package info.seleniumcucumber.userStepDefintions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import env.DriverUtil;
import info.seleniumcucumber.methods.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.*;

import java.util.concurrent.TimeUnit;

import static locators.LoginLocators.dropdown;
import static locators.LoginLocators.logout_button;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;


public class UserStepDefinitions implements BaseTest {

    public static LoginPage lp = new LoginPage();
    public static SearchPage sp = new SearchPage();
    public static SnapPage snap = new SnapPage();
    public static PortfolioPage portfolio = new PortfolioPage();
    public static DemographicsSnapPage demogs = new DemographicsSnapPage();
    public static CaseNLeadPage caseNlead = new CaseNLeadPage();
    protected WebDriver driver = DriverUtil.getDefaultDriver();


    @Given("^I navigate to url \"([^\"]*)\"$")
    public void navigate_to(String link) {
        if (System.getProperty("env").equals("UAT")) {
            link="https://cust360.uat-genie.yesbank.com/";
        }
        navigationObj.navigateTo(link);
    }

    @Then("^I should get logged-in with welcome message$")
    public void should_logged_in_with_welcome_message() throws Throwable {

        By selection = By.xpath("//span[@class='_1ItRkkJp4JtCGSqCU2C5QD']");
        (new WebDriverWait(driver, 10)).until(
                visibilityOfElementLocated(selection));
        String msg = driver.findElement(By.xpath("//span[@class='_1ItRkkJp4JtCGSqCU2C5QD']")).getText();
        if (!msg.isEmpty())
            msg = msg.split("\n")[0].trim();
        Assert.assertEquals("Manisha Chauhan", msg);
    }

    @Then("^I should get error message$")
    public void iShouldGetErrorMessage() throws Throwable {

        By selection = By.className("kc-feedback-text");
        (new WebDriverWait(driver, 30)).until(
                visibilityOfElementLocated(selection));
        String msg = driver.findElement(By.xpath("//span[@class='kc-text']")).getText().trim();
        if (!msg.isEmpty())
            msg = msg.split("\n")[0].trim();
        Assert.assertEquals("Login Failed. Unknown User ID or Bad Password.", msg);
    }

    @Then("^The button should be disabled$")
    public void theButtonShouldBeDisabled() throws Throwable {
        lp.checkButtonIsDisbale();
    }

    @When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEntersCredentials(String Username, String Password) throws Throwable {
        lp.enterCredentials(Username, Password);
    }


    @And("^I click on Login$")
    public void iClickOnLogin() throws Throwable {
        lp.clickOnLogin();
    }

    @And("^Under search bar, it contains static search parameters$")
    public void underSearchBarContainsStaticSearchParameters() throws Throwable {
        lp.staticSearchParameters();

    }

    @When("^I'm on login page$")
    public void verifyImOnLoginPage() {
        lp.verifyLoginPage();
    }

    @Then("^I should get logout$")
    public void iShouldGetLogout() throws Throwable {
        lp.logOut();
    }

    @Then("^Search result is displayed with all fields in search UI screen$")
    public void searchResultIsDisplayedWithAllFields() throws Throwable {
        sp.searchParameters();
    }

    @Then("^'No Customer Found.' message is displayed$")
    public void noSearchResultDisplay() throws Throwable {
        sp.noSearchResultDisplay();
    }

    @Then("^I quit browser$")
    public void iQuitBrowser() throws Throwable {
        driver.quit();
    }

    @Then("^'Too many matching customers found. Please refine your search criterion.' message is displayed due to threshold exceeded$")
    public void messageShouldComeForSearchRefinementDueToThresholdExceeded() throws Throwable {
        sp.refineMessage();
    }

    @And("^Accordingly respective \"([^\"]*)\" gets highlighted in static search parameter under search bar$")
    public void accordinglyRespectiveParameterGetsHighlighted(String Result) throws Throwable {
        sp.bubbleSearch(Result);
    }

    @Then("^I enter \"([^\"]*)\" into search field having (.+) \"([^\"]*)\"$")
    public void enterTextInSearchField(String text, String type, String accessName) throws Exception {
        miscmethodObj.validateLocator(type);
        inputObj.enterText(type, text, accessName);
    }

    @Then("^I click on search button having (.+) \"(.*?)\"$")
    public void clickOnSearchButton(String type, String accessName) throws Exception {
        miscmethodObj.validateLocator(type);
        clickObj.click(type, accessName);
    }

