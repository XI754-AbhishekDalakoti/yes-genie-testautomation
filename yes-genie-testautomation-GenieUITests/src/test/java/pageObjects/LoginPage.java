package pageObjects;

import env.Constant;
import locators.LoginLocators;
import org.junit.Assert;
import org.openqa.selenium.By;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;


public class LoginPage extends LoginLocators {

    public LoginPage(){
        super();
    }

    public void checkDisableButton() {
        Assert.assertFalse(Login_button.isEnabled());
    }

    public void enterCredentials(String Username, String Password){
        textBox_Username.sendKeys(Username);
        textBox_Password.sendKeys(Password);
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

        String strDate = display_LastLogin.getText();
        strDate = strDate.replaceAll("Last Login: ", "");
        SimpleDateFormat sdfrmt = new SimpleDateFormat("dd-MMM-yyyy, hh:mm a");
        sdfrmt.setLenient(false);
        sdfrmt.parse(strDate);
    }

    public void displayBasicInformation() throws ParseException {

        String UserDesignation = display_Designation.getText();
        String UserRole = display_Role.getText();
        String UserName = display_Name.getText();
        Assert.assertEquals(Constant.designation,UserDesignation);
        Assert.assertEquals(Constant.role,UserRole);
        Assert.assertEquals(Constant.name,UserName);

        driver.findElement(By.xpath("//div[@class=\"Ug7OgGNM7EPVYG5js9Amg\"]")).click();
    }

    public void clickDropDownOnTopRight() {
        dropDown.click();
    }

    public void staticSearchParameters() {
        String parameters = display_Parameters.getText();
        Assert.assertEquals("Cust IDMDM IDMobile No.PANPassportCust NameAccount No.AUS IDCKYC No.UPI HandleTwitter IdAadharEmail",parameters);
    }

    public void logOut() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dropDown.click();
        Logout_button.click();
    }
}