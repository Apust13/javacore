package com.apust.java8.lambda;

/**
 * Created by APUST on 12/3/2016.
 */

import static java.util.Arrays.asList;

public class App00 {

    public static void main(String[] args) {
        asList("A","BB","CCC").stream()
                .filter(s -> s.length() > 1)
                .map(String::length)
                .forEach(System.out::println);
    }
}
