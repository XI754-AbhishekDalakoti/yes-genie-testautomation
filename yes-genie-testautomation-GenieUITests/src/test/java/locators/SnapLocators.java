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
    public static WebElement icon;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, '_2USxA5C9026oPXW0fmlfg-')]")
    public static WebElement customername;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'kEWBDoHMNQ5jG2zd4akm')]")
    public static WebElement dob_doi;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'kEWBDoHMNQ5jG2zd4akm')]/img")
    public static WebElement dobdoi_tooltipText;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class, '_39L-52oY77XXN3mR2CMCrR')])[1]")
    public static WebElement authorised_signatory_tooltiptext;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class, '_39L-52oY77XXN3mR2CMCrR')])[2]")
    public static WebElement connections_tooltiptext;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class, '_39L-52oY77XXN3mR2CMCrR')])[3]")
    public static WebElement website_tooltiptext;

    @FindBy(how = How.XPATH, using = "//div[@class='_19MTAE-IAsaHScleHpI0fF']/div[3]/div")
    public static WebElement homebranchname;

    @FindBy(how = How.XPATH, using = "//div[@class='_19MTAE-IAsaHScleHpI0fF']/div[4]/div/img")
    public static WebElement connections;

    @FindBy(how = How.XPATH, using = "(//div[@class='_2Z1-0e6lDtN46kzzs-wGIf'])[1]")
    public static WebElement attribute_mdmid;

    @FindBy(how = How.XPATH, using = "//div[@class='_1RRMjt720IgPklxsu2yc8m']")
    public static WebElement mdmid_value;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class, '_2Z1-0e6lDtN46kzzs-wGIf')])[3]")
    public static WebElement profession_attribute;

    @FindBy(how = How.XPATH, using = "(//div[@class='tGryspxNgmwWz4yKlBBB8'])[2]")
    public static WebElement profession_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='D-Ciw49PysMvGxc0nmQAV'])[1]/div")
    public static WebElement ckycNo_attribute;

    @FindBy(how = How.XPATH, using = "(//div[@class='tGryspxNgmwWz4yKlBBB8'])[1]/div")
    public static WebElement ckycNo_value;

    @FindBy(how = How.XPATH, using = "//div[@class='tGryspxNgmwWz4yKlBBB8 _3I3leJDZEzF-2rq1kzGvRQ']")
    public static WebElement vintage_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='D-Ciw49PysMvGxc0nmQAV'])[3]/div")
    public static WebElement bsps_attribute;

    @FindBy(how = How.XPATH, using = "(//div[@class='D-Ciw49PysMvGxc0nmQAV'])[2]/div")
    public static WebElement bsps_corporate_attribute;

    @FindBy(how = How.XPATH, using = "(//span[@class='tGryspxNgmwWz4yKlBBB8'])")
    public static WebElement bsps_value1;

    @FindBy(how = How.XPATH, using = "(//span[@class='tGryspxNgmwWz4yKlBBB8'])[2]")
    public static WebElement bsps_value2;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class, '_2Z1-0e6lDtN46kzzs-wGIf')])[6]")
    public static WebElement customer_segment_attribute;

    @FindBy(how = How.XPATH, using = "(//div[@class='tGryspxNgmwWz4yKlBBB8'])[4]/span")
    public static WebElement customer_segment_value;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class, '_2Z1-0e6lDtN46kzzs-wGIf')])[7]")
    public static WebElement customer_type_attribute;

    @FindBy(how = How.XPATH, using = "(//div[@class='tGryspxNgmwWz4yKlBBB8'])[5]/span")
    public static WebElement customer_type_value;

    @FindBy(how = How.XPATH, using = "//div[@class='OTMu80ITtJxpvgHq3X4pf _1ZlXZ-2pf7HlQHw6IvlQe9']/img[1]")
    public static WebElement aadhar_tooltiptext;

    @FindBy(how = How.XPATH, using = "//div[@class='OTMu80ITtJxpvgHq3X4pf _1ZlXZ-2pf7HlQHw6IvlQe9']/img[2]")
    public static WebElement pan_tooltiptext;

    @FindBy(how = How.XPATH, using = "//div[@class='OTMu80ITtJxpvgHq3X4pf _1ZlXZ-2pf7HlQHw6IvlQe9']/img[3]")
    public static WebElement passport_tooltiptext;

    @FindBy(how = How.XPATH, using = "(//div[@class='OTMu80ITtJxpvgHq3X4pf'])[4]/img[1]")
    public static WebElement aadhar_status;

    @FindBy(how = How.XPATH, using = "(//div[@class='OTMu80ITtJxpvgHq3X4pf'])[4]/img[1]")
    public static WebElement pan_status;

    @FindBy(how = How.XPATH, using = "(//div[@class='OTMu80ITtJxpvgHq3X4pf'])[4]/img[1]")
    public static WebElement passport_status;

    @FindBy(how = How.XPATH, using = "(//div[@class='_2Z1-0e6lDtN46kzzs-wGIf'])[2]")
    public static WebElement attribute_business;

    @FindBy(how = How.XPATH, using = "(//div[@class='_1ZlXZ-2pf7HlQHw6IvlQe9'])[2]")
    public static WebElement business_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_2Z1-0e6lDtN46kzzs-wGIf'])[3]")
    public static WebElement industry_attribute;

    @FindBy(how = How.XPATH, using = "(//div[@class='tGryspxNgmwWz4yKlBBB8'])[2]")
    public static WebElement industry_value;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class, '_2Z1-0e6lDtN46kzzs-wGIf')])[4]")
    public static WebElement vintage_attribute;

    @FindBy(how = How.XPATH, using = "(//div[@class='_2Z1-0e6lDtN46kzzs-wGIf'])[4]")
    public static WebElement annual_turnover_attribute;

    @FindBy(how = How.XPATH, using = "(//div[@class='tGryspxNgmwWz4yKlBBB8'])[5]")
    public static WebElement annual_turnover_value;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, '_3LIYoDr15lNjvPToNw26Nd')]/img[1]")
    public static WebElement corporate_pan_tooltiptext;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, '_3LIYoDr15lNjvPToNw26Nd')]/img[2]")
    public static WebElement corporate_pan_status;

    @FindBy(how = How.XPATH, using = "(//a[@class='_361NW01yaAs-Wcs5kATCQL'])[1]/img")
    public static WebElement mobileNo_tooltiptext;

    @FindBy(how = How.XPATH, using = "(//a[contains(@class, 'tGryspxNgmwWz4yKlBBB8')])[1]")
    public static WebElement mobileNo_value;

    @FindBy(how = How.XPATH, using = "(//a[@class='_361NW01yaAs-Wcs5kATCQL'])[4]/img")
    public static WebElement mobileNo_status;

    @FindBy(how = How.XPATH, using = "(//a[@class='_361NW01yaAs-Wcs5kATCQL'])[2]/img")
    public static WebElement alternate_mobileNo_tooltiptext;

    @FindBy(how = How.XPATH, using = "(//a[contains(@class, 'tGryspxNgmwWz4yKlBBB8')])[2]")
    public static WebElement alternate_mobileNo_value;

    @FindBy(how = How.XPATH, using = "(//a[@class='_361NW01yaAs-Wcs5kATCQL'])[5]/img")
    public static WebElement alternate_mobileNo_status;

    @FindBy(how = How.XPATH, using = "(//a[@class='_361NW01yaAs-Wcs5kATCQL'])[2]/img")
    public static WebElement email_tooltiptext;

    @FindBy(how = How.XPATH, using = "(//a[contains(@class, '_361NW01yaAs-Wcs5kATCQL')])[5]/span")
    public static WebElement email_value;

    @FindBy(how = How.XPATH, using = "(//a[contains(@class, 'tGryspxNgmwWz4yKlBBB8')])[3]")
    public static WebElement corporate_email_value;

    @FindBy(how = How.XPATH, using = "(//a[@class='_361NW01yaAs-Wcs5kATCQL'])[4]/img")
    public static WebElement email_status;

    @FindBy(how = How.XPATH, using = "//a[contains(@class, '_1ZlXZ-2pf7HlQHw6IvlQe9')]/img")
    public static WebElement address_tooltiptext;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, '_1ZlXZ-2pf7HlQHw6IvlQe9')]/span")
    public static WebElement address_value;

    @FindBy(how = How.XPATH, using = "(//a[@class='_361NW01yaAs-Wcs5kATCQL'])[5]/img")
    public static WebElement address_status;

    @FindBy(how = How.XPATH, using = "//div[@class='VRzq6mIGh0FiXMvg-Kh1Z']/div[1]")
    public static WebElement category_all;

    @FindBy(how = How.XPATH, using = "//div[@class='VRzq6mIGh0FiXMvg-Kh1Z']/div[2]")
    public static WebElement category_regulatory;

    @FindBy(how = How.XPATH, using = "//div[@class='VRzq6mIGh0FiXMvg-Kh1Z']/div[3]")
    public static WebElement category_service;

    @FindBy(how = How.XPATH, using = "//div[@class='VRzq6mIGh0FiXMvg-Kh1Z']/div[4]")
    public static WebElement category_sell;

    @FindBy(how = How.XPATH, using = "//div[@class='VRzq6mIGh0FiXMvg-Kh1Z']/div[5]")
    public static WebElement category_alerts;

    @FindBy(how = How.XPATH, using = "//div[@class='VRzq6mIGh0FiXMvg-Kh1Z']/div[6]")
    public static WebElement category_information;

    @FindBy(how = How.XPATH, using = "(//div[@class='_1eD15-Ctmmj-a116Qe9TIk'])[1]/div/span")
    public static WebElement recommendation_data;

    @FindBy(how = How.XPATH, using = "(//div[@class='e52w_BTQ1gFCUHGWcBhio'])[1]")
    public static WebElement recommendation_end_date;

    @FindBy(how = How.XPATH, using = "(//div[@class='_2gVTPG7uHIMeGvbtzdUoz0'])[1]/div")
    public static WebElement action_lable;

    @FindBy(how = How.XPATH, using = "(//div[@class='_2gVTPG7uHIMeGvbtzdUoz0'])[1]/div")
    public static WebElement book_fd_lable;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, '_2IsuK2p9vH43XwRgJIESFz') and text() = 'Cust ID']")
    public static WebElement cust_id_attribute;

    @FindBy(how = How.XPATH, using = "(//div[@class='_3RRdNL0L_hPI0WIDrzn26Y'])[2]")
    public static WebElement product_name_attribute;

    @FindBy(how = How.XPATH, using = "(//div[@class='_3RRdNL0L_hPI0WIDrzn26Y'])[3]")
    public static WebElement bu_attribute;

    @FindBy(how = How.XPATH, using = "(//div[@class='_3RRdNL0L_hPI0WIDrzn26Y'])[4]")
    public static WebElement source_ref_id_attribute;

    @FindBy(how = How.XPATH, using = "(//div[@class='_3RRdNL0L_hPI0WIDrzn26Y'])[5]")
    public static WebElement branch_code_attribute;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Remarks']")
    public static WebElement remarks_attribute;

    @FindBy(how = How.XPATH, using = "(//div[@class='_3hL0ZmbCNbL6IPGho4gr_g'])[1]/div")
    public static WebElement cust_id_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_1PeIO4jIzGcxXDjDHApNmp'])[4]")
    public static WebElement product_name_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_1PeIO4jIzGcxXDjDHApNmp'])[2]")
    public static WebElement bu_value;

    @FindBy(how = How.XPATH, using = "(//input[@class='_3M_2Tbhcm6YQtu0uK0T6Ym'])")
    public static WebElement source_ref_id_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_1PeIO4jIzGcxXDjDHApNmp'])[3]")
    public static WebElement branch_code_value;

    @FindBy(how = How.ID, using = "submit")
    public static WebElement submit_button_bookFdpage;

    @FindBy(how = How.XPATH, using = "(//div[@class='_31vqzyuKmHK9WBSIDdOtxz'])")
    public static WebElement transaction_completed_successfully;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Remarks']")
    public static WebElement remarks_tab;
}



