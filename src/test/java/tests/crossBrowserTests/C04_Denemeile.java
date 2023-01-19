package tests.crossBrowserTests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseCross;


public class C04_Denemeile extends TestBaseCross {


    @Test
    public void test01() throws InterruptedException {
        String email = "tugrul123";
        String pawvordd = "erff";
        driver.get("https://facebook.com");
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

        WebElement isimKutusu = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]"));
        Actions actions = new Actions(driver);
        Faker faker = new Faker();

        actions.click(isimKutusu).sendKeys(faker.name().name())
                .sendKeys(Keys.TAB)

                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB).sendKeys(email).sendKeys(Keys.TAB).sendKeys(pawvordd)
                .sendKeys(Keys.TAB).sendKeys("JAN").sendKeys(Keys.TAB).sendKeys("15").sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys("2020").sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_RIGHT).perform();


        WebElement erkektest = driver.findElement(By.xpath("//input[@value='2']"));
        WebElement kadıntest = driver.findElement(By.xpath("//input[@value='1']"));

//tekrar et buraları **************
        Assert.assertTrue(erkektest.isSelected());
        Assert.assertFalse(kadıntest.isSelected());


        Thread.sleep(3000);

        driver.close();

    }
}
