package com.apust.javacore.work;

import java.util.Arrays;
import java.util.function.Predicate;

public class App01 {

    public static void main(String[] args) {

        Arrays.asList("AA", "BBB", "CCCC", "D").stream()
                .filter(s -> s.length() > 1)
                .forEach(System.out :: println);

        Arrays.asList("AA", "BBB", "CCCC", "D").stream()
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return s.length() > 1;
                    }
                })
                .forEach(System.out :: println);





    }
}
