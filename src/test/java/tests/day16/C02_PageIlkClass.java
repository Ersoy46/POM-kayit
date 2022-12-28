package tests.day16;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageIlkClass {

    //amazon sayfasına gidelim
    //arama kutusuna nutella yazıp aratalım
    //arama sonuclarının nutella içerdigini test edelim

    @Test
    public void test01(){
        Driver.getDriver().get("https://www.amazon.com");
        AmazonPage  amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        String actualSonucStr=amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(actualSonucStr.contains("Nutella"));
    }


@Test(groups = {"miniRegression", "smoke"})
    public void test02(){
    Driver.getDriver().get("https://www.amazon.com");
    AmazonPage  amazonPage=new AmazonPage();
    amazonPage.amazonAramaKutusu.sendKeys("Java"+Keys.ENTER);
    String actualsonucStr2=amazonPage.sonucYazisiElementi.getText();
    Assert.assertTrue(actualsonucStr2.contains("Java"));

}


}
