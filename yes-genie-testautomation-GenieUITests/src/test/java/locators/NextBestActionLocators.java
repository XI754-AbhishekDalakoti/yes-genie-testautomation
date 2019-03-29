package locators;

import info.seleniumcucumber.userStepDefintions.UserStepDefinitions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NextBestActionLocators extends UserStepDefinitions {
    public NextBestActionLocators() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//div[@class='_37o44A1ADlDnmq-cWSzlSy']/div/div")
    public static List<WebElement> count_of_recommendation_in_each_category;

    @FindBy(how = How.XPATH, using = "//div[@class='VRzq6mIGh0FiXMvg-Kh1Z']/div[1]")
    public static WebElement category_all;

    @FindBy(how = How.XPATH, using = "//div[@class='VRzq6mIGh0FiXMvg-Kh1Z']/div[2]")
    public static WebElement category_regulatory;

    @FindBy(how = How.XPATH, using = "//div[@class='VRzq6mIGh0FiXMvg-Kh1Z']/div[3]")
    public static WebElement category_service;

    @FindBy(how = How.XPATH, using = "//div[@class='VRzq6mIGh0FiXMvg-Kh1Z']/div[4]")
    public static WebElement category_xsell;

    @FindBy(how = How.XPATH, using = "//div[@class='VRzq6mIGh0FiXMvg-Kh1Z']/div[5]")
    public static WebElement category_alerts;

    @FindBy(how = How.XPATH, using = "//div[@class='VRzq6mIGh0FiXMvg-Kh1Z']/div[6]")
    public static WebElement category_information;

    @FindBy(how = How.XPATH, using = "(//div[@class='B1b-Lu2n9m4TNaSSepk_p'])[1]")
    public static List<WebElement> nba_details;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'default.82358909.svg')]")
    public static WebElement default_icon;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'savings_account.e9c3bf3f.svg')]")
    public static WebElement savingsaccount_icon;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'current_account.73a6b343.svg')]")
    public static WebElement currentaccount_icon;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'personal_loan.a21227df.svg')]")
    public static WebElement personalloan_icon;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'mutual_funds.ed5d9304.svg')]")
    public static WebElement mutualfund_icon;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'fixed_deposit.2dd337c6.svg')]")
    public static WebElement fixeddeposit_icon;

}
