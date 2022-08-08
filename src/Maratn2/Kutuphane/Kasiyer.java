package Maratn2.Kutuphane;
import java.util.UUID;

public class Kasiyer extends Kisi {
    private String id;

    @Override
    public String toString() {
        return "Kasiyer [id=" + id + ", getAd()=" + getAd() + ", getSoyAd()=" + getSoyAd() + "]";
    }

    public Kasiyer(String Ad, String soyAd) {
        super(Ad, soyAd);
        this.id = UUID.randomUUID().toString();
    }

}