    @And("^I validate Last Login date and time format displayed on bottom right of the page$")
    public void iValidateLastLoginDateAndTimeFormat() throws Throwable {
        lp.lastLoginDateTimeFormat();
    }

    @Then("^I validate basic information is displayed on top right$")
    public void iValidateBasicInformationIsDisplayedOnTopRight() throws Throwable {
        lp.displayBasicInformation();
    }

    @And("^I click on dropdown on top right of page$")
    public void iClickOnDropdownOnTopRightOfPage() throws Throwable {
        lp.clickDropDownOnTopRight();
    }

    @And("^I verify search label display like 'Search result for \"([^\"]*)\": \"([^\"]*)\" \"([^\"]*)\": \"([^\"]*)\" Results'$")
    public void iVerifyLabelDisplaysLikeSearchResultForResults(String Result1, String Result2, String Result3, String Result4) throws Throwable {
        sp.formatOfSearchLabel(Result1, Result2, Result3, Result4);
    }

    @When("^I click on authorized to view record$")
    public void iClickOnAuthorizedToViewRecord() throws Throwable {
        driver.findElement(By.id("record")).click();
    }

    @Then("^I verify all the attributes of demographics having customer type individual$")
    public void snapPageofIndividual(DataTable data) throws Throwable {
        demogs.demographicsAttributesOfIndividual(data);
    }

    @Then("^I lands to SNAP page directly$")
    public void snapPageIsOpenedDirectly() throws Throwable {
        sp.landsIntoSnapPage();
    }

    @Then("^I verify all the attributes of demographics having customer type corporate$")
    public void iVerifyAllTheAttributesOfDemographicsHavingCustomerTypeCorporate(DataTable data) throws Throwable {
        demogs.demographicsAttributesOfCorporate(data);
    }

    @Then("^I verify all the \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\" , \"([^\"]*)\", \"([^\"]*)\" is available in NBA section$")
    public void iVerifyAllTheWithDataAndIsAvailableInNBACategories(String category, String count, String recommendation, String recommendationEndDate, String actionLableIcon) throws Throwable {
        snap.verfiyDifferentCategoriesOnSnapPage(category, count, recommendation, recommendationEndDate, actionLableIcon);
    }

    @Then("^I click on any recommendation's lable in ALL category section to Create Lead$")
    public void iClickOnAnyRecommendationSLabelInALLCategorySectionToCreateLead()throws Throwable {
        caseNlead.clickOnLableToCreateLead();
    }

    @Then("^Book FD page should get open with attributes \"([^\"]*)\" \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void bookFDPageShouldGetOpenWithAttributes(String attribute1, String attribute2, String attribute3, String attribute4, String attribute5, String attribute6) throws Throwable {
        snap.verifyBookFDPage(attribute1, attribute2, attribute3, attribute4, attribute5, attribute6);
    }

