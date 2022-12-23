package tests.day17;

import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C01_HotelMyCampNegativeLogin {

    //https://hotelmycamp.com adresine gidiniz
    //login butonuna basınız
    //test date username:manager1,
    //test data pasword :manager1!
    //Degerleri girildiginde sayfaya girilemedigini test et
@Test
    public void test01(){
    Driver.getDriver().get("https://hotelmycamp.com");
    HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
    hotelMyCampPage.ilkLoginTuşu.click();
    hotelMyCampPage.usernameBox.sendKeys("manager");
    hotelMyCampPage.passwordBox.sendKeys("manager1!");
    hotelMyCampPage.loginButonu.click();
}
}
