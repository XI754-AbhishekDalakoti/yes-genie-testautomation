package helper;

import org.openqa.selenium.WebElement;

import java.util.List;

public class Helper {

    public double getTotalAmountAfterReplacingInList(List<WebElement> webElementList){
        double sum = 0;
        for(int i=0;i < webElementList.size();i++) {
            String price = webElementList.get(i).getText();
            String[] parts = price.split("₹");
            String amount = parts[1].replaceAll("[, ;]", "");
            sum = sum + Double.parseDouble(amount);
        }
        return sum;
    }

    public double getAmountAfterReplacing(WebElement webElement){
        String price = webElement.getText();
        String[] parts = price.split("₹");
        String amount = parts[1].replaceAll("[, ;]", "");
        double actualsum = Double.parseDouble(amount);
        return actualsum;
    }
}
