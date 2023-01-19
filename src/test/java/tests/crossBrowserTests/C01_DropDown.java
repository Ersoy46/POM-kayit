package tests.crossBrowserTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.TestBaseCross;

import java.sql.SQLOutput;
import java.util.List;

public class C01_DropDown extends TestBaseCross {

    @Test
    public void dropdownTesti() throws InterruptedException {
        driver.get("https://www.amazon.com");
        WebElement dropdownElementi = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

        Select select = new Select(dropdownElementi);

        select.selectByIndex(3);

        System.out.println(select.getFirstSelectedOption().getText());
        Thread.sleep(3000);

        select.selectByValue("search-alias=arts-crafts-intl-ship");
        List<WebElement> optionsList = select.getOptions();

        for (WebElement each : optionsList
        ) {
            System.out.println(each.getText());
        }
    }

}
