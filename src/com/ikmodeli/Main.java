package com.ikmodeli;

public class Main {
    public static void main(String[] args) {
        // Departman oluştur
        Departman yazilimDepartmani = new Departman("Yazılım Departmanı");

        // 5 adet personel oluştur ve departmana ekle
        Personel p1 = new Personel(1, "Ali", "Veli", "Yazılım Mühendisi", 5000);
        Personel p2 = new Personel(2, "Ayşe", "Yılmaz", "Proje Yöneticisi", 7000);
        Personel p3 = new Personel(3, "Mehmet", "Kara", "Test Uzmanı", 4500);
        Personel p4 = new Personel(4, "Fatma", "Aydın", "Analist", 6000);
        Personel p5 = new Personel(5, "Emre", "Yıldız", "DevOps Mühendisi", 6500);

        // Personelleri departmana ekle
        yazilimDepartmani.personelEkle(p1);
        yazilimDepartmani.personelEkle(p2);
        yazilimDepartmani.personelEkle(p3);
        yazilimDepartmani.personelEkle(p4);
        yazilimDepartmani.personelEkle(p5);

        // Tüm personelleri listele
        System.out.println("Departmandaki Personeller:");
        yazilimDepartmani.tumPersonelleriListele();
    }
}
