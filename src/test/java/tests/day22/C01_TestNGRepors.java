package tests.day22;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ResuableMethodlar;
import utilities.TestBaseRapor;

import java.io.IOException;

public class C01_TestNGRepors extends TestBaseRapor {

    @Test
    public void windowResuableMETHODtEST() throws IOException {

        extentTest = extentReports.createTest("window Handle", "title ile 2.sayfaya geçildigi test edildi");
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        extentTest.info("herokuapp sayfasına gidildi");
        Driver.getDriver().findElement(By.xpath("//a[@href=\"/windows/new\"]")).click();
        extentTest.info("yeni window linkine tıklanıldı");

        ResuableMethodlar.switchToWindow("New Window");
        extentTest.info("resuable method kullanarak açılan 2.sayfaya geçildi");


        String expectedTitle = "New Window";
        String actualTitle = Driver.getDriver().getTitle();
        extentTest.pass("titlenin beklenen degeriyle aynı oldugu test edildi");
        ResuableMethodlar.getScreenshot("Window Switch");

        Assert.assertEquals(actualTitle, expectedTitle);

    }
}
