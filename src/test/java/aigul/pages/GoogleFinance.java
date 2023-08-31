package aigul.pages;

import aigul.WaitUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class GoogleFinance {
    private final static By INPUT_ELEMENT = By.xpath("(//input[@type='text'])[2]");
    private final static By PREV_CLOSE_ELEMENT = By.xpath("//div[contains(text(),\"Prev close\")]");

    private final static String URL = "https://www.google.com/finance";

    private final WebDriver driver;

    public GoogleFinance(WebDriver driver) {
        this.driver = driver;
    }

    public double fetchGoogleClosingPrice() {
        driver.get(URL);

        WebElement inputElement = driver.findElement(INPUT_ELEMENT);
        inputElement.sendKeys("GOOGLE");
        inputElement.sendKeys(Keys.ENTER);

        WebElement prevCloseElement = WaitUtil.getLocatedElement(driver, PREV_CLOSE_ELEMENT, Duration.ofSeconds(3));
        String previousClosingPrice = prevCloseElement.getText();
        String numericPart = previousClosingPrice.replaceAll("[^\\d.]", "");
        return Double.parseDouble(numericPart);
    }
}
