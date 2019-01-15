package utility;




import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.CompareOperator;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.exceptions.HBaseException;
import org.apache.hadoop.hbase.filter.*;
import org.apache.hadoop.hbase.util.Bytes;

import javax.annotation.PreDestroy;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

import static org.apache.hadoop.hbase.util.Bytes.toBytes;


public class HBaseClient {


	private static final List<String> NULL_VALUES = Arrays.asList("", "NULL", "NULLNULL");


	private String hbaseErrorMessage;

	private Connection connection;
	Configuration config;

	public HBaseClient() throws IOException {
		Configuration config = getBasicConfiguration();
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
		/*ClassPathResource classPathResource = new ClassPathResource("hbase/hbase-site.xml");
        InputStream inputStream = classPathResource.getInputStream();*/
		String path = "src/test/resources/hbase-site.xml";
		config.addResource(new Path(path));
		//        config.addResource(inputStream);
		return config;
	}

	public Table getTable(String tableName) throws HBaseRecommendationException {

		TableName tabName = TableName.valueOf(tableName);
		try {
			return connection.getTable(tabName);
		} catch (IOException e) {
			//            //LOGGER.error(String.format("Got error in getting the table %s ", tabName), e);
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



	}

	public void closeTable(Table table) {
		if (null != table) {
			try {
				table.close();
			} catch (IOException e) {
				//LOGGER.error(String.format("Got error in closing the table %s ", table.getName()), e);
			}
		}
	}

	public Filter getPrefixFilter(String columnFamily, String value) {
		//LOGGER.debug("Creating prefix filter for columnFamily:{}, value:{}", columnFamily, value);
		return new PrefixFilter(toBytes(value));
	}


	public Filter getSingleFilter(String columnFamily, String fieldName, String value) {
		//LOGGER.debug("Creating filter for columnFamily:{}, fieldName:{}, value:{}", columnFamily, fieldName, value);
		if (null == value) {
			SingleColumnValueFilter filter = new SingleColumnValueFilter((toBytes(columnFamily)), toBytes(fieldName), CompareOperator.EQUAL, new NullComparator());
			filter.setFilterIfMissing(false);
			return filter;
		} else {
			return new SingleColumnValueFilter((toBytes(columnFamily)), toBytes(fieldName), CompareOperator.EQUAL, new BinaryComparator(toBytes(value)));
		}
	}

	//    public Filter getOrFilter(String columnFamily, String fieldName, List<String> values) {
	//        FilterList orFilter = new FilterList(FilterList.Operator.MUST_PASS_ONE);
	//        values.forEach(v ->
	//                orFilter.addFilter(getSingleFilter(columnFamily, fieldName, v))
	//        );
	//        return orFilter;
	//    }

	public List<Map<String, String>> getAllRows(Table table, Scan scan) throws IOException {
		ResultScanner resultScanner = table.getScanner(scan);
		List<Map<String, String>> resultList = new ArrayList<Map<String, String>>();
		for (Result result = resultScanner.next(); (result != null); result = resultScanner.next()) {
			resultList.add(getRowData(result));
		}
		resultScanner.close();
		return resultList;
	}

	public Map<String, String> getRowData(Result result) {
		Map<String, String> map = new HashMap<String, String>();
		for (Cell cell : result.listCells()) {
			String qualifier = Bytes.toString(cell.getQualifierArray(), cell.getQualifierOffset(), cell.getQualifierLength());
			String value = Bytes.toString(cell.getValueArray(), cell.getValueOffset(), cell.getValueLength());
			map.put(qualifier, getValue(value));
		}
		//LOGGER.debug("Data fetched from db is :{}", map);
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
