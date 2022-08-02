package day04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C01 {
    public static void main(String[] args) {
        List<Integer> rakamlar=new ArrayList<>();
        rakamlar.add(10);
        rakamlar.add(1);
        rakamlar.add(20);
        rakamlar.add(3);
        rakamlar.add(5);
        rakamlar.add(-5);
        rakamlar.add(7);
        rakamlar.add(4);
        rakamlar.add(9);
        rakamlar.add(9);
        rakamlar.add(-4);
        System.out.println(buyukMu(rakamlar));
        System.out.println();
        System.out.println(buyukBul1(rakamlar));
        System.out.println();
        System.out.println(buyukBul2(rakamlar));
        System.out.println();
        System.out.println(kucukBul1(rakamlar));
        System.out.println(dokuzSay(rakamlar));
        System.out.println(negatifSayilar(rakamlar));
        System.out.println(kareSirali(rakamlar));
    }

    public static List<Integer> kareSirali(List<Integer> l){
        return l.stream().
                filter(x->x%2!=0).
                map(x->(int) Math.pow(x,2)).distinct().sorted().   //sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());

    }

    public static List<Integer> negatifSayilar(List<Integer> l) {
        return l.stream().filter(x->x<0).collect(Collectors.toList());
    }

    public static int buyukMu(List<Integer> l){
        return l.stream().reduce(0,(x,y)->x>y?x:y);

    }

    public static int buyukBul1(List<Integer> l){
        return l.stream().reduce(0,Math::max);

    }
    public static int buyukBul2(List<Integer> l){
        return l.stream().sorted().reduce(0,(x,y)->y);

    }
    public static int kucukBul1(List<Integer> l){
        return l.stream().reduce(0,(x,y)->x<y? x:y);

    }
    public static int dokuzSay(List<Integer>l){
        return(int) l.stream().filter(x->x==9).count();
    }

}