    @And("^Data is prefilled with values \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" respectively$")
    public void dataIsPrefilledWithValuesRespectively(String custId, String lob, String branchName, String productName) throws Throwable {
        caseNlead.verifyValueOfAttribute(custId, lob, branchName, productName);
    }

    @Then("^I click on submit button$")
    public void iClickOnSubmitButton() throws Throwable {
        caseNlead.clickOnSubmitButtonOfCreateLeadWithRecommendation();
    }

    @And("^I click on remarks tab and write \"([^\"]*)\" remarks into remarks field$")
    public void iClickOnRemarksTabAndWriteRemarksIntoRemarksField(String remarks) throws Throwable {
        caseNlead.writeRemarksOnRemarkstab(remarks);
    }

    @And("^gets message \"([^\"]*)\"$")
    public void getsMessage(String message) throws Throwable {
        caseNlead.verifyTransactionCompleted(message);
    }

    @Then("^I click on cross button in 'Regulatory' recommendation$")
    public void iClickOnCrossButtonInRegulatoryRecommendation() throws Throwable {
        caseNlead.clickOnCrossButton();
    }

    @And("^I click on 'Defer' option to defer the recommendation$")
    public void iClickOnDeferOptionToDeferTheRecommendation() throws Throwable {
        caseNlead.clickOnDefer();
    }

    @And("^I select future date and click on submit button in calender$")
    public void iClickOnSubmitButtonInCalender() throws Throwable {
        snap.clickOnSubmitOfCalender();
    }

    @Then("^I get message \"([^\"]*)\"$")
    public void iGetsMessage(String message) throws Throwable {
        caseNlead.verifyMessage(message);
    }

    @And("^I click on 'Dimiss' option to dismiss the recommendation$")
    public void iClickOnDimissOptionToDeferTheRecommendation() throws Throwable {
        snap.clickOnDismiss();
    }

    @Then("^I select dimiss reason from dialogue box and i click on submit$")
    public void iSelectDimissReasonFromDialogueBoxAndIClickOnSubmit() throws Throwable {
        snap.selectDismissReason();
    }

    @Then("^I click on 'Customer Relation' icon$")
    public void iClickOnCustomerRelationshipIcon() throws Throwable {
        demogs.ClicksOnRelationshipIcon();
    }

    @Then("^I click on 'X-Sell' section in NBA$")
    public void iClickOnXSellSectionInNBA() throws Throwable {
        snap.clickOnSellCategory();
    }

    @And("^I click on cross button in 'X-Sell' recommendation$")
    public void iClickOnCrossButtonInXSellRecommendation() throws Throwable {
        snap.clickCrossButtonOfSellCategory();
    }

    @And("^Customer relation graph gets open where i can see 'Customer Relations Categories' like \"([^\"]*)\"$")
    public void customerRelationshipPageGetsOpenWhereICanSeeCustomerRelationshipCategoriesLike(String category) throws Throwable {
        snap.verifyRelationCategory(category);
    }

    @Then("^I click on 'minimize icon' to close relation graph$")
    public void iClickOnMinimizeButtonToCloseRelationGraph() throws Throwable {
        snap.clickOnMinimizeIconOfRelationGraph();
    }

    @Then("^I click on 'Transactions' icon on top right$")
    public void iClickOnTransactionsIconOnTopRight() throws Throwable {
        caseNlead.clickOnTransactionsButton();
    }

    @Then("^I click on 'Create Lead'$")
    public void iClickOnCreateLead() throws Throwable {
        caseNlead.clickOnCreateLead();
    }

    @And("^Form gets open with attributes \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" , \"([^\"]*)\" and \"([^\"]*)\"$")
    public void formGetsOpenWithAttributesAnd(String attribute1, String attribute2, String attribute3, String attribute4, String attribute5, String attribute6) throws Throwable {
        snap.verifyAttributesOfCreateLeadWithoutReccomendation(attribute1, attribute2, attribute3, attribute4, attribute5, attribute6);
    }

    @Then("^I click on 'Authorised Signatory' icon in demographics$")
    public void iClickOnAuthorisedSignatoryIconInDemographics() throws Throwable {
        demogs.iClickOnAuthorisedSignatoryIcon();
    }

    @Then("^Authorised Signatory page gets open with title \"([^\"]*)\"$")
    public void authorisedSignatoryPageGetsOpenWithTitle(String title) throws Throwable {
        demogs.verifyAuthorisedSignatoryPage(title);
    }

    @Then("^I verify 'Portfolio' section is displayed to user with KPI attributes \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iVerifyPortfolioSectionIsDisplayedToUserWithKPIAttributesAnd(String attr1, String attr2, String attr3) throws Throwable {
        snap.verifyKpiAttributes(attr1, attr2, attr3);
    }

    @And("^Respective values like \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\" is displayed on portfolio UI$")
    public void respectiveValuesLikeAndIsDisplayedOnPortfolioUI(String val1, String val2, String val3) throws Throwable {
        snap.verifyValuesOfKpiAttributes(val1, val2, val3);
    }

    @Then("^I click on MDM ID on demographics$")
    public void iClickOnMDMIDOnDemographics() throws Throwable {
        demogs.clickOnMmdIdOnDemogs();
    }

    @And("^I verify all DemogsValue with DetailedValue$")
    public void iVerifyAllDemogsValueWithDetailedValue(DataTable data) throws Throwable {
        snap.verifyDetailedAttributes(data);
    }

    @And("^I verify all attributes and there values for detailed MDM ID with indexType 'M'$")
    public void iVerifyAllAttributesAndThereValuesForDetailedMDMIDWithIndexTypeM(DataTable individualDetailedMdmid) throws Throwable {
        demogs.verifyDetailedAttributesAndValueOfMdmIDTypeM(individualDetailedMdmid);
    }

    @And("^I verify all attributes and there values for detailed MDM ID with indexType 'C'$")
    public void iVerifyAllAttributesAndThereValuesForDetailedMDMIDWithIndexTypeC(DataTable individualDetailedCustId) throws Throwable {
        demogs.verifyDetailedAttributesAndValueOfMdmIDTypeC(individualDetailedCustId);
    }

    @And("^I verify all attributes and there values for detailed MDM ID for corporate customer with Type M$")
    public void iVerifyAllAttributesAndThereValuesForDetailedMDMIDForCorporateCustomerWithTypeM(DataTable data) throws Throwable {
        demogs.verifyDetailedAttributesAndValueOfCorporateCustomerWithMdmIDTypeM(data);
    }

    @And("^I verify all attributes and there values of corporate customer for indexType C$")
    public void iVerifyAllAttributesAndThereValuesOfCorporateCustomerForIndexTypeC(DataTable data) throws Throwable {
        demogs.verifyDetailedAttributesAndValueOfCorporateCustomerWithMdmIDTypeC(data);
    }

    @Then("^Customer relation graph gets open where i can see 'Customer Relations' under categories$")
    public void customerRelationGraphGetsOpenWhereICanSeeCustomerRelationsUnderCategories(DataTable relationTable) throws Throwable {
        demogs.customerRelationGraphWithCategories(relationTable);
    }

    @And("^I verify all the attributes is displayed with authorised signatory data$")
    public void iVerifyAllTheAttributesIsDisplayedWithAuthorisedSignatoryData(DataTable data) throws Throwable {
        demogs.verifyAuthrisedSignatoryAttributesAndData(data);
    }

    @Then("^I verify deposit options of portfolio section$")
    public void depositOptionsOfPortfolio() throws Throwable {
        portfolio.verifyDepositOptions();
    }

    @Then("^I verify investment options of portfolio section$")
    public void investmentOptionsOfPortfolio() throws Throwable {
        portfolio.verifyInvestmentOptions();
    }

    @Then("^I verify loan options of portfolio section$")
    public void loanOptionsOfPortfolio() throws Throwable {
        portfolio.verifyLoanOptions();
    }

    @Then("^I verify cards and wallets options of portfolio section$")
    public void cardsOptionsOfPortfolio() throws Throwable {
        portfolio.verifyCardsOptions();
    }

    @Then("^I verify other options of portfolio section$")
    public void otherOptionsOfPortfolio() throws Throwable {
        portfolio.verifyOthersOptions();
    }

    @Then("^I verify KPI data of portfolio section for individual$")
    public void kpiDataOfPortfolioIndividual() throws Throwable {
        portfolio.verifyKPILabels();
        portfolio.verifyKPIAmountsForIndividual();
    }

    @Then("^I verify KPI data of portfolio section for corporate$")
    public void kpiDataOfPortfolioCorporate() throws Throwable {
        portfolio.verifyKPILabels();
        portfolio.verifyKPIAmountsForCorporate();
    }

    @After
    public void afterScenario() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dropdown.click();
        logout_button.click();
    }

/*    @Then("^I select Cust ID \"([^\"]*)\", LOB \"([^\"]*)\", Branch Name \"([^\"]*)\", Product Name \"([^\"]*)\" and provide remarks \"([^\"]*)\"$")
    public void iSelectCustIDLOBBranchNameProductNameAndProvideRemarks(String custid, String lob, String branchName, String productName, String rmrks) throws Throwable {
        caseNlead.selectFieldsInCreateLeadForm(custid, lob, branchName, productName, rmrks);
    }*/

