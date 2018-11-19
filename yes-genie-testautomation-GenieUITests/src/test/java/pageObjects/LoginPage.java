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

    public void displayLoginDateTimeBasicInfo() throws ParseException {

        String strDate = display_LastLogin.getText();
        strDate = strDate.replaceAll("Last Login: ", "");
        SimpleDateFormat sdfrmt = new SimpleDateFormat("MMMM dd, yyyy, hh:mm a");
        sdfrmt.setLenient(false);
        sdfrmt.parse(strDate);

        dropDown.click();
        String UserDesignation = display_Designation.getText();
        String UserRole = display_Role.getText();
        System.out.println(UserDesignation);
        System.out.println(UserRole);
        Assert.assertEquals(Constant.designation,UserDesignation);
        Assert.assertEquals(Constant.role,UserRole);

        driver.findElement(By.xpath("//div[@class=\"Ug7OgGNM7EPVYG5js9Amg\"]")).click();
    }

    public void staticSearchParameters() {
        String parameters = display_Parameters.getText();
        Assert.assertEquals(parameters, Constant.SearchParameters);
    }

    public void logOut() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dropDown.click();
        Logout_button.click();
    }

    public void validateFormat() throws ParseException {
        String strDate = display_LastLogin.getText();
        strDate = strDate.replaceAll("Last Login: ", "");
        SimpleDateFormat sdfrmt = new SimpleDateFormat("MMMM dd, yyyy, hh:mm a");
        sdfrmt.setLenient(false);
        sdfrmt.parse(strDate);
    }
}