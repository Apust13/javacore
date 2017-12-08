package com.apust.java8;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class App00 {

    public static void main(String[] args) {

//        Stream.of("dd3","cc2", "aa1",  "dd2", "aa1", "cc3","dd1", "aa3", "cc1")
//                .map(s -> {
//                    System.out.println("map:" +s);
//                    return s.toUpperCase();
//                })
//                .anyMatch(s->{
//                    System.out.println("anyMatch:" +s);
//                    return s.startsWith("A");
//                });

//        Stream.of("dd2","aa2", "bb1", "bb3", "cc4")
//                .filter(s -> {
//                    System.out.println("filter:" +s);
//                    return s.startsWith("a");
//                })
//                .map(s->{
//                    System.out.println("map:" +s);
//                    return s.toUpperCase();
//                })
//                .forEach(s -> System.out.println("forEach:" +s));

     Supplier<Stream<String>> stream = ()-> Stream.of("dd3", "cc2", "aa1", "dd2", "aa1").filter(s -> s.startsWith("a"));

        stream.get().anyMatch(s -> true);
        stream.get().noneMatch(s -> true);


    }

}
