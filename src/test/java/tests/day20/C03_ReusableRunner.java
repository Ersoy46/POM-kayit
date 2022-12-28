package tests.day20;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C03_ReusableRunner {

    @Test
    public void test01(){

        //ülkeler excel'indeki sayfa 1 de 11. index'deki satırın.
        // 2. index'deki hücresisinin Azerbaycan oldugunu test edin
        String path="src/test/java/resources/ulkeler.xlsx";
        String expectedData="Azerbaycan";
    //    String actualData=ReusableMethods.hucreGetir(path,"Sayfa1",11,2).toString();
    //    Assert.assertEquals(actualData,expectedData);
    }
}
