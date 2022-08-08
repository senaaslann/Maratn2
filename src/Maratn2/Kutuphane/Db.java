package Maratn2.Kutuphane;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Db {


    public static List<Musteri> musteriListesi = new ArrayList<Musteri>();
    public static List<Kasiyer> kasiyerListesi = new ArrayList<Kasiyer>();
    public static Map<Kitap, Musteri> kiralanmisKitaplar = new HashMap<Kitap, Musteri>();
    public static List<Kitap> kitapListesi = new ArrayList<Kitap>();
}
