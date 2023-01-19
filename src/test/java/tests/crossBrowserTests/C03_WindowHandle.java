package tests.crossBrowserTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseCross;

import java.util.Set;

public class C03_WindowHandle extends TestBaseCross {

    @Test
    public void windowHandleTesti() {
        driver.get("https://the-internet.herokuapp.com/windows");
        WebElement sayfadakiYaziElementi= driver.findElement(By.xpath("//h3[.='Opening a new window']"));
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(sayfadakiYaziElementi.getText(), "Opening a new window");


        softAssert.assertEquals(driver.getTitle(), "The internet", "beklenenden farklı");


        String windowHandleDegeri1 = driver.getWindowHandle();
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();

        Set<String> handDegerleriSeti = driver.getWindowHandles();
        String windowHnadleDegeri2 ="";

        for (String each : handDegerleriSeti
        ) {
            if (!each.equals(windowHandleDegeri1))
                windowHnadleDegeri2 = each;

            WebElement ikinciSayfadakiYaziElementi = driver.findElement(By.tagName("h3"));

            softAssert.assertEquals(ikinciSayfadakiYaziElementi.getText(), "New Window", "yazı farklı");

            driver.switchTo().window(windowHandleDegeri1);
            softAssert.assertEquals(driver.getTitle(), "The Internet", "sayfadaki yazı farklı");



        }

    }
}

