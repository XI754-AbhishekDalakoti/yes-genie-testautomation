package helper;

import org.openqa.selenium.WebElement;

import java.math.BigDecimal;
import java.util.List;

public class Helper {

    public double getTotalAmountAfterReplacingInList(List<WebElement> webElementList){
        double sum = 0.0d;
        double roundOff=0.0d;
        for(WebElement element : webElementList) {
            String price = element.getText();
            String[] parts = price.split(" ");
            String amount = parts[1].replaceAll("[, ;]", "");
            sum = sum + Double.parseDouble(amount);
            roundOff = Math.round(sum * 100.0) / 100.0;
        }
        return roundOff;
    }

    public double getAmountAfterReplacing(WebElement webElement){
        String price2 = webElement.getText();
        String[] parts2 = price2.split(" ");
        String amount2 = parts2[1].replaceAll("[, ;]", "");
        double actualsum = Double.parseDouble(amount2);
        return actualsum;
    }
}
