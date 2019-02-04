package pageObjects;

import cucumber.api.DataTable;
import locators.SnapLocators;
import org.junit.Assert;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class SnapPage extends SnapLocators {

    public SnapPage() {
        super();
    }

    public void demographicsAttributesOfIndividual(DataTable data) {
        List<List<String>> table = data.raw();

        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("http://cust360.yesgenie.com:30978/snap", currentUrl);

        String getIconTooltipText = icon.getAttribute("title");
        String getCustName = customername.getText().trim();
        String getDobDoi = dob_doi.getText().trim();
        String getDobTooltipTxt = dob_tooltipText.getAttribute("title");
        String getHomeBranchValue = home_branch_value.getAttribute("title");
        String getHomeBranchTooltiText = home_branch_tooltiptext.getAttribute("title");
        String getContactibiltyValue = contactibility_value.getText();
        String getConnectionsTooltipText = connections_tooltiptext.getAttribute("title");
        String getMDMIdAttribute = attribute_mdmid.getText();
        String getMDMIDValue = mdmid_value.getText();
        String getCkycAttribute = ckycNo_attribute.getText();
        String getCkycValue = ckycNo_value.getText();
        String getProfessionAttribute = profession_attribute.getText();
        String getProfessionValue = profession_value.getText();
        String getVintageAttribute = vintage_attribute.getText();
        String getVintageValue = vintage_value.getText();
        String getBsPsAttribute = bsps_attribute.getText();
        String getBsPsValue1 = bsps_value1.getText();
        String getBsPsValue2 = bsps_value2.getText();
        String BsPSValue = getBsPsValue1.concat(getBsPsValue2);
        String getCustomerTypeAttribute = customer_type_attribute.getText();
        String getCustomerTypeValue = customer_type_value.getAttribute("title");
        String getCustomerSegmentAttribute = customer_segment_attribute.getText();
        String getCustomerSegmentValue = customer_segment_value.getAttribute("title");
        String getAadharTooltipText = aadhar_tooltiptext.getAttribute("title");
        String getPanTooltiptext = pan_tooltiptext.getAttribute("title");
        String getPassportTooltiptext = passport_tooltiptext.getAttribute("title");
        String getAadhaarStatus = aadhar_status.getAttribute("title");
        String getPanStatus = pan_status.getAttribute("title");
        String getPassportStatus = passport_status.getAttribute("title");
        String getMobileNoTooltipText = mobileNo_tooltiptext.getAttribute("title");
        String getMobileNoValue = mobileNo_value.getText();
        String getMobileNoStatus = mobileNo_status.getAttribute("title");
        String getEmailTooltipText = email_tooltiptext.getAttribute("title");
        String getEmailValue = email_value.getText();
        String getEmailStatus = email_status.getAttribute("title");
        String getAddressTooltipText = address_tooltiptext.getAttribute("title");
        String getAddressValue = address_value.getText();
        String getAddressStatus = address_status.getAttribute("title");

        Assert.assertEquals(table.get(0).get(1), getIconTooltipText);
        Assert.assertEquals(table.get(0).get(0), getCustName);
        Assert.assertEquals(table.get(1).get(1), getDobDoi);
        Assert.assertEquals(table.get(1).get(0), getDobTooltipTxt);
        Assert.assertEquals(table.get(2).get(1), getHomeBranchValue);
        Assert.assertEquals(table.get(2).get(0), getHomeBranchTooltiText);
        Assert.assertEquals(table.get(3).get(1), getContactibiltyValue);
        Assert.assertEquals(table.get(4).get(1), getConnectionsTooltipText);
        Assert.assertEquals(table.get(5).get(0), getMDMIdAttribute);
        Assert.assertEquals(table.get(5).get(1), getMDMIDValue);
        Assert.assertEquals(table.get(6).get(0), getCkycAttribute);
        Assert.assertEquals(table.get(6).get(1), getCkycValue);
        Assert.assertEquals(table.get(7).get(0), getProfessionAttribute);
        Assert.assertEquals(table.get(7).get(1), getProfessionValue);
        Assert.assertEquals(table.get(8).get(0), getVintageAttribute);
        Assert.assertEquals(table.get(8).get(1), getVintageValue);
        Assert.assertEquals(table.get(9).get(0), getBsPsAttribute);
        Assert.assertEquals(table.get(9).get(1), BsPSValue);
        Assert.assertEquals(table.get(10).get(0), getCustomerTypeAttribute);
        Assert.assertEquals(table.get(10).get(1), getCustomerTypeValue);
        Assert.assertEquals(table.get(11).get(0), getCustomerSegmentAttribute);
        Assert.assertEquals(table.get(11).get(1), getCustomerSegmentValue);
        Assert.assertEquals(table.get(12).get(0), getAadharTooltipText);
        Assert.assertEquals(table.get(13).get(0), getPanTooltiptext);
        Assert.assertEquals(table.get(14).get(0), getPassportTooltiptext);
        Assert.assertEquals(table.get(13).get(2), getPanStatus);
        Assert.assertEquals(table.get(12).get(2), getAadhaarStatus);
        Assert.assertEquals(table.get(14).get(2), getPassportStatus);
        Assert.assertEquals(table.get(15).get(0), getMobileNoTooltipText);
        Assert.assertEquals(table.get(15).get(1), getMobileNoValue);
        Assert.assertEquals(table.get(15).get(2), getMobileNoStatus);
        Assert.assertEquals(table.get(16).get(0), getEmailTooltipText);
        Assert.assertEquals(table.get(16).get(1), getEmailValue);
        Assert.assertEquals(table.get(16).get(2), getEmailStatus);
        Assert.assertEquals(table.get(17).get(0), getAddressTooltipText);
        Assert.assertEquals(table.get(17).get(1), getAddressValue);
        Assert.assertEquals(table.get(17).get(2), getAddressStatus);
    }

    public void demographicsAttributesOfCorporate(DataTable data) {

        List<List<String>> table = data.raw();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("http://cust360.yesgenie.com:30978/snap", currentUrl);

        String getIconTooltipText = icon.getAttribute("title");
        String getCustName = customername.getText().trim();
        String getDobDoi = dob_doi.getText().trim();
        String getDoiTooltipTxt = doi_tooltipText.getAttribute("title");
        String getAuthorisedSignatoryTooltipText = authorised_signatory_tooltiptext.getAttribute("title");
        String getConnectionsTooltipText = connections_tooltiptext.getAttribute("title");
        String getWebsiteTooltipText = website_tooltiptext.getAttribute("title");
        String getMDMIdAttribute = attribute_mdmid.getText();
        String getMDMIDValue = mdmid_value.getText();
        String getCorporateBusinessAttribute = corporate_attribute_business.getText();
        String getCorporateBusinessValue = corporate_business_value.getText();
        String getCorporateIndustryAttribute = corporate_industry_attribute.getText();
        String getCorporateIndustryValue = corporate_industry_value.getText();
        String getVintageAttribute = vintage_attribute.getText();
        String getVintageValue = vintage_value.getText();
        String getBsPsCorporateAttribute = bsps_corporate_attribute.getText();
        String getBsPsValue1 = bsps_value1.getText();
        String getBsPsValue2 = bsps_value2.getText();
        String BsPSValue = getBsPsValue1.concat(getBsPsValue2);
        String getCustomerTypeAttribute = corporate_customer_type_attribute.getText();
        String getCustomerTypeValue = corporate_customer_type_value.getAttribute("title");
        String getAnnualTurnoverCorporateAttribute = annual_turnover_corporate_attribute.getText();
        String getAnnualTurnoverCorporateValue = annual_turnover_corporate_value.getText();
        String getPanTooltipText = corporate_pan_tooltiptext.getAttribute("title");
        String getPanStatus = corporate_pan_status.getAttribute("title");
        String getMobileNoTooltipText = mobileNo_tooltiptext.getAttribute("title");
        String getMobileNoValue = mobileNo_value.getText();
        String getMobileNoStatus = corporate_mobileNo_status.getAttribute("title");
        String getAlternateMobileNoTooltiptext = alternate_mobileNo_tooltiptext.getAttribute("title");
        String getAlternateMobileNoValue = alternate_mobileNo_value.getText();
        String getAlternateMobileNoStatus = alternate_mobileNo_status.getAttribute("title");
        String getCorporateEmailTooltipText = corporate_email_tooltiptext.getAttribute("title");
        String getEmailValue = corporate_email_value.getText();
        String getCorporateEmailStatus = corporate_email_status.getAttribute("title");
        String getAddressTooltipText = corporate_address_tooltiptext.getAttribute("title");
        String getCorporateAddressValue = corporate_address_value.getText();
        String getCorporateAddressStatus = corporate_address_status.getAttribute("title");

        Assert.assertEquals(table.get(0).get(1), getIconTooltipText);
        Assert.assertEquals(table.get(1).get(1), getCustName);
        Assert.assertEquals(table.get(2).get(0), getDobDoi);
        Assert.assertEquals(table.get(2).get(1), getDoiTooltipTxt);
        Assert.assertEquals(table.get(3).get(1), getAuthorisedSignatoryTooltipText);
        Assert.assertEquals(table.get(4).get(1), getConnectionsTooltipText);
        Assert.assertEquals(table.get(5).get(1), getWebsiteTooltipText);
        Assert.assertEquals(table.get(6).get(0), getMDMIdAttribute);
        Assert.assertEquals(table.get(6).get(1), getMDMIDValue);
        Assert.assertEquals(table.get(7).get(0), getCorporateBusinessAttribute);
        Assert.assertEquals(table.get(7).get(1), getCorporateBusinessValue);
        Assert.assertEquals(table.get(8).get(0), getCorporateIndustryAttribute);
        Assert.assertEquals(table.get(8).get(1), getCorporateIndustryValue);
        Assert.assertEquals(table.get(9).get(0), getVintageAttribute);
        Assert.assertEquals(table.get(9).get(1), getVintageValue);
        Assert.assertEquals(table.get(10).get(0), getBsPsCorporateAttribute);
        Assert.assertEquals(table.get(10).get(1), BsPSValue);
        Assert.assertEquals(table.get(11).get(0), getCustomerTypeAttribute);
        Assert.assertEquals(table.get(11).get(1), getCustomerTypeValue);
        Assert.assertEquals(table.get(12).get(0), getAnnualTurnoverCorporateAttribute);
        Assert.assertEquals(table.get(12).get(1), getAnnualTurnoverCorporateValue);
        Assert.assertEquals(table.get(13).get(0), getPanTooltipText);
        Assert.assertEquals(table.get(13).get(2), getPanStatus);
        Assert.assertEquals(table.get(14).get(0), getMobileNoTooltipText);
        Assert.assertEquals(table.get(14).get(1), getMobileNoValue);
        Assert.assertEquals(table.get(14).get(2), getMobileNoStatus);
        Assert.assertEquals(table.get(15).get(0), getAlternateMobileNoTooltiptext);
        Assert.assertEquals(table.get(15).get(1), getAlternateMobileNoValue);
        Assert.assertEquals(table.get(15).get(2), getAlternateMobileNoStatus);
        Assert.assertEquals(table.get(16).get(0), getCorporateEmailTooltipText);
        Assert.assertEquals(table.get(16).get(1), getEmailValue);
        Assert.assertEquals(table.get(16).get(2), getCorporateEmailStatus);
        Assert.assertEquals(table.get(17).get(0), getAddressTooltipText);
        Assert.assertEquals(table.get(17).get(1), getCorporateAddressValue);
        Assert.assertEquals(table.get(17).get(2), getCorporateAddressStatus);
    }

    public void verfiyDifferentCategoriesOnSnapPage(String category, String count, String recommendation, String recommendationEndDate, String actionLableIcon) throws InterruptedException {
        switch (category) {
            case "All":
                String all = category_all.getText();
                boolean validateTextOfCategoryAll = all.contains(category) && all.contains(count);
                String getAllCategoryRecommendationData = recommendation_data.getText();
                String getAllCategoryRecommendationEndDate = recommendation_end_date.getText();
                String getAllCategoryActionLableData = action_lable.getText();

                List<WebElement> getAllCategoryElements = driver.findElements(By.xpath("//div[@class='B1b-Lu2n9m4TNaSSepk_p']"));
                int countOfAllCategoryReccommendation = getAllCategoryElements.size();

                Assert.assertTrue(validateTextOfCategoryAll);
                Assert.assertEquals(Integer.parseInt(count), countOfAllCategoryReccommendation);
                Assert.assertEquals(recommendation, getAllCategoryRecommendationData);
                Assert.assertEquals(recommendationEndDate, getAllCategoryRecommendationEndDate);
                Assert.assertEquals(actionLableIcon, getAllCategoryActionLableData);
                break;

            case "Regulatory":
                category_regulatory.click();
                String regulatory = category_regulatory.getText();
                boolean validateTextOfCategoryRegulatory = regulatory.contains(category) && regulatory.contains(count);
                String getRegulatoryCategoryRecommendationData = recommendation_data.getText();
                String getRegulatoryCategoryRecommendationEndDate = recommendation_end_date.getText();
                String getRegulatoryCategoryActionLableData = action_lable.getText();

                List<WebElement> getRegulatoryCategoryElements = driver.findElements(By.xpath("//div[@class='B1b-Lu2n9m4TNaSSepk_p']"));
                int countOfRegulatoryCategoryReccommendation = getRegulatoryCategoryElements.size();

                Assert.assertTrue(validateTextOfCategoryRegulatory);
                Assert.assertEquals(Integer.parseInt(count), countOfRegulatoryCategoryReccommendation);
                Assert.assertEquals(recommendation, getRegulatoryCategoryRecommendationData);
                Assert.assertEquals(recommendationEndDate, getRegulatoryCategoryRecommendationEndDate);
                Assert.assertEquals(actionLableIcon, getRegulatoryCategoryActionLableData);
                break;

            case "Service":
                category_service.click();
                String service = category_service.getText();
                boolean validateTextOfCategoryService = service.contains(category) && service.contains(count);
                String getServiceCategoryRecommendationData = recommendation_data.getText();
                String getServiceCategoryRecommendationEndDate = recommendation_end_date.getText();
                String getServiceCategoryActionLableData = action_lable.getText();

                List<WebElement> getServiceCategoryElements = driver.findElements(By.xpath("//div[@class='B1b-Lu2n9m4TNaSSepk_p']"));
                int countOfServiceCategoryReccommendation = getServiceCategoryElements.size();

                Assert.assertTrue(validateTextOfCategoryService);
                Assert.assertEquals(Integer.parseInt(count), countOfServiceCategoryReccommendation);
                Assert.assertEquals(recommendation, getServiceCategoryRecommendationData);
                Assert.assertEquals(recommendationEndDate, getServiceCategoryRecommendationEndDate);
                Assert.assertEquals(actionLableIcon, getServiceCategoryActionLableData);
                break;

            case "Sell":
                category_sell.click();
                String sell = category_sell.getText();
                boolean validateTextOfCategorySell = sell.contains(category) && sell.contains(count);
                String getSellCategoryRecommendationData = recommendation_data.getText();
                String getSellCategoryRecommendationEndDate = recommendation_end_date.getText();
                String getSellCategoryActionLableData = action_lable.getText();

                List<WebElement> getSellCategoryElements = driver.findElements(By.xpath("//div[@class='B1b-Lu2n9m4TNaSSepk_p']"));
                int countOfSellCategoryReccommendation = getSellCategoryElements.size();

                Assert.assertTrue(validateTextOfCategorySell);
                Assert.assertEquals(Integer.parseInt(count), countOfSellCategoryReccommendation);
                Assert.assertEquals(recommendation, getSellCategoryRecommendationData);
                Assert.assertEquals(recommendationEndDate, getSellCategoryRecommendationEndDate);
                Assert.assertEquals(actionLableIcon, getSellCategoryActionLableData);
                break;

            case "Alerts":
                category_alerts.click();
                String alerts = category_alerts.getText();
                boolean validateTextOfCategoryAlerts = alerts.contains(category) && alerts.contains(count);
                String getAlertsCategoryRecommendationData = recommendation_data.getText();
                String getAlertsCategoryRecommendationEndDate = recommendation_end_date.getText();
                String getAlertsCategoryActionLableData = action_lable.getText();


                List<WebElement> getAlertsCategoryElements = driver.findElements(By.xpath("//div[@class='B1b-Lu2n9m4TNaSSepk_p']"));
                int countOfAlertsCategoryReccommendation = getAlertsCategoryElements.size();

                Assert.assertTrue(validateTextOfCategoryAlerts);
                Assert.assertEquals(Integer.parseInt(count), countOfAlertsCategoryReccommendation);
                Assert.assertEquals(recommendation, getAlertsCategoryRecommendationData);
                Assert.assertEquals(recommendationEndDate, getAlertsCategoryRecommendationEndDate);
                Assert.assertEquals(actionLableIcon, getAlertsCategoryActionLableData);
                break;

            case "Information":
                category_information.click();
                String information = category_information.getText();
                boolean validateTextOfCategoryInformation = information.contains(category) && information.contains(count);
/*                String getInformationCategoryRecommendationData = recommendation_data.getText();
                String getInformationCategoryRecommendationEndDate = recommendation_end_date.getText();
                String getInformationCategoryActionLableData = action_lable.getText();*/


                List<WebElement> getInformationCategoryElements = driver.findElements(By.xpath("//div[@class='B1b-Lu2n9m4TNaSSepk_p']"));
                int countOfInformationCategoryReccommendation = getInformationCategoryElements.size();

                Assert.assertTrue(validateTextOfCategoryInformation);
                Assert.assertEquals(Integer.parseInt(count), countOfInformationCategoryReccommendation);
/*                Assert.assertEquals(recommendation, getInformationCategoryRecommendationData);
                Assert.assertEquals(recommendationEndDate, getInformationCategoryRecommendationEndDate);
                Assert.assertEquals(actionLableIcon, getInformationCategoryActionLableData);*/
                break;
        }
    }
    public void clickOnBookFD() {
        book_fd_lable.click();
    }

    public void verifyBookFDPage(String attribute1, String attribute2, String attribute3, String attribute4, String attribute5, String attribute6) {
        String getCustIdAttribute = cust_id_attribute.getText();
        System.out.println("getCustIdAttribute "+getCustIdAttribute);
        String getProductNameAttribute = product_name_attribute.getText();
        System.out.println(getProductNameAttribute);
        String getBuAttribute = bu_attribute.getText();
        String getSourceRefIdAttribute = source_ref_id_attribute.getText();
        System.out.println(getSourceRefIdAttribute);
        String getBranchCodeAttribure = branch_code_attribute.getText();
        System.out.println(getBranchCodeAttribure);
        String getRemarksAttribute = remarks_attribute.getText();

        Assert.assertEquals(attribute1, getCustIdAttribute);
        Assert.assertEquals(attribute2, getProductNameAttribute);
        Assert.assertEquals(attribute3, getBuAttribute);
        Assert.assertEquals(attribute4, getSourceRefIdAttribute);
        Assert.assertEquals(attribute5, getBranchCodeAttribure);
        Assert.assertEquals(attribute6, getRemarksAttribute);
    }

    public void verifyValueOfAttribute(String value1, String value2, String value3, String value4, String value5) {
        String getCustIdValue = cust_id_value.getText();
        String getProductNameValue = product_name_value.getText();
        String getBuValue = lob_value.getText();
        String getSourceRefIdValue = source_ref_id_value.getText();
        String getBranchCodeValue = branch_code_value.getAttribute("id");

        Assert.assertEquals(value1, getCustIdValue);
        Assert.assertEquals(value2, getProductNameValue);
        Assert.assertEquals(value3, getBuValue);
        Assert.assertEquals(value4, getSourceRefIdValue);
        Assert.assertEquals(value5, getBranchCodeValue);
    }

    public void clickOnSubmitButtonOfBookFDForm() {
        submit_button_bookFdpage.click();
    }

    public void writeRemarksOnRemarkstab(String remark) {
        remarks_tab.clear();
        remarks_tab.sendKeys(remark);
    }

    public void verifyTransactionCompleted(String message) {
        String getTransactionCompletedMessage= transaction_completed_successfully.getText();
        Assert.assertEquals(message, getTransactionCompletedMessage);
    }

    public void ClickOnRegulatorySectionInNBA() {
        category_regulatory.click();
    }

    public void clickOnCrossButton() {
        cross_button_nba.click();
    }

    public void clickCrossButtonOfSellCategory() {
        cross_button_sell_category.click();
    }

    public void clickOnSellCategory() {
        category_sell.click();
    }

    public void clickOnDefer() {
        defer_button.click();
    }

    public void selectDateFromCalender() {
        String futureDate = select_date.getText();
        System.out.println(futureDate);
    }

    public void clickOnSubmitOfCalender() {
        calender_submit.click();
        calender_submit.click();
    }

    public void verifyMessage(String message) {
        String getSuccessMessage = deferred_dismiss_message.getText();
        Assert.assertEquals(message, getSuccessMessage);
    }

    public void clickOnDismiss() {
        dismiss_button.click();
    }

    public void selectDismissReason() {
        select_dimiss_reason.click();
        dismiss_submit_button.click();
    }

    public void ClicksOnRelationshipIcon() {
        relationship_icon.click();
    }

    public void verifyRelationCategory(String category) {
        relation_category_investor.click();
        String getRelationCategoryInvestorTabText = relation_category_investor.getText();
        String getCategoryHeadingOfInvestor = heading_name.getText();

        Assert.assertEquals(category, getRelationCategoryInvestorTabText);
        Assert.assertEquals(category, getCategoryHeadingOfInvestor);
        Assert.assertEquals(getRelationCategoryInvestorTabText, getCategoryHeadingOfInvestor);
    }

    public void clickOnMinimizeIconOfRelationGraph() {
        relation_graph_minimize_icon.click();
    }

    public void clickOnTransactionsIcon() {
        transactions_icon.click();
    }

    public void clickOnCreateLead() {
        create_lead.click();
    }

    public void verifyAttributesOfCreateLeadWithoutReccomendation(String attribute1, String attribute2, String attribute3, String attribute4, String attribute5, String attribute6) {
        String getCustIDAttribute = create_lead_custid_attribute.getText();

        Assert.assertEquals(attribute1, getCustIDAttribute);
    }

    public void selectValuesFromDropdownInCreateLead(String value1, String value2, String value3, String value4, String value5, String value6) {
        custid_dropdown.click();
        select_custid.click();
//        String getCustIdValue = custid_value.getText();
//        Assert.assertEquals(value1, getCustIdValue);

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

        String getMdmidAttribute = mdmId_attribute.getText();
        String getCustNameAttribute = cust_name_attribute.getText();
        String getGenderAttribute = gender_attribute.getText();
        String getEmailAttribute = email_attribute.getText();
//        String getEmailStatus = email_status_of_authorised_signatory.getText();
        String getMobileNoAttribute = mobileno_attribute.getText();
//        String getMobileNoStatus = mobileno_status_of_authorised_signatory.getText();
        String getSecondaryMobileNoAttribute = secondary_mobileno_attribute.getText();
        String getContactibilityAttribute = contactability_attribute.getText();
        String getCurrentCityStateAttribute = current_cityState_attribute.getText();
        String getAuthorisedFirstMdmid = authorised_first_mdmdid.getText();
        String getAuthorisedFirstCustName = authorised_first_custname.getText();
        String getAuthorisedFirstGender = authorised_first_gender.getText();
        String getAuthorisedFirstEmail = authorised_first_email.getText();
        String getAuthorisedFirstMobileno = authorised_first_mobileno.getText();
        String getAuthorisedFirstSecondaryMobile = authorised_first_secondary_mobile.getText();
        String getAuthorisedFirstContactibility = authorised_first_contactibility.getText();
        String getAuthorisedFirstCurrentCityState = authorised_first_currentcitystate.getText();


        Assert.assertEquals(table.get(0).get(0), getMdmidAttribute);
        Assert.assertEquals(table.get(0).get(1), getCustNameAttribute);
        Assert.assertEquals(table.get(0).get(2), getGenderAttribute);
        Assert.assertEquals(table.get(0).get(3), getEmailAttribute);
        Assert.assertEquals(table.get(0).get(4), getMobileNoAttribute);
        Assert.assertEquals(table.get(0).get(5), getSecondaryMobileNoAttribute);
        Assert.assertEquals(table.get(0).get(6), getContactibilityAttribute);
        Assert.assertEquals(table.get(0).get(7), getCurrentCityStateAttribute);
        Assert.assertEquals(table.get(1).get(0), getAuthorisedFirstMdmid);
        Assert.assertEquals(table.get(1).get(1), getAuthorisedFirstCustName);
        Assert.assertEquals(table.get(1).get(2), getAuthorisedFirstGender);
        Assert.assertEquals(table.get(1).get(3), getAuthorisedFirstEmail);
        Assert.assertEquals(table.get(1).get(4), getAuthorisedFirstMobileno);
        Assert.assertEquals(table.get(1).get(5), getAuthorisedFirstSecondaryMobile);
        Assert.assertEquals(table.get(1).get(6), getAuthorisedFirstContactibility);
        Assert.assertEquals(table.get(1).get(7), getAuthorisedFirstCurrentCityState);

    }

    public void verifyKpiAttributes(String attr1, String attr2, String attr3) {
        String getGroupNrvAttribute = group_nrv_atttribute.getText();
        String getNrvAttribute = nrv_attribute.getText();
        String getPpiAttribute = ppi_attribute.getText();

        Assert.assertEquals(attr1, getGroupNrvAttribute);
        Assert.assertEquals(attr2, getNrvAttribute);
        Assert.assertEquals(attr3, getPpiAttribute);
    }

    public void verifyValuesOfKpiAttributes(String val1, String val2, String val3) {
        String getGroupNrvValue = group_nrv_value.getText();
        String getNrvValue = nrv_value.getText();
        String getPpiValue = ppi_value.getText();

        Assert.assertEquals(val1, getGroupNrvValue);
        Assert.assertEquals(val2, getNrvValue);
        Assert.assertEquals(val3, getPpiValue);
    }

    public void clickOnMmdIdOnDemogs() {
        mdmID_demogs.click();
    }

    public void verifyDetailedAttributes(DataTable data) {

        List<List<String>> table = data.raw();

        String getMDMIDValue = mdmid_value.getText();
        String getCustName = customername.getText().trim();
        String getDobDoi = dob_doi.getText().trim();
        String getProfessionValue = profession_value.getText();
        String getEmailValue = email_value.getText();
        String getMobileNoValue = mobileNo_value.getText();
        String getAddressValue = address_value.getText();

        Assert.assertEquals(table.get(0).get(0), getMDMIDValue);
        Assert.assertEquals(table.get(1).get(0), getCustName);
        Assert.assertEquals(table.get(2).get(0), getDobDoi);
        Assert.assertEquals(table.get(3).get(0), getProfessionValue);
        Assert.assertEquals(table.get(4).get(0), getEmailValue);
        Assert.assertEquals(table.get(5).get(0), getMobileNoValue);

        String getDetailedMdmId = detailed_mdmid_value.getText().trim();
        String getDetailedCustName = detailed_cust_name.getText().trim();
        String getDetailedDobDoi = detailed_dob.getText().trim();
        String getDetailedProfessionValue = detailed_profession.getText();
        String getDetailedEmailValue = detailed_email.getText();
        String getDetailedMobileNoValue = detailed_mobileNo.getText();
        String getDetailedAddressValue = detailed_address.getText();

        Assert.assertEquals(table.get(0).get(1), getDetailedMdmId);
        Assert.assertEquals(table.get(1).get(1), getDetailedCustName);
        Assert.assertEquals(table.get(2).get(1), getDetailedDobDoi);
        Assert.assertEquals(table.get(3).get(1), getDetailedProfessionValue);
        Assert.assertEquals(table.get(4).get(1), getDetailedEmailValue);
        Assert.assertEquals(table.get(5).get(1), getDetailedMobileNoValue);
        Assert.assertEquals(table.get(6).get(1), getDetailedAddressValue);

        Assert.assertEquals(getMDMIDValue, getDetailedMdmId);
        Assert.assertEquals(getCustName, getDetailedCustName);
        Assert.assertEquals(getDobDoi, getDetailedDobDoi);
        Assert.assertEquals(getProfessionValue, getDetailedProfessionValue);
        Assert.assertEquals(getEmailValue, getDetailedEmailValue);
        Assert.assertEquals(getMobileNoValue, getDetailedMobileNoValue);
//        Assert.assertEquals(getAddressValue, getDetailedAddressValue);
    }

    public void verifyDetailedAttributesAndValueOfMdmIDTypeM(DataTable data) {
        List<List<String>> table = data.raw();
        String getDetailedAttributeNameOfTypeM = detailed_attribute_name.getText();
        String getDetailedAttributeDobOfTypeM = detailed_attribute_dob.getText();
        String getDetailedAttribiteProfessionOfTypeM = detailed_attribute_profession.getText();
        String getDetailedAttributeDatCustOpenOfTypeM = detailed_attribute_datacustopen.getText();
        String getDetailedAttributeIncomeOfTypeM = detailed_attribute_income.getText();
        String getDetailedAttributeEmailAddressOfTypeM = detailed_attribute_email_address.getText();
        String getDetailedAttributeMobileNoOfTypeM = detailed_attribute_mobileno.getText();
        String getDetailedAttributeAlternateNoOfTypeM = detailed_attribute_alternateno.getText();
        String getDetailedAttributeCurrentAddressOfTypeM = detailed_attribute_current_address.getText();
        String getDetailedAttributePermanentAddressOfTypeM = detailed_attribute_permanent_address.getText();
        String getDetailedAttributeHomeBranchOfTypeM = detailed_attribute_home_branch.getText();
        String getDetailedAttributeClusterOfTypeM = detailed_attribute_cluster.getText();
        String getDetailedAttributeRegionOfTypeM = detailed_attribute_region.getText();
        String getDetailedAttributeAssetRmOfTypeM = detailed_attribute_assetrm.getText();
        String getDetailedAttributeLiabilityRmOfTypeM = detailed_attribute_liabilityrm.getText();
        String getDetailedAttributeServiceRmOfTypeM = detailed_attribute_servicerm.getText();
        String getDetailedAttributeGroupCodeOfTypeM = detailed_attribute_group_code.getText();
        String getDetailedAttriburePsmOfTypeM = detailed_attribute_psm.getText();
        String getDetailedAttributeNationalityOfTypeM = detailed_attribute_nationality.getText();
        String getDetailedAttributeFatcaOfTypeM = detailed_attribute_fatca.getText();
        String getDetailedAttributeBagicOfTypeM = detailed_attribute_bagic.getText();
        String getDetailedAttributeKycStatusOfTypeM = detailed_attribute_kycstatus.getText();
        String getDetailedAttributeRiskCategoryOfTypeM = detailed_attribute_riskcategory.getText();

        String getDetailedMdmIdValueOfTypeM = detailed_mdmid_value.getText();
        String getDetailedNameValueOfTpypeM = detailed_name_value.getText();
        String getDetailedDobValueOfTypeM = detailed_dob_value.getText();
        String getDetailedProfessionValueOfTypeM = detailed_profession_value.getText();
        String getDetailedDatCustOpenValueOfTypeM = detailed_dat_custopen_value.getText();
        String getDetailedIncomeValueOfTypeM = detailed_income_value.getText();
        String getDetailedEmailAddressValueOfTypeM = detailed_email_address_value.getText();
        String getDetailedMobileNoValueOfTypeM = detailed_mobileno_value.getText();
        String getDetailedAlternateNoValueOfTypeM = detailed_alternateno_value.getText();
        String getDetailedCurrentAddressValueOfTypeM = detailed_current_address_value.getText();
        String getDetailedPermanentAdressValueOfTypeM = detailed_permanent_address_value.getText();
        String getDetailedHomeBranchValueOfTypeM = detailed_homebranch_value.getText();
        String getDetailedClusterValueOfTypeM = detailed_cluster_value.getText();
        String getDetailedRegionValueOfTypeM = detailed_region_value.getText();
        String getDetailedAssetrmValueOfTypeM = detailed_assetrm_value.getText();
        String getDetailedLiabilityrmValueOfTypeM = detailed_liabilityrm_value.getText();
        String getDetailedServicermValueOfTypeM = detailed_servicerm_value.getText();
        String getDetailedGroupCodeValueOfTypeM = detailed_groupcode_value.getText();
        String getDetailedPsmValueOfTypeM = detailed_psm_value.getText();
        String getDetailedNaionalityValueOfTypeM = detailed_nationality_value.getText();
        String getDetailedFatcaValueOfTypeM = detailed_fatca_value.getText();
        String getDetailedBagicValueOfTypeM = detailed_bagic_value.getText();
        String getDetailedKycStatusValueOfTypeM = detailed_kycstatus_value.getText();
        String getDetailedRiskCategoryValueOfTypeM = detailed_riskcategory_value.getText();

        Assert.assertEquals(table.get(1).get(0), getDetailedAttributeNameOfTypeM);
        Assert.assertEquals(table.get(2).get(0), getDetailedAttributeDobOfTypeM);
        Assert.assertEquals(table.get(3).get(0), getDetailedAttribiteProfessionOfTypeM);
        Assert.assertEquals(table.get(4).get(0), getDetailedAttributeDatCustOpenOfTypeM);
        Assert.assertEquals(table.get(5).get(0), getDetailedAttributeIncomeOfTypeM);
        Assert.assertEquals(table.get(6).get(0), getDetailedAttributeEmailAddressOfTypeM);
        Assert.assertEquals(table.get(7).get(0), getDetailedAttributeMobileNoOfTypeM);
        Assert.assertEquals(table.get(8).get(0), getDetailedAttributeAlternateNoOfTypeM);
        Assert.assertEquals(table.get(9).get(0), getDetailedAttributeCurrentAddressOfTypeM);
        Assert.assertEquals(table.get(10).get(0), getDetailedAttributePermanentAddressOfTypeM);
        Assert.assertEquals(table.get(11).get(0), getDetailedAttributeHomeBranchOfTypeM);
        Assert.assertEquals(table.get(12).get(0), getDetailedAttributeClusterOfTypeM);
        Assert.assertEquals(table.get(13).get(0), getDetailedAttributeRegionOfTypeM);
        Assert.assertEquals(table.get(14).get(0), getDetailedAttributeAssetRmOfTypeM);
        Assert.assertEquals(table.get(15).get(0), getDetailedAttributeLiabilityRmOfTypeM);
        Assert.assertEquals(table.get(16).get(0), getDetailedAttributeServiceRmOfTypeM);
        Assert.assertEquals(table.get(17).get(0), getDetailedAttributeGroupCodeOfTypeM);
        Assert.assertEquals(table.get(18).get(0), getDetailedAttriburePsmOfTypeM);
        Assert.assertEquals(table.get(19).get(0), getDetailedAttributeNationalityOfTypeM);
        Assert.assertEquals(table.get(20).get(0), getDetailedAttributeFatcaOfTypeM);
        Assert.assertEquals(table.get(21).get(0), getDetailedAttributeBagicOfTypeM);
        Assert.assertEquals(table.get(22).get(0), getDetailedAttributeKycStatusOfTypeM);
        Assert.assertEquals(table.get(23).get(0), getDetailedAttributeRiskCategoryOfTypeM);

        Assert.assertEquals(table.get(0).get(1), getDetailedMdmIdValueOfTypeM);
        Assert.assertEquals(table.get(1).get(1), getDetailedNameValueOfTpypeM);
        Assert.assertEquals(table.get(2).get(1), getDetailedDobValueOfTypeM);
        Assert.assertEquals(table.get(3).get(1), getDetailedProfessionValueOfTypeM);
        Assert.assertEquals(table.get(4).get(1), getDetailedDatCustOpenValueOfTypeM);
        Assert.assertEquals(table.get(5).get(1), getDetailedIncomeValueOfTypeM);
        Assert.assertEquals(table.get(6).get(1), getDetailedEmailAddressValueOfTypeM);
        Assert.assertEquals(table.get(7).get(1), getDetailedMobileNoValueOfTypeM);
        Assert.assertEquals(table.get(8).get(1), getDetailedAlternateNoValueOfTypeM);
        Assert.assertEquals(table.get(9).get(1), getDetailedCurrentAddressValueOfTypeM);
        Assert.assertEquals(table.get(10).get(1), getDetailedPermanentAdressValueOfTypeM);
        Assert.assertEquals(table.get(11).get(1), getDetailedHomeBranchValueOfTypeM);
        Assert.assertEquals(table.get(12).get(1), getDetailedClusterValueOfTypeM);
        Assert.assertEquals(table.get(13).get(1), getDetailedRegionValueOfTypeM);
        Assert.assertEquals(table.get(14).get(1), getDetailedAssetrmValueOfTypeM);
        Assert.assertEquals(table.get(15).get(1), getDetailedLiabilityrmValueOfTypeM);
        Assert.assertEquals(table.get(16).get(1), getDetailedServicermValueOfTypeM);
        Assert.assertEquals(table.get(17).get(1), getDetailedGroupCodeValueOfTypeM);
        Assert.assertEquals(table.get(18).get(1), getDetailedPsmValueOfTypeM);
        Assert.assertEquals(table.get(19).get(1), getDetailedNaionalityValueOfTypeM);
        Assert.assertEquals(table.get(20).get(1), getDetailedFatcaValueOfTypeM);
        Assert.assertEquals(table.get(21).get(1), getDetailedBagicValueOfTypeM);
        Assert.assertEquals(table.get(22).get(1), getDetailedKycStatusValueOfTypeM);
        Assert.assertEquals(table.get(23).get(1), getDetailedRiskCategoryValueOfTypeM);
    }

    public void verifyDetailedAttributesAndValueOfMdmIDTypeC(DataTable data) {

        List<List<String>> table = data.raw();
        detailed_mdmid_value_typeC.click();

        String getDetailedAttributeNameOfTypeC = detailed_attribute_name_typeC.getText();
        String getDetailedAttributeDobOfTypeC = detailed_attribute_dob_typeC.getText();
        String getDetailedAttribiteProfessionOfTypeC = detailed_attribute_profession_typeC.getText();
        String getDetailedAttributeDatCustOpenOfTypeC = detailed_attribute_datacustopen_typeC.getText();
        String getDetailedAttributeIncomeOfTypeC = detailed_attribute_income_typeC.getText();
        String getDetailedAttributeEmailAddressOfTypeC = detailed_attribute_email_address_typeC.getText();
        String getDetailedAttributeMobileNoOfTypeC = detailed_attribute_mobileno_typeC.getText();
        String getDetailedAttributeAlternateNoOfTypeC = detailed_attribute_alternateno_typeC.getText();
        String getDetailedAttributeCurrentAddressOfTypeC = detailed_attribute_current_address_typeC.getText();
        String getDetailedAttributePermanentAddressOfTypeC = detailed_attribute_permanent_address_typeC.getText();
        String getDetailedAttributeHomeBranchOfTypeC = detailed_attribute_home_branch_typeC.getText();
        String getDetailedAttributeClusterOfTypeC = detailed_attribute_cluster_typeC.getText();
        String getDetailedAttributeRegionOfTypeC = detailed_attribute_region_typeC.getText();
        String getDetailedAttributeAssetRMOfTypeC = detailed_attribute_assetrm_typeC.getText();
        String getDetailedAttributeLiabilityRMOfTypeC = detailed_attribute_liabilityrm_typeC.getText();
        String getDetailedAttributeServiceRmOfTypeC = detailed_attribute_servicerm_typeC.getText();
        String getDetailedAttributeGroupCodeOfTypeC = detailed_attribute_group_code_typeC.getText();
        String getDetailedAttriburePSMOfTypeC = detailed_attribute_psm_typeC.getText();
        String getDetailedAttributeNationalityOfTypeC = detailed_attribute_nationality_typeC.getText();
        String getDetailedAttributeFatcaOfTypeC = detailed_attribute_fatca_typeC.getText();
        String getDetailedAttributeBagicOfTypeC = detailed_attribute_bagic_typeC.getText();
        String getDetailedAttributeKycStatusOfTypeC = detailed_attribute_kycstatus_typeC.getText();
        String getDetailedAttributeRiskCategoryOfTypeC = detailed_attribute_riskcategory_typeC.getText();

        String getDetailedMdmIdValueOfTypeC = detailed_mdmid_value_typeC.getText();
        String getDetailedNameValueOfTypeC = detailed_name_value_typeC.getText();
        String getDetailedDobValueOfTypeC = detailed_dob_value_typeC.getText();
        String getDetailedProfessionValueOfTypeC = detailed_profession_value_typeC.getText();
        String getDetailedDatCustOpenValueOfTypeC = detailed_dat_custopen_value_typeC.getText();
        String getDetailedIncomeValueOfTypeC = detailed_income_value_typeC.getText();
        String getDetailedEmailAddressValueOfTypeC = detailed_email_address_value_typeC.getText();
        String getDetailedMobileNoValueOfTypeC = detailed_mobileno_value_typeC.getText();
        String getDetailedAlternateNoValueOfTypeC = detailed_alternateno_value_typeC.getText();
        String getDetailedCurrentAddressValueOfTypeC = detailed_current_address_value_typeC.getText();
        String getDetailedPermanentAdressValueOfTypeC = detailed_permanent_address_value_typeC.getText();
        String getDetailedHomeBranchValueOfTypeC = detailed_homebranch_value_typeC.getText();
        String getDetailedClusterValueOfTypeC = detailed_cluster_value_typeC.getText();
        String getDetailedRegionValueOfTypeC = detailed_region_value_typeC.getText();
        String getDetailedAssetrmValueOfTypeC = detailed_assetrm_value_typeC.getText();
        String getDetailedLiabilityrmValueOfTypeC = detailed_liabilityrm_value_typeC.getText();
        String getDetailedServicermValueOfTypeC = detailed_servicerm_value_typeC.getText();
        String getDetailedGroupCodeValueOfTypeC = detailed_groupcode_value_typeC.getText();
        String getDetailedPsmValueOfTypeC = detailed_psm_value_typeC.getText();
        String getDetailedNaionalityValueOfTypeC = detailed_nationality_value_typeC.getText();
        String getDetailedFatcaValueOfTypeC = detailed_fatca_value_typeC.getText();
        String getDetailedBagicValueOfTypeC = detailed_bagic_value_typeC.getText();
        String getDetailedKycStatusValueOfTypeC = detailed_kycstatus_value_typeC.getText();
        String getDetailedRiskCategoryValueOfTypeC = detailed_riskcategory_value_typeC.getText();

        Assert.assertEquals(table.get(1).get(0), getDetailedAttributeNameOfTypeC);
        Assert.assertEquals(table.get(2).get(0), getDetailedAttributeDobOfTypeC);
        Assert.assertEquals(table.get(3).get(0), getDetailedAttribiteProfessionOfTypeC);
        Assert.assertEquals(table.get(4).get(0), getDetailedAttributeDatCustOpenOfTypeC);
        Assert.assertEquals(table.get(5).get(0), getDetailedAttributeIncomeOfTypeC);
        Assert.assertEquals(table.get(6).get(0), getDetailedAttributeEmailAddressOfTypeC);
        Assert.assertEquals(table.get(7).get(0), getDetailedAttributeMobileNoOfTypeC);
        Assert.assertEquals(table.get(8).get(0), getDetailedAttributeAlternateNoOfTypeC);
        Assert.assertEquals(table.get(9).get(0), getDetailedAttributeCurrentAddressOfTypeC);
        Assert.assertEquals(table.get(10).get(0), getDetailedAttributePermanentAddressOfTypeC);
        Assert.assertEquals(table.get(11).get(0), getDetailedAttributeHomeBranchOfTypeC);
        Assert.assertEquals(table.get(12).get(0), getDetailedAttributeClusterOfTypeC);
        Assert.assertEquals(table.get(13).get(0), getDetailedAttributeRegionOfTypeC);
        Assert.assertEquals(table.get(14).get(0), getDetailedAttributeAssetRMOfTypeC);
        Assert.assertEquals(table.get(15).get(0), getDetailedAttributeLiabilityRMOfTypeC);
        Assert.assertEquals(table.get(16).get(0), getDetailedAttributeServiceRmOfTypeC);
        Assert.assertEquals(table.get(17).get(0), getDetailedAttributeGroupCodeOfTypeC);
        Assert.assertEquals(table.get(18).get(0), getDetailedAttriburePSMOfTypeC);
        Assert.assertEquals(table.get(19).get(0), getDetailedAttributeNationalityOfTypeC);
        Assert.assertEquals(table.get(20).get(0), getDetailedAttributeFatcaOfTypeC);
        Assert.assertEquals(table.get(21).get(0), getDetailedAttributeBagicOfTypeC);
        Assert.assertEquals(table.get(22).get(0), getDetailedAttributeKycStatusOfTypeC);
        Assert.assertEquals(table.get(23).get(0), getDetailedAttributeRiskCategoryOfTypeC);

        Assert.assertEquals(table.get(0).get(1), getDetailedMdmIdValueOfTypeC);
        Assert.assertEquals(table.get(1).get(1), getDetailedNameValueOfTypeC);
        Assert.assertEquals(table.get(2).get(1), getDetailedDobValueOfTypeC);
        Assert.assertEquals(table.get(3).get(1), getDetailedProfessionValueOfTypeC);
        Assert.assertEquals(table.get(4).get(1), getDetailedDatCustOpenValueOfTypeC);
        Assert.assertEquals(table.get(5).get(1), getDetailedIncomeValueOfTypeC);
        Assert.assertEquals(table.get(6).get(1), getDetailedEmailAddressValueOfTypeC);
        Assert.assertEquals(table.get(7).get(1), getDetailedMobileNoValueOfTypeC);
        Assert.assertEquals(table.get(8).get(1), getDetailedAlternateNoValueOfTypeC);
        Assert.assertEquals(table.get(9).get(1), getDetailedCurrentAddressValueOfTypeC);
        Assert.assertEquals(table.get(10).get(1), getDetailedPermanentAdressValueOfTypeC);
        Assert.assertEquals(table.get(11).get(1), getDetailedHomeBranchValueOfTypeC);
        Assert.assertEquals(table.get(12).get(1), getDetailedClusterValueOfTypeC);
        Assert.assertEquals(table.get(13).get(1), getDetailedRegionValueOfTypeC);
        Assert.assertEquals(table.get(14).get(1), getDetailedAssetrmValueOfTypeC);
        Assert.assertEquals(table.get(15).get(1), getDetailedLiabilityrmValueOfTypeC);
        Assert.assertEquals(table.get(16).get(1), getDetailedServicermValueOfTypeC);
        Assert.assertEquals(table.get(17).get(1), getDetailedGroupCodeValueOfTypeC);
        Assert.assertEquals(table.get(18).get(1), getDetailedPsmValueOfTypeC);
        Assert.assertEquals(table.get(19).get(1), getDetailedNaionalityValueOfTypeC);
        Assert.assertEquals(table.get(20).get(1), getDetailedFatcaValueOfTypeC);
        Assert.assertEquals(table.get(21).get(1), getDetailedBagicValueOfTypeC);
        Assert.assertEquals(table.get(22).get(1), getDetailedKycStatusValueOfTypeC);
        Assert.assertEquals(table.get(23).get(1), getDetailedRiskCategoryValueOfTypeC);
    }

    public void verifyDetailedAttributesAndValueOfCorporateCustomerWithMdmIDTypeM(DataTable data) {
        List<List<String>> table = data.raw();

        String getDetailedAttributeNameOfTypeM = detailed_attribute_name.getText();
        String getDetailedAttributeDobOfTypeM = detailed_attribute_dob.getText();
        String getDetailedAttribiteProfessionOfTypeM = detailed_attribute_profession.getText();
        String getDetailedAttributeDatCustOpenOfTypeM = detailed_attribute_datacustopen.getText();
        String getDetailedAttributeIncomeOfTypeM = detailed_attribute_income.getText();
        String getDetailedAttributeEmailAddressOfTypeM = detailed_attribute_email_address.getText();
        String getDetailedAttributeMobileNoOfTypeM = detailed_attribute_mobileno.getText();
        String getDetailedAttributeAlternateNoOfTypeM = detailed_attribute_alternateno.getText();
        String getDetailedAttributeHomeBranchOfTypeM = detailed_attribute_corporate_homebranch.getText();
        String getDetailedAttributeClusterOfTypeM = detailed_attribute_corporate_cluster.getText();
        String getDetailedAttributeRegionOfTypeM = detailed_attribute_corporate_region.getText();
        String getDetailedAttributeIecOfTypeM = detailed_attribute_corporate_iec.getText();
        String getDetailedAttributeAssetRmOfTypeM = detailed_attribute_corporate_assetrm.getText();
        String getDetailedAttributeLiabilityRmOfTypeM = detailed_attribute_corporate_liabilityrm.getText();
        String getDetailedAttributeServiceRmOfTypeM = detailed_attribute_corporate_servicerm.getText();
        String getDetailedAttributeGroupCodeOfTypeM = detailed_attribute_corporate_groupcode.getText();
        String getDetailedAttriburePsmOfTypeM = detailed_attribute_corporate_psm.getText();
        String getDetailedAttributeNationalityOfTypeM = detailed_attribute_natureofbusiness.getText();
        String getDetailedAttributeFatcaOfTypeM = detailed_attribute_natureofindustry.getText();
        String getDetailedAttributeBagicOfTypeM = detailed_attribute_corporate_riskcategory.getText();
        String getDetailedAttributeKycStatusOfTypeM = detailed_attribute_website.getText();
        String getDetailedAttributeRiskCategoryOfTypeM = detailed_attribute_ecommsite.getText();

        String getDetailedMdmIdValueOfTypeM = detailed_mdmid_value.getText();
        String getDetailedNameValueOfTpypeM = detailed_name_value.getText();
        String getDetailedDobValueOfTypeM = detailed_dob_value.getText();
        String getDetailedProfessionValueOfTypeM = detailed_profession_value.getText();
        String getDetailedDatCustOpenValueOfTypeM = detailed_dat_custopen_value.getText();
        String getDetailedIncomeValueOfTypeM = detailed_turnover_value.getText();
        String getDetailedEmailAddressValueOfTypeM = detailed_email_address_value.getText();
        String getDetailedMobileNoValueOfTypeM = detailed_mobileno_value.getText();
        String getDetailedAlternateNoValueOfTypeM = detailed_corporate_alternateno_value.getText();
        String getDetailedHomeBranchValueOfTypeM = detailed_corporate_homebranch_value.getText();
        String getDetailedClusterValueOfTypeM = detailed_corporate_cluster_value.getText();
        String getDetailedRegionValueOfTypeM = detailed_corporate_region_value.getText();
        String getDetailedIecValueOfTypeM = detailed_corporate_iec_value.getText();
        String getDetailedAssetrmValueOfTypeM = detailed_assetrm_value.getText();
        String getDetailedLiabilityrmValueOfTypeM = detailed_liabilityrm_value.getText();
        String getDetailedServicermValueOfTypeM = detailed_servicerm_value.getText();
        String getDetailedGroupCodeValueOfTypeM = detailed_groupcode_value.getText();
        String getDetailedPsmValueOfTypeM = detailed_psm_value.getText();
        String getDetailedNatureOfBusineddValueOfTypeM = detailed_corporate_natureofbusiness_value.getText();
        String getDetailedNatureOfIndustryValueOfTypeM = detailed_corporate_natureofindustry_value.getText();
        String getDetailedRiskCategoryValueOfTypeM = detailed_corporate_riskcategory_value.getText();
        String getDetailedWebsiteValueOfTypeM = detailed_corporate_webiste_value.getText();
        String getDetailedEcommSiteValueOfTypeM = detailed_corporate_ecommsite_value.getText();

        Assert.assertEquals(table.get(1).get(0), getDetailedAttributeNameOfTypeM);
        Assert.assertEquals(table.get(2).get(0), getDetailedAttributeDobOfTypeM);
        Assert.assertEquals(table.get(3).get(0), getDetailedAttribiteProfessionOfTypeM);
        Assert.assertEquals(table.get(4).get(0), getDetailedAttributeDatCustOpenOfTypeM);
        Assert.assertEquals(table.get(5).get(0), getDetailedAttributeIncomeOfTypeM);
        Assert.assertEquals(table.get(6).get(0), getDetailedAttributeEmailAddressOfTypeM);
        Assert.assertEquals(table.get(7).get(0), getDetailedAttributeMobileNoOfTypeM);
        Assert.assertEquals(table.get(8).get(0), getDetailedAttributeAlternateNoOfTypeM);
        Assert.assertEquals(table.get(9).get(0), getDetailedAttributeHomeBranchOfTypeM);
        Assert.assertEquals(table.get(10).get(0), getDetailedAttributeClusterOfTypeM);
        Assert.assertEquals(table.get(11).get(0), getDetailedAttributeRegionOfTypeM);
        Assert.assertEquals(table.get(12).get(0), getDetailedAttributeIecOfTypeM);
        Assert.assertEquals(table.get(13).get(0), getDetailedAttributeAssetRmOfTypeM);
        Assert.assertEquals(table.get(14).get(0), getDetailedAttributeLiabilityRmOfTypeM);
        Assert.assertEquals(table.get(15).get(0), getDetailedAttributeServiceRmOfTypeM);
        Assert.assertEquals(table.get(16).get(0), getDetailedAttributeGroupCodeOfTypeM);
        Assert.assertEquals(table.get(17).get(0), getDetailedAttriburePsmOfTypeM);
        Assert.assertEquals(table.get(18).get(0), getDetailedAttributeNationalityOfTypeM);
        Assert.assertEquals(table.get(19).get(0), getDetailedAttributeFatcaOfTypeM);
        Assert.assertEquals(table.get(20).get(0), getDetailedAttributeBagicOfTypeM);
        Assert.assertEquals(table.get(21).get(0), getDetailedAttributeKycStatusOfTypeM);
        Assert.assertEquals(table.get(22).get(0), getDetailedAttributeRiskCategoryOfTypeM);

        Assert.assertEquals(table.get(0).get(1), getDetailedMdmIdValueOfTypeM);
        Assert.assertEquals(table.get(1).get(1), getDetailedNameValueOfTpypeM);
        Assert.assertEquals(table.get(2).get(1), getDetailedDobValueOfTypeM);
        Assert.assertEquals(table.get(3).get(1), getDetailedProfessionValueOfTypeM);
        Assert.assertEquals(table.get(4).get(1), getDetailedDatCustOpenValueOfTypeM);
        Assert.assertEquals(table.get(5).get(1), getDetailedIncomeValueOfTypeM);
        Assert.assertEquals(table.get(6).get(1), getDetailedEmailAddressValueOfTypeM);
        Assert.assertEquals(table.get(7).get(1), getDetailedMobileNoValueOfTypeM);
        Assert.assertEquals(table.get(8).get(1), getDetailedAlternateNoValueOfTypeM);
        Assert.assertEquals(table.get(9).get(1), getDetailedHomeBranchValueOfTypeM);
        Assert.assertEquals(table.get(10).get(1), getDetailedClusterValueOfTypeM);
        Assert.assertEquals(table.get(11).get(1), getDetailedRegionValueOfTypeM);
        Assert.assertEquals(table.get(12).get(1), getDetailedIecValueOfTypeM);
        Assert.assertEquals(table.get(13).get(1), getDetailedAssetrmValueOfTypeM);
        Assert.assertEquals(table.get(14).get(1), getDetailedLiabilityrmValueOfTypeM);
        Assert.assertEquals(table.get(15).get(1), getDetailedServicermValueOfTypeM);
        Assert.assertEquals(table.get(16).get(1), getDetailedGroupCodeValueOfTypeM);
        Assert.assertEquals(table.get(17).get(1), getDetailedPsmValueOfTypeM);
        Assert.assertEquals(table.get(18).get(1), getDetailedNatureOfBusineddValueOfTypeM);
        Assert.assertEquals(table.get(19).get(1), getDetailedNatureOfIndustryValueOfTypeM);
        Assert.assertEquals(table.get(20).get(1), getDetailedRiskCategoryValueOfTypeM);
        Assert.assertEquals(table.get(21).get(1), getDetailedWebsiteValueOfTypeM);
        Assert.assertEquals(table.get(22).get(1), getDetailedEcommSiteValueOfTypeM);
    }

    public void verifyDetailedAttributesAndValueOfCorporateCustomerWithMdmIDTypeC(DataTable data) {
        List<List<String>> table = data.raw();
        detailed_mdmid_value_typeC.click();

        String getDetailedAttributeNameOfTypeC = detailed_attribute_name.getText();
        String getDetailedAttributeDobOfTypeC = detailed_attribute_dob.getText();
        String getDetailedAttribiteProfessionOfTypeC = detailed_attribute_profession.getText();
        String getDetailedAttributeDatCustOpenOfTypeC = detailed_attribute_datacustopen.getText();
        String getDetailedAttributeIncomeOfTypeC = detailed_attribute_income.getText();
        String getDetailedAttributeEmailAddressOfTypeC = detailed_attribute_email_address.getText();
        String getDetailedAttributeMobileNoOfTypeC = detailed_attribute_mobileno.getText();
        String getDetailedAttributeAlternateNoOfTypeC = detailed_attribute_alternateno.getText();
        String getDetailedAttributeHomeBranchOfTypeC = detailed_attribute_corporate_homebranch.getText();
        String getDetailedAttributeClusterOfTypeC = detailed_attribute_corporate_cluster.getText();
        String getDetailedAttributeRegionOfTypeC = detailed_attribute_corporate_region.getText();
        String getDetailedAttributeIecOfTypeC = detailed_attribute_corporate_iec.getText();
        String getDetailedAttributeAssetRmOfTypeC = detailed_attribute_corporate_assetrm.getText();
        String getDetailedAttributeLiabilityRmOfTypeC = detailed_attribute_corporate_liabilityrm.getText();
        String getDetailedAttributeServiceRmOfTypeC = detailed_attribute_corporate_servicerm.getText();
        String getDetailedAttributeGroupCodeOfTypeC = detailed_attribute_corporate_groupcode.getText();
        String getDetailedAttriburePsmOfTypeC = detailed_attribute_corporate_psm.getText();
        String getDetailedAttributeNationalityOfTypeC = detailed_attribute_natureofbusiness.getText();
        String getDetailedAttributeFatcaOfTypeC = detailed_attribute_natureofindustry.getText();
        String getDetailedAttributeBagicOfTypeC = detailed_attribute_corporate_riskcategory.getText();
        String getDetailedAttributeKycStatusOfTypeC = detailed_attribute_website.getText();
        String getDetailedAttributeRiskCategoryOfTypeC = detailed_attribute_ecommsite.getText();

        String getDetailedMdmIdValueOfTypeC = detailed_mdmid_value_typeC.getText();
        String getDetailedNameValueOfTpypeC = detailed_name_value.getText();
        String getDetailedDobValueOfTypeC = detailed_dob_value.getText();
        String getDetailedProfessionValueOfTypeC = detailed_profession_value.getText();
        String getDetailedDatCustOpenValueOfTypeC = detailed_dat_custopen_value.getText();
        String getDetailedIncomeValueOfTypeC = detailed_turnover_value.getText();
        String getDetailedEmailAddressValueOfTypeC = detailed_email_address_value.getText();
        String getDetailedMobileNoValueOfTypeC = detailed_mobileno_value.getText();
        String getDetailedAlternateNoValueOfTypeC = detailed_corporate_alternateno_value.getText();
        String getDetailedHomeBranchValueOfTypeC = detailed_corporate_homebranch_value.getText();
        String getDetailedClusterValueOfTypeC = detailed_corporate_cluster_value.getText();
        String getDetailedRegionValueOfTypeC = detailed_corporate_region_value.getText();
        String getDetailedIecValueOfTypeC = detailed_corporate_iec_value.getText();
        String getDetailedAssetrmValueOfTypeC = detailed_assetrm_value.getText();
        String getDetailedLiabilityrmValueOfTypeC = detailed_liabilityrm_value.getText();
        String getDetailedServicermValueOfTypeC = detailed_servicerm_value.getText();
        String getDetailedGroupCodeValueOfTypeC = detailed_groupcode_value.getText();
        String getDetailedPsmValueOfTypeC = detailed_psm_value.getText();
        String getDetailedNatureOfBusineddValueOfTypeC = detailed_corporate_natureofbusiness_value.getText();
        String getDetailedNatureOfIndustryValueOfTypeC = detailed_corporate_natureofindustry_value.getText();
        String getDetailedRiskCategoryValueOfTypeC = detailed_corporate_riskcategory_value.getText();
        String getDetailedWebsiteValueOfTypeC = detailed_corporate_webiste_value.getText();
        String getDetailedEcommSiteValueOfTypeC = detailed_corporate_ecommsite_value.getText();

        Assert.assertEquals(table.get(1).get(0), getDetailedAttributeNameOfTypeC);
        Assert.assertEquals(table.get(2).get(0), getDetailedAttributeDobOfTypeC);
        Assert.assertEquals(table.get(3).get(0), getDetailedAttribiteProfessionOfTypeC);
        Assert.assertEquals(table.get(4).get(0), getDetailedAttributeDatCustOpenOfTypeC);
        Assert.assertEquals(table.get(5).get(0), getDetailedAttributeIncomeOfTypeC);
        Assert.assertEquals(table.get(6).get(0), getDetailedAttributeEmailAddressOfTypeC);
        Assert.assertEquals(table.get(7).get(0), getDetailedAttributeMobileNoOfTypeC);
        Assert.assertEquals(table.get(8).get(0), getDetailedAttributeAlternateNoOfTypeC);
        Assert.assertEquals(table.get(9).get(0), getDetailedAttributeHomeBranchOfTypeC);
        Assert.assertEquals(table.get(10).get(0), getDetailedAttributeClusterOfTypeC);
        Assert.assertEquals(table.get(11).get(0), getDetailedAttributeRegionOfTypeC);
        Assert.assertEquals(table.get(12).get(0), getDetailedAttributeIecOfTypeC);
        Assert.assertEquals(table.get(13).get(0), getDetailedAttributeAssetRmOfTypeC);
        Assert.assertEquals(table.get(14).get(0), getDetailedAttributeLiabilityRmOfTypeC);
        Assert.assertEquals(table.get(15).get(0), getDetailedAttributeServiceRmOfTypeC);
        Assert.assertEquals(table.get(16).get(0), getDetailedAttributeGroupCodeOfTypeC);
        Assert.assertEquals(table.get(17).get(0), getDetailedAttriburePsmOfTypeC);
        Assert.assertEquals(table.get(18).get(0), getDetailedAttributeNationalityOfTypeC);
        Assert.assertEquals(table.get(19).get(0), getDetailedAttributeFatcaOfTypeC);
        Assert.assertEquals(table.get(20).get(0), getDetailedAttributeBagicOfTypeC);
        Assert.assertEquals(table.get(21).get(0), getDetailedAttributeKycStatusOfTypeC);
        Assert.assertEquals(table.get(22).get(0), getDetailedAttributeRiskCategoryOfTypeC);

        Assert.assertEquals(table.get(0).get(1), getDetailedMdmIdValueOfTypeC);
        Assert.assertEquals(table.get(1).get(1), getDetailedNameValueOfTpypeC);
        Assert.assertEquals(table.get(2).get(1), getDetailedDobValueOfTypeC);
        Assert.assertEquals(table.get(3).get(1), getDetailedProfessionValueOfTypeC);
        Assert.assertEquals(table.get(4).get(1), getDetailedDatCustOpenValueOfTypeC);
        Assert.assertEquals(table.get(5).get(1), getDetailedIncomeValueOfTypeC);
        Assert.assertEquals(table.get(6).get(1), getDetailedEmailAddressValueOfTypeC);
        Assert.assertEquals(table.get(7).get(1), getDetailedMobileNoValueOfTypeC);
        Assert.assertEquals(table.get(8).get(1), getDetailedAlternateNoValueOfTypeC);
        Assert.assertEquals(table.get(9).get(1), getDetailedHomeBranchValueOfTypeC);
        Assert.assertEquals(table.get(10).get(1), getDetailedClusterValueOfTypeC);
        Assert.assertEquals(table.get(11).get(1), getDetailedRegionValueOfTypeC);
        Assert.assertEquals(table.get(12).get(1), getDetailedIecValueOfTypeC);
        Assert.assertEquals(table.get(13).get(1), getDetailedAssetrmValueOfTypeC);
        Assert.assertEquals(table.get(14).get(1), getDetailedLiabilityrmValueOfTypeC);
        Assert.assertEquals(table.get(15).get(1), getDetailedServicermValueOfTypeC);
        Assert.assertEquals(table.get(16).get(1), getDetailedGroupCodeValueOfTypeC);
        Assert.assertEquals(table.get(17).get(1), getDetailedPsmValueOfTypeC);
        Assert.assertEquals(table.get(18).get(1), getDetailedNatureOfBusineddValueOfTypeC);
        Assert.assertEquals(table.get(19).get(1), getDetailedNatureOfIndustryValueOfTypeC);
        Assert.assertEquals(table.get(20).get(1), getDetailedRiskCategoryValueOfTypeC);
        Assert.assertEquals(table.get(21).get(1), getDetailedWebsiteValueOfTypeC);
        Assert.assertEquals(table.get(22).get(1), getDetailedEcommSiteValueOfTypeC);
    }

    public void customerRelationGraphWithCategories(DataTable data) {
        List<List<String>> table = data.raw();

        relation_category_investor.click();
        String getRelationCategoryInvestorTabText = relation_category_investor.getText();
        String getCategoryHeadingOfInvestor = heading_name.getText();
        String getCustomerNameInInvestorCategory = customer_name.getText();
        String getAttributeMDMIDInInvestorCategory = mdm_id.getText();
        String getSelfTextInInvestorCategory = self.getText();
        String getLinkedCustomerNameInInvestorCategory = linked_customer_name.getAttribute("title");
        String getLinkedMDMIDAttributeInInvestoryCategory = linked_mdm_id.getText();
        String getRelationshipInInvestorCategory = relationship.getText();

        Assert.assertEquals(table.get(1).get(0), getRelationCategoryInvestorTabText);
        Assert.assertEquals(table.get(1).get(0), getCategoryHeadingOfInvestor);
        Assert.assertEquals(table.get(1).get(1), getCustomerNameInInvestorCategory);
        Assert.assertEquals(table.get(1).get(2), getAttributeMDMIDInInvestorCategory);
        Assert.assertEquals(table.get(1).get(3), getSelfTextInInvestorCategory);
        Assert.assertEquals(table.get(1).get(4), getLinkedCustomerNameInInvestorCategory);
        Assert.assertEquals(table.get(1).get(5), getLinkedMDMIDAttributeInInvestoryCategory);
        Assert.assertEquals(table.get(1).get(6), getRelationshipInInvestorCategory);

        relation_category_friend.click();
        String getRelationCategoryFriendTabText = relation_category_friend.getText();
        String getCategoryHeadingOfFriend = heading_name.getText();
        String getCustomerNameInFriendCategory = customer_name.getText();
        String getAttributeMDMIDInFriendCategory = mdm_id.getText();
        String getSelfTextInfriendCategory = self.getText();
        String getLinkedCustomerNameInFriendCategory = linked_customer_name.getText();
        String getLinkedMDMIDAttributeInFriendCategory = linked_mdm_id.getText();
        String getRelationshipInFriendCategory = relationship.getText();

        Assert.assertEquals(table.get(2).get(0), getRelationCategoryFriendTabText);
        Assert.assertEquals(table.get(2).get(0), getCategoryHeadingOfFriend);
        Assert.assertEquals(table.get(2).get(1), getCustomerNameInFriendCategory);
        Assert.assertEquals(table.get(2).get(2), getAttributeMDMIDInFriendCategory);
        Assert.assertEquals(table.get(2).get(3), getSelfTextInfriendCategory);
        Assert.assertEquals(table.get(2).get(4), getLinkedCustomerNameInFriendCategory);
        Assert.assertEquals(table.get(2).get(5), getLinkedMDMIDAttributeInFriendCategory);
        Assert.assertEquals(table.get(2).get(6), getRelationshipInFriendCategory);

        relation_category_corporate.click();
        String getRelationCategoryCorporateTabText = relation_category_corporate.getText();
        String getCategoryHeadingOfCorporate = heading_name.getText();
        String getCustomerNameInCorporateCategory = customer_name.getText();
        String getAttributeMDMIDInCorporateCategory = mdm_id.getText();
        String getSelfTextInCorporateCategory = self.getText();
        String getLinkedCustomerNameInCorporateCategory = linked_customer_name.getText();
        String getLinkedMDMIDAttributeInCorporateCategory = linked_mdm_id.getText();
        String getRelationshipInCorporateCategory = relationship.getText();

        Assert.assertEquals(table.get(3).get(0), getRelationCategoryCorporateTabText);
        Assert.assertEquals(table.get(3).get(0), getCategoryHeadingOfCorporate);
        Assert.assertEquals(table.get(3).get(1), getCustomerNameInCorporateCategory);
        Assert.assertEquals(table.get(3).get(2), getAttributeMDMIDInCorporateCategory);
        Assert.assertEquals(table.get(3).get(3), getSelfTextInCorporateCategory);
        Assert.assertEquals(table.get(3).get(4), getLinkedCustomerNameInCorporateCategory);
        Assert.assertEquals(table.get(3).get(5), getLinkedMDMIDAttributeInCorporateCategory);
        Assert.assertEquals(table.get(3).get(6), getRelationshipInCorporateCategory);

        relation_category_family.click();
        String getRelationCategoryFamilyTabText = relation_category_family.getText();
        String getCategoryHeadingOfFamily = heading_name.getText();
        String getCustomerNameInFamilyCategory = customer_name.getText();
        String getAttributeMDMIDInFamilyCategory = mdm_id.getText();
        String getSelfTextInFamilyCategory = self.getText();
        String getLinkedCustomerNameInFamilyCategory = linked_customer_name.getText();
        String getLinkedMDMIDAttributeInFamilyCategory = linked_mdm_id.getText();
        String getRelationshipInFamilyCategory = relationship.getText();

        Assert.assertEquals(table.get(4).get(0), getRelationCategoryFamilyTabText);
        Assert.assertEquals(table.get(4).get(0), getCategoryHeadingOfFamily);
        Assert.assertEquals(table.get(4).get(1), getCustomerNameInFamilyCategory);
        Assert.assertEquals(table.get(4).get(2), getAttributeMDMIDInFamilyCategory);
        Assert.assertEquals(table.get(4).get(3), getSelfTextInFamilyCategory);
        Assert.assertEquals(table.get(4).get(4), getLinkedCustomerNameInFamilyCategory);
        Assert.assertEquals(table.get(4).get(5), getLinkedMDMIDAttributeInFamilyCategory);
        Assert.assertEquals(table.get(4).get(6), getRelationshipInFamilyCategory);

        relation_category_client.click();
        String getRelationCategoryClientTabText = relation_category_client.getText();
        String getCategoryHeadingOfClient = heading_name.getText();
        String getCustomerNameInClientCategory = customer_name.getText();
        String getAttributeMDMIDInClientCategory = mdm_id.getText();
        String getSelfTextInClientCategory = self.getText();
        String getLinkedCustomerNameInClientCategory = linked_customer_name.getAttribute("title");
        String getRelationshipInClientCategory = relationship_client.getText();

        Assert.assertEquals(table.get(5).get(0), getRelationCategoryClientTabText);
        Assert.assertEquals(table.get(5).get(0), getCategoryHeadingOfClient);
        Assert.assertEquals(table.get(5).get(1), getCustomerNameInClientCategory);
        Assert.assertEquals(table.get(5).get(2), getAttributeMDMIDInClientCategory);
        Assert.assertEquals(table.get(5).get(3), getSelfTextInClientCategory);
        Assert.assertEquals(table.get(5).get(4), getLinkedCustomerNameInClientCategory);
        Assert.assertEquals(table.get(5).get(6), getRelationshipInClientCategory);
    }
}
