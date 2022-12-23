package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
    public WebElement facebookGirisYapSekmesiSekmesi;

    @FindBy(name = "email")
    public WebElement facebookEmailKutusu;

    @FindBy(id = "pass")
    public WebElement facebookPasswordKutusu;

    @FindBy(name = "login")
    public WebElement facebookLoginKutusu;

    @FindBy(xpath = "//div[@class='_9ay7']")
    public WebElement facebookBaşarısızGiriş;


}
