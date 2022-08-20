package day03;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static void bosluk(Object obj){
        System.out.print(obj+" ");
    }

    public static boolean ciftYaz(int x){
        return x%2==0;
    }

    public static boolean tekYaz(int y){
        return y%2!=0;
    }
    public static int kare(int x){

        return x=x*x;
    }
    public static int kup(int x){

        return x=x*x*x;
    }
    public static double yarisi(int x){
      return x/2.0;
    }
    public static char sonKarakter(String str){
     return str.charAt(str.length()-1) ;
    }
    public static char ilkKarakter(String str){
        return str.charAt(0) ;
    }

    public static class C001 {
        public static void main(String[] args) {
            List<Integer> liste=new ArrayList<>();
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
        }

        private static void cift(List<Integer> liste) {
            liste.stream().filter(Utils::ciftYaz).forEach(Utils::bosluk);
        }

        public static void tekrarsizKupCarpim(List<Integer>l){
           Integer carpim= l.stream().distinct().filter(t->t%2 ==0).map(t->t*t*t).reduce(1,(t,u)->t*u);
            System.out.println(carpim);
        }

      public static void getMaxEleman(List<Integer>l){
           Integer max= l.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)->t>u ? t:u);
          //System.out.println(max);
          System.out.println("max = " + max);
      }
      public static void yazdir(List<Integer>l){
            l.stream().forEach(Utils::bosluk);

      }
      public static void tekrarsizCiftElemanlarinKaresiToplami(List<Integer>list){
            Integer toplam= list.stream().
                    distinct().filter(Utils::ciftYaz).
                    map(Utils::kare).reduce(0,Math::addExact);//reduce(Math::addExact).get();
          System.out.println(toplam);
      }
      public static void tekrarsizCiftElemanlarinKuplerinCarpimi(List<Integer>list){
           Integer carpim= list.stream().
                   distinct().filter(Utils::ciftYaz).
                   map(Utils::kup).
                   reduce(1,Math::multiplyExact);
          System.out.println(carpim);
      }
      public static void getMaxEleman2(List<Integer>list){
            Integer max=list.stream().distinct().reduce(Math::max).get();
          System.out.println(max);
      }
    }
}
