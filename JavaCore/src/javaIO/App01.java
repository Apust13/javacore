package javaIO;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by APUST on 6/27/2017.
 */
public class App01 {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("A".getBytes("UTF-16").length);
        System.out.println(Arrays.toString("A".getBytes("UTF-16")));
        System.out.println();
        System.out.println("A".getBytes("UTF-8").length);
        System.out.println(Arrays.toString("A".getBytes("UTF-8")));
        System.out.println();
        System.out.println("A".getBytes("windows-1251").length);
        System.out.println(Arrays.toString("A".getBytes("windows-1251")));

        System.out.println(" ----------------------------------------------------------- ");

        System.out.println("AA".getBytes("UTF-16").length);
        System.out.println("AA".getBytes("UTF-8").length);
        System.out.println("AA".getBytes("windows-1251").length);


        System.out.println(" ----------------------------------------------------------- ");

        System.out.println(Arrays.toString("AAA".getBytes("UTF-16")));
        System.out.println(Arrays.toString("AAA".getBytes("UTF-8")));
        System.out.println(Arrays.toString("AAA".getBytes("windows-1251")));



//        for(int i=0; i <= 3000; i++){
//            System.out.println(i + " " + (char)i + " size: " +String.valueOf(i).length());
//            Thread.sleep(50);
//        }


    }
}
