package Maratn2.Kutuphane;

public enum KitapTuru {
    FANTASTIK("Bilim Kurgu"), COCUK("Cocuk"), EDEBIYAT("Edebiyat");

    private String isim;

    private KitapTuru(String isim) {
        this.isim = isim;
    }
}
