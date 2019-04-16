package locators;

import info.seleniumcucumber.userStepDefintions.UserStepDefinitions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CaseNLeadLocators extends UserStepDefinitions {

    public CaseNLeadLocators() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Transactions')]")
    public static WebElement transaction_button;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Create Lead')]")
    public static WebElement create_lead;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Create Service Request')]")
    public static WebElement create_service_request;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Create Lead')]")
    public static WebElement create_lead_form_title;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Submit')]")
    public static WebElement submit_button;

    @FindBy(how = How.XPATH, using = "//div[@class='_31vqzyuKmHK9WBSIDdOtxz']")
    public static WebElement message_after_successfull_submission;

    @FindBy(how = How.XPATH, using = "//div[@class='css-1hwfws3']")
    public static WebElement select_custid;

    @FindBy(how = How.XPATH, using = "(//div[contains(text(),'998003452')])[2]")
    public static WebElement select_custid_from_dropdown;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Select Business Unit')]")
    public static WebElement select_lob;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Business Banking')]")
    public static WebElement select_lob_from_dropwdown;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Select Branch Name')]")
    public static WebElement select_branchname;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'GURGAON- HARYANA (2)')]")
    public static WebElement select_branchname_from_dropdown;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Select Product')]")
    public static WebElement select_productname;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Demat')]")
    public static WebElement select_productname_from_dropdown;

    @FindBy(how = How.ID, using = "remarks")
    public static WebElement remarks;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Book FD')]")
    public static WebElement create_lead_lable;

    @FindBy(how = How.XPATH, using = "(//div[@class='css-xp4uvy'])[1]")
    public static WebElement cust_id_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='css-142w6gm'])[2   ]")
    public static WebElement product_name_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='css-142w6gm'])[1]")
    public static WebElement lob_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='css-xp4uvy'])[2]")
    public static WebElement branch_name_value;

    @FindBy(how = How.ID, using = "remarks")
    public static WebElement remarks_tab;

    @FindBy(how = How.ID, using = "submit")
    public static WebElement submit_button_createlead;

    @FindBy(how = How.XPATH, using = "(//div[@class='_31vqzyuKmHK9WBSIDdOtxz'])")
    public static WebElement transaction_completed_successfully;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Update FATCA')]")
    public static WebElement update_fatca_lable;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'nba_close.b912ea74.svg')]")
    public static WebElement cross_button_nba;

    @FindBy(how = How.XPATH, using = "//img[@src='/static/media/Defer.c4b50860.svg']")
    public static WebElement defer_button;

    @FindBy(how = How.XPATH, using = "//div[@class='_1UTbBBTLWoGqq_t4gXKg85']")
    public static WebElement deferred_dismiss_message;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Close')]")
    public static WebElement close_button;

    @FindBy(how = How.XPATH, using = "//img[@src='/static/media/nba_close.b912ea74.svg']")
    public static WebElement cross_button_all_category;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Dismiss')]")
    public static WebElement dismiss_button;

    @FindBy(how = How.ID, using = "submit")
    public static WebElement dismiss_submit_button;

    @FindBy(how = How.XPATH, using = "//div[@class='_288kmL-P6mB4JB7iYJXHmn']")
    public static WebElement create_case_title;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Select Cust ID')]")
    public static WebElement click_custid_dropdown;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'998003451')]")
    public static WebElement select_custid_in_case;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Select Product Name')]")
    public static WebElement click_productname_dropdown;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Yes MSME')]")
    public static WebElement select_productname_for_case;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Select Case Type')]")
    public static WebElement click_casetype_dropdown;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Service Request')]")
    public static WebElement select_casetype_for_case;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Select Issue Type Name')]")
    public static WebElement click_issuetype_dropdown;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Request for Yes MSME set up')]")
    public static WebElement select_issuetype_for_case;

    @FindBy(how = How.XPATH, using = "//div[@class='VRzq6mIGh0FiXMvg-Kh1Z']/div[2]")
    public static WebElement category_regulatory;

    @FindBy(how = How.XPATH, using = "(//div[contains(text(),'998003452')])[2]")
    public static WebElement custId;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Cheque CMS and ECS')]")
    public static WebElement product_name;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'ECS')]")
    public static WebElement case_type;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'ECS instructions not initiated')]")
    public static WebElement issue_type_name;

    @FindBy(how = How.ID, using = "caseCategory")
    public static WebElement case_category;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'X-Sell')]")
    public static WebElement xsell_category;



}
