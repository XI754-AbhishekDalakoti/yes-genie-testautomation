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
    public static WebElement doi_tooltipText;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class, 'kEWBDoHMNQ5jG2zd4akm')]/img)[1]")
    public static WebElement dob_tooltipText;

    @FindBy(how = How.XPATH, using = "(//span[@class='_1ItRkkJp4JtCGSqCU2C5QD'])[2]")
    public static WebElement home_branch_value;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class,'_3-kEWBDoHMNQ5jG2zd4akm')])[2]/img")
    public static WebElement home_branch_tooltiptext;

    @FindBy(how = How.XPATH, using = "//div[@class='_1OPxI6-jvHCO_9AhdxJie5']")
    public static WebElement contactibility_value;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class, '_39L-52oY77XXN3mR2CMCrR')])[1]")
    public static WebElement authorised_signatory_tooltiptext;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class, '_39L-52oY77XXN3mR2CMCrR')])[2]")
    public static WebElement connections_tooltiptext;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class, '_39L-52oY77XXN3mR2CMCrR')])[3]")
    public static WebElement website_tooltiptext;

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

    @FindBy(how = How.XPATH, using = "(//div[contains(@class, '_2Z1-0e6lDtN46kzzs-wGIf')])[6]")
    public static WebElement corporate_customer_type_attribute;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class, '_2Z1-0e6lDtN46kzzs-wGIf')])[7]")
    public static WebElement customer_type_attribute;

    @FindBy(how = How.XPATH, using = "(//div[@class='tGryspxNgmwWz4yKlBBB8'])[5]/span")
    public static WebElement customer_type_value;

    @FindBy(how = How.XPATH, using = "(//span[@class='_3A8Wt0BtAhBZ9BUf5uJNu7'])[8]")
    public static WebElement detailed_corporate_alternateno_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[2]/span[4]")
    public static WebElement detailed_corporate_homebranch_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[2]/span[5]")
    public static WebElement detailed_corporate_cluster_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[2]/span[6]")
    public static WebElement detailed_corporate_region_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[2]/span[7]")
    public static WebElement detailed_corporate_iec_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[4]/span[1]")
    public static WebElement detailed_corporate_natureofbusiness_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[4]/span[2]")
    public static WebElement detailed_corporate_natureofindustry_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[4]/span[3]")
    public static WebElement detailed_corporate_riskcategory_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[4]/span[4]")
    public static WebElement detailed_corporate_webiste_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[4]/span[5]")
    public static WebElement detailed_corporate_ecommsite_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='tGryspxNgmwWz4yKlBBB8'])[4]/span")
    public static WebElement corporate_customer_type_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='OTMu80ITtJxpvgHq3X4pf'])[3]/img[1]")
    public static WebElement aadhar_tooltiptext;

    @FindBy(how = How.XPATH, using = "(//div[@class='OTMu80ITtJxpvgHq3X4pf'])[3]/img[2]")
    public static WebElement pan_tooltiptext;

    @FindBy(how = How.XPATH, using = "(//div[@class='OTMu80ITtJxpvgHq3X4pf'])[3]/img[3]")
    public static WebElement passport_tooltiptext;

    @FindBy(how = How.XPATH, using = "(//div[@class='OTMu80ITtJxpvgHq3X4pf'])[4]/img[1]")
    public static WebElement aadhar_status;

    @FindBy(how = How.XPATH, using = "(//div[@class='OTMu80ITtJxpvgHq3X4pf'])[4]/img[2]")
    public static WebElement pan_status;

    @FindBy(how = How.XPATH, using = "(//div[@class='OTMu80ITtJxpvgHq3X4pf'])[4]/img[3]")
    public static WebElement passport_status;

    @FindBy(how = How.XPATH, using = "(//div[@class='_2Z1-0e6lDtN46kzzs-wGIf'])[2]")
    public static WebElement corporate_attribute_business;

    @FindBy(how = How.XPATH, using = "(//div[@class='tGryspxNgmwWz4yKlBBB8'])[1]")
    public static WebElement corporate_business_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_2Z1-0e6lDtN46kzzs-wGIf'])[3]")
    public static WebElement corporate_industry_attribute;

    @FindBy(how = How.XPATH, using = "(//div[@class='tGryspxNgmwWz4yKlBBB8'])[2]")
    public static WebElement corporate_industry_value;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class, '_2Z1-0e6lDtN46kzzs-wGIf')])[4]")
    public static WebElement vintage_attribute;

    @FindBy(how = How.XPATH, using = "(//div[@class='_2Z1-0e6lDtN46kzzs-wGIf'])[4]")
    public static WebElement annual_turnover_corporate_attribute;

    @FindBy(how = How.XPATH, using = "(//div[@class='tGryspxNgmwWz4yKlBBB8'])[5]")
    public static WebElement annual_turnover_corporate_value;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, '_3LIYoDr15lNjvPToNw26Nd')]/img[1]")
    public static WebElement corporate_pan_tooltiptext;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, '_3LIYoDr15lNjvPToNw26Nd')]/img[2]")
    public static WebElement corporate_pan_status;

    @FindBy(how = How.XPATH, using = "(//a[@class='_361NW01yaAs-Wcs5kATCQL'])[1]/img")
    public static WebElement mobileNo_tooltiptext;

    @FindBy(how = How.XPATH, using = "(//a[contains(@class, '_22_DcXKejxA-H4f9z4SbRS')])[1]")
    public static WebElement mobileNo_value;

    @FindBy(how = How.XPATH, using = "(//a[@class='_361NW01yaAs-Wcs5kATCQL'])[3]/img")
    public static WebElement mobileNo_status;

    @FindBy(how = How.XPATH, using = "(//a[@class='_361NW01yaAs-Wcs5kATCQL'])[4]/img")
    public static WebElement corporate_mobileNo_status;

    @FindBy(how = How.XPATH, using = "(//a[@class='_361NW01yaAs-Wcs5kATCQL'])[2]/img")
    public static WebElement alternate_mobileNo_tooltiptext;

    @FindBy(how = How.XPATH, using = "(//a[contains(@class,'_22_DcXKejxA-H4f9z4SbRS')])[2]")
    public static WebElement alternate_mobileNo_value;

    @FindBy(how = How.XPATH, using = "(//a[@class='_361NW01yaAs-Wcs5kATCQL'])[5]/img")
    public static WebElement alternate_mobileNo_status;

    @FindBy(how = How.XPATH, using = "(//a[@class='_361NW01yaAs-Wcs5kATCQL'])[3]/img")
    public static WebElement corporate_email_tooltiptext;

    @FindBy(how = How.XPATH, using = "(//a[@class='_361NW01yaAs-Wcs5kATCQL'])[2]/img")
    public static WebElement email_tooltiptext;

    @FindBy(how = How.XPATH, using = "(//a[contains(@class, '_361NW01yaAs-Wcs5kATCQL')])[5]/span")
    public static WebElement email_value;

    @FindBy(how = How.XPATH, using = "(//a[contains(@class,'_22_DcXKejxA-H4f9z4SbRS')])[3]")
    public static WebElement corporate_email_value;

    @FindBy(how = How.XPATH, using = "(//a[@class='_361NW01yaAs-Wcs5kATCQL'])[6]/img")
    public static WebElement corporate_email_status;

    @FindBy(how = How.XPATH, using = "(//a[@class='_361NW01yaAs-Wcs5kATCQL'])[4]/img")
    public static WebElement email_status;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class, '_11c0GGSge26iLK2MDXCgdy')])[1]/span[4]")
    public static WebElement corporate_address_tooltiptext;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, '_361NW01yaAs-Wcs5kATCQL')]")
    public static WebElement address_tooltiptext;

    @FindBy(how = How.XPATH, using = "(//span[@class='_1ItRkkJp4JtCGSqCU2C5QD'])[3]")
    public static WebElement corporate_address_value;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, '_361NW01yaAs-Wcs5kATCQL')]/span[1]")
    public static WebElement address_value;

    @FindBy(how = How.XPATH, using = "(//a[@class='_361NW01yaAs-Wcs5kATCQL'])[7]/img")
    public static WebElement corporate_address_status;

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

    @FindBy(how = How.XPATH, using = "(//span[@class='_1ItRkkJp4JtCGSqCU2C5QD'])[5]")
    public static WebElement recommendation_data;

    @FindBy(how = How.XPATH, using = "(//div[@class='e52w_BTQ1gFCUHGWcBhio'])[1]")
    public static WebElement recommendation_end_date;

    @FindBy(how = How.XPATH, using = "(//div[@class='_2gVTPG7uHIMeGvbtzdUoz0'])[2]/div")
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
    public static WebElement lob_value;

    @FindBy(how = How.XPATH, using = "(//label[@class='_3IMHxwDiumzZQ0sVR9A747'])[1]")
    public static WebElement source_ref_id_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_1PeIO4jIzGcxXDjDHApNmp'])[3]")
    public static WebElement branch_code_value;

    @FindBy(how = How.ID, using = "submit")
    public static WebElement submit_button_bookFdpage;

    @FindBy(how = How.XPATH, using = "(//div[@class='_31vqzyuKmHK9WBSIDdOtxz'])")
    public static WebElement transaction_completed_successfully;

    @FindBy(how = How.ID, using = "remarks")
    public static WebElement remarks_tab;

    @FindBy(how = How.ID, using = "nbaItemClose-6-0")
    public static WebElement cross_button_nba;

    @FindBy(how = How.ID, using = "nbaItemClose-0-0")
    public static WebElement cross_button_sell_category;

    @FindBy(how = How.XPATH, using = "(//div[@class='_3SHH88IPp0skc0h6q5UV6Q'])[1]")
    public static WebElement defer_button;

    @FindBy(how = How.XPATH, using = "//div[@class='_6X07UbY_Zyh0rC0LINrgZ']")
    public static WebElement select_date;

    @FindBy(how = How.XPATH, using = "//div[@class='_2uJC9yo-UWAB5wmeI1DfQj']")
    public static WebElement calender_submit;

    @FindBy(how = How.XPATH, using = "//div[@class='_1UTbBBTLWoGqq_t4gXKg85']")
    public static WebElement deferred_dismiss_message;

    @FindBy(how = How.XPATH, using = "(//div[@class='_3SHH88IPp0skc0h6q5UV6Q'])[2]")
    public static WebElement dismiss_button;

    @FindBy(how = How.XPATH, using = "(//input[@type='radio'])[2]")
    public static WebElement select_dimiss_reason;

    @FindBy(how = How.ID, using = "submit")
    public static WebElement dismiss_submit_button;

    @FindBy(how = How.XPATH, using = "//img[@class='_3BiuRnWcqSoh7WiwTTnmf-']")
    public static WebElement relationship_icon;

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

    @FindBy(how = How.XPATH, using = "(//div[@class='_2LqD-0cHt1a2Qr2CHEVavQ'])[3]")
    public static WebElement relationship_client;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'_3bPmvFCu2ReIPAONCmDte5')]/div[2]")
    public static WebElement relation_category_investor;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'_3bPmvFCu2ReIPAONCmDte5')]/div[3]")
    public static WebElement relation_category_friend;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'_3bPmvFCu2ReIPAONCmDte5')]/div[4]")
    public static WebElement relation_category_corporate;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'_3bPmvFCu2ReIPAONCmDte5')]/div[5]")
    public static WebElement relation_category_family;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'_3bPmvFCu2ReIPAONCmDte5')]/div[6]")
    public static WebElement relation_category_client;

    @FindBy(how = How.XPATH, using = "//span[@class='_1e7iJQLfoqkQZa8rDieXHV']")
    public static WebElement heading_name;

    @FindBy(how = How.XPATH, using = "//div[@class='AvMHovGJlIEUhAIFgNAtR']")
    public static WebElement relation_graph_minimize_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'haTYyk_20GBasK5vg5Au8')]")
    public static WebElement transactions_icon;

    @FindBy(how = How.XPATH, using = "//div[@class='_2aG_5jPrRWSJhHTNP_8ku6']/div")
    public static WebElement create_lead;

    @FindBy(how = How.XPATH, using = "//div[@class='_288kmL-P6mB4JB7iYJXHmn']")
    public static WebElement create_lead_custid_attribute;

    @FindBy(how = How.ID, using = "Select Cust ID")
    public static WebElement custid_dropdown;

    @FindBy(how = How.XPATH, using = "//li[@class='_271erqeRbrf5QTGZUg-vX2']")
    public static WebElement select_custid;

    @FindBy(how = How.ID, using = "996264849")
    public static WebElement custid_value;

    @FindBy(how = How.XPATH, using = "(//img[@class='_3BiuRnWcqSoh7WiwTTnmf-'])[1]")
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

    @FindBy(how = How.XPATH, using = "(//td)[8]")
    public static WebElement authorised_first_currentcitystate;

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

    @FindBy(how = How.XPATH, using = "//div[@class='_1RRMjt720IgPklxsu2yc8m']")
    public static WebElement mdmID_demogs;

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

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[1]")
    public static WebElement detailed_attribute_name;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[2]")
    public static WebElement detailed_attribute_dob;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[3]")
    public static WebElement detailed_attribute_profession;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[4]")
    public static WebElement detailed_attribute_datacustopen;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[5]")
    public static WebElement detailed_attribute_income;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[6]")
    public static WebElement detailed_attribute_email_address;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[7]")
    public static WebElement detailed_attribute_mobileno;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[8]")
    public static WebElement detailed_attribute_alternateno;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[9]")
    public static WebElement detailed_attribute_current_address;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[10]")
    public static WebElement detailed_attribute_permanent_address;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[11]")
    public static WebElement detailed_attribute_home_branch;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[12]")
    public static WebElement detailed_attribute_cluster;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[13]")
    public static WebElement detailed_attribute_region;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[14]")
    public static WebElement detailed_attribute_assetrm;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[15]")
    public static WebElement detailed_attribute_liabilityrm;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[16]")
    public static WebElement detailed_attribute_servicerm;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[17]")
    public static WebElement detailed_attribute_group_code;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[18]")
    public static WebElement detailed_attribute_psm;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[19]")
    public static WebElement detailed_attribute_nationality;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[20]")
    public static WebElement detailed_attribute_fatca;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[21]")
    public static WebElement detailed_attribute_bagic;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[22]")
    public static WebElement detailed_attribute_kycstatus;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[23]")
    public static WebElement detailed_attribute_riskcategory;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[18]")
    public static WebElement detailed_attribute_natureofbusiness;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[19]")
    public static WebElement detailed_attribute_natureofindustry;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[20]")
    public static WebElement detailed_attribute_corporate_riskcategory;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[21]")
    public static WebElement detailed_attribute_website;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[22]")
    public static WebElement detailed_attribute_ecommsite;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[9]")
    public static WebElement detailed_attribute_corporate_homebranch;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[10]")
    public static WebElement detailed_attribute_corporate_cluster;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[11]")
    public static WebElement detailed_attribute_corporate_region;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[12]")
    public static WebElement detailed_attribute_corporate_iec;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[13]")
    public static WebElement detailed_attribute_corporate_assetrm;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[14]")
    public static WebElement detailed_attribute_corporate_liabilityrm;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[15]")
    public static WebElement detailed_attribute_corporate_servicerm;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[16]")
    public static WebElement detailed_attribute_corporate_groupcode;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[17]")
    public static WebElement detailed_attribute_corporate_psm;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class,'_2DaJrfzXfC-GMIhIqjSxH3')])[1]")
    public static WebElement detailed_mdmid_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[1]/span[1]")
    public static WebElement detailed_name_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[1]/span[2]")
    public static WebElement detailed_dob_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[1]/span[3]")
    public static WebElement detailed_profession_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[1]/span[4]")
    public static WebElement detailed_dat_custopen_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[1]/span[5]")
    public static WebElement detailed_income_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[1]/span[5]")
    public static WebElement detailed_turnover_value;

    @FindBy(how = How.XPATH, using = "(//span[@class='_3VeCHIt6FLYXYaCXATKVND'])/a/span")
    public static WebElement detailed_email_address_value;

    @FindBy(how = How.XPATH, using = "(//span[@class='_3VeCHIt6FLYXYaCXATKVND'])[2]/a")
    public static WebElement detailed_mobileno_value;

    @FindBy(how = How.XPATH, using = "(//span[@class='_3VeCHIt6FLYXYaCXATKVND'])[3]/a")
    public static WebElement detailed_alternateno_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[2]/span[4]")
    public static WebElement detailed_current_address_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[2]/span[5]")
    public static WebElement detailed_permanent_address_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[2]/span[6]")
    public static WebElement detailed_homebranch_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[2]/span[7]")
    public static WebElement detailed_cluster_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[2]/span[8]")
    public static WebElement detailed_region_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[3]/span[1]")
    public static WebElement detailed_assetrm_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[3]/span[2]")
    public static WebElement detailed_liabilityrm_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[3]/span[3]")
    public static WebElement detailed_servicerm_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[3]/span[4]")
    public static WebElement detailed_groupcode_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[3]/span[5]")
    public static WebElement detailed_psm_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[4]/span[1]")
    public static WebElement detailed_nationality_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[4]/span[2]")
    public static WebElement detailed_fatca_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[4]/span[3]")
    public static WebElement detailed_bagic_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[4]/span[4]")
    public static WebElement detailed_kycstatus_value;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[4]/span[5]")
    public static WebElement detailed_riskcategory_value;

