package Maratn2.Kutuphane;
import java.util.*;
import java.util.stream.Collectors;

public class Kiralama implements KitapInterface {

    @Override
    public void kiralamaYap(Kitap kitap, Musteri musteri) {
        if (kitap.isKiralanabilir()) {
            kitap.setKiralanabilir(false);
            Db.kiralanmisKitaplar.put(kitap, musteri);
            kitap.setKiralamaGecmisi(musteri);
            System.out.println(musteri.toString() + "\n" + kitap.toString() + "\n kiralamıştır.");
        } else {
            System.out.println(kitap.getIsim() + " Kitap Kiradadir :( ");
        }
    }

    @Override
    public void isimleKitapAra(String isim) {
        List<Kitap> arama = Db.kitapListesi.stream().filter(s -> s.getIsim().contains(isim))
                .collect(Collectors.toList());
        System.out.println("Kitap Arama");
        arama.forEach(S-> System.out.println(S));
    }

    @Override
    public void isimleMusteriAra(String Ad) {
        List<Musteri> arama = Db.musteriListesi.stream().filter(s -> s.getAd().contains(Ad))
                .collect(Collectors.toList());
        System.out.println("Müşteri Ara");
        arama.forEach(S-> System.out.println(S));
    }

    @Override
    public void kitaplariListele() {
        System.out.println("Kitap Listele");
        Db.kitapListesi.forEach(S-> System.out.println(S));

    }

    @Override
    public void kisiTarafindankiralananmisKitaplar() {
        System.out.println("Kisi Tarafindan Kiralanmis Kitaplar");
        Db.kiralanmisKitaplar.entrySet().forEach(System.out::println);

    }

    @Override
    public void kiralayan(String id) {
        System.out.println("Kiralayan Kisi");
        Db.kiralanmisKitaplar.entrySet().stream().filter(s -> s.getKey().getId() == id)
                .forEach(S-> System.out.println(S));

    }


    @Override
    public void kiralanmiskitaplar(String id) {
        Db.kiralanmisKitaplar.entrySet().stream().filter(s -> s.getValue().getId() == id)
                .forEach(S-> System.out.println(S));
    }
}
