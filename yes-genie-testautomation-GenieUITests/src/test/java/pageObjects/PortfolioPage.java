package pageObjects;

import helper.Helper;
import locators.PortfolioLocators;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Arrays;


public class PortfolioPage extends PortfolioLocators {

    public static Helper help=new Helper();

    public PortfolioPage() {
        super();
    }

    public void verifyDepositOptions(){
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("http://cust360.yesgenie.com:30978/snap", currentUrl);

        double expectedTotal = help.getTotalAmountAfterReplacingInList(deposit_amounts);

        Actions action = new Actions(driver);
        action.moveToElement(deposit_heading).build().perform();

        double actualTotal = help.getAmountAfterReplacing(total_deposit);

        Assert.assertEquals(true,deposit_icon.isDisplayed());
        Assert.assertEquals(true,deposit_heading.isDisplayed());
        Assert.assertEquals(true,fixed_deposit_icon.isDisplayed());
        Assert.assertEquals(true,fixed_deposit_heading.isDisplayed());
        Assert.assertEquals(true,savings_account_icon.isDisplayed());
        Assert.assertEquals(true,savings_account_heading.isDisplayed());
        Assert.assertEquals(true,current_account_icon.isDisplayed());
        Assert.assertEquals(true,current_account_heading.isDisplayed());
        Assert.assertEquals(true,recurring_deposit_icon.isDisplayed());
        Assert.assertEquals(true,recurring_deposit_heading.isDisplayed());
        Assert.assertEquals(true,demat_account_icon.isDisplayed());
        Assert.assertEquals(true,demat_account_heading.isDisplayed());
        Assert.assertEquals(expectedTotal,actualTotal,0.0f);


    }

    public void verifyInvestmentOptions(){

        double expectedTotal =help.getTotalAmountAfterReplacingInList(investment_amounts);

        Actions action = new Actions(driver);
        action.moveToElement(investment_heading).build().perform();

        double actualTotal = help.getAmountAfterReplacing(total_investment);

        Assert.assertEquals(true,investment_icon.isDisplayed());
        Assert.assertEquals(true,investment_heading.isDisplayed());
        Assert.assertEquals(true,life_insurance_icon.isDisplayed());
        Assert.assertEquals(true,life_insurance_heading.isDisplayed());
        Assert.assertEquals(true,mutual_funds_icon.isDisplayed());
        Assert.assertEquals(true,mutual_funds_heading.isDisplayed());
        Assert.assertEquals(true,ppf_icon.isDisplayed());
        Assert.assertEquals(true,ppf_heading.isDisplayed());
        Assert.assertEquals(true,stocks_icon.isDisplayed());
        Assert.assertEquals(true,stocks_heading.isDisplayed());
        Assert.assertEquals(true,apy_icon.isDisplayed());
        Assert.assertEquals(true,apy_heading.isDisplayed());
        Assert.assertEquals(true,gold_icon.isDisplayed());
        Assert.assertEquals(true,gold_heading.isDisplayed());
        Assert.assertEquals(expectedTotal,actualTotal,0.0f);

    }

    public void verifyLoanOptions(){

        double expectedTotal = help.getTotalAmountAfterReplacingInList(loan_amounts);

        Actions action = new Actions(driver);
        action.moveToElement(loan_heading).build().perform();

        double actualTotal = help.getAmountAfterReplacing(total_loan);

        Assert.assertEquals(true,loan_icon.isDisplayed());
        Assert.assertEquals(true,loan_heading.isDisplayed());
        Assert.assertEquals(true,auto_loan_icon.isDisplayed());
        Assert.assertEquals(true,auto_loan_heading.isDisplayed());
        Assert.assertEquals(true,home_loan_icon.isDisplayed());
        Assert.assertEquals(true,home_loan_heading.isDisplayed());
        Assert.assertEquals(true,personal_loan_icon.isDisplayed());
        Assert.assertEquals(true,personal_loan_heading.isDisplayed());
        Assert.assertEquals(expectedTotal,actualTotal,0.0f);

    }

    public void verifyCardsOptions(){

        double expectedTotal = help.getTotalAmountAfterReplacingInList(card_amounts);

        Actions action = new Actions(driver);
        action.moveToElement(cards_heading).build().perform();

        double actualTotal = help.getAmountAfterReplacing(total_card_amount);

        Assert.assertEquals(true,cards_icon.isDisplayed());
        Assert.assertEquals(true,cards_heading.isDisplayed());
        Assert.assertEquals(true,credit_card_icon.isDisplayed());
        Assert.assertEquals(true,credit_card_heading.isDisplayed());
        Assert.assertEquals(true,fuel_card_icon.isDisplayed());
        Assert.assertEquals(true,fuel_card_heading.isDisplayed());
        Assert.assertEquals(true,prepaid_card_icon.isDisplayed());
        Assert.assertEquals(true,prepaid_card_heading.isDisplayed());
        Assert.assertEquals(true,smart_card_icon.isDisplayed());
        Assert.assertEquals(true,smart_card_heading.isDisplayed());
        Assert.assertEquals(true,international_card_icon.isDisplayed());
        Assert.assertEquals(true,international_card_heading.isDisplayed());
        Assert.assertEquals(true,travel_card_icon.isDisplayed());
        Assert.assertEquals(true,travel_card_heading.isDisplayed());
        Assert.assertEquals(expectedTotal,actualTotal,0.0f);

    }

    public void verifyOthersOptions(){
        Assert.assertEquals(true,others_icon.isDisplayed());
        Assert.assertEquals(true,others_heading.isDisplayed());
        Assert.assertEquals(true,cheque_book_icon.isDisplayed());
        Assert.assertEquals(true,cheque_book_heading.isDisplayed());

    }

    public void verifyKPILabels(){

        ArrayList<String> expected_labels = new ArrayList<>(Arrays.asList("GROUP_NRV","NRV","PPI"));
        ArrayList<String> actual_labels = new ArrayList<>();
        for(WebElement element : kpi_labels){
            actual_labels.add(element.getText());
        }
        Assert.assertEquals(expected_labels,actual_labels);

    }

    public void verifyKPIAmountsForIndividual(){

        ArrayList<String> expected_data = new ArrayList<>(Arrays.asList("₹ 1,00,000","₹ 1,00,00,000","1.2"));
        ArrayList<String> actual_data = new ArrayList<>();
        for(WebElement dataElement : kpi_data){
            actual_data.add(dataElement.getText());
        }
        Assert.assertEquals(expected_data,actual_data);
    }

    public void verifyKPIAmountsForCorporate(){

        ArrayList<String> expected_data = new ArrayList<>(Arrays.asList("₹ 10,000","₹ 1,00,000","1.6"));
        ArrayList<String> actual_data = new ArrayList<>();
        for(WebElement dataElement : kpi_data){
            actual_data.add(dataElement.getText());
        }
        Assert.assertEquals(expected_data,actual_data);
    }
}
