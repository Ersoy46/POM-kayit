package tests.day18;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;

import java.util.List;

public class C02_WebTables {
    //Bir class oluşturun : C02_WebTables
    //● login() metodun oluşturun ve oturum açın.
    //● https://www.concorthotel.com//admin/HotelRoomAdmin adresine gidin
    //			○ Username : manager
    //			○ Password : Manager1!


    //● table() metodu oluşturun
    //			○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
    //			○ Table’daki tum body’i ve başlıkları(headers) konsolda yazdırın.


    // Eger tum tablo body'sini hucrelere ayirmadan tek bir String olarak gormek istersek
    // tum body'i tek bir Webelement olarak locate edebiliriz
    // Bu yklasim, tabloda HAPPY HOTEL var mi gibi sorular icin ideal bir cozum olur

    //● printRows() metodu oluşturun //tr
    //			○ table body’sinde bulunan toplam satir(row) sayısını bulun.

    //			○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.

    // eger tum satirlari yazdirmak istersek

    //			○ 4.satirdaki(row) elementleri konsolda yazdırın.

    HotelMyCampPage hotelMyCampPage;

    @Test
    public void loginT() {
        hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.girisYap();

    }

    @Test
    public void table() {
        HMCWebTablePage hmcWebTablePage = new HMCWebTablePage();
        List<WebElement> headerDataList = hmcWebTablePage.HeaderBirinciSatırDatalar;
        System.out.println("headar daki datalar:" + headerDataList.size());

        System.out.println(hmcWebTablePage.tumBodyWebElemnt.getText());


    }

    @Test
    public void printRows() {

    }

}
