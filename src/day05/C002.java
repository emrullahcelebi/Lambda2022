package day05;

import day03.Utils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class C002 {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();

        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);

        buyukHarfYazdiran(liste);
        System.out.println();
        uzunlugaGoreSirala(liste);
        System.out.println();
        uzunlugaGoreTerSirala(liste);
        System.out.println();
        sonKaraktereGOreSirala(liste);
        System.out.println();
        UzunlugunaVeIlkKarekterineGOreSirala(liste);
        System.out.println();
        //bestenBuyukSil(liste);
        //baslangicYadaSonHarfIcinSilme(liste);
        uzunlugu8Ile10ArasiVeOileBiten(liste);

    }
    public static void buyukHarfYazdiran(List<String> list){
        list.stream().map(String::toUpperCase).forEach(Utils::bosluk);
    }
    public static void uzunlugaGoreSirala(List<String>list){
        list.stream().
                sorted(Comparator.comparing(String::length)).
                forEach(Utils::bosluk);
    }
    public static void uzunlugaGoreTerSirala(List<String>list){
        list.stream().
                sorted(Comparator.comparing(String::length).reversed()).
                forEach(Utils::bosluk);
    }
    public static void sonKaraktereGOreSirala(List<String>list){
list.stream().distinct().sorted(Comparator.comparing(Utils::sonKarakter)).forEach(Utils::bosluk);
    }
    public static void UzunlugunaVeIlkKarekterineGOreSirala(List<String>list){
        list.
                stream().
                sorted(Comparator.comparing(String::length).thenComparing(Utils::ilkKarakter)).
                forEach(Utils::bosluk);
    }
    /*public static void bestenBuyukSil(List<String>list){
        list.removeIf(t->t.length()>5);//kalici siler
        System.out.println(list);
    }*/
    /*public static void baslangicYadaSonHarfIcinSilme(List<String>list){
        list.removeIf(t->t.charAt(0)=='A' || t.charAt(0)=='a' || t.charAt(t.length()-1)=='N' || t.charAt(t.length()-1)=='n');
        System.out.println(list);
    }*/
public static void uzunlugu8Ile10ArasiVeOileBiten(List<String>list){
    list.removeIf(t->t.length()>7 && t.length()<11 || t.endsWith("o"));
    System.out.println(list);
}

}
