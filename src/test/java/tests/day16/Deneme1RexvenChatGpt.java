import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Deneme1RexvenChatGpt {

    private WebDriver driver;
    private String baseUrl = "https://www.google.com/";

    @BeforeTest
    public void setUp() {
        // Set the ChromeDriver path
      //  System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        System.setProperty("webDriver.chrome.driver","src/driver/chromedriver.exe");

        // Create a new ChromeDriver instance
        driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();
    }

    @Test
    public void testGoogleTitle() {
        // Navigate to Google search page
        driver.get(baseUrl);

        // Get the page title
        String pageTitle = driver.getTitle();

        // Assert that the page title is "Google"
        Assert.assertEquals(pageTitle, "Google");
    }

    @AfterTest
    public void tearDown() {
        // Close the browser window
        driver.quit();
    }
}
