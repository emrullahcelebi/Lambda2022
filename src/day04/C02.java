package day04;

import java.util.ArrayList;
import java.util.List;

public class C02 {
    public static void main(String[] args) {
        List<String> liste=new ArrayList<>();
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Jackoson");
        liste.add("Amanda");
        liste.add("Mairano");
        liste.add("Tuncay");
        liste.add("Cemil");
        liste.add("Akif");
        aIleBaslayanlar(liste);
        buyukHarfeCevir(liste);
    }
    public static void aIleBaslayanlar(List<String> l){
        l.stream().filter(h->h.startsWith("A")).forEach(System.out::println);
    }
    public static void buyukHarfeCevir(List<String> l){
        l.stream().map(h->h.toUpperCase()).forEach(System.out::println);
    }
}
