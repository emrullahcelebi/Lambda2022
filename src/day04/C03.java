package day04;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C03 {
    public static void main(String[] args) {

        System.out.println("Toplam : "+ topla(4));
        System.out.println("============");
        System.out.println(tekTopla(3,9));
        System.out.println("============");
        System.out.println(faktoriyel(13));
        System.out.println(faktoriyel2(34));
        System.out.println("============");
        System.out.println(yazdir());
    }
    public static List<Double> yazdir(){
        Double[] notlar={88.5, 52.3,88.9, 100.0, 99.6, 42.0, 10.0};
        Stream <Double> streamNotlar=Stream.of(notlar);
return streamNotlar.filter(t->t>50.0).collect(Collectors.toList());
    }


    public static Double faktoriyel2(int n){
        return DoubleStream.iterate(1,t->t+1).limit(n).reduce(1,(x,y)->x*y);
    }
    public static int faktoriyel(int sayi){
       return IntStream.rangeClosed(1,sayi).reduce(1,(x,y)->x*y);
    }


    public static int topla(int deger){

        return IntStream.range(1,deger+1).sum();
        //return IntStream.rangeClosed(1,deger).forEach(System.out::println);
    }

    public static int tekTopla(int alt,int ust){
        return IntStream.rangeClosed(alt,ust).filter(t->t%2!=0).sum();

    }
}
