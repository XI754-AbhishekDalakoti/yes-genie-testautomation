package helper;

public class UriHelper {


    public static String uri;


    public static String uricheck() {
        if (System.getProperty("env").equals("UAT")) {
            uri = "https://cust360.uat-genie.yesbank.com";

        } else {
            uri = "https://cust360.yesgenie.com:31390";
        }
        return uri;


    }
}
