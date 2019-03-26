import dataCreation.ApiContracts;
import dataCreation.ImportHbaseData;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import utility.TablePicker;


public class CreateDataTest {
    public  String tableName;


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

/*    @Test
    public void list() throws Exception {
        ImportHbaseData.createConnection();
        ImportHbaseData.listHbaseTable();
    }


    @Test
    public void recommendationDataCreation()  throws Exception {
        ImportHbaseData.createConnection();
        tableName= TablePicker.nba_picker();
        ImportHbaseData.createHbaseTable(tableName);
        ImportHbaseData.setupHbase(tableName, "data_file/data_NBA.csv");
    }

    @Test
    public void demogsDataCreation() throws Exception {
        ImportHbaseData.createConnection();
        tableName= TablePicker.demogs_picker();
        ImportHbaseData.createHbaseTable(tableName);
        ImportHbaseData.setupHbase(tableName, "data_file/data_demogs.csv");
    }



    @Test
    public void kpiDataCreation() throws Exception {
        ImportHbaseData.createConnection();
        tableName= TablePicker.portfolio_kpi_picker();
        ImportHbaseData.createHbaseTable(tableName);
        ImportHbaseData.setupHbase(tableName,"data_file/kpi.csv");
    }



    @Test
    public void portfolioDataCreation() throws Exception {
        ImportHbaseData.createConnection();
        tableName= TablePicker.portfolio_snap_picker();
        ImportHbaseData.createHbaseTable(tableName);
        ImportHbaseData.setupHbase(tableName,"data_file/portfolio.csv");
    }


    @Test
    public void ausDataCreation() throws Exception {
        ImportHbaseData.createConnection();
        tableName= TablePicker.aus_picker();
        ImportHbaseData.createHbaseTable(tableName);
        ImportHbaseData.setupHbase(tableName,"data_file/aus.csv");
    }


    @Test
    public void portfolioDetailsDataCreation() throws Exception {
        ImportHbaseData.createConnection();
        tableName= TablePicker.product_details_picker();
        ImportHbaseData.createHbaseTable(tableName);
        ImportHbaseData.setupHbase(tableName,"data_file/portfolio_details.csv");
    }

    @Test
    public void kpiTrendDataCreation() throws Exception {
        ImportHbaseData.createConnection();
        tableName= TablePicker.product_kpi_trend_picker();
        ImportHbaseData.createHbaseTable(tableName);
        ImportHbaseData.setupHbase(tableName,"data_file/product_kpi_trend.csv");
    }


    @Test
    public void channelDataCreation() throws Exception {
        ImportHbaseData.createConnection();
        tableName= TablePicker.channel_picker();
        ImportHbaseData.createHbaseTable(tableName);
        ImportHbaseData.setupHbase(tableName,"data_file/channel.csv");
    } */



}






