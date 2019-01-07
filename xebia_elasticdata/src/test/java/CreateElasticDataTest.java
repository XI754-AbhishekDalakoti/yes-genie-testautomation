import org.testng.annotations.Test;
import dataCreation.ApiContracts;

import static io.restassured.RestAssured.given;

public class CreateElasticDataTest {
	
    
    



    @Test
    public void dataCreation() throws Exception {
        ApiContracts.deleteGnyCustSearchIndex();
        ApiContracts.createIndexGnyCustSearch();
        ApiContracts.createMappingGnyCustDoc();
        ApiContracts.bulkIndexing();
//      dataCreation.ApiContracts.bulkIndexingInYesBankAccount();


    }

    @Test
    public void afterScenario() {
    	ApiContracts.searchData();


    }


 

}






