package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PositiveLoginTesti {

    //bir test method oluşturun : PozitifLoginTesti
    // https://www.hotelmycamp.com sayfaasına git
    //login tuşuna bas
    //test data username:manager
    //test data pasword:manager1!
    //Degerleri girildiginde sayfaya başarılı şekilde girilebildigini test et

    @Test
    public void positiveLoginTest(){
     HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
     hotelMyCampPage.girisYap();
        Assert.assertTrue(hotelMyCampPage.başarılıGirişYazisi.isDisplayed());

        Driver.closeDriver();



    }
}
