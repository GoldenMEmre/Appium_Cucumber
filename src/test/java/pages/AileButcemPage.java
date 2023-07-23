package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;
import java.util.logging.XMLFormatter;

public class AileButcemPage {

    public AileButcemPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)),this);
    }

    @FindBy(xpath = "//*[@text='Giriş Yap']")
    public MobileElement girisYapButonu;

    @FindBy(xpath = "//*[@text='E-mail Adresi']")
    public MobileElement emailBox;

    @FindBy(xpath = "//*[@text='Şifre']")
    public MobileElement passwordBox;

    @FindBy(xpath = "//*[@text='Başarıyla giriş yapıldı.']")
    public MobileElement basariliGirisText;

    @FindBy(xpath = "(//*[@index='0'])[17]")
    public MobileElement nameBox;

    @FindBy(xpath = "(//*[@index='1'])[5]")
    public MobileElement surnameBox;

    @FindBy(xpath = "(//*[@index='2'])[2]")
    public MobileElement cityBox;

    @FindBy(xpath = "//*[@index='4']")
    public MobileElement ageBox;

    @FindBy(xpath = "//*[@index='5']")
    public MobileElement jobBox;

    @FindBy(xpath = "//*[@text='Gelir Ekle']")
    public MobileElement gelirEkle;

    @FindBy(xpath = "//*[@text='Açıklama']")
    public MobileElement aciklama;

    @FindBy(xpath = "//*[@text='Gelir Tipi']")
    public MobileElement gelirTipi;

    @FindBy(xpath = "//*[@text='Düzenli']")
    public MobileElement duzenli;

    @FindBy(xpath = "//*[@text='Kategori']")
    public MobileElement kategori;

    @FindBy(xpath = "//*[@index='6']")
    public MobileElement tarihSec;

    @FindBy(xpath = "//*[@text='30']")
    public MobileElement tarih;

    @FindBy(xpath = "//*[@text='OK']")
    public MobileElement okButonu;




}
