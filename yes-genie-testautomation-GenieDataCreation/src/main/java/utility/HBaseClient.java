package utility;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.filter.*;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.hadoop.security.UserGroupInformation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.*;

import static org.apache.hadoop.hbase.util.Bytes.toBytes;


public class HBaseClient {

	private static final Logger LOGGER = LoggerFactory.getLogger(HBaseClient.class);
	private static final List<String> NULL_VALUES = Arrays.asList("", "NULL", "NULLNULL");
	private String hbaseErrorMessage="Some error in hbase";
	private Connection connection;
	Configuration config;
	static PropertyReader propertyReader= new PropertyReader("src/main/resources/config.properties");

	public HBaseClient() throws Exception {
		if (System.getProperty("env").equals("UAT")){
			config = getConfiguration();
		}
		else {
			config = getBasicConfiguration();
		}
		connection = ConnectionFactory.createConnection(config);
	}


	public HBaseClient(Configuration config) throws IOException {
		connection = ConnectionFactory.createConnection(config);
	}


	private void destroy() throws IOException {
		if (null != connection) {
			connection.close();
		}
	}

	public void createTable(String tablename) throws IOException {
		HTableDescriptor hTableDescriptor = new HTableDescriptor(TableName.valueOf(tablename));
		hTableDescriptor.addFamily(new HColumnDescriptor("D"));
		Admin hBaseAdmin = connection.getAdmin();
		hBaseAdmin.createTable(hTableDescriptor);
	}


    public void listTable() throws IOException {
        Admin hBaseAdmin = connection.getAdmin();
        HTableDescriptor[] tableDescriptor = hBaseAdmin.listTables();
        for (int i=0; i<tableDescriptor.length;i++ ){
            System.out.println(tableDescriptor[i].getNameAsString());
        }
    }


	private Configuration getBasicConfiguration() throws IOException {
		Configuration config = HBaseConfiguration.create();
		String path = "src/test/resources/hbase-site.xml";
		config.addResource(new Path(path));
		return config;
	}


	public Configuration getConfiguration() throws Exception {
		Configuration config = HBaseConfiguration.create();
		config.set("hbase.zookeeper.quorum",propertyReader.getProperty("hbaseZookeeperIPs") );
		config.set("hbase.zookeeper.property.clientPort", propertyReader.getProperty("hbaseClientPort"));
		config.set("hadoop.security.authentication", "kerberos");
		config.set("hbase.security.authentication", "kerberos");
		config.set("hbase.cluster.distributed", "true");
		config.set("hbase.rpc.protection", "authentication");
		config.set("hbase.regionserver.kerberos.principal", propertyReader.getProperty("hbaseRegionServerKerberosPrincipal"));
		config.set("hbase.master.kerberos.principal", propertyReader.getProperty("hbaseMasterKerberosPrincipal"));
		UserGroupInformation.setConfiguration(config);
		UserGroupInformation.loginUserFromKeytab(propertyReader.getProperty("hbaseKeyTabUser"), propertyReader.getProperty("hbaseKeyTabFile"));
		UserGroupInformation.getLoginUser().checkTGTAndReloginFromKeytab();
		return config;
	}

	public void loginFromKeyTab() throws IOException {
		LOGGER.info("Login from keytab at {}", new Date());
		UserGroupInformation.loginUserFromKeytabAndReturnUGI(propertyReader.getProperty("hbaseKeyTabUser"), propertyReader.getProperty("hbaseKeyTabFile"));
	}


	public Table getTable(String tableName) throws HBaseRecommendationException {
		TableName tabName = TableName.valueOf(tableName);
		try {
			return connection.getTable(tabName);
		} catch (IOException e) {
			LOGGER.error(String.format("Got error in getting the table %s ", tabName), e);
			throw new HBaseRecommendationException(hbaseErrorMessage);
		}
	}


	public void deleteTableData(String tableName) throws IOException{
		TableName tabName = TableName.valueOf(tableName);
		Table table =connection.getTable(tabName);
		Scan scan=new Scan();
		ResultScanner scanner=table.getScanner(scan);
		List<Delete> deletes=new ArrayList<Delete>();
		for (Result r : scanner){
			deletes.add(new Delete(r.getRow()));
		}
		table.delete(deletes);
	}


	public void closeTable(Table table) {
		if (null != table) {
			try {
				table.close();
			} catch (IOException e) {
				LOGGER.error(String.format("Got error in closing the table %s ", table.getName()), e);
			}
		}
	}


	public Filter getPrefixFilter(String columnFamily, String value) {
		LOGGER.debug("Creating prefix filter for columnFamily:{}, value:{}", columnFamily, value);
		return new PrefixFilter(toBytes(value));
	}


	public Filter getSingleFilter(String columnFamily, String fieldName, String value) {
		LOGGER.debug("Creating filter for columnFamily:{}, fieldName:{}, value:{}", columnFamily, fieldName, value);
		if (null == value) {
			SingleColumnValueFilter filter = new SingleColumnValueFilter((toBytes(columnFamily)), toBytes(fieldName), CompareOperator.EQUAL, new NullComparator());
			filter.setFilterIfMissing(false);
			return filter;
		} else {
			return new SingleColumnValueFilter((toBytes(columnFamily)), toBytes(fieldName), CompareOperator.EQUAL, new BinaryComparator(toBytes(value)));
		}
	}


	public List<Map<String, String>> getAllRows(String tableName) throws IOException {
		TableName tabName = TableName.valueOf(tableName);
		Table table =connection.getTable(tabName);
		Scan scan=new Scan();
		ResultScanner resultScanner = table.getScanner(scan);
		List<Map<String, String>> resultList = new ArrayList<Map<String, String>>();
		for (Result result = resultScanner.next(); (result != null); result = resultScanner.next()) {
			resultList.add(getRowData(result));
		}
		resultScanner.close();
		return resultList;
	}


	public Result getAllRowsForRowKey(String tableName, String rowKey) throws IOException {
		TableName tabName = TableName.valueOf(tableName);
		Table table =connection.getTable(tabName);
		Get g = new Get(Bytes.toBytes(rowKey));
		Result result = table.get(g);
		return result;
	}


	public Map<String, String> getRowData(Result result) {
		Map<String, String> map = new HashMap<String, String>();
		for (Cell cell : result.listCells()) {
			String qualifier = Bytes.toString(cell.getQualifierArray(), cell.getQualifierOffset(), cell.getQualifierLength());
			String value = Bytes.toString(cell.getValueArray(), cell.getValueOffset(), cell.getValueLength());
			map.put(qualifier, getValue(value));
		}
		LOGGER.debug("Data fetched from db is :{}", map);
		return map;
	}


	public String getValue(String value) {
		if (value == null || NULL_VALUES.contains(value.toUpperCase())) {
			return null;
		} else {
			return value;
		}
	}
}
