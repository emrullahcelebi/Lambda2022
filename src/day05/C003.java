package day05;

import day03.Utils;

import java.util.stream.IntStream;

public class C003 {
    public static void main(String[] args) {

        System.out.println(get7den100eToplam());
        System.out.println(get7den100eToplam2());
        System.out.println(faktoriyel(5));
        System.out.println(ciftleriTopla(2,6));
        System.out.println(ikiSayiArasindakiSayilarinToplami(11,13));
    }
    public static int get7den100eToplam(){
        return IntStream.range(7,101).reduce(Math::addExact).getAsInt();
    }
    //2.yol
    public static int get7den100eToplam2(){
        return IntStream.rangeClosed(7,100).reduce(Math::addExact).getAsInt();
    }
    //2) 2'den 11'e kadar integer değerlerinin çarpımını bulan bir method oluşturun.
    public static int get2den11eCarpim(){
        return IntStream.rangeClosed(2,11).reduce(Math::multiplyExact).getAsInt();
    }
    //3) Verilen bir sayının faktoriyelini hesaplayan bir method oluşturun.
    // (5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)
    public static int faktoriyel(int sayi){
        return IntStream.rangeClosed(1,sayi).reduce(Math::multiplyExact).getAsInt();
    }

    //4) Verilen iki sayı arasındaki çift sayıların toplamını bulan bir method oluşturun.
    public static int ciftleriTopla(int x, int y){

        int z=0;
        if (x>y){
            z=x;
            x=y;
            y=z;
        }


        return IntStream.rangeClosed(x,y).filter(Utils::ciftYaz).sum();
    }

    //5) Verilen iki sayı arasındaki tüm sayıların rakamlarının toplamını hesaplayan bir method oluşturun.
    //  23 and 32 ==> 2+3  +  2+4  +  2+5  +  2+6  +  2+7  +   2+8  +   2+9  +   3+0  +   3+1  +   3+2 ==> 68
public static int ikiSayiArasindakiSayilarinToplami(int x, int y){
    int z=0;
    if (x>y){
        z=x;
        x=y;
        y=z;
    }
      return   IntStream.rangeClosed(x,y).map(Utils::rakamlarToplami).sum();
}


}
