package tests.day16;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C04_HotelMyCampPositiveLogin {


    @Test(groups = {"miniRegression", "smoke"})
    public void test01() {

        //bir test method oluştur positivetestlogin
        //https://hotelmycamp.com adresine gidin
        //	login butonuna bas
        //	test data username: manager ,
        //	test data password : Manager1!
        //	Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

    //    Driver.getDriver().get("https://hotelmycamp.com");
    //    HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
    //    hotelMyCampPage.spamGelişmişTuşu.click();
    //    Actions actions=new Actions(Driver.getDriver());
    //    actions.sendKeys(Keys.PAGE_DOWN).perform();
    //  hotelMyCampPage.spamYenidenDeneSekmesi.click();
    //    hotelMyCampPage.ilkLoginTuşu.click();

        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();
    }
}
