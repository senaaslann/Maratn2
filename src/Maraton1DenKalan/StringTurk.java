package Maraton1DenKalan;

public class StringTurk {


    public class StringTurkc {
        String string;


        public String Karakterdegis(String eski, String yeni) {
            return string.replace(eski, yeni);
        }

        public int Uzunluk() {
            return string.length();

        }

        public int IndexYeri(String deger) {
            return string.indexOf(deger);

        }

        public String KucukBuyuk() {
            return string.toLowerCase();

        }

        public String BuyukKucuk() {
            return string.toUpperCase();

        }

        public boolean Esitle(String deger) {
            return string.equals(deger);

        }

        public String BoslukSil() {
            return string.trim();

        }

        public boolean Varmi(String deger) {
            return string.contains(deger);

        }

        public String[] Kaydir(String deger) {
            return string.split(deger);

        }
    }
}