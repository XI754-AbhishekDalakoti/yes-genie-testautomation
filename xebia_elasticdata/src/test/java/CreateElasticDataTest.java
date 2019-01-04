import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.nio.file.Files;
import java.nio.file.Paths;


import static io.restassured.RestAssured.given;

public class CreateElasticDataTest {

    ResponseValidation responseValidation = new ResponseValidation();

    @BeforeSuite
    public void dataCreation() {
        deleteYesBankIndex();
        createIndexYesBank();
//        createIndexHierachy();
        createMappingCustomer();
//        createMappingHirechy();
        bulkIndexing();
        bulkIndexingInYesBankAccount();


    }

    @AfterSuite
    public void afterScenario() {
        searchData();
//        deleteYesBankIndex();

    }


    public void createIndexYesBank() {
        RestAssured.baseURI="http://192.168.7.51";
        RestAssured.port=9200;
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.contentType("application/json");
        requestSpecification.body("{ \"number_of_shards\":1,\"number_of_replicas\":1, \"analysis\": { \"normalizer\": { \"lowercase_normalizer\": { \"type\": \"custom\", \"filter\": [ \"lowercase\",\"asciifolding\" ] } }, \"analyzer\": { \"tokenized_lowercase_analyzer\": { \"type\":\"custom\", \"tokenizer\": \"whitespace\", \"filter\": [ \"lowercase\",\"asciifolding\" ] } } } }");
        Response response = requestSpecification.put("yesbank");



    }


    public void createIndexHierachy() {
        RestAssured.baseURI="http://192.168.7.51";
        RestAssured.port=9200;
        RequestSpecification requestSpecification = given();
        requestSpecification.contentType("application/json");
        requestSpecification.body("{ \"number_of_shards\":1,\"number_of_replicas\":1, \"analysis\": { \"normalizer\": { \"lowercase_normalizer\": { \"type\": \"custom\", \"filter\": [ \"lowercase\",\"asciifolding\" ] } }, \"analyzer\": { \"tokenized_lowercase_analyzer\": { \"type\":\"custom\", \"tokenizer\": \"whitespace\", \"filter\": [ \"lowercase\",\"asciifolding\" ] } } } }");
        Response response = requestSpecification.put("gny_hris_master");
        responseValidation.compareResponseCode(response, 200);


    }


