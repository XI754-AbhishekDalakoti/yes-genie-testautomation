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

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'email.36e7631f.svg')]")
    public static WebElement updateemail_icon;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'locker.0550e5d8.svg')]")
    public static WebElement locker_icon;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'fatca_declaration.21eb9e84.svg')]")
    public static WebElement updatefatca_icon;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'fixed_deposit.2dd337c6.svg')]")
    public static WebElement fixeddeposit_icon;

}
