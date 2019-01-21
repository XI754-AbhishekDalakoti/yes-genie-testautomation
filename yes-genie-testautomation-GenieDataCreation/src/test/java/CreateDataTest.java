import dataCreation.ApiContracts;
import dataCreation.ImportHbaseData;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import utility.HBaseRecommendationException;

import java.io.IOException;

public class CreateDataTest {
	

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

   @Test
   public void recommendationDataCreation() throws IOException, HBaseRecommendationException {
       ImportHbaseData.createConnection();
       ImportHbaseData.delete("genie_recomendations");
		ImportHbaseData.setupHbase("genie_recomendations","data_file/data_NBA.csv");
	}

   @Test
   public void demogsDataCreation() throws IOException, HBaseRecommendationException {
       ImportHbaseData.createConnection();
       ImportHbaseData.delete("genie_cust_demog");
       ImportHbaseData.setupHbase("genie_cust_demog","data_file/data_demogs.csv");
   }


   @Test
   public void kpiDataCreation() throws IOException, HBaseRecommendationException {
       ImportHbaseData.createConnection();
       ImportHbaseData.delete("kpi_matrix");
       ImportHbaseData.setupHbase("kpi_matrix","data_file/kpi.csv");
   }



    @Test
    public void portfolioDataCreation() throws IOException, HBaseRecommendationException {
        ImportHbaseData.createConnection();
        ImportHbaseData.delete("portfolio_snap");
        ImportHbaseData.setupHbase("portfolio_snap","data_file/portfolio.csv");
    }
}






