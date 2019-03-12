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

    @FindBy(how = How.XPATH, using = "//div[contains(@class, '_2USxA5C9026oPXW0fmlfg-')]/span")
    public static WebElement customername;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'kEWBDoHMNQ5jG2zd4akm')]")
    public static WebElement dob_doi;

    @FindBy(how = How.XPATH, using = "//div[@class='_24PYoJhN3w2ihktZqZgrIx']")
    public static WebElement mdmid_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='tGryspxNgmwWz4yKlBBB8'])[2]")
    public static WebElement profession_value;

    @FindBy(how = How.XPATH, using = "(//a[contains(@class, '_22_DcXKejxA-H4f9z4SbRS')])[1]")
    public static WebElement mobileNo_value;

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

    @FindBy(how = How.XPATH, using = "(//span[@class='_1ItRkkJp4JtCGSqCU2C5QD'])[5]")
    public static WebElement recommendation_data;

    @FindBy(how = How.XPATH, using = "(//div[@class='e52w_BTQ1gFCUHGWcBhio'])[1]")
    public static WebElement recommendation_end_date;

    @FindBy(how = How.XPATH, using = "(//div[@class='_2gVTPG7uHIMeGvbtzdUoz0'])[2]/div")
    public static WebElement action_lable;

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

    @FindBy(how = How.ID, using = "nbaItemClose-0-0")
    public static WebElement cross_button_sell_category;

    @FindBy(how = How.XPATH, using = "//div[@class='_2uJC9yo-UWAB5wmeI1DfQj']")
    public static WebElement calender_submit;

    @FindBy(how = How.XPATH, using = "(//div[@class='_3SHH88IPp0skc0h6q5UV6Q'])[2]")
    public static WebElement dismiss_button;

    @FindBy(how = How.XPATH, using = "(//input[@type='radio'])[2]")
    public static WebElement select_dimiss_reason;

    @FindBy(how = How.ID, using = "submit")
    public static WebElement dismiss_submit_button;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'_3bPmvFCu2ReIPAONCmDte5')]/div[2]")
    public static WebElement relation_category_investor;

    @FindBy(how = How.XPATH, using = "//span[@class='_1e7iJQLfoqkQZa8rDieXHV']")
    public static WebElement heading_name;

    @FindBy(how = How.XPATH, using = "//div[@class='AvMHovGJlIEUhAIFgNAtR']")
    public static WebElement relation_graph_minimize_icon;

    @FindBy(how = How.XPATH, using = "//div[@class='_288kmL-P6mB4JB7iYJXHmn']")
    public static WebElement create_lead_custid_attribute;

    @FindBy(how = How.XPATH, using = "996264849")
    public static WebElement group_nrv_atttribute;

    @FindBy(how = How.XPATH, using = "996264849")
    public static WebElement nrv_attribute;

    @FindBy(how = How.XPATH, using = "996264849")
    public static WebElement ppi_attribute;

    @FindBy(how = How.XPATH, using = "996264849")
    public static WebElement group_nrv_value;

    @FindBy(how = How.XPATH, using = "996264849")
    public static WebElement nrv_value;

    @FindBy(how = How.XPATH, using = "996264849")
    public static WebElement ppi_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3']/span[1])[1]")
    public static WebElement detailed_cust_name;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3']/span[2])[1]")
    public static WebElement detailed_dob;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3']/span[3])[1]")
    public static WebElement detailed_profession;

    @FindBy(how = How.XPATH, using = "//a[@class='_1OPvaD4SzHDOYCr9ReE2dw']/span")
    public static WebElement detailed_email;

    @FindBy(how = How.XPATH, using = "(//span[@class='_3VeCHIt6FLYXYaCXATKVND'])[2]/a")
    public static WebElement detailed_mobileNo;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[2]/span[4]")
    public static WebElement detailed_address;

    @FindBy(how = How.XPATH, using = "(//a[contains(@class,'_16uaZ5Pfb_GGhcja4IBY_O')])[2]/span")
    public static WebElement email_value;

    @FindBy(how = How.XPATH, using = "(//a[@class='_1OPvaD4SzHDOYCr9ReE2dw'])[1]/span")
    public static WebElement detailed_mdmid_value;












}



