package pageObjects;

import locators.PortfolioLocators;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;


public class PortfolioPage extends PortfolioLocators {

    public PortfolioPage() {
        super();
    }

    public void verifyDepositOptions(){
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("http://cust360.yesgenie.com:30978/snap", currentUrl);

        String[] fixed_deposit_amount = deposit_amounts.get(0).getText().split("₹");
        String[] savings_deposit_amount = deposit_amounts.get(1).getText().split("₹");

        String fd_amount_string = fixed_deposit_amount[1].replaceAll("[, ;]","");
        String sd_amount_string = savings_deposit_amount[1].replaceAll("[, ;]","");

        int expectedTotal = Integer.parseInt(fd_amount_string) + Integer.parseInt(sd_amount_string);

        Actions action = new Actions(driver);
        action.moveToElement(deposit_heading).build().perform();

        String[] parts = total_deposit.getText().split("₹");
        String total_deposit_string = parts[1].replaceAll("[, ;]","");
        int actualTotal = Integer.parseInt(total_deposit_string);

        Assert.assertEquals(expectedTotal,actualTotal);


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


    }

    public void verifyInvestmentOptions(){

        String[] insurance_amount = investment_amounts.get(0).getText().split("₹");
        String[] mutual_funds_amount = investment_amounts.get(1).getText().split("₹");
        String[] ppf_amount = investment_amounts.get(2).getText().split("₹");

        String insurance_amount_string = insurance_amount[1].replaceAll("[, ;]","");
        String mf_amount_string = mutual_funds_amount[1].replaceAll("[, ;]","");
        String ppf_amount_string = ppf_amount[1].replaceAll("[, ;]","");

        int expectedTotal = Integer.parseInt(insurance_amount_string) + Integer.parseInt(mf_amount_string) + Integer.parseInt(ppf_amount_string);

        Actions action = new Actions(driver);
        action.moveToElement(investment_heading).build().perform();

        String[] parts = total_investment.getText().split("₹");
        String total_investment_string = parts[1].replaceAll("[, ;]","");
        int actualTotal = Integer.parseInt(total_investment_string);

        Assert.assertEquals(expectedTotal,actualTotal);

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

    }

    public void verifyLoanOptions(){

        String[] auto_loan_amount = loan_amounts.get(0).getText().split("₹");
        String[] home_loan_amount = loan_amounts.get(1).getText().split("₹");

        String al_amount_string = auto_loan_amount[1].replaceAll("[, ;]","");
        String hl_amount_string = home_loan_amount[1].replaceAll("[, ;]","");

        int expectedTotal = Integer.parseInt(al_amount_string) + Integer.parseInt(hl_amount_string);

        Actions action = new Actions(driver);
        action.moveToElement(loan_heading).build().perform();

        String[] parts = total_loan.getText().split("₹");
        String total_loan_string = parts[1].replaceAll("[, ;]","");
        int actualTotal = Integer.parseInt(total_loan_string);

        Assert.assertEquals(expectedTotal,actualTotal);

        Assert.assertEquals(true,loan_icon.isDisplayed());
        Assert.assertEquals(true,loan_heading.isDisplayed());
        Assert.assertEquals(true,auto_loan_icon.isDisplayed());
        Assert.assertEquals(true,auto_loan_heading.isDisplayed());
        Assert.assertEquals(true,home_loan_icon.isDisplayed());
        Assert.assertEquals(true,home_loan_heading.isDisplayed());
        Assert.assertEquals(true,personal_loan_icon.isDisplayed());
        Assert.assertEquals(true,personal_loan_heading.isDisplayed());

    }

    public void verifyCardsOptions(){

        String[] credit_card_amount = card_amounts.get(0).getText().split("₹");
        String[] fuel_card_amount = card_amounts.get(1).getText().split("₹");
        String[] prepaid_card_amount = card_amounts.get(2).getText().split("₹");

        String cc_amount_string = credit_card_amount[1].replaceAll("[, ;]","");
        String fc_amount_string = fuel_card_amount[1].replaceAll("[, ;]","");
        String pc_amount_string = prepaid_card_amount[1].replaceAll("[, ;]","");

        double expectedTotal = Double.parseDouble(cc_amount_string) + Double.parseDouble(fc_amount_string) + Double.parseDouble(pc_amount_string);

        Actions action = new Actions(driver);
        action.moveToElement(cards_heading).build().perform();

        String[] parts = total_card_amount.getText().split("₹");
        String total_card_string = parts[1].replaceAll("[, ;]","");
        double actualTotal = Double.parseDouble(total_card_string);

        Assert.assertEquals(expectedTotal,actualTotal);

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

    }

    public void verifyOthersOptions(){
        Assert.assertEquals(true,others_icon.isDisplayed());
        Assert.assertEquals(true,others_heading.isDisplayed());
        Assert.assertEquals(true,cheque_book_icon.isDisplayed());
        Assert.assertEquals(true,cheque_book_heading.isDisplayed());

    }
}
