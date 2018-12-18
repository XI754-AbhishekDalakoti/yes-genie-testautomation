package pageObjects;

import env.Constant;
import locators.SearchLocators;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class SearchPage extends SearchLocators {

    public SearchPage(){
        super();
    }

    public void searchParameters() {

        String ID = heading_MDMID.getText();
        String Cust = heading_CUSTID.getText();
        String CustName = heading_CustomerName.getText();
        String DateOfBirth = heading_DOB.getText();
        String City = heading_AddressCity.getText();
        String Area = heading_AddressArea.getText();
        String HBranch = heading_HomeBranch.getText();
        String ARM = heading_AssetRM.getText();
        String LRM = heading_LiabilityRM.getText();
        String GID = heading_GroupID.getText();
        String BusinessSeg = heading_BusinessSegment.getText();
        String PartnerSeg = heading_PartnerSegment.getText();
        String OpenDate = heading_CustOpenDate.getText();
        Assert.assertEquals(Constant.MDMID,ID);
        Assert.assertEquals(Constant.CUSTID,Cust);
        Assert.assertEquals(Constant.CustomerName,CustName);
        Assert.assertEquals(Constant.DOB,DateOfBirth);
        Assert.assertEquals(Constant.AdressCity,City);
        Assert.assertEquals(Constant.AdressArea,Area);
        Assert.assertEquals(Constant.HomeBranch,HBranch);
        Assert.assertEquals(Constant.AssetRM,ARM);
        Assert.assertEquals(Constant.LiabilityRM,LRM);
        Assert.assertEquals(Constant.GroupID,GID);
        Assert.assertEquals(Constant.BusinessSegment,BusinessSeg);
        Assert.assertEquals(Constant.PartnerSegment,PartnerSeg);
        Assert.assertEquals(Constant.CustOpenDate,OpenDate);
        Assert.assertEquals(Constant.CustOpenDate,OpenDate);
        List<WebElement> elements = driver.findElements(By.xpath("//table[@class=\"_4sbYNaXGOD8VzGHAX2_Gp\"]/tbody/tr"));
        int countOfRows = elements.size();
        Assert.assertTrue(countOfRows <= Constant.threshold);
        String rowCount = countOfRows + " Results)";

        String countText = driver.findElement(By.xpath("//span[@class='_6AKfPTdqch8YuuArGQ4Dc']")).getText();
        String arrayOfRowCount[] = countText.split("\\(");
        Assert.assertEquals(rowCount.trim(),arrayOfRowCount[1].trim());
    }

    public void noSearchResultDisplay(){
        String noSearchResult = heading_NoSearchResult.getText();
        Assert.assertEquals("No Results Found. Please refine",noSearchResult);
    }

    public String getpageTitle(){
        String title = driver.getTitle();
        System.out.println("Title is : "+title);
        return title;
    }

    public void refineMessage() {
        String msg = refinementMessage.getText();
        Assert.assertEquals("Search returned too many results. Please refine", msg);
    }

    public void bubbleSearch(String Result) {
        String text = sp.bubbleHighlight.getText();
        if (Result == "PAN") {
            Assert.assertEquals(text,Result);
        }
        else if (Result == "Passport") {
            Assert.assertEquals(text,Result);
        }
        else if (Result == "Cust Name") {
            Assert.assertEquals(text,Result);
        }
    }

    public void formatOfSearchLabel(String Result1, String Result2, String Result3, String Result4) {

        String searchText = driver.findElement(By.xpath("//span[@class=\"_6AKfPTdqch8YuuArGQ4Dc\"]")).getText();
        String arrayOfSearchText[] = searchText.split("\\+");

        boolean res = arrayOfSearchText[0].contains(Result1);
        Assert.assertTrue(res);
        boolean res1 = arrayOfSearchText[1].contains(Result2);
        Assert.assertTrue(res1);
        boolean res2 = arrayOfSearchText[0].contains(Result3);
        Assert.assertTrue(res2);
        boolean res3 = arrayOfSearchText[1].contains(Result4);
        Assert.assertTrue(res3);
    }

    public void landsIntoSnapPage(){
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("http://yesgenie.com:30978/snap", currentUrl);
    }
}