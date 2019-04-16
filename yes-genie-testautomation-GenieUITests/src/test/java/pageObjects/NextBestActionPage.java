package pageObjects;

import cucumber.api.DataTable;
import locators.NextBestActionLocators;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;

public class NextBestActionPage extends NextBestActionLocators {

    public void verifyAllCategoriesIsDisplayed(String all, String regulatory, String service, String xsell, String alerts, String information) {
        int countOfAllCategory = count_of_recommendation_in_each_category.size();
        Assert.assertTrue(category_all.getText().contains(Integer.toString(countOfAllCategory)));
        Assert.assertTrue(category_all.getText().contains(all));

        category_regulatory.click();
        int countOfRegulatoryCategory = count_of_recommendation_in_each_category.size();
        Assert.assertTrue(category_regulatory.getText().contains(Integer.toString(countOfRegulatoryCategory)));
        Assert.assertTrue(category_regulatory.getText().contains(regulatory));

        category_service.click();
        int countOfServiceCategory = count_of_recommendation_in_each_category.size();
        Assert.assertTrue(category_service.getText().contains(Integer.toString(countOfServiceCategory)));
        Assert.assertTrue(category_service.getText().contains(service));

        category_xsell.click();
        int countOfXsellCategory = count_of_recommendation_in_each_category.size();
        Assert.assertTrue(category_xsell.getText().contains(Integer.toString(countOfXsellCategory)));
        Assert.assertTrue(category_xsell.getText().contains(xsell));

        category_alerts.click();
        int countOfAlertsCategory = count_of_recommendation_in_each_category.size();
        Assert.assertTrue(category_alerts.getText().contains(Integer.toString(countOfAlertsCategory)));
        Assert.assertTrue(category_alerts.getText().contains(alerts));

        category_information.click();
        int countOfInformationCategory = count_of_recommendation_in_each_category.size();
        Assert.assertTrue(category_information.getText().contains(Integer.toString(countOfInformationCategory)));
        Assert.assertTrue(category_information.getText().contains(information));
    }

    public void verifyDetailsDisplayedInNBA(DataTable nbaTable) {
        List<List<String>> data = nbaTable.raw();
        ArrayList<String> expected_nba_details = new ArrayList<>();
        ArrayList<String> actual_nba_details = new ArrayList<>();
        for(WebElement dataElement : nba_details) {
            actual_nba_details.add(dataElement.getText().trim().replace("\n"," ").replaceAll("( )+"," "));
        }
        expected_nba_details.add(data.get(0).get(0));
        Assert.assertTrue(updateemail_icon.isDisplayed());
        Assert.assertTrue(fixeddeposit_icon.isDisplayed());
        Assert.assertTrue(locker_icon.isDisplayed());
        Assert.assertTrue(updatefatca_icon.isDisplayed());
    }
}
