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

    @FindBy(how = How.XPATH, using = "//table[@class='_4sbYNaXGOD8VzGHAX2_Gp']/thead/tr/th[1]")
    public static WebElement heading_mdmId;

    @FindBy(how = How.XPATH, using = "//table[@class='_4sbYNaXGOD8VzGHAX2_Gp']/thead/tr/th[2]")
    public static WebElement heading_custId;

    @FindBy(how = How.XPATH, using = "//table[@class='_4sbYNaXGOD8VzGHAX2_Gp']/thead/tr/th[3]")
    public static WebElement heading_customerName;

    @FindBy(how = How.XPATH, using = "//table[@class='_4sbYNaXGOD8VzGHAX2_Gp']/thead/tr/th[4]")
    public static WebElement heading_dob;

    @FindBy(how = How.XPATH, using = "//table[@class='_4sbYNaXGOD8VzGHAX2_Gp']/thead/tr/th[5]")
    public static WebElement heading_addressCity;

    @FindBy(how = How.XPATH, using = "//table[@class='_4sbYNaXGOD8VzGHAX2_Gp']/thead/tr/th[6]")
    public static WebElement heading_addressArea;

    @FindBy(how = How.XPATH, using = "//table[@class='_4sbYNaXGOD8VzGHAX2_Gp']/thead/tr/th[7]")
    public static WebElement heading_homeBranch;

    @FindBy(how = How.XPATH, using = "//table[@class='_4sbYNaXGOD8VzGHAX2_Gp']/thead/tr/th[8]")
    public static WebElement heading_liabilityRM;

    @FindBy(how = How.XPATH, using = "//table[@class='_4sbYNaXGOD8VzGHAX2_Gp']/thead/tr/th[9]")
    public static WebElement heading_assetRM;

    @FindBy(how = How.XPATH, using = "//table[@class='_4sbYNaXGOD8VzGHAX2_Gp']/thead/tr/th[10]")
    public static WebElement heading_groupId;

    @FindBy(how = How.XPATH, using = "//table[@class='_4sbYNaXGOD8VzGHAX2_Gp']/thead/tr/th[11]")
    public static WebElement heading_businessSegment;

    @FindBy(how = How.XPATH, using = "//table[@class='_4sbYNaXGOD8VzGHAX2_Gp']/thead/tr/th[12]")
    public static WebElement heading_partnerSegment;

    @FindBy(how = How.XPATH, using = "//table[@class='_4sbYNaXGOD8VzGHAX2_Gp']/thead/tr/th[13]")
    public static WebElement heading_custOpenDate;

    @FindBy(how = How.XPATH, using = "//div[@class='_1yZKqTlSrXNSB_Zl_9scaj']")
    public static WebElement heading_noSearchResult;

    @FindBy(how = How.XPATH, using = "//div[@class='_1yZKqTlSrXNSB_Zl_9scaj']")
    public static WebElement refinement_message;

    @FindBy(how = How.XPATH, using = "//div[@class='_1HWu9-VMmg-bQcnoV5fSo-']/label[not(@class='_3Q0Indavt4PQipSfQVyWpQ')]")
    public static WebElement bubble_highlight;

    @FindBy(how = How.XPATH, using = "//td[contains(text(),'996264849')]")
    public static WebElement individual_record;

    @FindBy(how = How.XPATH, using = "//td[contains(text(),'998003452')]")
    public static WebElement nonindividual_record;

}