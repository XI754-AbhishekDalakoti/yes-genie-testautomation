package pageObjects;

import locators.CaseNLeadLocators;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CaseNLeadPage extends CaseNLeadLocators {

    public CaseNLeadPage() {
        super();
    }

    public void clickOnTransactionsButton() {
        transaction_button.click();
    }

    public void clickOnCreateLead() {
        create_lead.click();
    }

    public void verifyCreateLeadForm(String title) {
        String getCreateLeadTitile = create_lead_form_title.getText();
        Assert.assertEquals(title, getCreateLeadTitile);
    }

    public void fillAllFieldsOfCreateLeadForm(String rmks) {
        select_custid.click();
        select_custid_from_dropdown.click();
        select_lob.click();
        select_lob_from_dropwdown.click();
        select_branchname.click();
        select_branchname_from_dropdown.click();
        select_productname.click();
        select_productname_from_dropdown.click();
        remarks.click();
        remarks.sendKeys(rmks);
        submit_button.click();
    }

    public void clickOnSubmitButton() {
        submit_button.click();
    }

    public void fillAllFieldsOfCreateServiceRequestForm(String rmks) {
        click_custid_dropdown.click();
        select_custid_in_case.click();
        click_productname_dropdown.click();
        select_productname_for_case.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        click_casetype_dropdown.click();
        select_casetype_for_case.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        click_issuetype_dropdown.click();
        select_issuetype_for_case.click();
        remarks.click();
        remarks.sendKeys(rmks);
        submit_button.click();
    }

    public void verifySuccessfullySubmittedMessage(String msg) {
        Assert.assertEquals(msg,message_after_successfull_submission.getText());
    }

    public void createLeadWithRecommendationTitle() {
        Assert.assertEquals("Issue",create_lead_lable.getText());
    }

    public void clickOnLableToCreateLead() {
        create_lead_lable.click();
    }

    public void verifyValueOfAttribute(String custId, String lob, String branchName, String productName) {
        Assert.assertEquals(custId, cust_id_value.getText());
        Assert.assertEquals(lob, lob_value.getText());
        Assert.assertEquals(branchName, branch_name_value.getText());
        Assert.assertEquals(productName, product_name_value.getText());
    }

    public void writeRemarksOnRemarkstab(String remark) {
        remarks_tab.clear();
        remarks_tab.sendKeys(remark);
    }

    public void clickOnSubmitButtonOfCreateLeadWithRecommendation() {
        submit_button_createlead.click();
    }

    public void verifyTransactionCompleted(String message) {
        Assert.assertEquals(message, transaction_completed_successfully.getText());
    }

    public void clickOnLableToCreateServiceRequest() {
        category_regulatory.click();
        create_sr_lable.click();
    }

    public void clickOnCrossButton() {
        cross_button_nba.click();
    }

    public void clickOnDefer() {
        defer_button.click();
    }

    public void verifyMessage(String message) {
        Assert.assertTrue(deferred_dismiss_message.getText().contains(message));
        close_button.click();
    }

    public void clickCrossButtonInAllCategory() {
        cross_button_all_category.click();
    }

    public void clickOnDismiss() {
        dismiss_button.click();
    }

    public void selectDismissReason() {
        dismiss_submit_button.click();
    }

    public void clickOnCreateServiceRequest() { create_service_request.click(); }

    public void verifyTitleOfCaseCaseForm(String title) {
        Assert.assertEquals(title, create_case_title.getText());
    }

    public void verifyCreateCaseFormTitle() {
        Assert.assertTrue(create_sr_lable.isDisplayed());
    }

    public void verifyDataIsPrefilledInCreateCaseWithRecommendation() {
        Assert.assertTrue(custId.isDisplayed());
        Assert.assertTrue(product_name.isDisplayed());
        Assert.assertTrue(case_type.isDisplayed());
        Assert.assertTrue(issue_type_name.isDisplayed());
        Assert.assertEquals("Complaint", case_category.getAttribute("value"));
    }
}
