package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C04 {
    public static void main(String[] args) throws IOException {
        String path="src/day04/mars.txt";


       Stream<String> satirlar= Files.lines(Path.of("src/day04/mars.txt"));
       satirlar.forEach(System.out::println);
        System.out.println("========================================================");
        Files.lines(Path.of(path)).
                map(t->t.toUpperCase()).forEach(System.out::println);

        Files.lines(Path.of(path)).limit(1).map(String::toUpperCase).forEach(System.out::println);
        System.out.println("========================================================");
        Files.lines(Path.of(path)).map(String::toUpperCase).skip(2).limit(2).forEach(System.out::println);
        System.out.println("========================================================");

        System.out.println(Files.lines(Path.of(path)).map(String::toLowerCase).filter(t->t.contains(" bu")).count());
        System.out.println("========================================================");

        Files.lines(Path.of(path)).map(t->t.toLowerCase().split(" ")).
                flatMap(Arrays::stream).distinct().forEach(System.out::println);

        System.out.println("========================================================");
        long mSayisi= Files.lines(Path.of(path)).map(t->t.toLowerCase().split("")).
                flatMap(Arrays::stream).
                filter(t->t.equals("m")).count();
        System.out.println(mSayisi);
        System.out.println("========================================================");
        System.out.println(Files.lines(Path.of(path)).map(t->t.replace("_","").replace("\\W","").
                        split("")).
                flatMap(Arrays::stream).count());

    }
}
