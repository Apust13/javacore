package com.apust;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NewJava8 {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list1.add(String.valueOf(i));
        }

        char letter = 65;
        System.out.println(letter);

        for (int i = 0; i < 10; i++) {
            list2.add(Character.toString((char) ((char)letter + i)));
        }

        for (int i = 0; i < 10; i++) {
            list3.add(i);
        }


        System.out.println(list1);
        System.out.println(list2);

        Predicate<String> p1 = e -> e.equals("2");

//        System.out.println(list1.stream().count());
//        System.out.println(list1.stream().anyMatch(i -> i.equals("10")));
//        System.out.println(list3.stream().filter(i -> !(i%2==0)).collect(Collectors.toList()));
//        System.out.println(list3.stream().min((o1, o2) -> -1));
        System.out.println(IntStream.range(0, list1.size()).boxed().collect(Collectors.toMap(i ->list1.get(i), i ->list2.get(i))));




    }
}
