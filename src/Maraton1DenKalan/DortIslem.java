package Maraton1DenKalan;

public class DortIslem {

    public static int Toplama(int... sayi) {
    int Top = 0;
    for (int i : sayi) {
        Top += i;
    }
    return Top;
}


    public static int Cikarma(int sayi1, int sayi2) {
        return (sayi2 - sayi1);
    }


    public static int Carpma(int... sayi) {
        int carp = 1;
        for (int i : sayi) {

            carp *= i;
        }
        return carp;
    }


    public static int Bolme(int sayi4, int sayi5) {
        return (sayi4 / sayi5);
    }

    public static int Alanuc(int h, int l) {
        return (h * l / 2);

    }

    public static int Alankare(int kenar) {
        return (kenar * kenar);

    }



}
