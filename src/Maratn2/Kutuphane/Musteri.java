package Maratn2.Kutuphane;


    import java.util.UUID;

    public class Musteri extends Kisi {

        private String id;

        @Override
        public String toString() {
            return "Musteri [id=" + id + ", getIsim()=" + getAd() + ", getSoyIsim()=" + getSoyAd() + "]";
        }

        public Musteri(String isim, String soyIsim) {
            super(isim, soyIsim);
            this.id = UUID.randomUUID().toString();
        }

        public String getId() {
            return id;
        }

    }
