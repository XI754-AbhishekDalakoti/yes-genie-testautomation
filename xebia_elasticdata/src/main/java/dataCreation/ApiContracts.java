package dataCreation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utility.PropertyReader;
import utility.ReadExcelDataWithDynamicColumn;
import utility.ResponseValidation;
import java.nio.file.Files;
import java.nio.file.Paths;


public class ApiContracts {

	static ResponseValidation responseValidation = new ResponseValidation();
	static PropertyReader propertyReader= new PropertyReader("src/main/resources/config.properties");

    public static void createIndexGnyCustSearch() {
        RestAssured.baseURI=propertyReader.getProperty("baseURI");
        RestAssured.port=Integer.valueOf(propertyReader.getProperty("port"));
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.contentType("application/json");
        requestSpecification.body("{ \"number_of_shards\":1,\"number_of_replicas\":1, \"analysis\": { \"normalizer\": { \"lowercase_normalizer\": { \"type\": \"custom\", \"filter\": [ \"lowercase\",\"asciifolding\" ] } }, \"analyzer\": { \"tokenized_lowercase_analyzer\": { \"type\":\"custom\", \"tokenizer\": \"whitespace\", \"filter\": [ \"lowercase\",\"asciifolding\" ] } } } }");
        Response response = requestSpecification.put("gny_cust_search");



    }


    public static void createIndexHierachy() {
    	RestAssured.baseURI=propertyReader.getProperty("baseURI");
        RestAssured.port=Integer.valueOf(propertyReader.getProperty("port"));
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.contentType("application/json");
        requestSpecification.body("{ \"number_of_shards\":1,\"number_of_replicas\":1, \"analysis\": { \"normalizer\": { \"lowercase_normalizer\": { \"type\": \"custom\", \"filter\": [ \"lowercase\",\"asciifolding\" ] } }, \"analyzer\": { \"tokenized_lowercase_analyzer\": { \"type\":\"custom\", \"tokenizer\": \"whitespace\", \"filter\": [ \"lowercase\",\"asciifolding\" ] } } } }");
        Response response = requestSpecification.put("gny_hris_master");
        responseValidation.compareResponseCode(response, 200);


    }


    public static void createMappingGnyCustDoc() {
    	RestAssured.baseURI=propertyReader.getProperty("baseURI");
        RestAssured.port=Integer.valueOf(propertyReader.getProperty("port"));
        String body="{\"gny_cust_doc\":{\"properties\":{ \"dob\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"aadhar_no\":{\"type\":\"keyword\",\"index\":\"true\"}, \"permanent_state\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"current_state\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"current_city\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"permanent_city\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"asset_rm\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"service_rm\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"sales_rm\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ybl_staff_flg\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"business_segment\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ckyc_no\":{\"type\":\"keyword\",\"index\":\"true\", \"normalizer\":\"lowercase_normalizer\"}, \"cust_id\":{\"type\":\"long\"}, \"cust_category_flg\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"dataset_flg\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"customer_name\":{\"type\":\"text\",\"index\":\"true\", \"analyzer\":\"tokenized_lowercase_analyzer\"}, \"link_cust_name\":{\"type\":\"text\",\"index\":\"true\", \"analyzer\":\"tokenized_lowercase_analyzer\"}, \"gny_display_name\":{\"type\":\"text\",\"index\":\"true\", \"analyzer\":\"tokenized_lowercase_analyzer\"}, \"cust_open_date\":{\"type\":\"keyword\",\"index\":\"true\"}, \"email\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"group_id\":{\"type\":\"long\"}, \"mdm_id\":{\"type\":\"long\"}, \"linked_mdm_id\":{\"type\":\"long\"}, \"mobile_no\":{\"type\":\"long\"}, \"pan_no\":{\"type\":\"keyword\",\"index\":\"true\"}, \"partner_segment\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"passport_no\":{\"type\":\"keyword\",\"index\":\"true\"}, \"twitter_handle\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"upi\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ucic\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"link_ucic\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"branch_code\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"branch_name\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"branch_region\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"clusters\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"cust_rel_type\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"link_cod_cust\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"data_dt\":{\"type\":\"keyword\",\"index\":\"true\"} }}}";
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.contentType("application/json");
        requestSpecification.body(body);
        Response response = requestSpecification.put("gny_cust_search/_mapping/gny_cust_doc");
        responseValidation.compareResponseCode(response, 200);


    }


