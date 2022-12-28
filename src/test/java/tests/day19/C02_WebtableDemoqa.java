package tests.day19;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_WebtableDemoqa {


    //https://demoqa.com/webtables sayfasina gidin.
//Headers da bulunan department isimlerini yazdirin
//3.sütünun başlıgını yazdırın
//tablodaki tüm dataları yazdirin
//tablodaki kac cell(data) oldugunu yazdırın
//tablodaki satir sayisini yazdirin
//tablodaki sütun sayisini yazdirin
//tablodaki3.kolonu yazdirin
//Tabloda "First Name" Kierra olan kişinin Salary'sini yazdirin
//Page sayfasında bir method oluşturun,
// Test sayfasinin satir ve sütüun sayisini girdigimde bana datayi yazdırsın

    @Test(groups = {"smoke", "regression"})
    public void demoqaTest() {
        Driver.getDriver().get(ConfigReader.getProperty("DemoqaUrl"));


    }
}
