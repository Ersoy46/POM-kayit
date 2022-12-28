package pages;

import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DemoqaPage {

    public DemoqaPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='rt-tr']")
    public WebElement baslıkSatiriElementi;

    @FindBy(xpath = "//div[@class='rt-th rt-resizable-header -cursor-pointer']")
    public WebElement baslıklarWebElementListesi;

    @FindBy(xpath = "//div[@class='rt-tbody']")
    public WebElement bodyTekWebElement;

    @FindBy(xpath = "//div[@class='rt-td']")
    public List<WebElement> tumDataWebElementList;

    @FindBy(xpath = "//div[@class='rt-tr-group']")
    public List<WebElement> tumSatirlarWebElementList;

    public void sütunYazdir(int sütun) {

        int satirSayisi = tumSatirlarWebElementList.size();
        WebElement geciciElement;
        String dinamikXpath;

        //   System.out.println(baslıklarWebElementListesi.get(sütun-1).getText());

        for (int i = 1; i <= satirSayisi; i++) {

            dinamikXpath = "((//div[@class='rt-tr-group'])[" + i + "]//div[@class='rt-td'])[" + sütun + "]";
            geciciElement = Driver.getDriver().findElement(By.xpath(dinamikXpath));
            System.out.println(geciciElement.getText());

        }
    }

    public void ismeGöreMaasYazdir(String isim) {

        int satirSayisi = tumSatirlarWebElementList.size();
        String dinamikXpath;
        String satirdakiİsim;
        String salary;

        for (int i = 0; i < satirSayisi; i++) {
            dinamikXpath = "((//div[@class='rt-tr-group'])[" + i + "]//div[@class='rt-td'])[" + 1 + "]";
            satirdakiİsim = Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText();
            dinamikXpath = "((//div[@class='rt-tr-group'])[" + i + "]//div[@class='rt-td'])[" + 5 + "]";
            salary = Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText();

            if (satirdakiİsim.equals(isim)) {
                System.out.println(salary);

            }
        }
    }

    public void hücreYazdir(int satir, int sütun) {
        String dinamikXpath = "((//div[@class='rt-tr-group'])[" + satir + "]//div[@class='rt-td'])[" + sütun + "]";
        System.out.println(Driver.getDriver().findElement(By.xpath("dinamikXpath")).getText());
    }
}
