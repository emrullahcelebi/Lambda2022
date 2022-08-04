package day04;

import java.util.ArrayList;
import java.util.Comparator;
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
        liste.add("Avdo");

        aIleBaslayanlar(liste);
        buyukHarfeCevir(liste);
        uzunlugaGoreSiralaKucult(liste);
        kullaniciUzunlugu(liste,5);
        System.out.println();
        System.out.println(uyunlukKucukMu(liste,9));
        System.out.println(harfVarMi(liste,"B"));
        System.out.println(varMi(liste,"c"));
        System.out.println();
        aileOYazdiran(liste);
        System.out.println();
        listele(liste);
    }
    public static void listele(List<String>l){
        l.stream().
                sorted(Comparator.comparing(String::length)).
                map(t->t+":"+t.length()+"\t").
                forEach(System.out::println);
    }




    public static void aileOYazdiran(List<String>l){
        l.stream().filter(x->x.startsWith("A") && x.endsWith("o")).forEach(System.out::println);
    }



    public static boolean varMi(List<String>l, String harf){
        return l.stream().anyMatch(t->t.endsWith(harf));
    }






    public static boolean harfVarMi(List<String> l, String harf){
        return l.stream().noneMatch(t->t.startsWith(harf));
    }




    public static boolean uyunlukKucukMu(List<String> liste, int uzunluk){

        return liste.stream().allMatch(t->t.length()<uzunluk);
    }

    public static void kullaniciUzunlugu(List<String>l, int uzunluk){

        l.stream().filter(t->t.length()>uzunluk).forEach(System.out::println);
    }








    public static void uzunlugaGoreSiralaKucult(List<String> l){

        l.stream().
                sorted(Comparator.comparing(t->t.length())).
                map(t->t.toLowerCase()).
                forEach(System.out::println);

    }

    public static void aIleBaslayanlar(List<String> l){
        l.stream().filter(h->h.startsWith("A")).forEach(System.out::println);
    }
    public static void buyukHarfeCevir(List<String> l){
        l.stream().map(h->h.toUpperCase()).forEach(System.out::println);
    }
}
