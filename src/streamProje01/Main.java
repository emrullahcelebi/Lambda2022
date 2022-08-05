package streamProje01;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Ogrenci> ogrListesi=new ArrayList<>();


    public static void main(String[] args) {
        testOgrenciOlustur();
        ismeGoreListele("ahmet");
        ismeGoreListele("ayse");
        ismeGoreListele("john");




    }
    private static void ismeGoreListele(String isim){
        ogrListesi.stream().
                filter(t->t.getAd().equalsIgnoreCase(isim)).
                forEach(System.out::println);
    }
    private static void testOgrenciOlustur(){

ogrListesi.add(new Ogrenci("Ahmet","Can", 17,95.5,"erkek"));
ogrListesi.add(new Ogrenci("Ahmet","Baki", 18,90.1,"erkek"));
ogrListesi.add(new Ogrenci("Ayse","Can", 21,82.3,"kadin"));
ogrListesi.add(new Ogrenci("Mustafa","Can", 15,75.3,"erkek"));
ogrListesi.add(new Ogrenci("Ayse","Yilmaz", 40,45,"kadin"));
ogrListesi.add(new Ogrenci("Ali","Veli", 80,35.5,"erkek"));
ogrListesi.add(new Ogrenci("Veli","Ozturk", 20,95.5,"erkek"));

    }
}
