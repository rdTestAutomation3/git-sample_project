package com.ikmodeli;
import java.util.ArrayList;
import java.util.List;
import com.ikmodeli.Personel;

public class Departman {
    private String departmanAdi;
    private List<Personel> personelListesi;

    public Departman(String departmanAdi) {
        this.departmanAdi = departmanAdi;
        this.personelListesi = new ArrayList<>();
    }

    public void personelEkle(Personel personel) {
        personelListesi.add(personel);
    }

    public List<Personel> getPersonelListesi() {
        return personelListesi;
    }

    public void tumPersonelleriListele() {
        for (Personel personel : personelListesi) {
            System.out.println(personel);
        }
    }

    public String getDepartmanAdi() {
        return departmanAdi;
    }

    @Override
    public String toString() {
        return "Departman{" +
                "departmanAdi='" + departmanAdi + '\'' +
                ", personelListesi=" + personelListesi +
                '}';
    }
}
