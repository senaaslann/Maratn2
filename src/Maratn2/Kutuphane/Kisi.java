package Maratn2.Kutuphane;

public abstract class  Kisi {
    private String Ad;
    private String soyAd;

    @Override
    public String toString() {
        return "Kisi [Ad=" + Ad + ", soyAd=" + soyAd + "]";
    }

    public Kisi(String Ad, String soyAd) {
        this.Ad = Ad;
        this.soyAd = soyAd;
    }

    public String getAd() {
        return Ad;
    }

    public void setAd(String Ad) {
        this.Ad = Ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }
}
