package locators;

import info.seleniumcucumber.userStepDefintions.UserStepDefinitions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PortfolioLocators extends UserStepDefinitions {
    public PortfolioLocators() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'deposits_box.6a62d65c.svg')]")
    public static WebElement deposit_icon;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'Deposits_corporate.93e237d0.svg')]")
    public static WebElement corporate_deposit_icon;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Deposit')]")
    public static WebElement deposit_heading;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Deposits & Investments')]")
    public static WebElement deposits_investments_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'fixed_deposit.2dd337c6.svg')]")
    public static WebElement fixed_deposit_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Fixed Deposit')]")
    public static WebElement fixed_deposit_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'savings_account.e9c3bf3f.svg')]")
    public static WebElement savings_account_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Saving Account')]")
    public static WebElement savings_account_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'current_account_wip.072f22bd.svg')]")
    public static WebElement current_account_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Current Account')]")
    public static WebElement current_account_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'recurring_deposit_wip.2843189c.svg')]")
    public static WebElement recurring_deposit_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Recurring Deposit Account')]")
    public static WebElement recurring_deposit_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'dmat_propose.4e8c602f.svg')]")
    public static WebElement demat_account_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Demat Account')]")
    public static WebElement demat_account_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'investment.dee02d79.svg')]")
    public static WebElement investment_icon;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'trade_forex.ff1cd9b6.svg')]")
    public static WebElement trade_icon;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Investments')]")
    public static WebElement investment_heading;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Trade')]")
    public static WebElement trade_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'life_insurance.69338c61.svg')]")
    public static WebElement life_insurance_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Life Insurance')]")
    public static WebElement life_insurance_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'mutual_funds.ed5d9304.svg')]")
    public static WebElement mutual_funds_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Mutual Funds')]")
    public static WebElement mutual_funds_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'provident_fund.ebc8841c.svg')]")
    public static WebElement ppf_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Public Provident Fund')]")
    public static WebElement ppf_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'mf_online_wip.440716e0.svg')]")
    public static WebElement stocks_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Stocks')]")
    public static WebElement stocks_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'apy_propose.0fc36b91.svg')]")
    public static WebElement apy_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'APY')]")
    public static WebElement apy_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'loan_against_security_propose.cb3a9f84.svg')]")
    public static WebElement gold_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Gold')]")
    public static WebElement gold_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'loans.2bb783ac.svg')]")
    public static WebElement loan_icon;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Loans')]")
    public static WebElement loan_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'auto_loan.d9ff7ca3.svg')]")
    public static WebElement auto_loan_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Auto Loan')]")
    public static WebElement auto_loan_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'home_loan.179b1783.svg')]")
    public static WebElement home_loan_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Home Loan')]")
    public static WebElement home_loan_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'personal_loan_propose.d5452086.svg')]")
    public static WebElement personal_loan_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Personal Loan')]")
    public static WebElement personal_loan_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'Cards.427a89f0.svg')]")
    public static WebElement cards_icon;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'collections_and_payments.96b6ecff.svg')]")
    public static WebElement collections_payments_icon;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'loans.2bb783ac.svg')]")
    public static WebElement loans_advances_icon;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Cards & Wallet')]")
    public static WebElement cards_heading;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Collections & Payments')]")
    public static WebElement collections_payments_heading;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Loans & Advances')]")
    public static WebElement loans_advances_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'credit_card.4540bef7.svg')]")
    public static WebElement credit_card_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Credit Card')]")
    public static WebElement credit_card_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'fuel_card.670ff35e.svg')]")
    public static WebElement fuel_card_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Fuel Card')]")
    public static WebElement fuel_card_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'prepaid_card.c1eab14a.svg')]")
    public static WebElement prepaid_card_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Prepaid Card')]")
    public static WebElement prepaid_card_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'common_card_wip.7119f6cb.svg')]")
    public static WebElement smart_card_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Smart Card')]")
    public static WebElement smart_card_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'common_card_propose.7618fbf1.svg')]")
    public static WebElement international_card_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'International Credit Card')]")
    public static WebElement international_card_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'travel_card_propose.c08152f8.svg')]")
    public static WebElement travel_card_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Travel Card')]")
    public static WebElement travel_card_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'others.aa9a6389.svg')]")
    public static WebElement others_icon;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Others')]")
    public static WebElement others_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'cheque_book.a0fb49fd.svg')]")
    public static WebElement cheque_book_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Cheque Book')]")
    public static WebElement cheque_book_heading;

    @FindBy(how = How.XPATH, using = "//div[@class='_2cTCmnxj5gU1JCpbN-KO6R'][1]//span[contains(text(),'₹')]")
    public static List<WebElement> deposit_amounts;

    @FindBy(how = How.CSS, using = "div[class='gy2-S5J2MMx_FOwip4xHw depositInvestmentsHover']")
    public static WebElement total_depositsinvestments;

    @FindBy(how = How.CSS, using = "div[class='gy2-S5J2MMx_FOwip4xHw depositHover']")
    public static WebElement total_deposit;

    @FindBy(how = How.XPATH, using = "//div[@class='_2cTCmnxj5gU1JCpbN-KO6R'][2]//span[contains(text(),'₹')]")
    public static List<WebElement> investment_amounts;

    @FindBy(how = How.CSS, using = "div[class='gy2-S5J2MMx_FOwip4xHw investmentHover']")
    public static WebElement total_investment;

    @FindBy(how = How.CSS, using = "div[class='gy2-S5J2MMx_FOwip4xHw tradeHover']")
    public static WebElement total_trade;

    @FindBy(how = How.XPATH, using = "//div[@class='_2cTCmnxj5gU1JCpbN-KO6R'][3]//span[contains(text(),'₹')]")
    public static List<WebElement> loan_amounts;

    @FindBy(how = How.CSS, using = "div[class='gy2-S5J2MMx_FOwip4xHw loanHover']")
    public static WebElement total_loan;

    @FindBy(how = How.XPATH, using = "//div[@class='_2cTCmnxj5gU1JCpbN-KO6R'][4]//span[contains(text(),'₹')]")
    public static List<WebElement> card_amounts;

    @FindBy(how = How.CSS, using = "div[class='gy2-S5J2MMx_FOwip4xHw cardHover']")
    public static WebElement total_card_amount;

    @FindBy(how = How.CSS, using = "div[class='gy2-S5J2MMx_FOwip4xHw loanAdvanceHover']")
    public static WebElement total_loans_advances_amount;

    @FindBy(how = How.CSS, using = "span[class='_1wQ1rFim9bh2TNPIuuDBdQ']")
    public static List<WebElement> kpi_labels;

    @FindBy(how = How.XPATH, using = "//span[@class='_20Mx09ER8emApg4placFeV']/span")
    public static List<WebElement> kpi_data;

    @FindBy(how = How.XPATH, using = "//div[@class='_2wa49TB9GF0nwMcvjvIyxn']")
    public static List<WebElement> channels_data;

    @FindBy(how = How.XPATH, using = "(//div[@class='_1ayJzxADQ3eVsU5XX3HP42'])[1]/img")
    public static List<WebElement> netbanking_toottip_data;

    @FindBy(how = How.XPATH, using = "(//div[@class='_1ayJzxADQ3eVsU5XX3HP42'])[2]/img")
    public static List<WebElement> mobileapp_tooltip_data;

    @FindBy(how = How.XPATH, using = "(//div[@class='_1ayJzxADQ3eVsU5XX3HP42'])[4]/div")
    public static WebElement pos_toottip_data;

    @FindBy(how = How.XPATH, using = "(//div[@class='_1ayJzxADQ3eVsU5XX3HP42'])[5]/div")
    public static WebElement atm_toottip_data;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'Collapse_Icon.9921b729.svg')]")
    public static WebElement collapse_icon;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'net_banking.0d609890.svg')]")
    public static WebElement netbanking_icon;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'mobile_app.b840e053.svg')]")
    public static WebElement mobileapp_icon;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'pos.99f33b5e.svg')]")
    public static WebElement pos_icon;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'atm.cd0beb4b.svg')]")
    public static WebElement atm_icon;

    @FindBy(how = How.XPATH, using = "(//img[contains(@src,'Home_Branch.1bad3955.svg')])[2]")
    public static WebElement branchbanking_icon;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'data:image/png;base64,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')]")
    public static WebElement yesrobot_icon;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'registered.ec15f842.svg')]")
    public static WebElement registered_icon;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'locked.e90057b1.svg')]")
    public static WebElement lock_icon;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'android.4b6f9880.svg')]")
    public static WebElement android_icon;

}

