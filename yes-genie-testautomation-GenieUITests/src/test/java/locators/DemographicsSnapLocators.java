package locators;

import info.seleniumcucumber.userStepDefintions.UserStepDefinitions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DemographicsSnapLocators extends UserStepDefinitions {

    public DemographicsSnapLocators() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "(//div[@class='OTMu80ITtJxpvgHq3X4pf'])[1]")
    public static List<WebElement> mdm_ckyc_keyValue;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'_268QFm3MsmQL5WaQLanvqr')]")
    public static List<WebElement> profession_vintage_keyValue;

    @FindBy(how = How.XPATH, using = "//div[@class='_2MhYYpxd84gAHqNlIb6wcI']")
    public static List<WebElement> bsps_customersegment_keyValue;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'_1uH3XPHYIGhn33dYxt_Pjh')]")
    public static List<WebElement> customertype_keyvalue;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'_3V7XtLKLvVLKhqv1t1UpLx')]/img")
    public static List<WebElement> aadhar_pan_passport_keyvalue;

    @FindBy(how = How.XPATH, using = "//span/a/img")
    public static List<WebElement> mobile_email_address_keystatus;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'_1Yfk9Isi-5iq9pN-LkHLPq')]")
    public static List<WebElement> mobile_email_address_values;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'_3ccnp6TFwPkSstS9IZxirH')]")
    public static List<WebElement> individual_details;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'_3ccnp6TFwPkSstS9IZxirH')]/div/img")
    public static List<WebElement> individual_details_headings;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'_2UMTFc3XbfVLEXUz2wZPNU')]/div")
    public static WebElement individual_contactibility_heading;

    @FindBy(how = How.XPATH, using = "//div[@class='_1OPxI6-jvHCO_9AhdxJie5']")
    public static WebElement individual_contactibility_value;

    @FindBy(how = How.XPATH, using = "//div[@class='_39L-52oY77XXN3mR2CMCrR']")
    public static WebElement individual_connections;

    @FindBy(how = How.XPATH, using = "//img[@class='_1_atkNt6WQrXXcs5RJIdA7']")
    public static WebElement individual_icon_text;

    @FindBy(how = How.XPATH, using = "//img[@src='/static/media/Corporate.7fd727ce.svg']")
    public static WebElement corporate_cust_type;

    @FindBy(how = How.XPATH, using = "//span[contains(@class,'_2USxA5C9026oPXW0fmlfg-')]")
    public static WebElement corporate_customername;

    @FindBy(how = How.XPATH, using = "//img[@src='/static/media/Corporate_Icon.e9e51629.svg']")
    public static WebElement corporate_doi;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'_1LWSN10VSAv_jJF8FejNWc')]")
    public static WebElement corporate_doi_value;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'_1GkkAcbPVHzKEfpA1iMz-P')]/div")
    public static List<WebElement> corporate_icon_tooltiptext;

    @FindBy(how = How.XPATH, using = "//div[@class='OTMu80ITtJxpvgHq3X4pf']/div")
    public static List<WebElement> corporate_mdmid;

    @FindBy(how = How.XPATH, using = "//div[@class='D-Ciw49PysMvGxc0nmQAV']/div")
    public static List<WebElement> corporate_business_bsps;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, '_3nb1YIL36ybgNuX9p5Vw-K')]/div")
    public static List<WebElement> corporate_industry;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, '_268QFm3MsmQL5WaQLanvqr')]/div")
    public static List<WebElement> corporate_vintage;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'_3Tuagfc1HkfnCmTkrLGF6u')]/div")
    public static List<WebElement> corporate_customer_type;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'_3FlKaYXTU4D1W1OeEDSRD3')]/div")
    public static List<WebElement> corporate_annual_turnover;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'_3LIYoDr15lNjvPToNw26Nd')]/img")
    public static List<WebElement> corporate_pan;

    @FindBy(how = How.XPATH, using = "//span/a/img")
    public static List<WebElement> corporate_attribute;

    @FindBy(how = How.XPATH, using = "//span[@class='_3_8_HQvOFAqqLUBp9U5Go']")
    public static WebElement corporate_current_address_onHover;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'_1Yfk9Isi-5iq9pN-LkHLPq')]/span")
    public static List<WebElement> corporate_values;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'_22_DcXKejxA-H4f9z4SbRS')]/span")
    public static WebElement corporate_current_address_value;

    @FindBy(how = How.XPATH, using = "//img[@src='/static/media/DropdownWhite.eed0f3f1.svg']")
    public static WebElement mdmID_demogs;

    @FindBy(how = How.XPATH, using = "//div[@class='_1Dtf-1VzufPBBjBoo-bTL4']/span[1]")
    public static List<WebElement> corporate_detailedmdmid_headings;

    @FindBy(how = How.XPATH, using = "//div[@class='_1Dtf-1VzufPBBjBoo-bTL4']/span[2]")
    public static List<WebElement> corporate_detailedmdmid_values;

    @FindBy(how = How.XPATH, using = "(//div[@class='_26rLMU3DQ5JN-e5AG5Zv4M'])[2]/div")
    public static WebElement detailed_mdmid_value_typeC;

    @FindBy(how = How.XPATH, using = "//div[@class='_1Dtf-1VzufPBBjBoo-bTL4']/span[1]")
    public static List<WebElement> corporate_detailedcustid_headings;

    @FindBy(how = How.XPATH, using = "//div[@class='_1Dtf-1VzufPBBjBoo-bTL4']/span[2]")
    public static List<WebElement> corporate_detailedcustid_values;

    @FindBy(how = How.XPATH, using = "//div[@class='OTMu80ITtJxpvgHq3X4pf']")
    public static List<WebElement> individual_headings;

    @FindBy(how = How.XPATH, using = "//div[@class='_1Dtf-1VzufPBBjBoo-bTL4']/span[1]")
    public static List<WebElement> individual_detailedmdmid_headings;

    @FindBy(how = How.XPATH, using = "//div[@class='_1Dtf-1VzufPBBjBoo-bTL4']/span[2]")
    public static List<WebElement> individual_detailedmdmid_values;

    @FindBy(how = How.XPATH, using = "//div[@class='_1Dtf-1VzufPBBjBoo-bTL4']/span[1]")
    public static List<WebElement> individual_detailedcustid_headings;

    @FindBy(how = How.XPATH, using = "//div[@class='_1Dtf-1VzufPBBjBoo-bTL4']/span[2]")
    public static List<WebElement> individual_detailedcustid_values;

    @FindBy(how = How.XPATH, using = "(//div[contains(text(),'996264849')])[3]")
    public static WebElement individual_detailed_custid;

    @FindBy(how = How.XPATH, using = "//div[@class='_39L-52oY77XXN3mR2CMCrR']")
    public static WebElement relationship_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'_3bPmvFCu2ReIPAONCmDte5')]/div[2]")
    public static WebElement category_investors;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'_3bPmvFCu2ReIPAONCmDte5')]/div[3]")
    public static WebElement category_friend;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'_3bPmvFCu2ReIPAONCmDte5')]/div[4]")
    public static WebElement category_corporate;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'_3bPmvFCu2ReIPAONCmDte5')]/div[5]")
    public static WebElement category_family;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'_3bPmvFCu2ReIPAONCmDte5')]/div[6]")
    public static WebElement category_client;

    @FindBy(how = How.XPATH, using = "//span[@class='_1e7iJQLfoqkQZa8rDieXHV']")
    public static WebElement heading_name;

    @FindBy(how = How.XPATH, using = "(//div[@class='MxwgDM3kCsHAgDOXzTxJi'])[1]/span")
    public static WebElement customer_name;

    @FindBy(how = How.XPATH, using = "(//div[@class='_2LqD-0cHt1a2Qr2CHEVavQ'])[1]")
    public static WebElement mdm_id;

    @FindBy(how = How.XPATH, using = "(//div[@class='_2LqD-0cHt1a2Qr2CHEVavQ'])[2]")
    public static WebElement self;

    @FindBy(how = How.XPATH, using = "(//div[@class='MxwgDM3kCsHAgDOXzTxJi'])[2]/span")
    public static WebElement linked_customer_name;

    @FindBy(how = How.XPATH, using = "(//div[@class='_2LqD-0cHt1a2Qr2CHEVavQ'])[3]")
    public static WebElement linked_mdm_id;

    @FindBy(how = How.XPATH, using = "(//div[@class='_2LqD-0cHt1a2Qr2CHEVavQ'])[4]")
    public static WebElement relationship;

    @FindBy(how = How.XPATH, using = "(//img[@src='/static/media/Individual.23f30a4e.svg'])")
    public static WebElement individual_icon;

    @FindBy(how = How.XPATH, using = "(//img[@src='/static/media/Individual.23f30a4e.svg'])")
    public static WebElement corporate_icon;

    @FindBy(how = How.XPATH, using = "//img[@src='/static/media/Auth_Arrow.512c4a42.svg']")
    public static WebElement authorized_signatory_icon;

    @FindBy(how = How.XPATH, using = "//span[@class='_285qQDT8CNm4bTNZb_c5vT']")
    public static WebElement authorized_signatory_page_heading;

    @FindBy(how = How.XPATH, using = "//tr/th[1]")
    public static WebElement mdmId_attribute;

    @FindBy(how = How.XPATH, using = "//tr/th[2]")
    public static WebElement cust_name_attribute;

    @FindBy(how = How.XPATH, using = "//tr/th[3]")
    public static WebElement gender_attribute;

    @FindBy(how = How.XPATH, using = "//tr/th[4]")
    public static WebElement email_attribute;

    @FindBy(how = How.XPATH, using = "//tr/th[5]")
    public static WebElement mobileno_attribute;

    @FindBy(how = How.XPATH, using = "//tr/th[6]")
    public static WebElement secondary_mobileno_attribute;

    @FindBy(how = How.XPATH, using = "//tr/th[7]")
    public static WebElement contactability_attribute;

    @FindBy(how = How.XPATH, using = "//tr/th[8]")
    public static WebElement current_cityState_attribute;

    @FindBy(how = How.XPATH, using = "(//td)[1]")
    public static WebElement authorised_first_mdmdid;

    @FindBy(how = How.XPATH, using = "(//td)[2]")
    public static WebElement authorised_first_custname;

    @FindBy(how = How.XPATH, using = "(//td)[3]")
    public static WebElement authorised_first_gender;

    @FindBy(how = How.XPATH, using = "(//td)[4]")
    public static WebElement authorised_first_email;

    @FindBy(how = How.XPATH, using = "(//td)[5]")
    public static WebElement authorised_first_mobileno;

    @FindBy(how = How.XPATH, using = "(//td)[6]")
    public static WebElement authorised_first_secondary_mobile;

    @FindBy(how = How.XPATH, using = "(//td)[7]")
    public static WebElement authorised_first_contactibility;

    @FindBy(how = How.XPATH, using = "(//td)[8]/span")
    public static WebElement authorised_first_currentcitystate;

    @FindBy(how = How.XPATH, using = "(//img[@class='qgW84NoZHrEw1QLQStQw1'])[1]")
    public static WebElement email_status_of_authorised_signatory;

    @FindBy(how = How.XPATH, using = "(//img[@class='qgW84NoZHrEw1QLQStQw1'])[2]")
    public static WebElement mobileno_status_of_authorised_signatory;
}




