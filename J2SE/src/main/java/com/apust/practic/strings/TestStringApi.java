package com.apust.practic.strings;

/**
 * Created by GUN
 * on 17.06.2016.
 */
public class TestStringApi {
    public static void main(String[] args) {
        String str = "Hello man!";

        String str1 = new String("Hello man!");

        String str2 = "man!";
        char c = 101;

        System.out.println(str.charAt(1));

        System.out.println(str.codePointAt(1));
        System.out.println(c);
        System.out.println(str.endsWith("man!"));

        System.out.println(str.equals(str1));

        System.out.println(str.indexOf(str2));
        System.out.println(str.length());

    }
}
