import day03.Utils;

import java.util.ArrayList;
import java.util.List;



public class C001 {
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
}
