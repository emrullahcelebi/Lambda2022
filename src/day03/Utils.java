package day03;




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
    public static int rakamlarToplami(int x){

        int toplam=0;
        while (x>0){
            toplam +=x%10;
            x/=10;
        }
        return toplam;
    }
}
