package pageObjects;

import cucumber.api.DataTable;
import locators.DemographicsSnapLocators;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class DemographicsSnapPage extends DemographicsSnapLocators {

    public void demographicsAttributesOfCorporate(DataTable data) {
        List<List<String>> table = data.raw();

        ArrayList<String> expected_details = new ArrayList<>();
        ArrayList<String> actual_details = new ArrayList<>();
        actual_details.add(corporate_cust_type.getAttribute("title"));
        actual_details.add(corporate_customername.getAttribute("title"));
        actual_details.add(corporate_doi.getAttribute("title"));
        actual_details.add(corporate_doi_value.getText());
        for (int i = 0; i < 2; i++) {
            expected_details.add(table.get(0).get(i));
        }
        for (int i = 0; i < 2; i++) {
            expected_details.add(table.get(1).get(i));
        }
        Assert.assertEquals(expected_details, actual_details);

        ArrayList<String> expected_icon_tooltiptext = new ArrayList<>();
        ArrayList<String> actual_icon_tooltiptext = new ArrayList<>();
        for (WebElement dataElement : corporate_icon_tooltiptext) {
            actual_icon_tooltiptext.add(dataElement.getAttribute("title"));
        }
        for (int i = 2; i <= 4; i++) {
            expected_icon_tooltiptext.add(table.get(i).get(1));
        }
        Assert.assertEquals(expected_icon_tooltiptext, actual_icon_tooltiptext);

        ArrayList<String> expected_mdmid = new ArrayList<>();
        ArrayList<String> actual_mdmid = new ArrayList<>();
        for (WebElement dataElement : corporate_mdmid) {
            actual_mdmid.add(dataElement.getText());
        }
        ArrayList<String> actual_mdmid1 = new ArrayList<>();
        actual_mdmid1.add(actual_mdmid.get(0));
        actual_mdmid1.add(actual_mdmid.get(1));
        for (int i = 0; i < 2; i++) {
            expected_mdmid.add(table.get(5).get(i));
        }
        Assert.assertEquals(expected_mdmid, actual_mdmid1);

        ArrayList<String> expected_business_bsps_keyValue = new ArrayList<>();
        ArrayList<String> actual_business_bsps_keyValue = new ArrayList<>();
        for (WebElement dataElement : corporate_business_bsps) {
            actual_business_bsps_keyValue.add(dataElement.getText());
        }
        for (int i = 0; i < 2; i++) {
            expected_business_bsps_keyValue.add(table.get(6).get(i));
        }
        for (int i = 0; i < 2; i++) {
            expected_business_bsps_keyValue.add(table.get(9).get(i));
        }
        Assert.assertEquals(expected_business_bsps_keyValue, actual_business_bsps_keyValue);

        ArrayList<String> expected_industry_keyValue = new ArrayList<>();
        ArrayList<String> actual_industry_keyValue = new ArrayList<>();
        for (WebElement dataElement : corporate_industry) {
            actual_industry_keyValue.add(dataElement.getText());
        }
        for (int i = 0; i < 2; i++) {
            expected_industry_keyValue.add(table.get(7).get(i));
        }
        Assert.assertEquals(expected_industry_keyValue, actual_industry_keyValue);

        ArrayList<String> expected_vintage_keyValue = new ArrayList<>();
        ArrayList<String> actual_vintage_keyValue = new ArrayList<>();
        for (WebElement dataElement : corporate_vintage) {
            actual_vintage_keyValue.add(dataElement.getText());
        }
        ArrayList<String> actual_vintage_keyValue1 = new ArrayList<>();
        actual_vintage_keyValue1.add(actual_vintage_keyValue.get(1));
        actual_vintage_keyValue1.add(actual_vintage_keyValue.get(2));
        for (int i = 0; i < 2; i++) {
            expected_vintage_keyValue.add(table.get(8).get(i));
        }
        Assert.assertEquals(expected_vintage_keyValue, actual_vintage_keyValue1);

        ArrayList<String> expected_customer_type_keyValue = new ArrayList<>();
        ArrayList<String> actual_customer_type_keyValue = new ArrayList<>();
        for (WebElement dataElement : corporate_customer_type) {
            actual_customer_type_keyValue.add(dataElement.getText());
        }
        for (int i = 0; i < 2; i++) {
            expected_customer_type_keyValue.add(table.get(10).get(i));
        }
        Assert.assertEquals(expected_customer_type_keyValue, actual_customer_type_keyValue);

        ArrayList<String> expected_annual_turnover_keyValue = new ArrayList<>();
        ArrayList<String> actual_annual_turnover_keyValue = new ArrayList<>();
        for (WebElement dataElement : corporate_annual_turnover) {
            actual_annual_turnover_keyValue.add(dataElement.getText());
        }
        for (int i = 0; i < 3; i++) {
            expected_annual_turnover_keyValue.add(table.get(11).get(i));
        }
        Assert.assertEquals(expected_annual_turnover_keyValue, actual_annual_turnover_keyValue);

        ArrayList<String> expected_pan_keyValue = new ArrayList<>();
        ArrayList<String> actual_pan_keyValue = new ArrayList<>();
        for (WebElement dataElement : corporate_pan) {
            actual_pan_keyValue.add(dataElement.getAttribute("title"));
        }
        for (int i = 0; i < 2; i++) {
            expected_pan_keyValue.add(table.get(12).get(i));
        }
        Assert.assertEquals(expected_pan_keyValue, actual_pan_keyValue);

        ArrayList<String> expected_attributes_status = new ArrayList<>();
        ArrayList<String> actual_attributes_status = new ArrayList<>();
        for (WebElement dataElement : corporate_attribute) {
            actual_attributes_status.add(dataElement.getAttribute("title"));
        }
        String getCurrentAddressOnHover = corporate_current_address_onHover.getAttribute("title");
        actual_attributes_status.remove(3);
        actual_attributes_status.add(3, getCurrentAddressOnHover);
        for (int i = 13; i < table.size(); i++) {
            expected_attributes_status.add(table.get(i).get(0));
        }
        for (int i = 13; i < table.size(); i++) {
            expected_attributes_status.add(table.get(i).get(2));
        }
        Assert.assertEquals(expected_attributes_status, actual_attributes_status);

        ArrayList<String> expected_values = new ArrayList<>();
        ArrayList<String> actual_values = new ArrayList<>();
        for (WebElement dataElement : corporate_values) {
            actual_values.add(dataElement.getText());
        }
        String getCurrentAddressValue = corporate_current_address_value.getText();
        actual_values.add(3, getCurrentAddressValue);
        for (int i = 13; i < table.size(); i++) {
            expected_values.add(table.get(i).get(1));
        }
        Assert.assertEquals(expected_values, actual_values);
    }

    public void clickOnMmdIdOnDemogs() {
        mdmID_demogs.click();
    }

    public void verifyDetailedAttributesAndValueOfCorporateCustomerWithMdmIDTypeM(DataTable corporateDetailedMdmIdTable) {
        List<List<String>> data = corporateDetailedMdmIdTable.raw();
        ArrayList<String> expected_detailedmdmid_headings = new ArrayList<>();
        ArrayList<String> actual_detailedmdmid_headings = new ArrayList<>();
        for (WebElement dataElement : corporate_detailedmdmid_headings) {
            actual_detailedmdmid_headings.add(dataElement.getText());
        }
        for (int i = 0; i < data.size(); i++) {
            expected_detailedmdmid_headings.add(data.get(i).get(0));
        }
        Assert.assertEquals(expected_detailedmdmid_headings, actual_detailedmdmid_headings);

        ArrayList<String> expected_detailedmdmid_values = new ArrayList<>();
        ArrayList<String> actual_detailedmdmid_values = new ArrayList<>();
        for (WebElement dataElement : corporate_detailedmdmid_values) {
            actual_detailedmdmid_values.add(dataElement.getText());
        }
        for (int i = 0; i < data.size(); i++) {
            expected_detailedmdmid_values.add(data.get(i).get(1));
        }
        Assert.assertEquals(expected_detailedmdmid_values, actual_detailedmdmid_values);
    }

    public void verifyDetailedAttributesAndValueOfCorporateCustomerWithMdmIDTypeC(DataTable corporateDetailedCustIdTable) {
        List<List<String>> data = corporateDetailedCustIdTable.raw();
        detailed_mdmid_value_typeC.click();
        ArrayList<String> expected_detailedcustid_headings = new ArrayList<>();
        ArrayList<String> actual_detailedcustid_headings = new ArrayList<>();
        for (WebElement dataElement : corporate_detailedcustid_headings) {
            actual_detailedcustid_headings.add(dataElement.getText());
        }
        for (int i = 0; i < data.size(); i++) {
            expected_detailedcustid_headings.add(data.get(i).get(0));
        }
        Assert.assertEquals(expected_detailedcustid_headings, actual_detailedcustid_headings);

        ArrayList<String> expected_detailedcustid_values = new ArrayList<>();
        ArrayList<String> actual_detailedcustid_values = new ArrayList<>();
        for (WebElement dataElement : corporate_detailedcustid_values) {
            actual_detailedcustid_values.add(dataElement.getText());
        }
        for (int i = 0; i < data.size(); i++) {
            expected_detailedcustid_values.add(data.get(i).get(1));
        }
        Assert.assertEquals(expected_detailedcustid_values, actual_detailedcustid_values);
    }

    public void demographicsAttributesOfIndividual(DataTable individualDemogsTable) {
        List<List<String>> data = individualDemogsTable.raw();

        ArrayList<String> expected_indiviual_values = new ArrayList<>();
        ArrayList<String> actual_individual_values = new ArrayList<>();
        for (WebElement dataElement : individual_details) {
            actual_individual_values.add(dataElement.getText().replace("\n"," "));
        }
        expected_indiviual_values.add(data.get(0).get(0));
        Assert.assertEquals(expected_indiviual_values,actual_individual_values);

        ArrayList<String> expected_indiviual_headings = new ArrayList<>();
        ArrayList<String> actual_individual_headings = new ArrayList<>();
        for (WebElement dataElement : individual_details_headings) {
            actual_individual_headings.add(dataElement.getAttribute("title"));
        }
        for (int i = 0; i < 3; i++) {
            expected_indiviual_headings.add(data.get(1).get(i));
        }
/*        Assert.assertEquals(expected_indiviual_headings,actual_individual_headings);
        Assert.assertEquals(data.get(2).get(0), individual_contactibility_heading.getAttribute("title"));
        Assert.assertEquals(data.get(2).get(1), individual_contactibility_value.getText());
        Assert.assertEquals(data.get(2).get(2), individual_connections.getAttribute("title"));
        Assert.assertEquals(data.get(0).get(1), individual_icon_text.getAttribute("title"));*/

        ArrayList<String> expected_mdm_ckyc_keyValue = new ArrayList<>();
        ArrayList<String> actual_mdm_ckyc_keyValue = new ArrayList<>();
        for (WebElement dataElement : mdm_ckyc_keyValue) {
            actual_mdm_ckyc_keyValue.add(dataElement.getText().replace("\n", " "));
        }
        expected_mdm_ckyc_keyValue.add(data.get(3).get(0));
        Assert.assertEquals(expected_mdm_ckyc_keyValue,actual_mdm_ckyc_keyValue);

        ArrayList<String> expected_profession_vintage_keyValue = new ArrayList<>();
        ArrayList<String> actual_profession_vintage_keyValue = new ArrayList<>();
        for (WebElement dataElement : profession_vintage_keyValue) {
            actual_profession_vintage_keyValue.add(dataElement.getText().replace("\n", " "));
        }
        expected_profession_vintage_keyValue.add(data.get(4).get(0));
        Assert.assertEquals(expected_profession_vintage_keyValue,actual_profession_vintage_keyValue);

        ArrayList<String> expected_bsps_customersegment_keyValue = new ArrayList<>();
        ArrayList<String> actual_bsps_customersegment_keyValue = new ArrayList<>();
        for (WebElement dataElement : bsps_customersegment_keyValue) {
            actual_bsps_customersegment_keyValue.add(dataElement.getText().replace("\n", " "));
        }
        expected_bsps_customersegment_keyValue.add(data.get(5).get(0));
        Assert.assertEquals(expected_bsps_customersegment_keyValue,actual_bsps_customersegment_keyValue);

        ArrayList<String> expected_customertype_keyValue = new ArrayList<>();
        ArrayList<String> actual_customertype_keyValue = new ArrayList<>();
        for (WebElement dataElement : customertype_keyvalue) {
            actual_customertype_keyValue.add(dataElement.getText().replace("\n", " "));
        }
        expected_customertype_keyValue.add(data.get(6).get(0));
        Assert.assertEquals(expected_customertype_keyValue,actual_customertype_keyValue);

        ArrayList<String> expected_aadhar_pan_passport_headings = new ArrayList<>();
        ArrayList<String> actual_aadhar_pan_passport_headings = new ArrayList<>();
        for (WebElement dataElement : aadhar_pan_passport_keyvalue) {
            actual_aadhar_pan_passport_headings.add(dataElement.getAttribute("title"));
        }
        for (int i = 7; i < 10; i++) {
            expected_aadhar_pan_passport_headings.add(data.get(i).get(0));
        }
        for (int i = 7; i < 10; i++) {
            expected_aadhar_pan_passport_headings.add(data.get(i).get(1));
        }
        Assert.assertEquals(expected_aadhar_pan_passport_headings,actual_aadhar_pan_passport_headings);

        ArrayList<String> expected_mobile_email_address_status = new ArrayList<>();
        ArrayList<String> actual_mobile_email_address_status = new ArrayList<>();
        for (WebElement dataElement : mobile_email_address_keystatus) {
            actual_mobile_email_address_status.add(dataElement.getAttribute("title"));
        }
        actual_mobile_email_address_status.remove(2);
        for (int i = 10; i < 12; i++) {
            expected_mobile_email_address_status.add(data.get(i).get(0));
        }
        for (int i = 10; i < 13; i++) {
            expected_mobile_email_address_status.add(data.get(i).get(1));
        }
        Assert.assertEquals(expected_mobile_email_address_status,actual_mobile_email_address_status);

        ArrayList<String> expected_mobile_email_address_values = new ArrayList<>();
        ArrayList<String> actual_mobile_email_address_values = new ArrayList<>();
        for (WebElement dataElement : mobile_email_address_values) {
            actual_mobile_email_address_values.add(dataElement.getText().replace("\n"," "));
        }
        expected_mobile_email_address_values.add(data.get(13).get(0));
        Assert.assertEquals(expected_mobile_email_address_values,actual_mobile_email_address_values);
    }

    public void verifyDetailedAttributesAndValueOfMdmIDTypeM(DataTable individualDetailedMdmid) {
        List<List<String>> data = individualDetailedMdmid.raw();
        ArrayList<String> expected_detailedmdmid_headings = new ArrayList<>();
        ArrayList<String> actual_detailedmdmid_headings = new ArrayList<>();
        for (WebElement dataElement : individual_detailedmdmid_headings) {
            actual_detailedmdmid_headings.add(dataElement.getText());
        }
        for (int i = 0; i < data.size(); i++) {
            expected_detailedmdmid_headings.add(data.get(i).get(0));
        }
        Assert.assertEquals(expected_detailedmdmid_headings, actual_detailedmdmid_headings);

        ArrayList<String> expected_detailedmdmid_values = new ArrayList<>();
        ArrayList<String> actual_detailedmdmid_values = new ArrayList<>();
        for (WebElement dataElement : individual_detailedmdmid_values) {
            actual_detailedmdmid_values.add(dataElement.getText());
        }
        for (int i = 0; i < data.size(); i++) {
            expected_detailedmdmid_values.add(data.get(i).get(1));
        }
        Assert.assertEquals(expected_detailedmdmid_values, actual_detailedmdmid_values);
    }

    public void verifyDetailedAttributesAndValueOfMdmIDTypeC(DataTable individualDetailedCustId) {
        individual_detailed_custid.click();
        List<List<String>> data = individualDetailedCustId.raw();
        ArrayList<String> expected_detailedcustid_headings = new ArrayList<>();
        ArrayList<String> actual_detailedcustid_headings = new ArrayList<>();
        for (WebElement dataElement : individual_detailedcustid_headings) {
            actual_detailedcustid_headings.add(dataElement.getText());
        }
        for (int i = 0; i < data.size(); i++) {
            expected_detailedcustid_headings.add(data.get(i).get(0));
        }
        Assert.assertEquals(expected_detailedcustid_headings, actual_detailedcustid_headings);

        ArrayList<String> expected_detailedcustid_values = new ArrayList<>();
        ArrayList<String> actual_detailedcustid_values = new ArrayList<>();
        for (WebElement dataElement : individual_detailedcustid_values) {
            actual_detailedcustid_values.add(dataElement.getText());
        }
        for (int i = 0; i < data.size(); i++) {
            expected_detailedcustid_values.add(data.get(i).get(1));
        }
        Assert.assertEquals(expected_detailedcustid_values, actual_detailedcustid_values);
    }

    public void ClicksOnRelationshipIcon() {
        relationship_icon.click();
    }

    public void minimizeToCloseRelationGraph() {
        relation_minimize_button.click();
    }

    public void customerRelationGraphWithCategories(DataTable relationTable) {
        List<List<String>> data = relationTable.raw();
        category_investors.click();
        Assert.assertEquals(data.get(1).get(0), category_investors.getText());
        Assert.assertEquals(data.get(1).get(6), heading_name.getText());
        Assert.assertEquals(data.get(1).get(1), customer_name.getText());
        Assert.assertEquals(data.get(1).get(2), mdm_id.getText());
        Assert.assertEquals(data.get(1).get(3), self.getText());
        Assert.assertEquals(data.get(1).get(4), linked_customer_name.getAttribute("title"));
        Assert.assertEquals(data.get(1).get(5), linked_mdm_id.getText());
        Assert.assertEquals(data.get(1).get(6), relationship.getText());
        Assert.assertTrue(individual_icon.isDisplayed());
        Assert.assertTrue(corporate_icon.isDisplayed());

        category_friend.click();
        Assert.assertEquals(data.get(2).get(0), category_friend.getText());
        Assert.assertEquals(data.get(2).get(6), heading_name.getText());
        Assert.assertEquals(data.get(2).get(1), customer_name.getText());
        Assert.assertEquals(data.get(2).get(2), mdm_id.getText());
        Assert.assertEquals(data.get(2).get(3), self.getText());
        Assert.assertEquals(data.get(2).get(4), linked_customer_name.getText());
        Assert.assertEquals(data.get(2).get(5), linked_mdm_id.getText());
        Assert.assertEquals(data.get(2).get(6), relationship.getText());

        category_corporate.click();
        Assert.assertEquals(data.get(3).get(0), category_corporate.getText());
        Assert.assertEquals(data.get(3).get(0).substring(0,9), heading_name.getText());
        Assert.assertEquals(data.get(3).get(1), customer_name.getText());
        Assert.assertEquals(data.get(3).get(2), mdm_id.getText());
        Assert.assertEquals(data.get(3).get(3), self.getText());
        Assert.assertEquals(data.get(3).get(4), linked_customer_name.getText());
        Assert.assertEquals(data.get(3).get(5), linked_mdm_id.getText());
        Assert.assertEquals(data.get(3).get(6), relationship.getText());

        category_family.click();
        Assert.assertEquals(data.get(4).get(0), category_family.getText());
        Assert.assertEquals(data.get(4).get(6), heading_name.getText());
        Assert.assertEquals(data.get(4).get(1), customer_name.getText());
        Assert.assertEquals(data.get(4).get(2), mdm_id.getText());
        Assert.assertEquals(data.get(4).get(3), self.getText());
        Assert.assertEquals(data.get(4).get(4), linked_customer_name.getText());
        Assert.assertEquals(data.get(4).get(5), linked_mdm_id.getText());
        Assert.assertEquals(data.get(4).get(6), relationship.getText());

        category_client.click();
        Assert.assertEquals(data.get(5).get(0), category_client.getText());
        Assert.assertEquals(data.get(5).get(6), heading_name.getText());
        Assert.assertEquals(data.get(5).get(1), customer_name.getText());
        Assert.assertEquals(data.get(5).get(2), mdm_id.getText());
        Assert.assertEquals(data.get(5).get(3), self.getText());
        Assert.assertEquals(data.get(5).get(4), linked_customer_name.getAttribute("title"));
        Assert.assertEquals(data.get(5).get(5), linked_bank_name.getText());
        Assert.assertEquals(data.get(5).get(6), client_relationship.getText());
    }

    public void iClickOnAuthorisedSignatoryIcon() {
        authorized_signatory_icon.click();
    }

    public void verifyAuthorisedSignatoryPage(String title) {
        String getAuthorisedSignatoryHeading = authorized_signatory_page_heading.getText();
        Assert.assertEquals(title, getAuthorisedSignatoryHeading);
    }

    public void verifyAuthrisedSignatoryAttributesAndData(DataTable data) {
        List<List<String>> table = data.raw();
        Assert.assertEquals(table.get(0).get(0), mdmId_attribute.getText());
        Assert.assertEquals(table.get(0).get(1), cust_name_attribute.getText());
        Assert.assertEquals(table.get(0).get(2), gender_attribute.getText());
        Assert.assertEquals(table.get(0).get(3), email_attribute.getText());
        Assert.assertEquals(table.get(0).get(5), mobileno_attribute.getText());
        Assert.assertEquals(table.get(0).get(7), secondary_mobileno_attribute.getText());
        Assert.assertEquals(table.get(0).get(8), contactability_attribute.getText());
        Assert.assertEquals(table.get(0).get(9), current_cityState_attribute.getText());
        Assert.assertEquals(table.get(1).get(0), authorised_first_mdmdid.getText());
        Assert.assertEquals(table.get(1).get(1), authorised_first_custname.getText());
        Assert.assertEquals(table.get(1).get(2), authorised_first_gender.getText());
        Assert.assertEquals(table.get(1).get(3), authorised_first_email.getText());
        Assert.assertEquals(table.get(1).get(4), email_status_of_authorised_signatory.getAttribute("title"));
        Assert.assertEquals(table.get(1).get(5), authorised_first_mobileno.getText());
        Assert.assertEquals(table.get(1).get(6), mobileno_status_of_authorised_signatory.getAttribute("title"));
        Assert.assertEquals(table.get(1).get(7), authorised_first_secondary_mobile.getText());
        Assert.assertEquals(table.get(1).get(8), authorised_first_contactibility.getText());
        Assert.assertEquals(table.get(1).get(9), authorised_first_currentcitystate.getAttribute("title"));
        Assert.assertEquals(table.get(1).get(10), accountno_authorised_signatory.getAttribute("title"));
    }
}
