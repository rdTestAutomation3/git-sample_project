package com.maashesaplama;

public class Main {
    public static void main(String[] args) {
        // Personel oluştur
        Personel personel1 = new Personel("Ali", 5000, 27); // 27 gün çalıştı
        Personel personel2 = new Personel("Ayşe", 6000, 24); // 24 gün çalıştı

        // Personellerin maaşını hesaplayalım
        System.out.println(personel1.getIsim() + " toplam maaş: " + personel1.maasHesapla() + " TL");
        System.out.println(personel2.getIsim() + " toplam maaş: " + personel2.maasHesapla() + " TL");
    }
}