// locators of type C detailed attribute and value

    @FindBy(how = How.XPATH, using = "(//div[contains(@class,'_2DaJrfzXfC-GMIhIqjSxH3')])[2]")
    public static WebElement detailed_mdmid_value_typeC;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[1]")
    public static WebElement detailed_attribute_name_typeC;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[2]")
    public static WebElement detailed_attribute_dob_typeC;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[3]")
    public static WebElement detailed_attribute_profession_typeC;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[4]")
    public static WebElement detailed_attribute_datacustopen_typeC;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[5]")
    public static WebElement detailed_attribute_income_typeC;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[6]")
    public static WebElement detailed_attribute_email_address_typeC;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[7]")
    public static WebElement detailed_attribute_mobileno_typeC;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[8]")
    public static WebElement detailed_attribute_alternateno_typeC;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[9]")
    public static WebElement detailed_attribute_current_address_typeC;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[10]")
    public static WebElement detailed_attribute_permanent_address_typeC;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[11]")
    public static WebElement detailed_attribute_home_branch_typeC;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[12]")
    public static WebElement detailed_attribute_cluster_typeC;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[13]")
    public static WebElement detailed_attribute_region_typeC;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[14]")
    public static WebElement detailed_attribute_assetrm_typeC;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[15]")
    public static WebElement detailed_attribute_liabilityrm_typeC;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[16]")
    public static WebElement detailed_attribute_servicerm_typeC;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[17]")
    public static WebElement detailed_attribute_group_code_typeC;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[18]")
    public static WebElement detailed_attribute_psm_typeC;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[19]")
    public static WebElement detailed_attribute_nationality_typeC;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[20]")
    public static WebElement detailed_attribute_fatca_typeC;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[21]")
    public static WebElement detailed_attribute_bagic_typeC;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[22]")
    public static WebElement detailed_attribute_kycstatus_typeC;

    @FindBy(how = How.XPATH, using = "(//span[@class='FRlmnnrs2aZUbipGaX_1e'])[23]")
    public static WebElement detailed_attribute_riskcategory_typeC;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[1]/span[1]")
    public static WebElement detailed_name_value_typeC;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[1]/span[2]")
    public static WebElement detailed_dob_value_typeC;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[1]/span[3]")
    public static WebElement detailed_profession_value_typeC;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[1]/span[4]")
    public static WebElement detailed_dat_custopen_value_typeC;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[1]/span[5]")
    public static WebElement detailed_income_value_typeC;

    @FindBy(how = How.XPATH, using = "(//span[@class='_3VeCHIt6FLYXYaCXATKVND'])/a/span")
    public static WebElement detailed_email_address_value_typeC;

    @FindBy(how = How.XPATH, using = "(//span[@class='_3VeCHIt6FLYXYaCXATKVND'])[2]/a")
    public static WebElement detailed_mobileno_value_typeC;

    @FindBy(how = How.XPATH, using = "(//span[@class='_3VeCHIt6FLYXYaCXATKVND'])[3]/a")
    public static WebElement detailed_alternateno_value_typeC;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[2]/span[4]")
    public static WebElement detailed_current_address_value_typeC;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[2]/span[5]")
    public static WebElement detailed_permanent_address_value_typeC;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[2]/span[6]")
    public static WebElement detailed_homebranch_value_typeC;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[2]/span[7]")
    public static WebElement detailed_cluster_value_typeC;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[2]/span[8]")
    public static WebElement detailed_region_value_typeC;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[3]/span[1]")
    public static WebElement detailed_assetrm_value_typeC;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[3]/span[2]")
    public static WebElement detailed_liabilityrm_value_typeC;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[3]/span[3]")
    public static WebElement detailed_servicerm_value_typeC;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[3]/span[4]")
    public static WebElement detailed_groupcode_value_typeC;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[3]/span[5]")
    public static WebElement detailed_psm_value_typeC;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[4]/span[1]")
    public static WebElement detailed_nationality_value_typeC;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[4]/span[2]")
    public static WebElement detailed_fatca_value_typeC;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[4]/span[3]")
    public static WebElement detailed_bagic_value_typeC;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[4]/span[4]")
    public static WebElement detailed_kycstatus_value_typeC;

    @FindBy(how = How.XPATH, using = "(//div[@class='_53pmg1lz9yMKjYqMWgpA3'])[4]/span[5]")
    public static WebElement detailed_riskcategory_value_typeC;
}



