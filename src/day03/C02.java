package day03;

import java.util.ArrayList;
import java.util.List;

public class C02 {
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


        ciftleriYazdir(rakamlar);


    }
    public static void ciftleriYazdir(List<Integer> list){
       // list.stream().filter(x->x%2==0).forEach(x-> System.out.print(x+" "));
list.stream().filter(C02::ciftMi).forEach(System.out::print);

    }
    public static boolean ciftMi(int x){
return x%2==0;
    }
}
