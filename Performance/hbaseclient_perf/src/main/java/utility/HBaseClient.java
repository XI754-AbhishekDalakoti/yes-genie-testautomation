package utility;

import customException.HBaseRecommendationException;
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
//	static PropertyReader propertyReader= new PropertyReader("config.properties");


	public HBaseClient() throws Exception {
		Boolean env =false;

		if (env){
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


	private Configuration getBasicConfiguration() throws IOException {
		Configuration config = HBaseConfiguration.create();
//		String path = "hbase-site.xml";
//		config.addResource(new Path(path));
		config.set("hbase.zookeeper.quorum","10.10.24.25" );
		config.set("hbase.zookeeper.property.clientPort","2181" );
		return config;
	}

	public void createTable(String tablename) throws IOException {
		HTableDescriptor hTableDescriptor = new HTableDescriptor(TableName.valueOf(tablename));
		hTableDescriptor.addFamily(new HColumnDescriptor("D"));
		Admin hBaseAdmin = connection.getAdmin();
		hBaseAdmin.createTable(hTableDescriptor);
	}



	public Configuration getConfiguration() throws Exception {
		Configuration config = HBaseConfiguration.create();
		config.set("hbase.zookeeper.quorum","10.0.45.64" );
		config.set("hbase.zookeeper.property.clientPort", "2181");
		config.set("hadoop.security.authentication", "kerberos");
		config.set("hbase.security.authentication", "kerberos");
		config.set("hbase.cluster.distributed", "true");
		config.set("hbase.rpc.protection", "authentication");
		config.set("hbase.regionserver.kerberos.principal", "hbase/_HOST@YESBANK.COM");
		config.set("hbase.master.kerberos.principal", "/app/fin.keytab");
		UserGroupInformation.setConfiguration(config);
		UserGroupInformation.loginUserFromKeytab("SAUD355524", "/app/fin.keytab");
		UserGroupInformation.getLoginUser().checkTGTAndReloginFromKeytab();
		return config;
	}

	public void loginFromKeyTab() throws IOException {
		LOGGER.info("Login from keytab at {}", new Date());
		UserGroupInformation.loginUserFromKeytabAndReturnUGI("SAUD355524", "/app/fin.keytab");
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






}
