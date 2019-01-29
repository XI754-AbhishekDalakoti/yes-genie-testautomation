import dataCreation.ApiContracts;
import dataCreation.ImportHbaseData;
import org.testng.annotations.AfterSuite;
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
    public void recommendationDataCreation()  throws Exception {
        ImportHbaseData.createConnection();
        ImportHbaseData.delete("genie_recomendations");
        ImportHbaseData.setupHbase("genie_recomendations", "data_file/data_NBA.csv");
    }

    @Test
    public void demogsDataCreation() throws Exception {
        ImportHbaseData.createConnection();
        ImportHbaseData.delete("genie_cust_demog");
        ImportHbaseData.setupHbase("genie_cust_demog", "data_file/data_demogs.csv");
    }



   @Test
   public void kpiDataCreation() throws Exception {
       ImportHbaseData.createConnection();
       ImportHbaseData.delete("kpi_matrix");
       ImportHbaseData.setupHbase("kpi_matrix","data_file/kpi.csv");
   }



    @Test
    public void portfolioDataCreation() throws Exception {
        ImportHbaseData.createConnection();
        ImportHbaseData.delete("portfolio_snap");
        ImportHbaseData.setupHbase("portfolio_snap","data_file/portfolio.csv");
    }


    @Test
    public void ausDataCreation() throws Exception {
        ImportHbaseData.createConnection();
        ImportHbaseData.delete("v_gny_cust_aus_master");
        ImportHbaseData.setupHbase("v_gny_cust_aus_master","data_file/aus.csv");
    }
}






