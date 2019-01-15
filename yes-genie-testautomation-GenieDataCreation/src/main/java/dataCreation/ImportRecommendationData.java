package dataCreation;



import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import utility.HBaseClient;
import utility.HBaseRecommendationException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;


public class ImportRecommendationData {

//   private static final String TABLE_NAME = "genie_prabhat";
   private static final String FAMILY = "D";

  
   private static HBaseClient hBaseClient;

   
   public static void setUp(String tablename, String file) throws IOException, InterruptedException, ExecutionException, HBaseRecommendationException {
   
       setupHbase(tablename, file);
   }

   public static void setupHbase(String tablename, String file) throws IOException, HBaseRecommendationException {
       createConnection();
       insertIntoHbase(tablename, file);
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
   
   
   public static void delete(String tablename) throws HBaseRecommendationException, IOException{
	   hBaseClient.deleteTableData(tablename);
	   
	   
   }

   public static void createConnection() throws IOException {
       hBaseClient = new HBaseClient();
   }

 
   

   @Test
   public void init() throws IOException {
       System.out.println("Done");
   }

   


}