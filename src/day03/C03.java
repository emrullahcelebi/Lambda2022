package day03;

import java.util.ArrayList;
import java.util.List;

public class C03 {
    public static void main(String[] args) {
        List<Integer> rakamlar=new ArrayList<>();
        rakamlar.add(10);
        rakamlar.add(1);
        rakamlar.add(20);
        rakamlar.add(3);
        rakamlar.add(5);
        rakamlar.add(7);
        rakamlar.add(4);
        rakamlar.add(9);
        rakamlar.add(9);

        tekKareYazdir(rakamlar);
        System.out.println();
        System.out.println(tekKupToplami(rakamlar));
    }
    public static void tekKareYazdir(List<Integer> l){
        l.stream().filter(x->x%2!=0).distinct().map(x->x*x).forEach(C01::yazdir);
    }
    public static int tekKupToplami(List<Integer> list){
       return list.stream().filter(x->x%2!=0).map(x->x*x*x).reduce(0,(x,y)->(x+y));


    }
}