    public static void createMappingHirechy() {
    	RestAssured.baseURI=propertyReader.getProperty("baseURI");
        RestAssured.port=Integer.valueOf(propertyReader.getProperty("port"));
        String body ="{\"gny_hris_doc\":{\"properties\":{ \"emp_no\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"emp_name\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"emp_func_desig\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"emp_corp_desig\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra1\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra1_name\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra1_func_desig\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra1_corp_desig\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra2\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra2_name\":{\"type\":\"keyword\",\"index\":\"true\", \"normalizer\":\"lowercase_normalizer\"}, \"ra2_func_desig\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra2_corp_desig\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra3\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra3_name\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra3_func_desig\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra3_corp_desig\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra4\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra4_name\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra4_func_desig\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra4_corp_desig\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra5\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra5_name\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra5_func_desig\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra5_corp_desig\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra6\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra6_name\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra6_func_desig\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra6_corp_desig\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"data_dt\":{\"type\":\"keyword\",\"index\":\"true\"} }}}";
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.contentType("application/json");
        requestSpecification.body(body);
        Response response = requestSpecification.put("gny_hris_master/_mapping/gny_hris_doc");
        responseValidation.compareResponseCode(response, 200);


    }


    public static void bulkIndexing() throws Exception{
    	RestAssured.baseURI=propertyReader.getProperty("baseURI");
        RestAssured.port=Integer.valueOf(propertyReader.getProperty("port"));
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.contentType("application/json");
        String ar[] = getJson();
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
            requestSpecification.body("{ \"index\":{ \"_index\": \"gny_cust_search\" , \"_type\": \"gny_cust_doc\" } } \n" +ar[i]+"\n");
            Response response = requestSpecification.post("_bulk");
            System.out.println("bulk indexing result is " + response.body().asString());
            responseValidation.compareResponseCode(response, 200);
        }
    }


    public static void bulkIndexingInYesBankAccount(){
    	RestAssured.baseURI=propertyReader.getProperty("baseURI");
        RestAssured.port=Integer.valueOf(propertyReader.getProperty("port"));
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.contentType("application/json");
        requestSpecification.body("{ \"index\":{ \"_index\": \"yesbankaccount\" , \"_type\": \"custaccount\" } } \n {\"custId\": 838218, \"accountNo\": 181400005300037 }\n");
        Response response = requestSpecification.post("_bulk");
        responseValidation.compareResponseCode(response, 200);

    }


    public static void searchData(){
    	RestAssured.baseURI=propertyReader.getProperty("baseURI");
        RestAssured.port=Integer.valueOf(propertyReader.getProperty("port"));
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.contentType("application/json");
        Response response = requestSpecification.get("gny_cust_search/_search");
        responseValidation.compareResponseCode(response, 200);
        System.out.println(response.body().asString());

    }


    public static void deleteAll(){
    	RestAssured.baseURI=propertyReader.getProperty("baseURI");
        RestAssured.port=Integer.valueOf(propertyReader.getProperty("port"));
        RequestSpecification requestSpecification = RestAssured.given();
        Response response = requestSpecification.delete("_all");
        responseValidation.compareResponseCode(response, 200);


    }

    public static void deleteGnyCustSearchIndex(){
    	RestAssured.baseURI=propertyReader.getProperty("baseURI");
        RestAssured.port=Integer.valueOf(propertyReader.getProperty("port"));
        RequestSpecification requestSpecification = RestAssured.given();
        Response response = requestSpecification.delete("gny_cust_search");
        responseValidation.compareResponseCode(response, 200);


    }




    public static String[] getJson() throws Exception {
        String excelFilePath = System.getProperty("user.dir").concat(propertyReader.getProperty("elastic_file_path"));
        ReadExcelDataWithDynamicColumn.creteJSONAndTextFileFromExcel(excelFilePath);
        String content = new String(Files.readAllBytes(Paths.get("src/test/resources/JsonFile.json")));
        content = content.replaceAll("\"row[0-9]+", "");
        content = content.replaceAll("\\.0", "");
        String[] ar = content.split(",\":");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = ar[i].replaceAll("\\{\":", "");
            ar[i] = ar[i].replaceAll("\\}\\}", "}");
        }
        return ar;

    }

}
