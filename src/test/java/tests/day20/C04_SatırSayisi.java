package tests.day20;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class C04_SatırSayisi {

    @Test
    public void test01() throws IOException {

        //ülkeler excel'indeki sayfa1 ve sayfa2'deki satır sayilarini ve kullanılan satir sayılarını bulun

        String path="src/test/java/resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fis);

        int sayfa1SatirSayisi=workbook.getSheet("Sayfa1").getLastRowNum();
        int sayfa1FizikiKullanılanSatirSayisi=workbook.getSheet("Sayfa1").getPhysicalNumberOfRows();
        System.out.println("1.sayfa satir sayisi : " + sayfa1SatirSayisi);
        System.out.println("1. sayfa fiziki kullanılan: " + sayfa1FizikiKullanılanSatirSayisi);
    }
}
