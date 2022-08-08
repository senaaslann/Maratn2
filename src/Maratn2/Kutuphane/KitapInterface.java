package Maratn2.Kutuphane;

public interface KitapInterface {
    public void kiralamaYap(Kitap kitap, Musteri musteri);

    public void isimleKitapAra(String isim);

    public void isimleMusteriAra(String isim);

    public void kitaplariListele();

    void kisiTarafindankiralananmisKitaplar();

    void kiralayan(String id);

    void kiralanmiskitaplar(String id);
}

