package info.seleniumcucumber.userStepDefintions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import env.Constant;
import env.DriverUtil;
import info.seleniumcucumber.methods.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.*;

import java.util.concurrent.TimeUnit;

import static locators.LoginLocators.dropdown;
import static locators.LoginLocators.logout_button;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;


public class UserStepDefinitions implements BaseTest {

    public static LoginPage lp = new LoginPage();
    public static SearchPage sp = new SearchPage();
    public static PortfolioPage portfolio = new PortfolioPage();
    public static DemographicsSnapPage demogs = new DemographicsSnapPage();
    public static CaseNLeadPage caseNlead = new CaseNLeadPage();
    public static ProductDetailsPage productdetail =new ProductDetailsPage();
    public static NextBestActionPage nba = new NextBestActionPage();
    protected WebDriver driver = DriverUtil.getDefaultDriver();

    @Given("^I navigate to url \"([^\"]*)\"$")
    public void navigate_to(String link) {
        if (System.getProperty("env").equals("UAT")) {
            link="https://cust360.uat-genie.yesbank.com/";
        }
        navigationObj.navigateTo(link);
        System.out.println("Title of page     "+driver.getTitle());
        Assert.assertEquals("Log in to YBL", driver.getTitle());
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

    @Then("^I click on any recommendation's lable in ALL category section to Create Lead$")
    public void iClickOnAnyRecommendationSLabelInALLCategorySectionToCreateLead()throws Throwable {
        caseNlead.clickOnLableToCreateLead();
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

    @Then("^I get message \"([^\"]*)\"$")
    public void iGetsMessage(String message) throws Throwable {
        caseNlead.verifyMessage(message);
    }

    @And("^I click on 'Dimiss' option to dismiss the recommendation$")
    public void iClickOnDimissOptionToDeferTheRecommendation() throws Throwable {
        caseNlead.clickOnDismiss();
    }

    @Then("^I select dimiss reason from dialogue box and i click on submit$")
    public void iSelectDimissReasonFromDialogueBoxAndIClickOnSubmit() throws Throwable {
        caseNlead.selectDismissReason();
    }

    @Then("^I click on 'Customer Relation' icon$")
    public void iClickOnCustomerRelationshipIcon() throws Throwable {
        demogs.ClicksOnRelationshipIcon();
    }

    @And("^I click on cross button in 'All' category recommendation$")
    public void iClickOnCrossButtonInAllCategoryRecommendation() throws Throwable {
        caseNlead.clickCrossButtonInAllCategory();
    }

    @Then("^I click on 'Transactions' icon on top right$")
    public void iClickOnTransactionsIconOnTopRight() throws Throwable {
        caseNlead.clickOnTransactionsButton();
    }

    @Then("^I click on 'Create Lead'$")
    public void iClickOnCreateLead() throws Throwable {
        caseNlead.clickOnCreateLead();
    }

    @Then("^I click on 'Authorised Signatory' icon in demographics$")
    public void iClickOnAuthorisedSignatoryIconInDemographics() throws Throwable {
        demogs.iClickOnAuthorisedSignatoryIcon();
    }

    @Then("^Authorised Signatory page gets open with title \"([^\"]*)\"$")
    public void authorisedSignatoryPageGetsOpenWithTitle(String title) throws Throwable {
        demogs.verifyAuthorisedSignatoryPage(title);
    }

    @Then("^I click on MDM ID on demographics$")
    public void iClickOnMDMIDOnDemographics() throws Throwable {
        demogs.clickOnMmdIdOnDemogs();
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

    @Then("^I click on Saving Account$")
    public void clickOnSavings() throws Throwable {
        productdetail.clickOnSavingsAccount();
    }

    @Then("^I verify the columns and data displayed in the tabular view$")
    public void verifyProductDetailsInTable(DataTable table1) throws Throwable {
        productdetail.verifyProductDetailsInTabularView(table1);
    }

    @Then("^I verify the alerts displayed in the alert view$")
    public void verifyAlertBox(DataTable table2) throws Throwable {
        productdetail.verifyAlertinAlertView(table2);
    }

    @And("^I verify the data displayed in the graph view$")
    public void verifyGraphView(DataTable table3) throws Throwable {
        productdetail.verifyDataInGraphView(table3);
    }

    @Then("^I click on one account information row$")
    public void clickOnFirstAccount() throws Throwable {
        productdetail.clickOnFirstAccountRow();
    }

    @And("^I also click on the second account information row$")
    public void clickOnSecondAccount() throws Throwable {
        productdetail.clickOnSecondAccountRow();
    }

    @And("I verify \"([^\"]*)\" displayed near the reset button$")
    public void verifyMessage(String message) throws Throwable {
        productdetail.verifyMessageBesideResetButton(message);
    }

    @Then("^I click on the reset button$")
    public void clickOnReset() throws Throwable {
        productdetail.clickOnResetButton();
    }

    @And("^I click on 'Create Service Request'$")
    public void iClickOnCreateServiceRequest() throws Throwable {
        caseNlead.clickOnCreateServiceRequest();
    }

    @Then("^Create Case form gets open with title \"([^\"]*)\"$")
    public void createCaseFormGetsOpenWithTitle(String title) throws Throwable {
        caseNlead.verifyTitleOfCaseCaseForm(title);
    }

    @And("^I fill all the fields of Create Case form with remarks \"([^\"]*)\" and click on submit$")
    public void iFillAllTheFieldsOfCreateCaseFormWithRemarksAndClickOnSubmit(String rmks) throws Throwable {
        caseNlead.fillAllFieldsOfCreateServiceRequestForm(rmks);
    }

    @Then("^I verify categories like \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\" is displayed in NBA$")
    public void iVerifyCategoriesLikeAndIsDisplayedInNBA(String all, String regulatory, String service, String xsell, String alerts, String information) throws Throwable {
        nba.verifyAllCategoriesIsDisplayed(all, regulatory, service, xsell, alerts, information);
    }

    @Then("^I verify recommendation is displayed with below details with icons$")
    public void iVerifyRecommendationIsDisplayedWithBelowDetailsWithIcons(DataTable nbaTable) throws Throwable {
        nba.verifyDetailsDisplayedInNBA(nbaTable);
    }

    @And("^I click on 'minimize icon' to close relation graph$")
    public void iClickOnMinimizeIconToCloseRelationGraph() throws Throwable {
        demogs.minimizeToCloseRelationGraph();
    }

    @And("^I select future date and click on submit button in calender$")
    public void iSelectFutureDateAndClickOnSubmitButtonInCalender() throws Throwable {
        caseNlead.clickOnSubmitButton();
    }

    @Then("^Create Case form gets open with lable name as title$")
    public void createCaseFormGetsOpenWithLableNameAsTitle() throws Throwable {
        caseNlead.verifyCreateCaseFormTitle();
    }

    @And("^Data is prefilled with all values$")
    public void dataIsPrefilledWithAllValues() throws Throwable {
        caseNlead.verifyDataIsPrefilledInCreateCaseWithRecommendation();
    }

    @After("@logout")
    public void afterScenario() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dropdown.click();
        logout_button.click();
    }

    @Then("^I click on record$")
    public void iClickOnRecord() throws Throwable {
        sp.clickOnRecord();
    }
}
