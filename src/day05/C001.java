


package day05;

import day03.Utils;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C001 {


    public static void main(String[] args) {
            List<Integer> liste = new ArrayList();
            liste.add(8);
            liste.add(9);
            liste.add(131);
            liste.add(10);
            liste.add(9);
            liste.add(10);
            liste.add(2);
            liste.add(8);
            tekrarsizKupCarpim(liste);
            System.out.println();
            getMaxEleman(liste);
            yazdir(liste);
            System.out.println();
            cift(liste);
            System.out.println();
            tekrarsizCiftElemanlarinKaresiToplami(liste);
            tekrarsizCiftElemanlarinKuplerinCarpimi(liste);
            getMaxEleman2(liste);
            yedidenBuyukCift(liste);
            tekrarsizTersSiralamaYarisi(liste);
            }

    private static void cift(List<Integer> liste) {
            liste.stream().filter(Utils::ciftYaz).forEach(Utils::bosluk);
            }
    public static void tekrarsizKupCarpim(List<Integer> l) {
            Integer carpim = (Integer)l.stream().distinct().filter((t) -> {
            return t % 2 == 0;
            }).map((t) -> {
            return t * t * t;
            }).reduce(1, (t, u) -> {
            return t * u;
            });
            System.out.println(carpim);
            }
    public static void getMaxEleman(List<Integer> l) {
            Integer max = (Integer)l.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> {
            return t > u ? t : u;
            });
            System.out.println("max = " + max);
            }
    public static void yazdir(List<Integer> l) {
            l.stream().forEach(Utils::bosluk);
            }
    public static void tekrarsizCiftElemanlarinKaresiToplami(List<Integer> list) {
            Integer toplam = (Integer)list.stream().distinct().filter(Utils::ciftYaz).map(Utils::kare).reduce(0, Math::addExact);
            System.out.println(toplam);
            }
    public static void tekrarsizCiftElemanlarinKuplerinCarpimi(List<Integer> list) {
            Integer carpim = (Integer)list.stream().distinct().filter(Utils::ciftYaz).map(Utils::kup).reduce(1, Math::multiplyExact);
            System.out.println(carpim);
            }
    public static void getMaxEleman2(List<Integer> list) {
            Integer max = (Integer)list.stream().distinct().reduce(Math::max).get();
            System.out.println(max);
            }
            public static void yedidenBuyukCift(List<Integer> list){
            Integer min=list.stream().
                    distinct().filter(t->t>7).
                    filter(Utils::ciftYaz).
                    reduce(Math::min).get();
                    System.out.println(min);
            }
            public static void tekrarsizTersSiralamaYarisi(List<Integer>list){
            List<Double> sonuc=list.stream().distinct().filter(t->t>5).
                    map(Utils::yarisi).sorted(Comparator.reverseOrder()).
                    collect(Collectors.toList());
                    System.out.println(sonuc);
            }


}

