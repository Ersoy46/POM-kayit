package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

import javax.xml.xpath.XPath;
import java.util.List;

public class HotelMyCampPage {
 public   HotelMyCampPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@id='details-button']")
    public WebElement spamGelişmişTuşu;

 @FindBy(xpath = "//a[@id='proceed-link']")
    public WebElement spamYenidenDeneSekmesi;

 @FindBy(xpath = "//a[text()='Log in']")
    public WebElement ilkLoginTuşu;

 @FindBy(xpath = "//input[@id='UserName']")
    public WebElement usernameBox;

 @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordBox;

 @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement loginButonu;

 @FindBy(xpath = "//div[@class='validation-summary-errors']")
    public WebElement girişYapılamadıElementi;

 @FindBy(xpath = "//span[@class='caption-subject font-green-sharp bold uppercase']")
    public WebElement başarılıGirişYazisi;

 @FindBy(xpath = "//span[text()='Hotel Management']")
 public WebElement hotelManagementLinki;

 @FindBy (xpath = "//a[@href=\"/admin/HotelAdmin\"]")
 public WebElement hotelList;

 @FindBy(xpath = "//a[@class='btn btn-circle btn-default']")
 public WebElement addEelmentLinki;

 @FindBy(xpath = "//input[@id='Code']")
 public WebElement addHotelCodeKutusu;

 @FindBy(xpath = "//select[@id='IDGroup']")
 public WebElement addHotelDropDown;

 @FindBy (xpath = "//button[@id='btnSubmit']")
 public WebElement addHotelSaveButonu;

 @FindBy(xpath = "//div[text()='Hotel was inserted successfully']")
 public WebElement addHotelBaşarılıGirişYazisi;









public void girisYap(){
    Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
    spamGelişmişTuşu.click();
    spamYenidenDeneSekmesi.click();
    ilkLoginTuşu.click();
    usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
    passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPasword"));
    loginButonu.click();
}

}
