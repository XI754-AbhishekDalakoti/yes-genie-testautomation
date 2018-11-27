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

        String countText = driver.findElement(By.xpath("//span[@class=\"_3EgRXlYvEjwG3mDsFlPzjz\"]")).getText();
        String arrayOfRowCount[] = countText.split("\\(");
        Assert.assertEquals(rowCount.trim(),arrayOfRowCount[1].trim());
    }

    public void noSearchResultDisplay(){
        String noSearchResult = heading_NoSearchResult.getText();
        Assert.assertEquals("No result found",noSearchResult);
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

    public void bubbleSearch(String Parameter1) {
        String text = sp.bubbleHighlight.getText();
        if (Parameter1 == "PAN") {
            Assert.assertEquals(text,Parameter1);
        }
        else if (Parameter1 == "Passport") {
            Assert.assertEquals(text,Parameter1);
        }
        else if (Parameter1 == "Cust Name") {
            Assert.assertEquals(text,Parameter1);
        }
    }
}