package dataCreation;

import com.jcraft.jsch.Logger;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;
import org.slf4j.LoggerFactory;
import utility.HBaseClient;
import utility.HBaseRecommendationException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;


public class ImportHbaseData {

   private static final String FAMILY = "D";
   private static HBaseClient hBaseClient;
   private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(ImportHbaseData.class);

   
   public static void setUp(String tablename, String file) throws IOException, InterruptedException, ExecutionException, HBaseRecommendationException {
       setupHbase(tablename, file);
   }


   public static void setupHbase(String tablename, String file) throws IOException, HBaseRecommendationException {
       insertIntoHbase(tablename, file);
   }

    public static void createHbaseTable(String table) throws IOException {
        try{
            hBaseClient.createTable(table);
        }
        catch(Exception e){
            LOGGER.debug("Table already exists");
        }
    }



    public static void getHbaseTableData(String table) throws IOException {
        try{
            hBaseClient.getAllRows(table);
        }
        catch(Exception e){
            LOGGER.debug("Table Not Found");
        }
    }


    public static void listHbaseTable() throws IOException {
        hBaseClient.listTable();
    }


   public static void insertIntoHbase(String tablename, String file) throws IOException, HBaseRecommendationException {
       Table table = hBaseClient.getTable(tablename);
       BufferedReader br = new BufferedReader(new FileReader(file));
       String line = null;
       HashMap<Integer, String> map = new HashMap<Integer, String>();
       boolean firstRow = true;
       int start = 1000;
       while ((line = br.readLine()) != null) {
           String str[] = line.split("\\|");
           if (firstRow) {
               for (int i = 0; i < str.length; i++) {
                   map.put(i, str[i]);
               }
               firstRow = false;
           } else {
               Put p1 = new Put(Bytes.toBytes(str[0]));
               for (int i = 1; i < str.length; i++) {
                       p1.addColumn(Bytes.toBytes(FAMILY), Bytes.toBytes(map.get(i)), Bytes.toBytes(str[i]));

               }
               table.put(p1);
           }
           start++;
       }
       table.close();
       System.out.println(map);
   }

    public static void updateRowkeyHbase(String tablename, String rowkey) throws IOException, HBaseRecommendationException {
        try{
            Table table = hBaseClient.getTable(tablename);

            Put p1 = new Put(Bytes.toBytes(rowkey));
            p1.addColumn(Bytes.toBytes(FAMILY), Bytes.toBytes("status"), Bytes.toBytes("open"));
            table.put(p1);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }



    public static void delete(String tablename) throws HBaseRecommendationException, IOException{
	   hBaseClient.deleteTableData(tablename);
}

   public static void createConnection() throws Exception {
       if (hBaseClient == null) {
           hBaseClient = new HBaseClient();
       }
   }
}