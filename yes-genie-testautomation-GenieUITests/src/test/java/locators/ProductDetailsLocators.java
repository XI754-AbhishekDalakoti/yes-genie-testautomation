package locators;

import info.seleniumcucumber.userStepDefintions.UserStepDefinitions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductDetailsLocators extends UserStepDefinitions {
    public ProductDetailsLocators() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Saving Account')]")
    public static WebElement savings_account;

    @FindBy(how = How.XPATH, using = "//tr[@class='_1nL_BTSxz4hYsaTP7n60yV'][1]//span")
    public static List<WebElement> table_headings;

    @FindBy(how = How.XPATH, using = "//tr[@class='_1nL_BTSxz4hYsaTP7n60yV'][2]//span")
    public static List<WebElement> table_values;

    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Alerts')]")
    public static WebElement alert_box;

    @FindBy(how = How.CSS, using = "label[class='_38PA79fk-_8yNRSRLyOI5P']")
    public static List<WebElement> alerts;

    @FindBy(how = How.CSS, using = "div[class='recharts-wrapper']")
    public static WebElement graph_box;

    @FindBy(how = How.CSS, using = "circle[class='recharts-dot recharts-line-dot']")
    public static WebElement graph_point;

    @FindBy(how = How.XPATH, using = "//li[@class='recharts-tooltip-item'][1]//span")
    public static List<WebElement> graph_datapoint1;

    @FindBy(how = How.XPATH, using = "//li[@class='recharts-tooltip-item'][2]//span")
    public static List<WebElement> graph_datapoint2;

    @FindBy(how = How.XPATH, using = "//tr[@class='_1nL_BTSxz4hYsaTP7n60yV'][2]")
    public static WebElement table_first_row;

    @FindBy(how = How.XPATH, using = "//tr[@class='_1nL_BTSxz4hYsaTP7n60yV'][3]")
    public static WebElement table_second_row;

    @FindBy(how = How.XPATH, using = "//div[@class='xP7FnLdBTDfM1ML_e-Okp']/span[1]")
    public static WebElement info_message;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')]")
    public static WebElement reset_button;


}
