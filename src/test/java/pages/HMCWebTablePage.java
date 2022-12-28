package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HMCWebTablePage {
    public HMCWebTablePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//thead//tr[1]//th")
    public List<WebElement> HeaderBirinciSatırDatalar;

    @FindBy(xpath = "//tbody")
    public WebElement tumBodyWebElemnt;

    @FindBy(xpath = "//tboyd//tr")
    public List<WebElement> satirlarListesi;

    public WebElement satirYazdir(int satirNo) {
        String satirDinamikXpath = "//tboyd//tr[" + satirNo + "]";

        WebElement satirElement = Driver.getDriver().findElement(By.xpath(satirDinamikXpath));

        return satirElement;
    }

    public String hücreWebElementGetir(int satir, int sütun) {

        String dinamikHücreXpath = "//tbody//tr[" + satir + "]//td[" + sütun + "]";
        WebElement istenenHücreElementi = Driver.getDriver().findElement(By.xpath(dinamikHücreXpath));
        String hücreDatasi = istenenHücreElementi.getText();

        return hücreDatasi;
    }

    public void sütunYazdir(int sütun) {

        int satirSayisi = satirlarListesi.size();

        int i;
        for (i = 1; i < satirSayisi; i++) ;

        System.out.println(hücreWebElementGetir(i, sütun));
        
    }

}
