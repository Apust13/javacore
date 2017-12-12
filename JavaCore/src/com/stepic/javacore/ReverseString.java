package com.stepic.javacore;

/**
 * Created by GUN on 11/18/2015.
 */
public class ReverseString {
    public static boolean isPolyndrome(String str){
        StringBuilder s0 = new StringBuilder(str.replaceAll("[^A-Za-z1-9]+", ""));
        String s2 = s0.toString();
        String s1 = s0.reverse().toString();
        boolean result = s1.equalsIgnoreCase(s2);
        return result ;

    }

    public static void main(String[] args) {

        String poly = "Madam, I'm Adam!";

        System.out.println(isPolyndrome(poly));



    }

}
