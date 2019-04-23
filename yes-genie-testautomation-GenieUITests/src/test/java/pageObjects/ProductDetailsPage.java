package pageObjects;

import cucumber.api.DataTable;
import locators.ProductDetailsLocators;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ProductDetailsPage extends ProductDetailsLocators {

    public void clickOnSavingsAccount(){
        savings_account.click();
    }

    public void verifyProductDetailsInTabularView(DataTable detailstable){
        List<List<String>> data = detailstable.raw();
        ArrayList<String> expected_headings = new ArrayList<>();
        ArrayList<String> actual_headings = new ArrayList<>();
        for(WebElement dataElement : table_headings){
            actual_headings.add(dataElement.getText());
        }
        for(int i=0;i<data.size();i++){
            expected_headings.add(data.get(i).get(0));
        }
        Assert.assertEquals(expected_headings,actual_headings);

        ArrayList<String> expected_values = new ArrayList<>();
        ArrayList<String> actual_values = new ArrayList<>();
        for(WebElement dataElem : table_values){
            actual_values.add(dataElem.getText());
        }
        for(int i=0;i<data.size();i++){
            expected_values.add(data.get(i).get(1));
        }
        Assert.assertEquals(expected_values,actual_values);
    }

    public void verifyAlertinAlertView(DataTable alerttable){
        Assert.assertEquals(true,alert_box.isDisplayed());
        List<List<String>> alertlist = alerttable.raw();
        ArrayList<String> expected_alerts = new ArrayList<>();
        ArrayList<String> actual_alerts = new ArrayList<>();
        for(WebElement dataElement : alerts){
            actual_alerts.add(dataElement.getText());
        }
        for(int i=0;i<alertlist.size();i++){
            expected_alerts.add(alertlist.get(i).get(0));
        }
        Assert.assertEquals(expected_alerts,actual_alerts);
    }

    public void verifyDataInGraphView(DataTable graphTable){

        Assert.assertEquals(true,graph_box.isDisplayed());

        Actions action = new Actions(driver);
        action.moveToElement(graph_point).build().perform();

        List<List<String>> graphData = graphTable.raw();
        String expected_data_firstpoint = graphData.get(0).get(0);
        String actual_data_firstpoint="";
        for(WebElement dataElement : graph_datapoint1){
            actual_data_firstpoint = actual_data_firstpoint + dataElement.getText();
        }
        Assert.assertEquals(expected_data_firstpoint,actual_data_firstpoint);

        String expected_data_secondpoint = graphData.get(1).get(0);
        String actual_data_secondpoint="";
        for(WebElement dataElement : graph_datapoint2){
            actual_data_secondpoint = actual_data_secondpoint + dataElement.getText();
        }
        Assert.assertEquals(expected_data_secondpoint,actual_data_secondpoint);

    }

    public void clickOnFirstAccountRow(){ table_first_row.click(); }

    public void clickOnSecondAccountRow(){ table_second_row.click(); }

    public void verifyMessageBesideResetButton(String expected_message){
        String actual_message = info_message.getText();
        Assert.assertEquals(expected_message,actual_message);
    }

    public void clickOnResetButton(){ reset_button.click();}

}
