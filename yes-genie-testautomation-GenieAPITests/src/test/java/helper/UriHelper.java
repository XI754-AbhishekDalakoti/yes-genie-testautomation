package helper;

public class UriHelper {


    public static String uri;


    public static String uricheck() {
        if (System.getProperty("env").equals("UAT")) {
            uri = "http://ybblx3v355ca02.yesbank.com:30978";

        } else {
            uri = "https://cust360.yesgenie.com:31390";
        }
        return uri;


    }
}
