package com.apust.javaIO;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by APUST on 6/27/2017.
 */
public class App002 {
    public static void main(String[] args) throws IOException, InterruptedException {
        char ch = 101;
        ch = 0b1100101;
        System.out.println(ch);
        System.out.println(Arrays.toString(new char[]{ch}).getBytes().length);
        System.out.println(Arrays.toString((""+ch).getBytes("UTF-8")));
        System.out.println(Arrays.toString((""+ch).getBytes("UTF-8")).length());
        System.out.println(Integer.toBinaryString(ch));
//        Arrays.asList((""+ch).getBytes("UTF-8")).stream().forEach(bytes -> System.out.println(Arrays.toString(Integer.toBinaryString(bytes))));

    }
}
