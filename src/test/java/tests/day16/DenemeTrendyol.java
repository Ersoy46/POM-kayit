package tests.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.Driver;

import java.time.Duration;

public class DenemeTrendyol {

    WebDriver driver;
    @Test
    public void test(){
        Driver.getDriver().get("https://www.trendyol.com");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();




      //  Actions actions=new Actions(driver);
      driver.findElement(By.xpath("  //button[@id='onetrust-accept-btn-handler']")).click();
        WebElement aramaTusu= driver.findElement(By.xpath("//input[@class='vQI670rJ']"));
        aramaTusu.click();
        aramaTusu.click();

        aramaTusu.sendKeys("telefon" + Keys.ENTER);

    }
}
