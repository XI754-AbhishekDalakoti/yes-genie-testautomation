package pageObjects;

import env.Constant;
import locators.LoginLocators;
import org.junit.Assert;
import org.openqa.selenium.By;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class LoginPage extends LoginLocators {

    public LoginPage(){
        super();
    }

    public void checkButtonIsDisbale() {
        Assert.assertFalse(login_button.isEnabled());
    }

    public void enterCredentials(String Username, String Password){
        textbox_username.sendKeys(Username);
        textbox_password.sendKeys(Password);
    }

    public void clickOnLogin() {
        login_button.click();
    }

    public void verifyLoginPage() {
        String title = sp.getpageTitle().trim();
        if (title.equalsIgnoreCase("Log in to YBL")) {
            System.out.println("t : " + title);
        } else {
            lp.logOut();
        }
    }

    public void lastLoginDateTimeFormat() throws ParseException {
        String[] months = new String[]{"Jan", "Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec","AM","PM"};
        List<String> list = Arrays.asList(months);
        String lastLoginDateTime = display_lastlogin.getText();
        String lastLoginDateFormat = lastLoginDateTime.replaceAll("Last Login: ", "");
        String splittingOnDash[] = lastLoginDateFormat.split("\\-");
        String splittingOnSpace[] = lastLoginDateFormat.split("\\ ");
        Assert.assertTrue(list.contains(splittingOnDash[1]));
        Assert.assertTrue(list.contains(splittingOnSpace[2]));
    }

    public void displayBasicInformation() throws ParseException {
        String UserDesignation = display_designation.getText();
        String UserRole = display_role.getText();
        String UserName = display_name.getText();
        Assert.assertEquals(Constant.designation,UserDesignation);
        Assert.assertEquals(Constant.role,UserRole);
        Assert.assertEquals(Constant.name,UserName);

        driver.findElement(By.xpath("//div[@class=\"Ug7OgGNM7EPVYG5js9Amg\"]")).click();
    }

    public void clickDropDownOnTopRight() {
        dropdown.click();
    }

    public void staticSearchParameters() {
        String staticSearchParameters = search_static_parameters.getText();
        Assert.assertEquals("Cust IDMDM IDMobile No.PANPassportCust NameAccount No.CKYC No.UPI HandleTwitter IdEmail",staticSearchParameters);
    }

    public void logOut() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dropdown.click();
        logout_button.click();
    }
}