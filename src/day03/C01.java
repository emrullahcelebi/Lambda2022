package day03;

import java.util.ArrayList;
import java.util.List;

public class C01 {
    public static void main(String[] args) {
        List<Integer> rakamlar=new ArrayList<>();
        rakamlar.add(5);
        rakamlar.add(7);
        rakamlar.add(9);
        rakamlar.add(-1);
        rakamlar.add(4);
        rakamlar.add(8);
        rakamlar.add(4);
        rakamlar.add(2);
        rakamlar.add(-1000);
        rakamlar.add(13);
        rakamlar.add(15);

        rakamlar.stream().filter(t-> t%2!=0).forEach(System.out::print);
        System.out.println();
        rakamlar.stream().filter(t-> t%2==0).forEach(x-> System.out.print(x));
        System.out.println();
        rakamlar.stream().filter(t-> t%2==0).forEach(C01::yazdir);



    }
    public static void yazdir(int x){
        System.out.print(x+" ");
    }
}
