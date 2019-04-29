package pageObjects;

import env.Constant;
import locators.SearchLocators;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.NoSuchElementException;

public class SearchPage extends SearchLocators {

    public SearchPage() {
        super();
    }

    public void searchParameters() {
        try {
            Assert.assertEquals(Constant.MDMID, heading_mdmId.getText());
            Assert.assertEquals(Constant.CUSTID, heading_custId.getText());
            Assert.assertEquals(Constant.CustomerName, heading_customerName.getText());
            Assert.assertEquals(Constant.DOB, heading_dob.getText());
            Assert.assertEquals(Constant.AdressCity, heading_addressCity.getText());
            Assert.assertEquals(Constant.AdressArea, heading_addressArea.getText());
            Assert.assertEquals(Constant.HomeBranch, heading_homeBranch.getText());
            Assert.assertEquals(Constant.LiabilityRM, heading_liabilityRM.getText());
            Assert.assertEquals(Constant.AssetRM, heading_assetRM.getText());
            Assert.assertEquals(Constant.GroupID, heading_groupId.getText());
            Assert.assertEquals(Constant.BusinessSegment, heading_businessSegment.getText());
            Assert.assertEquals(Constant.PartnerSegment, heading_partnerSegment.getText());
            Assert.assertEquals(Constant.CustOpenDate, heading_custOpenDate.getText());
            List<WebElement> elements = driver.findElements(By.xpath("//table[@class=\"_4sbYNaXGOD8VzGHAX2_Gp\"]/tbody/tr"));
            int countOfRows = elements.size();
            Assert.assertTrue(countOfRows <= Constant.threshold);
            String rowCount = countOfRows + " Results)";

            String countText = driver.findElement(By.xpath("//span[@class='_6AKfPTdqch8YuuArGQ4Dc']")).getText();
            String arrayOfRowCount[] = countText.split("\\(");
            Assert.assertEquals(rowCount.trim(), arrayOfRowCount[1].trim());
        } catch (Exception e) {
            Assert.assertEquals(Constant.snapPageUrl, driver.getCurrentUrl());
        }
    }

    public void noSearchResultDisplay() {
        String noSearchResultMessage = heading_noSearchResult.getText().trim();
        Assert.assertEquals("No Customer Found.", noSearchResultMessage);
    }

    public String getpageTitle() {
        String title = driver.getTitle();
        System.out.println("Title is : " + title);
        return title;
    }

    public void refineMessage() {
        String msg = refinement_message.getText().trim();
        Assert.assertEquals("Too many matching customers found. Please refine your search criterion.", msg);
    }

    public void bubbleSearch(String Result) {
        String text = sp.bubble_highlight.getText();
        if (Result == "PAN") {
            Assert.assertEquals(text, Result);
        } else if (Result == "Passport") {
            Assert.assertEquals(text, Result);
        } else if (Result == "Cust Name") {
            Assert.assertEquals(text, Result);
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

    public void landsIntoSnapPage() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(Constant.snapPageUrl, currentUrl);
    }

    public void clickOnIndividualRecord() {
        try {
            individual_record.click();
        } catch (Exception err) {
            System.out.println(err);
        }
    }

    public void clickOnNonIndividualRecord() {
        nonindividual_record.click();
    }
}