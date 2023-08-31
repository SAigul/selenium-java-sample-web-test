package aigul;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

public class BaseChromeTest extends BaseTest {

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.verboseLogging", "true");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-network-throttling");
        options.addArguments("--disable-extensions");
        driver = new ChromeDriver(options);
    }
}