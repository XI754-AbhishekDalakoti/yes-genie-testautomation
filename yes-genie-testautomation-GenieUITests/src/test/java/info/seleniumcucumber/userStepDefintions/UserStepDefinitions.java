package info.seleniumcucumber.userStepDefintions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import env.DriverUtil;
import info.seleniumcucumber.methods.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.LoginPage;
import pageObjects.SearchPage;
import pageObjects.SnapPage;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;


public class UserStepDefinitions implements BaseTest {

    public static LoginPage lp = new LoginPage();
    public static SearchPage sp = new SearchPage();
    public static SnapPage snap = new SnapPage();
    protected WebDriver driver = DriverUtil.getDefaultDriver();

    @Then("^I should get logged-in with welcome message$")
    public void should_logged_in_with_welcome_message() throws Throwable {

        By selection = By.xpath("//span[@class='_2QCs8cFfqH_wnXLIYBu5ro ZU4gfSwYj6EDl657TJqnA']");
        (new WebDriverWait(driver, 10)).until(
                visibilityOfElementLocated(selection));
        String msg = driver.findElement(By.xpath("//span[@class='_2QCs8cFfqH_wnXLIYBu5ro ZU4gfSwYj6EDl657TJqnA']")).getText();
        if (!msg.isEmpty())
            msg = msg.split("\n")[0].trim();
        Assert.assertEquals("Welcome, Panna Das", msg);
    }

    @Then("^I should get error message$")
    public void iShouldGetErrorMessage() throws Throwable {

        By selection = By.className("kc-feedback-text");
        (new WebDriverWait(driver, 30)).until(
                visibilityOfElementLocated(selection));
        String msg = driver.findElement(By.className("kc-feedback-text")).getText();
        if (!msg.isEmpty())
            msg = msg.split("\n")[0].trim();
        Assert.assertEquals("Login Failed. Unknown User ID or Bad Password.", msg);
    }

    @Then("^The button should be disabled$")
    public void theButtonShouldBeDisabled() throws Throwable {
        lp.checkDisableButton();
    }

    @When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEntersCredentials(String Username, String Password) throws Throwable {
        lp.enterCredentials(Username, Password);
    }


    @And("^I click on Login$")
    public void iClickOnLogin() throws Throwable {
        lp.Login_button.click();
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

    @Then("^'No Results Found, Please refine' message is displayed$")
    public void noSearchResultDisplay() throws Throwable {
        sp.noSearchResultDisplay();
    }

    @Then("^I quit browser$")
    public void iQuitBrowser() throws Throwable {
        driver.quit();
    }

    @Then("^'Search returned too many results, Please refine' message is displayed due to threshold exceeded$")
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
    public void snapPageofIndividual() throws Throwable {
        snap.demographicsAttributesOfIndividual();
    }

    @Then("^I verify all the attributes of demographics having customer type corporate$")
    public void snapPageofCorporate() throws Throwable {
        snap.demographicsAttributesOfCorporate();
    }

    @Then("^I lands to SNAP page directly$")
    public void snapPageIsOpenedDirectly() throws Throwable {
        sp.landsIntoSnapPage();
    }
}