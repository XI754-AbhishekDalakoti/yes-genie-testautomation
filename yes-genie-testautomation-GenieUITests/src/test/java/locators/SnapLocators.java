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
    public static WebElement individual_icon;

    @FindBy(how = How.XPATH, using = "//div[@class='_2USxA5C9026oPXW0fmlfg-']")
    public static WebElement customername;

    @FindBy(how = How.XPATH, using = "//div[@class='_3-kEWBDoHMNQ5jG2zd4akm']")
    public static WebElement dob_doi;

    @FindBy(how = How.XPATH, using = "//div[@class='_3-kEWBDoHMNQ5jG2zd4akm']/img")
    public static WebElement dobdoi_tooltipText;

    @FindBy(how = How.XPATH, using = "//div[@class='_19MTAE-IAsaHScleHpI0fF']/div[2]/div/img")
    public static WebElement contactibility;

    @FindBy(how = How.XPATH, using = "//div[@class='_19MTAE-IAsaHScleHpI0fF']/div[3]/div")
    public static WebElement homebranchname;

    @FindBy(how = How.XPATH, using = "//div[@class='_19MTAE-IAsaHScleHpI0fF']/div[4]/div/img")
    public static WebElement connections;

    @FindBy(how = How.XPATH, using = "//div[@class='_1OSLB2oWSVu4PHie1sadf3']/div/div[1]")
    public static WebElement mdmid;

    @FindBy(how = How.XPATH, using = "//div[@class='_1OSLB2oWSVu4PHie1sadf3']/div/div[1]/div[1]")
    public static WebElement profession;

    @FindBy(how = How.XPATH, using = "//div[@class='OTMu80ITtJxpvgHq3X4pf']/div[3]/div[1]")
    public static WebElement ckyc;

    @FindBy(how = How.XPATH, using = "//div[@class='_1OSLB2oWSVu4PHie1sadf3']/div[2]/div[2]")
    public static WebElement vintage;

    @FindBy(how = How.XPATH, using = "//div[@class='_104h8bFD34DMbVVZzgAnQl']/div[1]/div[1]/div[1]")
    public static WebElement bsps;

    @FindBy(how = How.XPATH, using = "//div[@class='_104h8bFD34DMbVVZzgAnQl']/div[2]/div[1]/div[1]")
    public static WebElement customer_segment;

    @FindBy(how = How.XPATH, using = "//div[@class='_104h8bFD34DMbVVZzgAnQl']/div[1]/div[2]/div")
    public static WebElement customer_type;

    @FindBy(how = How.XPATH, using = "//div[@class='_1lJ3q59zQVK2lzN12QazzB']/div/img[1]")
    public static WebElement aadhar;

    @FindBy(how = How.XPATH, using = "//div[@class='_1lJ3q59zQVK2lzN12QazzB']/div/img[2]")
    public static WebElement pan;

    @FindBy(how = How.XPATH, using = "//div[@class='_1lJ3q59zQVK2lzN12QazzB']/div/img[3]")
    public static WebElement passport;

    @FindBy(how = How.XPATH, using = "//div[@class='_1T2Deurhkt2YNlc-Ef7yLD']/div/div[7]/div/a/img")
    public static WebElement mobile_no;

    @FindBy(how = How.XPATH, using = "//div[@class='_1T2Deurhkt2YNlc-Ef7yLD']/div/div[7]/div/a[2]/img")
    public static WebElement email;

    @FindBy(how = How.XPATH, using = "//div[@class='_1T2Deurhkt2YNlc-Ef7yLD']/div/div[7]/div/div/img")
    public static WebElement address;

    @FindBy(how = How.XPATH, using = "//div[@class='_1OPxI6-jvHCO_9AhdxJie5']/img")
    public static WebElement constitution;

    @FindBy(how = How.XPATH, using = "//div[@class='_39L-52oY77XXN3mR2CMCrR']/div[1]/a/img")
    public static WebElement website;

    @FindBy(how = How.XPATH, using = "//div[@class='_19MTAE-IAsaHScleHpI0fF']/div[3]/div/img")
    public static WebElement corporate_connections;

    @FindBy(how = How.XPATH, using = "//div[@class='_1OSLB2oWSVu4PHie1sadf3']/div/div[3]")
    public static WebElement business;

    @FindBy(how = How.XPATH, using = "//div[@class='_1OSLB2oWSVu4PHie1sadf3']/div[2]/div[1]")
    public static WebElement industry;

    @FindBy(how = How.XPATH, using = "//div[@class='_1OSLB2oWSVu4PHie1sadf3']/div[2]/div[3]")
    public static WebElement corporate_vintage;

    @FindBy(how = How.XPATH, using = "//div[@class='_3m_4iuI8kZwQ-JiXRTUfzX']/div[5]/div[2]/div")
    public static WebElement annual_turnover;

    @FindBy(how = How.XPATH, using = "//div[@class='_104h8bFD34DMbVVZzgAnQl']/div[2]/div[3]/img")
    public static WebElement corporate_pan;

    @FindBy(how = How.XPATH, using = "//div[@class='_3m_4iuI8kZwQ-JiXRTUfzX']/div[6]/div/a[1]/img")
    public static WebElement corporate_mobileNo;

    @FindBy(how = How.XPATH, using = "//div[@class='_3m_4iuI8kZwQ-JiXRTUfzX']/div[6]/div/a[2]/img")
    public static WebElement alternate_mobileNo;

    @FindBy(how = How.XPATH, using = "//div[@class='_3m_4iuI8kZwQ-JiXRTUfzX']/div[6]/div/a[3]/img")
    public static WebElement corporate_email;

    @FindBy(how = How.XPATH, using = "//div[@class='_3m_4iuI8kZwQ-JiXRTUfzX']/div[6]/div/div/img")
    public static WebElement corporate_address;

}



