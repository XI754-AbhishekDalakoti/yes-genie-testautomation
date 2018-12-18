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
        System.out.println(getIndividualIconTooltipText);
        String getCustName = CustomerName.getText().trim();
        System.out.println(getCustName);
        String getDobDoi = DobDoi.getText().trim();
        System.out.println(getDobDoi);
        String getDobDoiTooltipTxt = DobDoiTooltipText.getAttribute("title");
        System.out.println(getDobDoiTooltipTxt);
        String getContactibilityTooltipText = Contactibility.getAttribute("title");
        System.out.println(getContactibilityTooltipText);
        String HomeBranchTooltipText = HomeBranchname.getAttribute("title");
        System.out.println(HomeBranchTooltipText);
        HomeBranchTooltipText.contains("Home Branch");
        String getConnectionsTooltipText = Connections.getAttribute("title");
        System.out.println(getConnectionsTooltipText);
        String getMDMID = MDMID.getText();
        System.out.println(getMDMID);
        String getProfessionText = Profession.getText();
        System.out.println(getProfessionText);
        String getCKYCText = CKYC.getText();
        System.out.println(getCKYCText);
        String getVintageText = Vintage.getText();
        System.out.println(getVintageText);
        String getBsPsText = BSPS.getText();
        System.out.println(getBsPsText);
        String getCustomerSegmentText = CustomerSegment.getText();
        System.out.println(getCustomerSegmentText);
        String getCustomerTypeText = CustomerType.getText();
        System.out.println(getCustomerTypeText);
        String getAadharTooltipText = Aadhar.getAttribute("title");
        System.out.println(getAadharTooltipText);
        String getPanText = Pan.getAttribute("title");
        System.out.println(getPanText);
        String getPassportText = Passport.getAttribute("title");
        System.out.println(getPassportText);
        String getMobileNoTooltipText = MobileNo.getAttribute("title");
        System.out.println(getMobileNoTooltipText);
        String getEmailTooltipText = Email.getAttribute("title");
        System.out.println(getEmailTooltipText);
        String getAddressTooltipText = Address.getAttribute("title");
        System.out.println(getAddressTooltipText);

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
        System.out.println(getIndividualIconTooltipText);
        String getCustName = CustomerName.getText().trim();
        System.out.println(getCustName);
        String getDobDoi = DobDoi.getText();
        getDobDoi = getDobDoi.replaceAll("©", "").trim();
        System.out.println(getDobDoi);
        String getDobDoiTooltipTxt = DobDoiTooltipText.getAttribute("title");
        System.out.println(getDobDoiTooltipTxt);
        String getConstitutionTooltipText = Constitution.getAttribute("title");
        System.out.println(getConstitutionTooltipText);
        String getWebsiteTooltipText = Website.getAttribute("title");
        getWebsiteTooltipText = getWebsiteTooltipText.replaceAll(": -", "");
        System.out.println(getWebsiteTooltipText);
        String getCorporateConnectionsTooltipText = CorporateConnections.getAttribute("title");
        System.out.println(getCorporateConnectionsTooltipText);
        String getMDMID = MDMID.getText();
        System.out.println(getMDMID);
        String getBusinessText = Business.getText();
        System.out.println(getBusinessText);
        String getIndustryText = Industry.getText();
        System.out.println(getIndustryText);
        String getCorporateVintageText = CorporateVintage.getText();
        System.out.println(getCorporateVintageText);
        String getBsPsText = BSPS.getText();
        System.out.println(getBsPsText);
        String getAnnualTurnoverText = AnnualTurnover.getText();
        System.out.println(getAnnualTurnoverText);
        String getCustomerTypeText = CustomerType.getText();
        System.out.println(getCustomerTypeText);
        String getPanTooltipText = CorporatePan.getAttribute("title");
        System.out.println(getPanTooltipText);
        String getCorporateMobileNoTooltipText = CorporateMobileNo.getAttribute("title");
        System.out.println(getCorporateMobileNoTooltipText);
        String getAlternateMobileNo = AlternateMobileNo.getAttribute("title");
        System.out.println(getAlternateMobileNo);
        String getCorporateEmailTooltipText = CorporateEmail.getAttribute("title");
        System.out.println(getCorporateEmailTooltipText);
        String getCorporateAddressTooltipText = CorporateAddress.getAttribute("title");
        System.out.println(getCorporateAddressTooltipText);

        Assert.assertEquals("Corporate", getIndividualIconTooltipText);
        Assert.assertEquals("SURINDRA RADIOS PRIVATE LIMITED",getCustName);
        Assert.assertEquals("09-Apr-1986", getDobDoi);
        Assert.assertEquals("DOI",getDobDoiTooltipTxt);
        Assert.assertEquals("Constitution", getConstitutionTooltipText);
        Assert.assertEquals("Website", getWebsiteTooltipText);
        Assert.assertEquals("Connections", getCorporateConnectionsTooltipText);
        Assert.assertEquals("MDM ID", getMDMID);
        Assert.assertEquals("Business", getBusinessText);
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
