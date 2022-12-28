package tests.day16;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C03_FacebookLogin {

    //https://www.facebook.com sayfasına gidiniz
    //POM'A UYGUN OLARAL EMAİL, ŞİFRE KUTULARINI VE GİRİŞ YAP  BUTONUNU LOCATE EDİN
    //FAKER CLASS'INI KULLANIP EMAİL VE ŞİFRE YAZDIRIP, g,r,ş butonuna basın
    //başarılı giriş yapılamadıgı test edin

    @Test(groups = {"miniRegression", "Regression"})
    public void test01() throws InterruptedException {
        Driver.getDriver().get("https://www.facebook.com");
        FacebookPage facebookPage=new FacebookPage();

        Faker faker=new Faker();

        facebookPage.facebookEmailKutusu.sendKeys(faker.internet().emailAddress());
        facebookPage.facebookPasswordKutusu.sendKeys(faker.internet().password());
        facebookPage.facebookLoginKutusu.click();


        Assert.assertTrue(facebookPage.facebookBaşarısızGiriş.isDisplayed());


        Thread.sleep(3000);

        Driver.closeDriver();

    }
}
