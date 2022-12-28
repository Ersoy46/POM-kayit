//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class TestBaseRapor {
    protected static ExtentReports extentReports; // extent report ' a ilk atamayı yapar
    protected static ExtentTest extentTest;  //test pass veya failed  gibi bilgileri kaydeder.
    protected static ExtentHtmlReporter extentHtmlReporter; //HTML raporu düzenler.

    public TestBaseRapor() {
    }

    @BeforeTest(
            alwaysRun = true   // her zaman çalıştır demek
    )
    public void setUpTest() {
        extentReports = new ExtentReports();   // raporlaöayı başlatır
        //raporlamayı nereye eklemek istiyorsak buraya yazıyoruz
        String date=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String filePath = System.getProperty("user.dir") + "/test-output/Rapor"+date+".html";
        extentHtmlReporter = new ExtentHtmlReporter(filePath);

        extentReports.attachReporter(extentHtmlReporter);

        extentReports.setSystemInfo("Enviroment", "QA");
        extentReports.setSystemInfo("Browser", ConfigReader.getProperty("browser"));
        extentReports.setSystemInfo("Automation Engineer", "Ertuğrul");
        extentHtmlReporter.config().setDocumentTitle("SON TEST");
        extentHtmlReporter.config().setReportName("BU RAPOR ÇOK GÜZELMİŞ");
    }

    @AfterMethod(
            alwaysRun = true
    )
    public void tearDownMethod(ITestResult result) throws IOException {
        if (result.getStatus() == 2) {
            String screenshotLocation = ResuableMethodlar.getScreenshot(result.getName());
            extentTest.fail(result.getName());
            extentTest.addScreenCaptureFromPath(screenshotLocation);
            extentTest.fail(result.getThrowable());
        } else if (result.getStatus() == 3) {
            extentTest.skip("Test Case is skipped: " + result.getName());
        }

        Driver.closeDriver();
    }

    @AfterTest(
            alwaysRun = true
    )
    public void tearDownTest() {
        extentReports.flush();
    }
}
