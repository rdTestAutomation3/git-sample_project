package com.ikmodeli;

public class Personel {
    private int id;
    private String isim;
    private String soyisim;
    private String pozisyon;
    private double maas;

    public Personel(int id, String isim, String soyisim, String pozisyon, double maas) {
        this.id = id;
        this.isim = isim;
        this.soyisim = soyisim;
        this.pozisyon = pozisyon;
        this.maas = maas;
    }

    public int getId() {
        return id;
    }

    public String getIsim() {
        return isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public String getPozisyon() {
        return pozisyon;
    }

    public double getMaas() {
        return maas;
    }

    @Override
    public String toString() {
        return "Personel{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", pozisyon='" + pozisyon + '\'' +
                ", maas=" + maas +
                '}';
    }
}
