package tests.day21;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ResuableMethodlar;

import java.io.IOException;
import java.util.Set;

public class C01_WindowHandleResuableMethod {
    @Test
    public void test01(){
        //https://the-internet.herokuapp.com/windows adresine gidelim
        //click here butonuna basalım
        //new tab'a geçip title'nin "new tab" oldugunu test edin

        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");

        String ilksayfawindowhandle=Driver.getDriver().getWindowHandle();

        Driver.getDriver().findElement(By.xpath("//a[@href=\"/windows/new\"]")).click();

        Set<String>tumHandleSet=Driver.getDriver().getWindowHandles();
        String ikinciSayfaHandle ="";

        for (String each:tumHandleSet
             ) {
            if (!each.equals(ilksayfawindowhandle)){;
            ikinciSayfaHandle=each;


        }
    }
    Driver.getDriver().switchTo().window(ikinciSayfaHandle);
        String expectedTitle="New Window";
                String actualTitle=Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

        Driver.closeDriver();
    }
        @Test
          public void windowResuableMETHODtEST() throws IOException {
            Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
            Driver.getDriver().findElement(By.xpath("//a[@href=\"/windows/new\"]")).click();
        ResuableMethodlar.switchToWindow("New Window");


            String expectedTitle="New Window";
            String actualTitle=Driver.getDriver().getTitle();

            ResuableMethodlar.getScreenshot("Window Switch");

            Assert.assertEquals(actualTitle,expectedTitle);
}
}