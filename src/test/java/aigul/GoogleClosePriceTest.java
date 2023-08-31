package aigul;

import aigul.pages.GoogleFinance;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleClosePriceTest extends BaseChromeTest {

    GoogleFinance page;

    @BeforeMethod
    public void setupMethod() {
        page = new GoogleFinance(getDriver());
    }

    @Test
    public void getPreviousClosingPrice() {
        double previousClosingPrice = page.fetchGoogleClosingPrice();
        System.out.println("previous closing price: " + "$" + previousClosingPrice);
    }
}
