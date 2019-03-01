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

        String id = heading_mdmId.getText();
        String cust = heading_custId.getText();
        String custName = heading_customerName.getText();
        String dateOfBirth = heading_dob.getText();
        String city = heading_addressCity.getText();
        String area = heading_addressArea.getText();
        String Hbranch = heading_homeBranch.getText();
        String arm = heading_assetRM.getText();
        String lrm = heading_liabilityRM.getText();
        String GrpId = heading_groupId.getText();
        String businessSeg = heading_businessSegment.getText();
        String partnerSeg = heading_partnerSegment.getText();
        String openDate = heading_custOpenDate.getText();
        Assert.assertEquals(Constant.MDMID,id);
        Assert.assertEquals(Constant.CUSTID,cust);
        Assert.assertEquals(Constant.CustomerName,custName);
        Assert.assertEquals(Constant.DOB,dateOfBirth);
        Assert.assertEquals(Constant.AdressCity,city);
        Assert.assertEquals(Constant.AdressArea,area);
        Assert.assertEquals(Constant.HomeBranch,Hbranch);
        Assert.assertEquals(Constant.AssetRM,arm);
        Assert.assertEquals(Constant.LiabilityRM,lrm);
        Assert.assertEquals(Constant.GroupID,GrpId);
        Assert.assertEquals(Constant.BusinessSegment,businessSeg);
        Assert.assertEquals(Constant.PartnerSegment,partnerSeg);
        Assert.assertEquals(Constant.CustOpenDate,openDate);
        List<WebElement> elements = driver.findElements(By.xpath("//table[@class=\"_4sbYNaXGOD8VzGHAX2_Gp\"]/tbody/tr"));
        int countOfRows = elements.size();
        Assert.assertTrue(countOfRows <= Constant.threshold);
        String rowCount = countOfRows + " Results)";

        String countText = driver.findElement(By.xpath("//span[@class='_6AKfPTdqch8YuuArGQ4Dc']")).getText();
        String arrayOfRowCount[] = countText.split("\\(");
        Assert.assertEquals(rowCount.trim(),arrayOfRowCount[1].trim());
    }

    public void noSearchResultDisplay(){
        String noSearchResultMessage = heading_noSearchResult.getText();
        Assert.assertEquals("No Results Found. Please refine",noSearchResultMessage);
    }

    public String getpageTitle(){
        String title = driver.getTitle();
        System.out.println("Title is : "+title);
        return title;
    }

    public void refineMessage() {
        String msg = refinement_message.getText();
        Assert.assertEquals("Search returned too many results. Please refine", msg);
    }

    public void bubbleSearch(String Result) {
        String text = sp.bubble_highlight.getText();
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
        Assert.assertEquals("https://cust360.yesgenie.com:31390/snap", currentUrl);
    }
}