package tests.day17;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_PropertiesIlkClass {


    //https://hotelmycamp.com adresine gidiniz
    //login butonuna basınız
    //test date username:manager1,
    //test data pasword :manager1!
    //Degerleri girildiginde sayfaya başarılı şekilde girilebildigini test et

    @Test
    public void pozitifeLoginTesti(){

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkLoginTuşu.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValiUsername"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidpasword"));
        hotelMyCampPage.loginButonu.click();
        Assert.assertTrue(hotelMyCampPage.başarılıGirişYazisi.isDisplayed());

    }
}
