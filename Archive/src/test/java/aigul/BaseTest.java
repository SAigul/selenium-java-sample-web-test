package aigul;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class BaseTest {
    protected WebDriver driver;

    public WebDriver getDriver() {
        return this.driver;
    }

    @AfterMethod
    public void tearDown() {
        quitDriver();
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}