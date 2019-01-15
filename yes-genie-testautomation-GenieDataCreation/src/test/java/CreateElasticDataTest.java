import dataCreation.ApiContracts;
import dataCreation.ImportRecommendationData;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import utility.HBaseRecommendationException;

import java.io.IOException;

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
    
    @Test
    public void recommendationDataCreation() throws IOException, HBaseRecommendationException {
		ImportRecommendationData.setupHbase("genie_recomendations","data_file/data_NBA.csv");
	}

    @Test
    public void demogsDataCreation() throws IOException, HBaseRecommendationException {
        ImportRecommendationData.setupHbase("genie_cust_demog","data_file/data_demogs.csv");
    }
}