    public void createMappingCustomer() {
        RestAssured.baseURI="http://192.168.7.51";
        RestAssured.port=9200;
        String body = "{\"customer\":{\"properties\":{ \"DOB\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"aadharNo\":{\"type\":\"keyword\",\"index\":\"true\"}, \"accountNo\":{\"type\":\"long\"}, \"addressArea\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"city\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"assetRM\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"serviceRM\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"salesRM\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"businessSegment\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"cKyc\":{\"type\":\"keyword\",\"index\":\"true\", \"normalizer\":\"lowercase_normalizer\"}, \"custId\":{\"type\":\"long\"}, \"custType\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"indexType\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"customerName\":{\"type\":\"text\",\"index\":\"true\", \"analyzer\":\"tokenized_lowercase_analyzer\"}, \"customerOpenDate\":{\"type\":\"keyword\",\"index\":\"true\"},\"customerSearchEnabled\":{\"type\":\"boolean\"}, \"email\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"groupId\":{\"type\":\"long\"},\"homeBranch\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"liabilityRM\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"},\"mdmId\":{\"type\":\"long\"}, \"linkedMdmId\":{\"type\":\"long\"},\"mobileNumber\":{\"type\":\"long\"}, \"PAN\":{\"type\":\"keyword\",\"index\":\"true\"}, \"partnerSegment\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"passportNo\":{\"type\":\"keyword\",\"index\":\"true\"}, \"twitter\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"upiId\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"branchCode\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"} }}}    ";
        RequestSpecification requestSpecification = given();
        requestSpecification.contentType("application/json");
        requestSpecification.body(body);
        Response response = requestSpecification.put("yesbank/_mapping/customer");
        responseValidation.compareResponseCode(response, 200);


    }


    public void createMappingHirechy() {
        RestAssured.baseURI="http://192.168.7.51";
        RestAssured.port=9200;
        String body ="{\"gny_hris_doc\":{\"properties\":{ \"emp_no\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"emp_name\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"emp_func_desig\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"emp_corp_desig\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra1\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra1_name\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra1_func_desig\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra1_corp_desig\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra2\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra2_name\":{\"type\":\"keyword\",\"index\":\"true\", \"normalizer\":\"lowercase_normalizer\"}, \"ra2_func_desig\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra2_corp_desig\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra3\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra3_name\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra3_func_desig\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra3_corp_desig\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra4\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra4_name\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra4_func_desig\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra4_corp_desig\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra5\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra5_name\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra5_func_desig\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra5_corp_desig\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra6\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra6_name\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra6_func_desig\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"ra6_corp_desig\":{\"type\":\"keyword\",\"index\":\"true\",\"normalizer\":\"lowercase_normalizer\"}, \"data_dt\":{\"type\":\"keyword\",\"index\":\"true\"} }}}";
        RequestSpecification requestSpecification = given();
        requestSpecification.contentType("application/json");
        requestSpecification.body(body);
        Response response = requestSpecification.put("gny_hris_master/_mapping/gny_hris_doc");
        responseValidation.compareResponseCode(response, 200);


    }


    public void bulkIndexing(){
        RestAssured.baseURI="http://192.168.7.51";
        RestAssured.port=9200;
        RequestSpecification requestSpecification = given();
        requestSpecification.contentType("application/json");
        String ar[] = getJson();
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
            requestSpecification.body("{ \"index\":{ \"_index\": \"yesbank\" , \"_type\": \"customer\" } } \n" +ar[i]+"\n");
            Response response = requestSpecification.post("_bulk");
            System.out.println("bulk indexing result is " + response.body().asString());
            responseValidation.compareResponseCode(response, 200);
        }
    }


    public void bulkIndexingInYesBankAccount(){
        RestAssured.baseURI="http://192.168.7.51";
        RestAssured.port=9200;
        RequestSpecification requestSpecification = given();
        requestSpecification.contentType("application/json");
        requestSpecification.body("{ \"index\":{ \"_index\": \"yesbankaccount\" , \"_type\": \"custaccount\" } } \n {\"custId\": 838218, \"accountNo\": 181400005300037 }\n");
        Response response = requestSpecification.post("_bulk");
        responseValidation.compareResponseCode(response, 200);

    }


    public void searchData(){
        RestAssured.baseURI="http://192.168.7.51";
        RestAssured.port=9200;
        RequestSpecification requestSpecification = given();
        requestSpecification.contentType("application/json");
        Response response = requestSpecification.get("yesbank/_search");
        responseValidation.compareResponseCode(response, 200);
        System.out.println(response.body().asString());

    }


    public void deleteAll(){
        RestAssured.baseURI="http://192.168.7.51";
        RestAssured.port=9200;
        RequestSpecification requestSpecification = given();
        Response response = requestSpecification.delete("_all");


    }

    public void deleteYesBankIndex(){
        RestAssured.baseURI="http://192.168.7.51";
        RestAssured.port=9200;
        RequestSpecification requestSpecification = given();
        Response response = requestSpecification.delete("yesbank");


    }




    public String[] getJson() {

        // You can specify your excel file path.
        String excelFilePath = "elastic.xls";

        // This method will read each sheet data from above excel file and create a JSON and a text file to save the sheet data.
        ReadExcelDataWithDynamicColumn.creteJSONAndTextFileFromExcel(excelFilePath);
        try {
            String content = new String(Files.readAllBytes(Paths.get("JsonFile.json")));

            content = content.replaceAll("\"row[0-9]+", "");

            content = content.replaceAll("\\.0", "");

            String[] ar = content.split(",\":");


            for (int i = 0; i < ar.length; i++) {
                ar[i] = ar[i].replaceAll("\\{\":", "");
                ar[i] = ar[i].replaceAll("\\}\\}", "}");

                //Logic for json to string conversion
//                    ar[i] = ar[i].replaceAll("\"", "\\\"");
            }
            return ar;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}






