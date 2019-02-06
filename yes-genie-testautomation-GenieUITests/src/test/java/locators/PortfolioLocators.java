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

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'/static/media/deposits_box.6a62d65c.svg')]")
    public static WebElement deposit_icon;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Deposit')]")
    public static WebElement deposit_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'/static/media/fixed_deposit.2dd337c6.svg')]")
    public static WebElement fixed_deposit_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Fixed Deposit')]")
    public static WebElement fixed_deposit_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'/static/media/savings_account.e9c3bf3f.svg')]")
    public static WebElement savings_account_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Saving Account')]")
    public static WebElement savings_account_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'/static/media/current_account_wip.072f22bd.svg')]")
    public static WebElement current_account_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Current Account')]")
    public static WebElement current_account_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'/static/media/recurring_deposit_wip.2843189c.svg')]")
    public static WebElement recurring_deposit_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Recurring Deposit Account')]")
    public static WebElement recurring_deposit_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'/static/media/dmat_propose.4e8c602f.svg')]")
    public static WebElement demat_account_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Demat Account')]")
    public static WebElement demat_account_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'/static/media/investment.dee02d79.svg')]")
    public static WebElement investment_icon;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Investments')]")
    public static WebElement investment_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'/static/media/life_insurance.69338c61.svg')]")
    public static WebElement life_insurance_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Life Insurance')]")
    public static WebElement life_insurance_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'/static/media/mutual_funds.ed5d9304.svg')]")
    public static WebElement mutual_funds_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Mutual Funds')]")
    public static WebElement mutual_funds_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'/static/media/provident_fund.ebc8841c.svg')]")
    public static WebElement ppf_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Public Provident Fund')]")
    public static WebElement ppf_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'/static/media/mf_online_wip.440716e0.svg')]")
    public static WebElement stocks_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Stocks')]")
    public static WebElement stocks_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'/static/media/apy_propose.0fc36b91.svg')]")
    public static WebElement apy_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'APY')]")
    public static WebElement apy_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'/static/media/loan_against_security_propose.cb3a9f84.svg')]")
    public static WebElement gold_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Gold')]")
    public static WebElement gold_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'/static/media/loans.2bb783ac.svg')]")
    public static WebElement loan_icon;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Loans')]")
    public static WebElement loan_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'/static/media/auto_loan.d9ff7ca3.svg')]")
    public static WebElement auto_loan_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Auto Loan')]")
    public static WebElement auto_loan_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'/static/media/home_loan.179b1783.svg')]")
    public static WebElement home_loan_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Home Loan')]")
    public static WebElement home_loan_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'/static/media/personal_loan_propose.d5452086.svg')]")
    public static WebElement personal_loan_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Personal Loan')]")
    public static WebElement personal_loan_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'/static/media/Cards.427a89f0.svg')]")
    public static WebElement cards_icon;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Cards & Wallet')]")
    public static WebElement cards_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'/static/media/credit_card.4540bef7.svg')]")
    public static WebElement credit_card_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Credit Card')]")
    public static WebElement credit_card_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'/static/media/fuel_card.670ff35e.svg')]")
    public static WebElement fuel_card_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Fuel Card')]")
    public static WebElement fuel_card_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'/static/media/prepaid_card.c1eab14a.svg')]")
    public static WebElement prepaid_card_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Prepaid Card')]")
    public static WebElement prepaid_card_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'/static/media/common_card_wip.7119f6cb.svg')]")
    public static WebElement smart_card_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Smart Card')]")
    public static WebElement smart_card_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'/static/media/common_card_propose.7618fbf1.svg')]")
    public static WebElement international_card_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'International Credit Card')]")
    public static WebElement international_card_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'/static/media/travel_card_propose.c08152f8.svg')]")
    public static WebElement travel_card_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Travel Card')]")
    public static WebElement travel_card_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'/static/media/others.aa9a6389.svg')]")
    public static WebElement others_icon;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Others')]")
    public static WebElement others_heading;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'/static/media/cheque_book.a0fb49fd.svg')]")
    public static WebElement cheque_book_icon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Cheque Book')]")
    public static WebElement cheque_book_heading;

    @FindBy(how = How.XPATH, using = "//div[@class='_2cTCmnxj5gU1JCpbN-KO6R'][1]//span[contains(text(),'₹')]")
    public static List<WebElement> deposit_amounts;

    @FindBy(how = How.CSS, using = "div[class='gy2-S5J2MMx_FOwip4xHw depositHover']")
    public static WebElement total_deposit;

    @FindBy(how = How.XPATH, using = "//div[@class='_2cTCmnxj5gU1JCpbN-KO6R'][2]//span[contains(text(),'₹')]")
    public static List<WebElement> investment_amounts;

    @FindBy(how = How.CSS, using = "div[class='gy2-S5J2MMx_FOwip4xHw investmentHover']")
    public static WebElement total_investment;

    @FindBy(how = How.XPATH, using = "//div[@class='_2cTCmnxj5gU1JCpbN-KO6R'][3]//span[contains(text(),'₹')]")
    public static List<WebElement> loan_amounts;

    @FindBy(how = How.CSS, using = "div[class='gy2-S5J2MMx_FOwip4xHw loanHover']")
    public static WebElement total_loan;

    @FindBy(how = How.XPATH, using = "//div[@class='_2cTCmnxj5gU1JCpbN-KO6R'][4]//span[contains(text(),'₹')]")
    public static List<WebElement> card_amounts;

    @FindBy(how = How.CSS, using = "div[class='gy2-S5J2MMx_FOwip4xHw cardHover']")
    public static WebElement total_card_amount;

}
