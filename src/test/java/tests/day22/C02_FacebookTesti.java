package tests.day22;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;
import utilities.ResuableMethodlar;
import utilities.TestBaseRapor;

public class C02_FacebookTesti extends TestBaseRapor {
    @Test()
    public void test01(){
        extentTest=extentReports.createTest("facebook","fake isimle girilemedigi test edildi");

        Driver.getDriver().get("https://www.facebook.com");
        extentTest.info("facebook sayfasına gidildi");
        FacebookPage facebookPage=new FacebookPage();

        Faker faker=new Faker();

        facebookPage.facebookEmailKutusu.sendKeys(faker.internet().emailAddress());
        facebookPage.facebookPasswordKutusu.sendKeys(faker.internet().password());
        facebookPage.facebookLoginKutusu.click();
extentTest.info("ilgili alanlar faker ile dolduruldu");

        Assert.assertTrue(facebookPage.facebookBaşarısızGiriş.isDisplayed());
extentTest.pass("girilemedigi test edildi");





    }
}
