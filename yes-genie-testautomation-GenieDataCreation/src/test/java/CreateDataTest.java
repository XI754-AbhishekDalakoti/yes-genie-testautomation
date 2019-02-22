import dataCreation.ApiContracts;
import dataCreation.ImportHbaseData;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;


public class CreateDataTest {


    @Test
    public void dataCreationSearch() throws Exception {
        ApiContracts.deleteGnyCustSearchIndex();
        ApiContracts.createIndexGnyCustSearch();
        ApiContracts.createMappingGnyCustDoc();
        ApiContracts.bulkIndexingCustSearch();
        ApiContracts.bulkIndexingInYesBankAccount();
    }

    @Test
    public void dataCreationRelationship() throws Exception {
        ApiContracts.deleteGnyCustRelationshipIndex();
        ApiContracts.createIndexGnyCustRelationship();
        ApiContracts.createMappingGnyCustRelationship();
        ApiContracts.bulkIndexingCustRelationship();
    }


    @Test
    public void afterScenario() {
        ApiContracts.searchData();
        ApiContracts.relationshipData();


    }

    @Test
    public void list() throws Exception {
        ImportHbaseData.createConnection();
        ImportHbaseData.listHbaseTable();
    }


    @Test
    public void recommendationDataCreation()  throws Exception {
        ImportHbaseData.createConnection();
        ImportHbaseData.createHbaseTable("gny_nba");
        ImportHbaseData.setupHbase("gny_nba", "data_file/data_NBA.csv");
    }

    @Test
    public void demogsDataCreation() throws Exception {
        ImportHbaseData.createConnection();
        ImportHbaseData.createHbaseTable("gny_cust_demogs");
        ImportHbaseData.setupHbase("gny_cust_demogs", "data_file/data_demogs.csv");
    }



    @Test
    public void kpiDataCreation() throws Exception {
        ImportHbaseData.createConnection();
        ImportHbaseData.createHbaseTable("gny_portfolio_kpi_snap");
        ImportHbaseData.setupHbase("gny_portfolio_kpi_snap","data_file/kpi.csv");
    }



    @Test
    public void portfolioDataCreation() throws Exception {
        ImportHbaseData.createConnection();
        ImportHbaseData.createHbaseTable("gny_portfolio_snap");
        ImportHbaseData.setupHbase("gny_portfolio_snap","data_file/portfolio.csv");
    }


    @Test
    public void ausDataCreation() throws Exception {
        ImportHbaseData.createConnection();
        ImportHbaseData.createHbaseTable("gny_cust_aus");
        ImportHbaseData.setupHbase("gny_cust_aus","data_file/aus.csv");
    }


    @Test
    public void portfolioDetailsDataCreation() throws Exception {
        ImportHbaseData.createConnection();
        ImportHbaseData.createHbaseTable("gny_product_details");
        ImportHbaseData.setupHbase("gny_product_details","data_file/portfolio_details.csv");
    }

    @Test
    public void kpiTrendDataCreation() throws Exception {
        ImportHbaseData.createConnection();
        ImportHbaseData.createHbaseTable("gny_kpi_trend");
        ImportHbaseData.setupHbase("gny_kpi_trend","data_file/product_kpi_trend.csv");
    }



}






