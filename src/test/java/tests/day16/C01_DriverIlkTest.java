package tests.day16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverIlkTest {

    @Test
    public void test01(){
       Driver.getDriver().get("https://www.amazon.com");
       String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("Amazon"));
    }

    @Test
    public void test02(){
        Driver.getDriver().get("https://bestbuy.com");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("bestbuy"));
        Driver.closeDriver();
    }
}
