import dataCreation.ApiContracts;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CreateElasticDataTest {
	

    @BeforeSuite
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






