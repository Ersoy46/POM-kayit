package tests.day20;

import org.testng.annotations.Test;

public class C05_ExcelliMapYükleme {

    @Test
    public void test01(){

        //dosya yolu ve sayfa ismi verilen bir excel sheet'i
        //map olarak kaydeden resuable bir method oluşturalım

        String path="src/test/java/resources/ulkeler.xlsx";
        String sayfaAdi="Sayfa1";

        System.out.println(ReusableMethodsExcel.mapOlustur(path,sayfaAdi));


    }
}
