package com.maashesaplama;

public class Personel {
    private String isim;
    private double maas; // Aylık temel maaş
    private int calisilanGun; // O ay çalışılan gün sayısı

    // Constructor
    public Personel(String isim, double maas, int calisilanGun) {
        this.isim = isim;
        this.maas = maas;
        this.calisilanGun = calisilanGun;
    }

    // Maaş hesaplama metodu
    public double maasHesapla() {
        // Eğer çalışılan gün 25'ten fazlaysa, her ekstra gün için 1000 TL prim ekle
        int fazlaGun = calisilanGun > 25 ? calisilanGun - 25 : 0;
        double prim = fazlaGun * 1000; // Prim hesaplama
        return maas + prim; // Toplam maaş
    }

    // Getter'lar
    public String getIsim() {
        return isim;
    }

    public int getCalisilanGun() {
        return calisilanGun;
    }

    // Bilgileri yazdırma
    @Override
    public String toString() {
        return "Personel{" +
                "isim='" + isim + '\'' +
                ", maas=" + maas +
                ", calisilanGun=" + calisilanGun +
                '}';
    }
}
