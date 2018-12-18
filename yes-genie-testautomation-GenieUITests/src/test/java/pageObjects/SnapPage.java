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

        String getIndividualIconTooltipText = IndividualIcon.getAttribute("title");
        String getCustName = CustomerName.getText().trim();
        String getDobDoi = DobDoi.getText().trim();
        String getDobDoiTooltipTxt = DobDoiTooltipText.getAttribute("title");
        String getContactibilityTooltipText = Contactibility.getAttribute("title");
        String HomeBranchTooltipText = HomeBranchname.getAttribute("title");
        HomeBranchTooltipText.contains("Home Branch");
        String getConnectionsTooltipText = Connections.getAttribute("title");
        String getMDMID = MDMID.getText();
        String getProfessionText = Profession.getText();
        String getCKYCText = CKYC.getText();
        String getVintageText = Vintage.getText();
        String getBsPsText = BSPS.getText();
        String getCustomerSegmentText = CustomerSegment.getText();
        String getCustomerTypeText = CustomerType.getText();
        String getAadharTooltipText = Aadhar.getAttribute("title");
        String getPanText = Pan.getAttribute("title");
        String getPassportText = Passport.getAttribute("title");
        String getMobileNoTooltipText = MobileNo.getAttribute("title");
        String getEmailTooltipText = Email.getAttribute("title");
        String getAddressTooltipText = Address.getAttribute("title");

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

        String getIndividualIconTooltipText = IndividualIcon.getAttribute("title");
        String getCustName = CustomerName.getText().trim();
        String getDobDoi = DobDoi.getText();
        getDobDoi = getDobDoi.replaceAll("©", "").trim();
        String getDobDoiTooltipTxt = DobDoiTooltipText.getAttribute("title");
        String getConstitutionTooltipText = Constitution.getAttribute("title");
        String getWebsiteTooltipText = Website.getAttribute("title");
        getWebsiteTooltipText = getWebsiteTooltipText.replaceAll(": -", "");
        String getCorporateConnectionsTooltipText = CorporateConnections.getAttribute("title");
        String getMDMID = MDMID.getText();
        String getBusinessText = Business.getText();
        String getIndustryText = Industry.getText();
        String getCorporateVintageText = CorporateVintage.getText();
        String getBsPsText = BSPS.getText();
        String getAnnualTurnoverText = AnnualTurnover.getText();
        String getCustomerTypeText = CustomerType.getText();
        String getPanTooltipText = CorporatePan.getAttribute("title");
        String getCorporateMobileNoTooltipText = CorporateMobileNo.getAttribute("title");
        String getAlternateMobileNo = AlternateMobileNo.getAttribute("title");
        String getCorporateEmailTooltipText = CorporateEmail.getAttribute("title");
        String getCorporateAddressTooltipText = CorporateAddress.getAttribute("title");

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
