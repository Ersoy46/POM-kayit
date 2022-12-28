package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeLoginTesti {

    // 1) smokeTest  paketi altinda yeni bir Class olustur: NegativeTest
    //3 Farkli test Methodunda 3 senaryoyu test et
    //				- yanlisSifre
    //				- yanlisKulllanici
    //				- yanlisSifreKullanici
    //test data yanlis username: manager1 , yanlis password : manager1!
    //2) https://qa-environment.concorthotel.com/ adresine git
    //3) Login butonuna bas
    //4) Verilen senaryolar ile giris yapilamadigini test et

    HotelMyCampPage hotelMyCampPage;

    @Test
    public void yanlısSifreTesti() {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.ilkLoginTuşu.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPasword"));
        hotelMyCampPage.loginButonu.click();
        Assert.assertTrue(hotelMyCampPage.girişYapılamadıElementi.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void yanlısUsernameTesti() {
        Driver.getDriver().get("HMCUrl");
        hotelMyCampPage.ilkLoginTuşu.click();
        hotelMyCampPage.usernameBox.sendKeys("HMCWrongUsername");
        hotelMyCampPage.passwordBox.sendKeys("HMCValidPasword");
        hotelMyCampPage.loginButonu.click();
        Assert.assertTrue(hotelMyCampPage.girişYapılamadıElementi.isDisplayed());
        Driver.closeDriver();

    }

    @Test
    public void yanlısSifreUsernameTesti() {
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();
        Assert.assertTrue(hotelMyCampPage.girişYapılamadıElementi.isDisplayed());
        Driver.closeDriver();

    }
}
