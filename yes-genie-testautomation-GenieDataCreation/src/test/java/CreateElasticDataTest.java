import dataCreation.ApiContracts;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class CreateElasticDataTest {
	

    @Test
    public void dataCreation() throws Exception {
        ApiContracts.deleteGnyCustSearchIndex();
        ApiContracts.createIndexGnyCustSearch();
        ApiContracts.createMappingGnyCustDoc();
        ApiContracts.bulkIndexing();
        ApiContracts.bulkIndexingInYesBankAccount();
    }


    @AfterSuite
    public void afterScenario() {
    	ApiContracts.searchData();


    }
}






