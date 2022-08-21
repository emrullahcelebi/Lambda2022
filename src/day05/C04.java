package day05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C04 {
    public static void main(String[] args) {
        Courses courseTurkishDay = new Courses("Summer", "Turkish Day", 97, 128);
        Courses courseTurkishNight = new Courses("Winter", "Turkish Night", 98, 154);
        Courses courseEnglishDay = new Courses("Spring", "English Day", 95, 132);
        Courses courseEnglishNight = new Courses("Winter", "English Night", 93, 144);
        List<Courses> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);
        System.out.println(buyukMu(coursesList, 95));
        System.out.println(kelimeVarMi(coursesList, "Turkish"));
        System.out.println(enYuksekKurs(coursesList));
        System.out.println(ortalamayaGoreSiralaVeIlkVerileniAtla(coursesList,1));
    }

    //1)Tüm ortalama puanların verilen sayıdan büyük olup olmadığını kontrol etmek için bir method oluşturun.

    public static boolean buyukMu(List<Courses> list, int x) {
        return list.stream().allMatch(t -> t.getAverageScore() > x);
    }
    //2)Kurs adlarından en az birinin verilen kelimeyi içerip içermediğini kontrol etmek için bir method oluşturun

    public static boolean kelimeVarMi(List<Courses> list, String kelime) {

        return list.stream().anyMatch(t -> t.getCourseName().contains(kelime));
    }
    //3) Ortalama puani en yuksek olan kursu yazdirmak icin bir yontem olusturun

    public static String enYuksekKurs(List<Courses> list) {

        return list.stream().sorted(Comparator.comparing(Courses::getAverageScore).reversed()).findFirst().get().getCourseName();
    }
//4) list ogelerini artan duzende ortalama puana gore siralayiniz ve ilk verilenleri atlayin

    public static List<Courses> ortalamayaGoreSiralaVeIlkVerileniAtla(List<Courses>list,int x){

        return list.stream().sorted(Comparator.comparing(Courses::getAverageScore)).skip(x).collect(Collectors.toList());

    }

}
























