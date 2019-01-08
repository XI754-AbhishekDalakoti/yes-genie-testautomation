package pageObjects;

import locators.SnapLocators;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SnapPage extends SnapLocators {

    public SnapPage() {
        super();
    }

    public void demographicsAttributesOfIndividual() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("http://yesgenie.com:30978/snap", currentUrl);

        String getIconTooltipText = icon.getAttribute("title");
        String getCustName = customername.getText().trim();
        String getDobDoi = dob_doi.getText().trim();
        String getDobDoiTooltipTxt = dobdoi_tooltipText.getAttribute("title");
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
        String getCustomerTypeValue = customer_type_value.getText();
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
        boolean result = getAddressTooltipText.contains("Saharanpur,uttar Pradesh");
        String getAddressStatus = address_status.getAttribute("title");

        Assert.assertEquals("Individual", getIconTooltipText);
        Assert.assertEquals("Charu Sadana", getCustName);
        Assert.assertEquals("NA", getDobDoi);
        Assert.assertEquals("Birthday", getDobDoiTooltipTxt);
        Assert.assertEquals("Connections", getConnectionsTooltipText);
        Assert.assertEquals("MDM ID", getMDMIdAttribute);
        Assert.assertEquals("996264849", getMDMIDValue);
        Assert.assertEquals("Ckyc no.", getCkycAttribute);
        Assert.assertEquals("NA", getCkycValue);
        Assert.assertEquals("Profession", getProfessionAttribute);
        Assert.assertEquals("Business", getProfessionValue);
        Assert.assertEquals("Vintage", getVintageAttribute);
        Assert.assertEquals("3.3", getVintageValue);
        Assert.assertEquals("BS/PS", getBsPsAttribute);
        Assert.assertEquals("BRB/RS", BsPSValue);
        Assert.assertEquals("Customer Type", getCustomerTypeAttribute);
        Assert.assertEquals("Female Resident Individual", getCustomerTypeValue);
        Assert.assertEquals("Customer Segment", getCustomerSegmentAttribute);
        Assert.assertEquals("Yes First Primary Opdt", getCustomerSegmentValue);
        Assert.assertEquals("Aadhaar", getAadharTooltipText);
        Assert.assertEquals("Pan", getPanTooltiptext);
        Assert.assertEquals("Passport", getPassportTooltiptext);
        Assert.assertEquals("Verified", getPanStatus);
        Assert.assertEquals("Verified", getAadhaarStatus);
        Assert.assertEquals("Verified", getPassportStatus);
        Assert.assertEquals("Mobile Number", getMobileNoTooltipText);
        Assert.assertEquals("917123456789", getMobileNoValue);
        Assert.assertEquals("Verified", getMobileNoStatus);
        Assert.assertEquals("Email", getEmailTooltipText);
        Assert.assertEquals("csadana@yahoo.co.in", getEmailValue);
        Assert.assertEquals("Verified", getEmailStatus);
        Assert.assertEquals("W/o Rahul Sadana 25-b, Saharanpur,uttar Pradesh", getAddressTooltipText);
        Assert.assertTrue(result);
        Assert.assertEquals("Verified", getAddressStatus);
    }

    public void demographicsAttributesOfCorporate() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("http://yesgenie.com:30978/snap", currentUrl);

        String getIconTooltipText = icon.getAttribute("title");
        String getCustName = customername.getText().trim();
        String getDobDoi = dob_doi.getText().trim();
        String getDobDoiTooltipTxt = dobdoi_tooltipText.getAttribute("title");
        String getAuthorisedSignatoryTooltipText = authorised_signatory_tooltiptext.getAttribute("title");
        String getConnectionsTooltipText = connections_tooltiptext.getAttribute("title");
        String getWebsiteTooltipText = website_tooltiptext.getAttribute("title");
        System.out.println(getWebsiteTooltipText);
        String getMDMIdAttribute = attribute_mdmid.getText();
        String getMDMIDValue = mdmid_value.getText();
        String getBusinessAttribute = attribute_business.getText();
        String getBusinessValue = business_value.getText();
        String getIndustryAttribute = industry_attribute.getText();
        String getIndustryValue = industry_value.getText();
        String getVintageAttribute = vintage_attribute.getText();
        String getVintageValue = vintage_value.getText();
        String getBsPsCorporateAttribute = bsps_corporate_attribute.getText();
        System.out.println(getBsPsCorporateAttribute);
        String getBsPsValue1 = bsps_value1.getText();
        String getBsPsValue2 = bsps_value2.getText();
        String BsPSValue = getBsPsValue1.concat(getBsPsValue2);
        String getCustomerTypeAttribute = customer_type_attribute.getText();
        System.out.println(getCustomerTypeAttribute);
        String getCustomerTypeValue = customer_type_value.getText();
        String getAnnualTurnoverAttribute = annual_turnover_attribute.getText();
        String getAnnualTurnoverValue = annual_turnover_value.getText();
        String getPanTooltipText = corporate_pan_tooltiptext.getAttribute("title");
        String getPanStatus = corporate_pan_status.getAttribute("title");
        String getMobileNoTooltipText = mobileNo_tooltiptext.getAttribute("title");
        String getMobileNoValue = mobileNo_value.getText();
        String getMobileNoStatus = mobileNo_status.getAttribute("title");
        String getAlternateMobileNoTooltiptext = alternate_mobileNo_tooltiptext.getAttribute("title");
        String getAlternateMobileNoValue = alternate_mobileNo_value.getText();
        String getAlternateMobileNoStatus = alternate_mobileNo_status.getAttribute("title");
        String getEmailTooltipText = email_tooltiptext.getAttribute("title");
        String getEmailValue = corporate_email_value.getText();
        String getEmailStatus = email_status.getAttribute("title");
        String getAddressTooltipText = address_tooltiptext.getAttribute("title");
        String getAddressValue = address_value.getText();
        String getAddressStatus = address_status.getAttribute("title");

        Assert.assertEquals("Corporate", getIconTooltipText);
        Assert.assertEquals("Surindra Radios Private Limited", getCustName);
        Assert.assertEquals("NA", getDobDoi);
        Assert.assertEquals("Date of Incorporation", getDobDoiTooltipTxt);
        Assert.assertEquals("Authorised Signatory", getAuthorisedSignatoryTooltipText);
        Assert.assertEquals("Connections", getConnectionsTooltipText);
        Assert.assertEquals("Website: Not Available", getWebsiteTooltipText);
        Assert.assertEquals("MDM ID", getMDMIdAttribute);
        Assert.assertEquals("998003452", getMDMIDValue);
        Assert.assertEquals("Business", getBusinessAttribute);
        Assert.assertEquals("NA", getBusinessValue);
        Assert.assertEquals("Industry", getIndustryAttribute);
        Assert.assertEquals("Agri Commodities", getIndustryValue);
        Assert.assertEquals("Vintage", getVintageAttribute);
        Assert.assertEquals("4.1", getVintageValue);
        Assert.assertEquals("BS/PS", getBsPsCorporateAttribute);
        Assert.assertEquals("BRB/RS", BsPSValue);
        Assert.assertEquals("Customer Type", getCustomerTypeAttribute);
        Assert.assertEquals("Female Resid...", getCustomerTypeValue);
        Assert.assertEquals("Annual Turnover", getAnnualTurnoverAttribute);
        Assert.assertEquals("1 To 5 Crore", getAnnualTurnoverValue);
        Assert.assertEquals("Pan", getPanTooltipText);
        Assert.assertEquals("Not Verified", getPanStatus);
        Assert.assertEquals("Mobile Number", getMobileNoTooltipText);
        Assert.assertEquals("6080112225", getMobileNoValue);
        Assert.assertEquals("Not Verified", getMobileNoStatus);
        Assert.assertEquals("Alternate Mobile", getAlternateMobileNoTooltiptext);
        Assert.assertEquals("NA", getAlternateMobileNoValue);
        Assert.assertEquals("Not Available", getAlternateMobileNoStatus);
        Assert.assertEquals("Email", getEmailTooltipText);
        Assert.assertEquals("amarjeets555@gmail.com", getEmailValue);
        Assert.assertEquals("Verified", getEmailStatus);
        Assert.assertEquals("Sco 1128 Sector 22, Patna,bihar", getAddressTooltipText);
        Assert.assertEquals("Patna Bihar", getAddressValue);
        Assert.assertEquals("Not Verified", getAddressStatus);
    }

    public void verfiyDifferentCategoriesOnSnapPage(String category, String count, String recommendation, String recommendationEndDate, String actionLableIcon) {
        switch (category) {
            case "All":
                String all = category_all.getText();
                boolean validateTextOfCategoryAll = all.contains(category) && all.contains(count);
                System.out.println(all);
                String getRecommendationData = recommendation_data.getText();
                String getRecommendationEndDate = recommendation_end_date.getText();
                String getActionLableData = action_lable.getText();

                List<WebElement> getAllCategoryElements = driver.findElements(By.xpath("//div[@class='_37o44A1ADlDnmq-cWSzlSy']/div"));
                int countOfAllCategoryReccommendation = getAllCategoryElements.size();

                int convertCountToInteger = Integer.parseInt(count);
                Assert.assertTrue(validateTextOfCategoryAll);
                Assert.assertEquals(convertCountToInteger, countOfAllCategoryReccommendation);
                Assert.assertEquals(recommendation, getRecommendationData);
                Assert.assertEquals(recommendationEndDate, getRecommendationEndDate);
                Assert.assertEquals(actionLableIcon, getActionLableData);
                break;

            case "Regulatory":
                String regulatory = category_regulatory.getText();
                boolean validateTextOfCategoryRegulatory = regulatory.contains(category) && regulatory.contains(count);

                category_regulatory.click();
                List<WebElement> getRegulatoryCategoryElements = driver.findElements(By.xpath("//div[@class='_37o44A1ADlDnmq-cWSzlSy']/div"));
                int countOfRegulatoryCategoryReccommendation = getRegulatoryCategoryElements.size();

                Assert.assertTrue(validateTextOfCategoryRegulatory);
                Assert.assertEquals(Integer.parseInt(count), countOfRegulatoryCategoryReccommendation);
                break;

            case "Service":
                String service = category_service.getText();
                boolean validateTextOfCategoryService = service.contains(category) && service.contains(count);

                category_service.click();
                List<WebElement> getServiceCategoryElements = driver.findElements(By.xpath("//div[@class='_37o44A1ADlDnmq-cWSzlSy']/div"));
                int countOfServiceCategoryReccommendation = getServiceCategoryElements.size();

                Assert.assertTrue(validateTextOfCategoryService);
                Assert.assertEquals(Integer.parseInt(count), countOfServiceCategoryReccommendation);
                break;

            case "Sell":
                String sell = category_sell.getText();
                boolean validateTextOfCategorySell = sell.contains(category) && sell.contains(count);

                category_sell.click();
                List<WebElement> getSellCategoryElements = driver.findElements(By.xpath("//div[@class='_37o44A1ADlDnmq-cWSzlSy']/div"));
                int countOfSellCategoryReccommendation = getSellCategoryElements.size();

                Assert.assertTrue(validateTextOfCategorySell);
                Assert.assertEquals(Integer.parseInt(count), countOfSellCategoryReccommendation);
                break;

            case "Alerts":
                String alerts = category_alerts.getText();
                boolean validateTextOfCategoryAlerts = alerts.contains(category) && alerts.contains(count);

                category_alerts.click();
                List<WebElement> getAlertsCategoryElements = driver.findElements(By.xpath("//div[@class='_37o44A1ADlDnmq-cWSzlSy']/div"));
                int countOfAlertsCategoryReccommendation = getAlertsCategoryElements.size();

                Assert.assertTrue(validateTextOfCategoryAlerts);
                Assert.assertEquals(Integer.parseInt(count), countOfAlertsCategoryReccommendation);
                break;

            case "Information":
                String information = category_information.getText();
                boolean validateTextOfCategoryInformation = information.contains(category) && information.contains(count);

                category_information.click();
                List<WebElement> getInformationCategoryElements = driver.findElements(By.xpath("//div[@class='_37o44A1ADlDnmq-cWSzlSy']/div"));
                int countOfInformationCategoryReccommendation = getInformationCategoryElements.size();

                Assert.assertTrue(validateTextOfCategoryInformation);
                Assert.assertEquals(Integer.parseInt(count), countOfInformationCategoryReccommendation);
                break;
        }
    }
     public void clickOnBookFD() {
         book_fd_lable.click();
     }

     public void verifyBookFDPage(String attribute1, String attribute2, String attribute3, String attribute4, String attribute5, String attribute6) {
         String getCustIdSize = cust_id_attribute.getCssValue("display");
         System.out.println("getCustIdAttribute "+getCustIdSize);
         String getProductNameAttribute = product_name_attribute.getText();
         System.out.println(getProductNameAttribute);
         String getBuAttribute = bu_attribute.getText();
         String getSourceRefIdAttribute = source_ref_id_attribute.getText();
         System.out.println(getSourceRefIdAttribute);
         String getBranchCodeAttribure = branch_code_attribute.getText();
         System.out.println(getBranchCodeAttribure);
         String getRemarksAttribute = remarks_attribute.getText();

//         Assert.assertEquals(attribute1, getCustIdAttribute);
         Assert.assertEquals(attribute2, getProductNameAttribute);
         Assert.assertEquals(attribute3, getBuAttribute);
         Assert.assertEquals(attribute4, getSourceRefIdAttribute);
         Assert.assertEquals(attribute5, getBranchCodeAttribure);
         Assert.assertEquals(attribute6, getRemarksAttribute);
    }

    public void verifyValueOfAttribute(String value1, String value2, String value3, String value4, String value5) {
        String getCustIdValue = cust_id_value.getText();
        String getProductNameValue = product_name_value.getText();
        String getBuValue = bu_value.getText();
        String getSourceRefIdValue = source_ref_id_value.getAttribute("value");
        String getBranchCodeValue = branch_code_value.getText();

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
}
