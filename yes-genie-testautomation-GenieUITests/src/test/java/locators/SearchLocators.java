package locators;

import info.seleniumcucumber.userStepDefintions.UserStepDefinitions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchLocators extends UserStepDefinitions {

    public SearchLocators() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//table[@class=\"_4sbYNaXGOD8VzGHAX2_Gp\"]/thead/tr/th[1]")
    public static WebElement heading_MDMID;

    @FindBy(how = How.XPATH, using = "//table[@class=\"_4sbYNaXGOD8VzGHAX2_Gp\"]/thead/tr/th[2]")
    public static WebElement heading_CUSTID;

    @FindBy(how = How.XPATH, using = "//table[@class=\"_4sbYNaXGOD8VzGHAX2_Gp\"]/thead/tr/th[3]")
    public static WebElement heading_CustomerName;

    @FindBy(how = How.XPATH, using = "//table[@class=\"_4sbYNaXGOD8VzGHAX2_Gp\"]/thead/tr/th[4]")
    public static WebElement heading_DOB;

    @FindBy(how = How.XPATH, using = "//table[@class=\"_4sbYNaXGOD8VzGHAX2_Gp\"]/thead/tr/th[5]")
    public static WebElement heading_AddressCity;

    @FindBy(how = How.XPATH, using = "//table[@class=\"_4sbYNaXGOD8VzGHAX2_Gp\"]/thead/tr/th[6]")
    public static WebElement heading_AddressArea;

    @FindBy(how = How.XPATH, using = "//table[@class=\"_4sbYNaXGOD8VzGHAX2_Gp\"]/thead/tr/th[7]")
    public static WebElement heading_HomeBranch;

    @FindBy(how = How.XPATH, using = "//table[@class=\"_4sbYNaXGOD8VzGHAX2_Gp\"]/thead/tr/th[8]")
    public static WebElement heading_AssetRM;

    @FindBy(how = How.XPATH, using = "//table[@class=\"_4sbYNaXGOD8VzGHAX2_Gp\"]/thead/tr/th[9]")
    public static WebElement heading_LiabilityRM;

    @FindBy(how = How.XPATH, using = "//table[@class=\"_4sbYNaXGOD8VzGHAX2_Gp\"]/thead/tr/th[10]")
    public static WebElement heading_GroupID;

    @FindBy(how = How.XPATH, using = "//table[@class=\"_4sbYNaXGOD8VzGHAX2_Gp\"]/thead/tr/th[11]")
    public static WebElement heading_BusinessSegment;

    @FindBy(how = How.XPATH, using = "//table[@class=\"_4sbYNaXGOD8VzGHAX2_Gp\"]/thead/tr/th[12]")
    public static WebElement heading_PartnerSegment;

    @FindBy(how = How.XPATH, using = "//table[@class=\"_4sbYNaXGOD8VzGHAX2_Gp\"]/thead/tr/th[13]")
    public static WebElement heading_CustOpenDate;

    @FindBy(how = How.XPATH, using = "//div[@class='_1yZKqTlSrXNSB_Zl_9scaj']")
    public static WebElement heading_NoSearchResult;

    @FindBy(how = How.XPATH, using = "//div[@class=\"_1yZKqTlSrXNSB_Zl_9scaj\"]")
    public static WebElement refinementMessage;

    @FindBy(how = How.XPATH, using = "//div[@class=\"_1HWu9-VMmg-bQcnoV5fSo-\"]/label[not(@class=\"_3Q0Indavt4PQipSfQVyWpQ\")]")
    public static WebElement bubbleHighlight;

}