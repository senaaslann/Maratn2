package Maraton1DenKalan;

public class Diziler {


    public float[] sonEkle(float[] eski, float sayi) {
    float[] yeni = new float[eski.length + 1];
    for (int i = 0; i < eski.length; i++) {
        yeni[i] = eski[i];
    }
    yeni[eski.length] = sayi;
    return yeni;
}

    public float[] ekle(float[] eski, int index, float sayi) {
        float[] yeni = new float[eski.length + 1];
        for (int i = 0; i < eski.length; i++) {
            if (i == index) {
                yeni[i] = sayi;
            } else if (i > index)
                yeni[i] = eski[i - 1];
            else
                yeni[i] = eski[i];
        }
        if (index < eski.length)
            yeni[eski.length] = eski[eski.length - 1];
        else
            yeni[eski.length] = sayi;
        return yeni;
    }


    public float[] sil(float[] eski, int index) {
        float[] yeni = new float[eski.length - 1];
        for (int i = 0; i < yeni.length; i++) {
            if (i >= index) {
                yeni[i] = eski[i + 1];
            } else
                yeni[i] = eski[i];
        }
        return yeni;
    }

    public void Listele(float[] dizi) {
        for (float index : dizi)
            System.out.println(index);
    }
}
