package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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



}
