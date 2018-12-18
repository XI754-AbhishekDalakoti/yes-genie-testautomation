package locators;

import info.seleniumcucumber.userStepDefintions.UserStepDefinitions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SnapLocators extends UserStepDefinitions {

    public SnapLocators() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//div[@class='Zpr-MNfPstkKfN9HLNF5_']/img")
    public static WebElement IndividualIcon;

    @FindBy(how = How.XPATH, using = "//div[@class='_2USxA5C9026oPXW0fmlfg-']")
    public static WebElement CustomerName;

    @FindBy(how = How.XPATH, using = "//div[@class='_3-kEWBDoHMNQ5jG2zd4akm']")
    public static WebElement DobDoi;

    @FindBy(how = How.XPATH, using = "//div[@class='_3-kEWBDoHMNQ5jG2zd4akm']/img")
    public static WebElement DobDoiTooltipText;

    @FindBy(how = How.XPATH, using = "//div[@class='_19MTAE-IAsaHScleHpI0fF']/div[2]/div/img")
    public static WebElement Contactibility;

    @FindBy(how = How.XPATH, using = "//div[@class='_19MTAE-IAsaHScleHpI0fF']/div[3]/div")
    public static WebElement HomeBranchname;

    @FindBy(how = How.XPATH, using = "//div[@class='_19MTAE-IAsaHScleHpI0fF']/div[4]/div/img")
    public static WebElement Connections;

    @FindBy(how = How.XPATH, using = "//div[@class='_1OSLB2oWSVu4PHie1sadf3']/div/div[1]")
    public static WebElement MDMID;

    @FindBy(how = How.XPATH, using = "//div[@class='_1OSLB2oWSVu4PHie1sadf3']/div/div[1]/div[1]")
    public static WebElement Profession;

    @FindBy(how = How.XPATH, using = "//div[@class='OTMu80ITtJxpvgHq3X4pf']/div[3]/div[1]")
    public static WebElement CKYC;

    @FindBy(how = How.XPATH, using = "//div[@class='_1OSLB2oWSVu4PHie1sadf3']/div[2]/div[2]")
    public static WebElement Vintage;

    @FindBy(how = How.XPATH, using = "//div[@class='_104h8bFD34DMbVVZzgAnQl']/div[1]/div[1]/div[1]")
    public static WebElement BSPS;

    @FindBy(how = How.XPATH, using = "//div[@class='_104h8bFD34DMbVVZzgAnQl']/div[2]/div[1]/div[1]")
    public static WebElement CustomerSegment;

    @FindBy(how = How.XPATH, using = "//div[@class='_104h8bFD34DMbVVZzgAnQl']/div[1]/div[2]/div")
    public static WebElement CustomerType;

    @FindBy(how = How.XPATH, using = "//div[@class='_1lJ3q59zQVK2lzN12QazzB']/div/img[1]")
    public static WebElement Aadhar;

    @FindBy(how = How.XPATH, using = "//div[@class='_1lJ3q59zQVK2lzN12QazzB']/div/img[2]")
    public static WebElement Pan;

    @FindBy(how = How.XPATH, using = "//div[@class='_1lJ3q59zQVK2lzN12QazzB']/div/img[3]")
    public static WebElement Passport;

    @FindBy(how = How.XPATH, using = "//div[@class='_1T2Deurhkt2YNlc-Ef7yLD']/div/div[7]/div/a/img")
    public static WebElement MobileNo;

    @FindBy(how = How.XPATH, using = "//div[@class='_1T2Deurhkt2YNlc-Ef7yLD']/div/div[7]/div/a[2]/img")
    public static WebElement Email;

    @FindBy(how = How.XPATH, using = "//div[@class='_1T2Deurhkt2YNlc-Ef7yLD']/div/div[7]/div/div/img")
    public static WebElement Address;

    @FindBy(how = How.XPATH, using = "//div[@class='_1OPxI6-jvHCO_9AhdxJie5']/img")
    public static WebElement Constitution;

    @FindBy(how = How.XPATH, using = "//div[@class='_39L-52oY77XXN3mR2CMCrR']/div[1]/a/img")
    public static WebElement Website;

    @FindBy(how = How.XPATH, using = "//div[@class='_19MTAE-IAsaHScleHpI0fF']/div[3]/div/img")
    public static WebElement CorporateConnections;

    @FindBy(how = How.XPATH, using = "//div[@class='_1OSLB2oWSVu4PHie1sadf3']/div/div[3]")
    public static WebElement Business;

    @FindBy(how = How.XPATH, using = "//div[@class='_1OSLB2oWSVu4PHie1sadf3']/div[2]/div[1]")
    public static WebElement Industry;

    @FindBy(how = How.XPATH, using = "//div[@class='_1OSLB2oWSVu4PHie1sadf3']/div[2]/div[3]")
    public static WebElement CorporateVintage;

    @FindBy(how = How.XPATH, using = "//div[@class='_3m_4iuI8kZwQ-JiXRTUfzX']/div[5]/div[2]/div")
    public static WebElement AnnualTurnover;

    @FindBy(how = How.XPATH, using = "//div[@class='_104h8bFD34DMbVVZzgAnQl']/div[2]/div[3]/img")
    public static WebElement CorporatePan;

    @FindBy(how = How.XPATH, using = "//div[@class='_3m_4iuI8kZwQ-JiXRTUfzX']/div[6]/div/a[1]/img")
    public static WebElement CorporateMobileNo;

    @FindBy(how = How.XPATH, using = "//div[@class='_3m_4iuI8kZwQ-JiXRTUfzX']/div[6]/div/a[2]/img")
    public static WebElement AlternateMobileNo;

    @FindBy(how = How.XPATH, using = "//div[@class='_3m_4iuI8kZwQ-JiXRTUfzX']/div[6]/div/a[3]/img")
    public static WebElement CorporateEmail;

    @FindBy(how = How.XPATH, using = "//div[@class='_3m_4iuI8kZwQ-JiXRTUfzX']/div[6]/div/div/img")
    public static WebElement CorporateAddress;

}



