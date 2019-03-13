package pageObjects;

import locators.CaseNLeadLocators;
import org.junit.Assert;

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
        remarks.sendKeys("rmks");
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
        create_sr_lable.click();
    }

    public void clickOnCrossButton() {
        cross_button_nba.click();
    }

    public void clickOnDefer() {
        defer_button.click();
    }

    public void verifyMessage(String message) {
        String getSuccessMessage = deferred_dismiss_message.getText();
        Assert.assertEquals(message, getSuccessMessage);
        close_button.click();
    }
}
