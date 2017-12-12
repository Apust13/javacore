package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by APUST on 10/29/2017.
 */
public class App01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aa3","bb3","aa0","aa1", "bb2", "cc3", "bb1", "cc2", "aa2");

//        list.stream()
//            .filter(s -> s.startsWith("a"))
//            .map(String :: toUpperCase)
//            .sorted()
//            .forEach(System.out::println);
//
//        IntStream.range(1,10).forEach(System.out :: print);

        Stream.of(2.0, 1.0, 4.0, 3.0)
        .mapToInt(Double::intValue)
        .mapToObj(i -> "c" + i)
        .sorted()
        .forEach(System.out::println);



        Stream.of("dd1", "aa1", "fb1", "bb1", "cc1")
              .map(s -> {
                  System.out.println("map: " + s);
                  return s.toUpperCase();
              })
              .anyMatch(s ->{
                  System.out.println("anyMatch: " + s);
                  return s.startsWith("F");
              });


        Stream.of("dd2", "aa2", "fb1", "bb3", "cc4")
              .map(s -> {
                  System.out.println("map: " + s);
                  return s.toUpperCase();
              })
              .filter(s ->{
                  System.out.println("anyMatch: " + s);
                  return s.startsWith("A");
              })
              .forEach(s -> System.out.println("forEach: " + s));




    }
}
