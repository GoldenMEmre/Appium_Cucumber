package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.AileButcemPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class aileButcem {
    AndroidDriver<AndroidElement> driver=Driver.getAndroidDriver();
    TouchAction touchAction=new TouchAction<>(driver);
    AileButcemPage aileButcemPage=new AileButcemPage();


    @Given("Kullanici driver kurulumlari yapar")
    public void kullanici_driver_kurulumlari_yapar() {
        Driver.getAndroidDriver();
    }
    @Given("ilk ekran ayarlarini yapin ve ardindan login sayfasina ulasin")
    public void ilk_ekran_ayarlarini_yapin_ve_ardindan_login_sayfasina_ulasin() throws InterruptedException {
// 905,983 press move 100,983
        Thread.sleep(2000);
        for (int i=0; i<6; i++){
            ReusableMethods.ekranSagKaydirma(905,983,500,100,983,600);
        }

        aileButcemPage.girisYapButonu.click();
    }
    @Given("{string} ve {string} bilgilerini girerek kullanici bilgileriyle giris yapin")
    public void mail_ve_password_bilgilerini_girerek_kullanici_bilgileriyle_giris_yapin(String mail,String password) {
        aileButcemPage.emailBox.sendKeys(ConfigReader.getProperty(mail));
        aileButcemPage.passwordBox.sendKeys(ConfigReader.getProperty(password));
        aileButcemPage.girisYapButonu.click();
    }
    @Given("uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin")
    public void uygulamaya_kullanici_bilgileriyle_giris_yapildigini_dogrulayin() {
        Assert.assertTrue(aileButcemPage.basariliGirisText.isDisplayed());
    }
    @Given("sol kisimdaki menuden {string} bolumune gidin")
    public void sol_kisimdaki_menuden_hesabim_bolumune_gidin(String hesabim) throws InterruptedException {
        // 110,135
        Thread.sleep(4000);
        ReusableMethods.koordinatTiklama(100,135,1000);
        ReusableMethods.scrollWithUiScrollable(hesabim);
    }

    @Given("hesabim sayfasindaki bilgileri degistirerek {int} {string} {string} {string} {int} {int} {string} {string} {string} {string} degisikleri kaydedin")
    public void hesabim_sayfasindaki_bilgileri_degistirerek_degisikleri_kaydedin(Integer bekleme, String name, String surname, String city, Integer xKoordinat, Integer yKoordinat, String kadin, String yas, String meslek, String kaydet) throws InterruptedException {
        Thread.sleep(bekleme);
        aileButcemPage.nameBox.clear();
        aileButcemPage.surnameBox.clear();
        aileButcemPage.cityBox.clear();
        aileButcemPage.ageBox.clear();
        aileButcemPage.jobBox.clear();

        aileButcemPage.nameBox.sendKeys(ConfigReader.getProperty(name));
        aileButcemPage.surnameBox.sendKeys(ConfigReader.getProperty(surname));
        aileButcemPage.cityBox.sendKeys(ConfigReader.getProperty(city));
        //428,1230
        ReusableMethods.koordinatTiklama(xKoordinat,yKoordinat,bekleme);
        ReusableMethods.scrollWithUiScrollable(kadin);
        aileButcemPage.ageBox.sendKeys(ConfigReader.getProperty(yas));
        aileButcemPage.jobBox.sendKeys(ConfigReader.getProperty(meslek));
        ReusableMethods.scrollWithUiScrollable(kaydet);


    }

    @Given("ardindan degisiklerin yapildigini {string} {string} {string} {string} {string} dogrulayin")
    public void ardindan_degisiklerin_yapildigini_dogrulayin(String isim, String soyisim, String sehir, String yas, String meslek) {
        Assert.assertTrue(aileButcemPage.nameBox.getText().contains(ConfigReader.getProperty(isim)));
        Assert.assertTrue(aileButcemPage.surnameBox.getText().contains(ConfigReader.getProperty(soyisim)));
        Assert.assertTrue(aileButcemPage.cityBox.getText().contains(ConfigReader.getProperty(sehir)));
        Assert.assertTrue(aileButcemPage.ageBox.getText().contains(ConfigReader.getProperty(yas)));
        Assert.assertTrue(aileButcemPage.jobBox.getText().contains(ConfigReader.getProperty(meslek)));
    }
    @Given("Kullanici uygulamayi kapatir")
    public void kullanici_uygulamayi_kapatir() {
        Driver.quitAppiumDriver();
    }


    @Given("anasayfadaki arti butonuna tiklayin")
    public void anasayfadaki_arti_butonuna_tiklayin() throws InterruptedException {
        //534, 1671
    ReusableMethods.koordinatTiklama(534,1671,1000);
    ReusableMethods.scrollWithUiScrollable("Gelir Ekle");


    }
    @Given("gelir ekle bolumune tiklayin")
    public void gelir_ekle_bolumune_tiklayin() {
        aileButcemPage.gelirEkle.click();

    }
    @Given("aciklama,gelir tip, kategori, tarih ve tutari belirleyin ve kaydedin")
    public void aciklama_gelir_tip_kategori_tarih_ve_tutari_belirleyin_ve_kaydedin() {
        aileButcemPage.aciklama.click();
        aileButcemPage.gelirTipi.click();
        aileButcemPage.kategori.click();
        aileButcemPage.tarihSec.click();
        aileButcemPage.tarih.click();
        aileButcemPage.okButonu.click();


    }
    @Given("basariyla eklendigini dogrulayin")
    public void basariyla_eklendigini_dogrulayin() {

    }


}
