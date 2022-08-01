package day02;

import java.util.Arrays;
import java.util.List;

public class C01 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        list.forEach(x-> System.out.print(x+", "));
        System.out.println();

        list.forEach(t-> System.out.print(t+2+" "));

        list.forEach(t->{
            int miktar=2;
            System.out.print(t+2+" ");
        });
        System.out.println();
        list.forEach((Integer x)-> System.out.print(x*2+" "));

        System.out.println();

        int deger=5;
        list.forEach(t-> System.out.print(t+deger));
        System.out.println();


        list.forEach(System.out::print);
        System.out.println();



        list.forEach(C01::yazdir);

    }
    public static void yazdir(int x){
        System.out.print(x +" ");
    }
}
