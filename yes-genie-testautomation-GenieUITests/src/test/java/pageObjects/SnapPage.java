package pageObjects;

import locators.SnapLocators;
import org.junit.Assert;

public class SnapPage extends SnapLocators {

    public SnapPage(){
        super();
    }

    public void demographicsAttributesOfIndividual() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("http://yesgenie.com:30978/snap", currentUrl);

        String getIndividualIconTooltipText = individual_icon.getAttribute("title");
        String getCustName = customername.getText().trim();
        String getDobDoi = dob_doi.getText().trim();
        String getDobDoiTooltipTxt = dobdoi_tooltipText.getAttribute("title");
        String getContactibilityTooltipText = contactibility.getAttribute("title");
        String HomeBranchTooltipText = homebranchname.getAttribute("title");
        HomeBranchTooltipText.contains("Home Branch");
        String getConnectionsTooltipText = connections.getAttribute("title");
        String getMDMID = mdmid.getText();
        String getProfessionText = profession.getText();
        String getCKYCText = ckyc.getText();
        String getVintageText = vintage.getText();
        String getBsPsText = bsps.getText();
        String getCustomerSegmentText = customer_segment.getText();
        String getCustomerTypeText = customer_type.getText();
        String getAadharTooltipText = aadhar.getAttribute("title");
        String getPanText = pan.getAttribute("title");
        String getPassportText = passport.getAttribute("title");
        String getMobileNoTooltipText = mobile_no.getAttribute("title");
        String getEmailTooltipText = email.getAttribute("title");
        String getAddressTooltipText = address.getAttribute("title");

        Assert.assertEquals("Individual", getIndividualIconTooltipText);
        Assert.assertEquals("CHARU SADANA",getCustName);
        Assert.assertEquals("15-Mar-1994", getDobDoi);
        Assert.assertEquals("Birthday",getDobDoiTooltipTxt);
        Assert.assertEquals("Contactibility", getContactibilityTooltipText);
        Assert.assertEquals("Connections", getConnectionsTooltipText);
        Assert.assertEquals("MDM ID", getMDMID);
        Assert.assertEquals("Profession", getProfessionText);
        Assert.assertEquals("CKYC No.", getCKYCText);
        Assert.assertEquals("Vintage", getVintageText);
        Assert.assertEquals("BS/PS", getBsPsText);
        Assert.assertEquals("Customer Segment", getCustomerSegmentText);
        Assert.assertEquals("Customer Type", getCustomerTypeText);
        Assert.assertEquals("Adhaar", getAadharTooltipText);
        Assert.assertEquals("Pan", getPanText);
        Assert.assertEquals("Passport", getPassportText);
        Assert.assertEquals("Mobile", getMobileNoTooltipText);
        Assert.assertEquals("Email", getEmailTooltipText);
        Assert.assertEquals("Address", getAddressTooltipText);
    }

    public void demographicsAttributesOfCorporate() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("http://yesgenie.com:30978/snap", currentUrl);

        String getIndividualIconTooltipText = individual_icon.getAttribute("title");
        String getCustName = customername.getText().trim();
        String getDobDoi = dob_doi.getText();
        getDobDoi = getDobDoi.replaceAll("©", "").trim();
        String getDobDoiTooltipTxt = dobdoi_tooltipText.getAttribute("title");
        String getConstitutionTooltipText = constitution.getAttribute("title");
        String getWebsiteTooltipText = website.getAttribute("title");
        getWebsiteTooltipText = getWebsiteTooltipText.replaceAll(": -", "");
        String getCorporateConnectionsTooltipText = corporate_connections.getAttribute("title");
        String getMDMID = mdmid.getText();
        String getBusinessText = business.getText();
        String getIndustryText = industry.getText();
        String getCorporateVintageText = corporate_vintage.getText();
        String getBsPsText = bsps.getText();
        String getAnnualTurnoverText = annual_turnover.getText();
        String getCustomerTypeText = customer_type.getText();
        String getPanTooltipText = corporate_pan.getAttribute("title");
        String getCorporateMobileNoTooltipText = corporate_mobileNo.getAttribute("title");
        String getAlternateMobileNo = alternate_mobileNo.getAttribute("title");
        String getCorporateEmailTooltipText = corporate_email.getAttribute("title");
        String getCorporateAddressTooltipText = corporate_address.getAttribute("title");

        Assert.assertEquals("Corporate", getIndividualIconTooltipText);
        Assert.assertEquals("SURINDRA RADIOS PRIVATE LIMITED",getCustName);
        Assert.assertEquals("09-Apr-1986", getDobDoi);
        Assert.assertEquals("DOI",getDobDoiTooltipTxt);
        Assert.assertEquals("Constitution", getConstitutionTooltipText);
        Assert.assertEquals("Website", getWebsiteTooltipText);
        Assert.assertEquals("Connections", getCorporateConnectionsTooltipText);
        Assert.assertEquals("MDM ID", getMDMID);
        Assert.assertEquals("Business", getBusinessText);
        Assert.assertEquals("Industry", getIndustryText);
        Assert.assertEquals("Vintage", getCorporateVintageText);
        Assert.assertEquals("BS/PS", getBsPsText);
        Assert.assertEquals("Annual Turnover", getAnnualTurnoverText);
        Assert.assertEquals("Customer Type", getCustomerTypeText);
        Assert.assertEquals("Pan", getPanTooltipText);
        Assert.assertEquals("Mobile", getCorporateMobileNoTooltipText);
        Assert.assertEquals("Alternate Mobile", getAlternateMobileNo);
        Assert.assertEquals("Email", getCorporateEmailTooltipText);
        Assert.assertEquals("Address", getCorporateAddressTooltipText);
    }
}