    @Then("^Create Lead form gets open with title \"([^\"]*)\"$")
    public void createLeadFormGetsOpenWithTitleWithHeadingsCustIDLOBBranchNameProductNameAndRemarks(String title) throws Throwable {
        caseNlead.verifyCreateLeadForm(title);
    }

    @And("^I fill all the fields of create lead form with remarks \"([^\"]*)\" and click on submit$")
    public void iFillAllTheFieldsOfCreateLeadFormWithRemarksAndClickOnSubmit(String rmks) throws Throwable {
        caseNlead.fillAllFieldsOfCreateLeadForm(rmks);
    }

    @And("^I verify \"([^\"]*)\" message is displayed$")
    public void iVerifyMessageIsDisplayed(String msg) throws Throwable {
        caseNlead.verifySuccessfullySubmittedMessage(msg);
    }

    @Then("^Create Lead form gets open with lable name as title$")
    public void createLeadFormGetsOpenWithLableNameAsTitle() throws Throwable {
        caseNlead.createLeadWithRecommendationTitle();
    }

    @Then("^I click on any recommendation's lable in ALL category section to Create Service Request$")
    public void iClickOnAnyRecommendationSLableInALLCategorySectionToCreateServiceRequest() throws Throwable {
        caseNlead.clickOnLableToCreateServiceRequest();
    }
}
