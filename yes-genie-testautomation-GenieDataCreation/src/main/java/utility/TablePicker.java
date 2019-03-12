package utility;

public class TablePicker {
    public static String nba_table;
    public static String demogs_table;
    public static String portfolio_kpi_table;
    public static String portfolio_snap_table;
    public static String aus_table;
    public static String product_details_table;
    public static String product_kpi_trend_table;
    public static String channel_table;



    public static String nba_picker(){
        if (System.getProperty("env").equals("UAT")) {
            nba_table = "gny_nba";
        }
        else{
            nba_table="gny_nba";
        }
        return nba_table;

    }

    public static String demogs_picker(){
        if (System.getProperty("env").equals("UAT")) {
            demogs_table = "gny_cust_demogs_v1";
        }
        else{
            demogs_table="gny_cust_demogs";
        }
        return demogs_table;

    }

    public static String portfolio_kpi_picker(){
        if (System.getProperty("env").equals("UAT")) {
            portfolio_kpi_table = "gny_portfolio_kpi_snap_v1";
        }
        else{
            portfolio_kpi_table="gny_portfolio_kpi_snap";
        }
        return portfolio_kpi_table;
    }


    public static String aus_picker(){
        if (System.getProperty("env").equals("UAT")) {
            aus_table = "gny_cust_aus";
        }
        else{
            aus_table="gny_cust_aus";
        }
        return aus_table;

    }


    public static String product_details_picker(){
        if (System.getProperty("env").equals("UAT")) {
            product_details_table = "gny_product_details";
        }
        else{
            product_details_table="gny_product_details";
        }
        return product_details_table;

    }


    public static String portfolio_snap_picker(){
        if (System.getProperty("env").equals("UAT")) {
            portfolio_snap_table = "gny_portfolio_snap_v1";
        }
        else{
            portfolio_snap_table="gny_portfolio_snap";
        }
        return portfolio_snap_table;

    }



    public static String product_kpi_trend_picker(){
        if (System.getProperty("env").equals("UAT")) {
            product_kpi_trend_table = "gny_product_kpi_trend";
        }
        else{
            product_kpi_trend_table="gny_kpi_trend";
        }
        return product_kpi_trend_table;

    }


    public static String channel_picker(){
        if (System.getProperty("env").equals("UAT")) {
            channel_table = "gny_channel_snap_v1";
        }
        else{
            channel_table="gny_channel_snap";
        }
        return channel_table;

    }


}
