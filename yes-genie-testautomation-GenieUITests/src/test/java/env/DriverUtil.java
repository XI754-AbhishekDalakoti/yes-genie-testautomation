package env;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Base64;
import java.util.Enumeration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.ErrorHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class DriverUtil {
    public static long DEFAULT_WAIT = 20;
    protected static WebDriver driver=null;
    static String currentPath = System.getProperty("user.dir");
    static Properties prop = new Properties();
    static DesiredCapabilities capability=null;

    public static DesiredCapabilities getCapability(InputStream input) {
        DesiredCapabilities capability = new DesiredCapabilities();
        try {
            prop.load(input);
            if(prop.containsKey("app")) {
                String appName = prop.getProperty("app");
                if(!appName.contains("sauce-storage")) {
                    String appPath = currentPath+"/src/main/java/appUnderTest/"+appName;
                    prop.setProperty("app", appPath);
                }
            }

            // set capabilities
            Enumeration<Object> enuKeys = prop.keys();
            while (enuKeys.hasMoreElements()) {
                String key = (String) enuKeys.nextElement();
                String value = prop.getProperty(key);
                capability.setCapability(key, value);
            }
            input.close();
        }catch(Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        return capability;
    }

    private static void uploadAppToSauceStorage(String appName, String appPath) {
        System.out.println("Uploading App "+appName+" to sauce storage");
        InputStream input;
        try {
            input = new FileInputStream(currentPath+"/src/main/java/platformConfigs/saucelab.properties");
            prop.load(input);
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        String username = prop.getProperty("username");
        String access_key = prop.getProperty("access_key");

        String uploadURL = "https://saucelabs.com/rest/v1/storage/"+username+"/"+appName+"?overwrite=true";
        String encoding = Base64.getEncoder().encodeToString((username+":"+access_key).getBytes());

        URLConnection urlconnection = null;
        try {
            File file = new File(appPath);
            URL url = new URL(uploadURL);
            urlconnection = url.openConnection();
            urlconnection.setDoOutput(true);
            urlconnection.setDoInput(true);

            if (urlconnection instanceof HttpURLConnection) {
                ((HttpURLConnection) urlconnection).setRequestMethod("POST");
                ((HttpURLConnection) urlconnection).setRequestProperty("Content-type", "text/plain");
                ((HttpURLConnection) urlconnection).setRequestProperty("Authorization", "Basic " + encoding);
                ((HttpURLConnection) urlconnection).connect();
            }

            BufferedOutputStream bos = new BufferedOutputStream(urlconnection.getOutputStream());
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
            int i;
            // read byte by byte until end of stream
            while ((i = bis.read()) > 0) {
                bos.write(i);
            }
            bis.close();
            bos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {

            int responseCode = ((HttpURLConnection) urlconnection).getResponseCode();
            if ((responseCode >= 200) && (responseCode <= 202)) {
                System.out.println("App uploaded successfully");
            }
            else {
                System.out.println("App upload failed");
            }
            System.out.println("responseCode : "+responseCode);

            ((HttpURLConnection) urlconnection).disconnect();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static WebDriver getDefaultDriver() {
        if (driver != null) {
            return driver;
        }

        String enviroment = "desktop";
        String platform = "";
        String config = System.getProperty("config", "");

        if(!config.isEmpty())
        {
            try{
                enviroment = config.split("_")[0].toLowerCase();
                platform = config.split("_")[1].toLowerCase();
                InputStream input = new FileInputStream(currentPath+"/src/main/java/browserConfigs/"+config+".properties");
                capability = getCapability(input);
            }
            catch(Exception e){
                System.out.println("\nException : File not present or Invalid config file name "+config+".properties");
                System.out.println("Config file format should be : enviroment_platform_device.properties");
                System.out.println("\nE.g : local_android_nexus5.properties");
                System.out.println("E.g : local_ios_iphone6.properties");
                System.out.println("E.g : browserstack_android_nexus5.properties");
                System.out.println("E.g : saucelab_windows7_chrome.properties");
                System.exit(0);
            }
        }

        switch(enviroment)
        {
            case "local": if(platform.equals("android"))
                driver = androidDriver(capability);
            else if(platform.equals("ios"))
                driver =  iosDriver(capability);
            else{
                System.out.println("unsupported platform");
                System.exit(0);
            }
                break;

            case "browserstack": driver = browserStackDriver(capability);
                break;

            case "saucelab": driver = saucelabDriver(capability);
                break;

            case "desktop": DesiredCapabilities capabilities = null;
                capabilities = DesiredCapabilities.chrome();
                capabilities.setJavascriptEnabled(true);
                capabilities.setCapability("takesScreenshot", true);
//                capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS , true);
                driver = chooseDriver(capabilities);
                driver.manage().timeouts().setScriptTimeout(DEFAULT_WAIT, TimeUnit.SECONDS);
                driver.manage().window().maximize();
                break;

            default : 	System.out.println("\nException : Invalid platform "+enviroment);
                System.exit(0);
        }

        return driver;
    }

    /*
     * Returns saucelab remote driver instance by reading saucelab configuration
     * from platformConfigs/saucelab.properties
     *
     * @param DesiredCapabilities create capabilities by reading browser config.
     * @return RemoteWebDriver
     */
    private static WebDriver saucelabDriver(DesiredCapabilities capabilities) {
        URL remoteDriverURL = null;
        RemoteWebDriver remoteDriver = null;

        // set app path for app testing
        if(prop.containsKey("app")) {
            String appName = prop.getProperty("app").split(":")[1];
            String appPath = currentPath+"/src/main/java/appUnderTest/"+appName;

            File appFile = new File(appPath);
            if(appFile.exists()) {
                //prop.setProperty("app", appPath);
                uploadAppToSauceStorage(appName, appPath);
            }else {
                System.out.println("Exception : No app with name '"+appName+"' found in appUnderTest directory");
                System.exit(0);
            }
        }


        try {
            InputStream input = new FileInputStream(currentPath+"/src/main/java/platformConfigs/saucelab.properties");
            prop.load(input);

            String url = prop.getProperty("protocol")+
                    "://"+
                    prop.getProperty("username")+
                    ":"+
                    prop.getProperty("access_key")+
                    prop.getProperty("url");

            input.close();
            prop.clear();
            remoteDriverURL = new URL(url);
            remoteDriver = new RemoteWebDriver(remoteDriverURL, capability);
        }catch(Exception e) {
            System.out.println("\nException Occured :\n");
            System.out.println(e.getMessage());
            System.exit(0);
        }
        return remoteDriver;
    }

    /*
     * Returns browserStack remote driver instance by reading browserStack configuration
     * from platformConfigs/browserstack.properties
     *
     * @param DesiredCapabilities create capabilities by reading browser config.
     * @return RemoteWebDriver
     */
    private static WebDriver browserStackDriver(DesiredCapabilities capabilities) {
        URL remoteDriverURL = null;
        try {
            InputStream input = new FileInputStream(currentPath+"/src/main/java/platformConfigs/browserstack.properties");
            prop.load(input);

            String url = prop.getProperty("protocol")+
                    "://"+
                    prop.getProperty("username")+
                    ":"+
                    prop.getProperty("access_key")+
                    prop.getProperty("url");

            input.close();
            prop.clear();
            remoteDriverURL = new URL(url);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return new RemoteWebDriver(remoteDriverURL, capability);
    }

    private static WebDriver androidDriver(DesiredCapabilities capabilities) {
        String port = "4723";
        try {
            driver = (AndroidDriver) new AndroidDriver(new URL("http://127.0.0.1:"+port+"/wd/hub"),capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }

    private static WebDriver iosDriver(DesiredCapabilities capabilities)
    {
        String port = "4723";
        try {
            driver = (IOSDriver) new IOSDriver(new URL("http://127.0.0.1:"+port+"/wd/hub"),capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }

    /**
     * By default to web driver will be chrome
     *
     * Override it by passing -Dbrowser=ie to the command line arguments
     * @param capabilities
     * @return webdriver
     */
    private static WebDriver chooseDriver(DesiredCapabilities capabilities) {
        String preferredDriver = System.getProperty("browser", "Firefox");

        boolean headless = System.getProperty("headless").equals("true");
        boolean ios = System.getProperty("ios_flag").equals("true");

        boolean android = System.getProperty("android_flag").equals("true");
        /*boolean headless = System.getProperty("headless").equals("true");

        boolean ios = System.getProperty("ios_flag").equals("true");

        boolean android = System.getProperty("android_flag").equals("true");*/
        switch (preferredDriver.toLowerCase()) {
            case "safari":
                try {
                    driver = new SafariDriver();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    System.exit(0);
                }
                return driver;
            case "edge":
                try {
                    driver = new EdgeDriver();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    System.exit(0);
                }
                return driver;
            default:
                ChromeOptions chromeOptions = new ChromeOptions();

                if (headless) {
                    chromeOptions.addArguments("--headless");
                }
                if (System.getProperty("os.name").equalsIgnoreCase("Linux")) {
                    capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS , true);
                    capabilities.setAcceptInsecureCerts(true);
                    System.out.println("capability for cert is set ");
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver_linux");
                }
                else if (System.getProperty("os.name").equals("Mac OS X")) {
                    capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS , true);
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver_mac");
                }
                else {
                    capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
                }



                System.getProperty("ios_flag");
                if (ios){
                    System.out.print("ios flag is set");
                    chromeOptions.addArguments("--user-agent=Mozilla/5.0 (iPhone; CPU iPhone OS 6_0 like Mac OS X) AppleWebKit/536.26 (KHTML, like Gecko) Version/6.0 Mobile/10A5376e Safari/8536.25");
                }
                else if(android){
                    chromeOptions.addArguments("--user-agent=Mozilla/5.0 (Linux; Android 4.4.2; Nexus 4 Build/KOT49H) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/34.0.1847.114 Mobile Safari/537.36");
                }
                capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);

                try {

                    chromeOptions.addArguments("--start-maximized");
                    capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
                    driver = new ChromeDriver(capabilities);
                    String cap = String.valueOf(((ChromeDriver) driver).getCapabilities());
                    System.out.println("capabilities are here " +cap + "and server is " +System.getProperty("os.name"));
                    ErrorHandler handler = new ErrorHandler();
                    handler.setIncludeServerErrors(false);
                    //driver.setErrorHandler(handler);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    System.exit(0);
                }
                return driver;
        }
    }


    public static WebElement waitAndGetElementByCssSelector(WebDriver driver, String selector,int seconds) {
        By selection = By.cssSelector(selector);
        return (new WebDriverWait(driver, seconds)).until( // ensure element is visible!
                visibilityOfElementLocated(selection));
    }

    public static void closeDriver() {
        if (driver != null) {
            try {
                //driver.close();
                //driver.quit(); // fails in current geckodriver! TODO: Fixme
            } catch (NoSuchMethodError nsme) { // in case quit fails
            } catch (NoSuchSessionException nsse) { // in case close fails
            } catch (SessionNotCreatedException snce) {} // in case close fails
            driver = null;
        }
    }
}

