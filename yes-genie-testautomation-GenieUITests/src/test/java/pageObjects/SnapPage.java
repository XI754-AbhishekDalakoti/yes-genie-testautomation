package pageObjects;

import cucumber.api.DataTable;
import locators.SnapLocators;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class SnapPage extends SnapLocators {

    public SnapPage() {
        super();
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


                List<WebElement> getInformationCategoryElements = driver.findElements(By.xpath("//div[@class='B1b-Lu2n9m4TNaSSepk_p']"));
                int countOfInformationCategoryReccommendation = getInformationCategoryElements.size();

                Assert.assertTrue(validateTextOfCategoryInformation);
                Assert.assertEquals(Integer.parseInt(count), countOfInformationCategoryReccommendation);
                break;
        }
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

    public void clickCrossButtonOfSellCategory() {
        cross_button_sell_category.click();
    }

    public void clickOnSellCategory() {
        category_sell.click();
    }

    public void clickOnSubmitOfCalender() {
        calender_submit.click();
        calender_submit.click();
    }

    public void clickOnDismiss() {
        dismiss_button.click();
    }

    public void selectDismissReason() {
        select_dimiss_reason.click();
        dismiss_submit_button.click();
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

    public void verifyAttributesOfCreateLeadWithoutReccomendation(String attribute1, String attribute2, String attribute3, String attribute4, String attribute5, String attribute6) {
        String getCustIDAttribute = create_lead_custid_attribute.getText();

        Assert.assertEquals(attribute1, getCustIDAttribute);
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

    public void verifyDetailedAttributes(DataTable data) {

        List<List<String>> table = data.raw();

        String getMDMIDValue = mdmid_value.getText();
        String getCustName = customername.getText().trim();
        String getDobDoi = dob_doi.getText().trim();
        String getProfessionValue = profession_value.getText();
        String getEmailValue = email_value.getText();
        String getMobileNoValue = mobileNo_value.getText();

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
    }
}
