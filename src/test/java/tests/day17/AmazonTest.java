import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.time.Duration;


public class AmazonTest {
    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        // set ChromeDriver path
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");


        // create ChromeDriver instance
        driver = new ChromeDriver();
    }

    @Test
    public void testAddProduct() {
        // navigate to Amazon.com
        driver.get("https://www.amazon.com/");

        // find search box and enter product name
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("iPhone 13 pro max 128 gb");
        searchBox.submit();

        // click search button
        WebElement searchButton = driver.findElement(By.xpath("//div[@class='s-result-list s-search-results sg-row']/div[@data-asin])[1"));
        searchButton.click();

        // click on first search result
        WebElement firstSearchResult = driver.findElement(By.xpath("(//div[@class='s-result-list s-search-results sg-row']/div[@data-asin])[1]"));
        firstSearchResult.click();

        // click on add to cart button
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button"));
        addToCartButton.click();

        // wait for cart count to update

     //   Duration waitTime = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement cartCount = driver.findElement(By.id("nav-cart-count"));
        wait.until(ExpectedConditions.textToBePresentInElement(cartCount, "1"));

        // check if product is added to cart
        String cartItemCount = cartCount.getText();
        assert cartItemCount.equals("1") : "Failed to add product to cart";
    }

    @AfterMethod
    public void cleanup() {
        // close the browser
      //  driver.quit();
    }
}