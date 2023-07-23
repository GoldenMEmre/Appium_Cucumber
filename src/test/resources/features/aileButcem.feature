
Feature: AILE BUTCEM

  Background: Kullanici giris icin gerekli kurulumlari yapar
    * Kullanici driver kurulumlari yapar
    * ilk ekran ayarlarini yapin ve ardindan login sayfasina ulasin
    * "mail" ve "password" bilgilerini girerek kullanici bilgileriyle giris yapin
    * uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin

  Scenario: Verilen gorevler yerine getirilerek kullanicinin gorevleri tamamlanir
    * sol kisimdaki menuden "Hesabım" bolumune gidin
    * hesabim sayfasindaki bilgileri degistirerek 600 "isim" "soyisim" "sehir" 428 1230 "Erkek" "yas" "meslek" "Kaydet" degisikleri kaydedin
    * ardindan degisiklerin yapildigini "isim" "soyisim" "sehir" "yas" "meslek" dogrulayin
    * Kullanici uygulamayi kapatir

  Scenario: Verilen gorevler belirtilen sekilde gerceklestirilir

    * anasayfadaki arti butonuna tiklayin
    * gelir ekle bolumune tiklayin
    * aciklama,gelir tip, kategori, tarih ve tutari belirleyin ve kaydedin
    * basariyla eklendigini dogrulayin
    * Kullanici uygulamayi kapatir