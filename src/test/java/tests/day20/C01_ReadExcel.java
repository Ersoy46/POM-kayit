package tests.day20;

import org.apache.poi.ss.usermodel.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ReadExcel {

    @Test
    public void test01() throws IOException {
        String path = "src/test/java/resources/ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(path);

        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheet("sayfa1");
        Row row = sheet.getRow(4);
        Cell cell = row.getCell(2);
        System.out.println(cell);


        //biz FİS ile okudugumuz excel dosyasını projemiz içerisinde kullanabilmek için
        //apachi POİ dependency yardımıyla bir workbook oluşturduk.
        //Bu workbook bizim projemizin içerisinde Ülkeler excelinin bir koyasını kullanmamızı saglıyor.
        //Excel'in yapısı geregi bir hücrete(cell) ulaşabilmek için workbokkdan başlarayak sırası ile
        //  1-sheet
        //2- Row
        //3- cell
        //objeleri oluşturmamız gerekiyor.

        String expectedData="Andorra";
        Assert.assertEquals(cell.getStringCellValue(),expectedData);

        //5. indexteki satırın, 3.indexteki hücre bilgisini yazdırılaım
        row=sheet.getRow(5);
        cell=row.getCell(3);

        System.out.println(cell);
    }
}