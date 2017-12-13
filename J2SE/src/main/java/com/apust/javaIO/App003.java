package com.apust.javaIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by APUST on 7/4/2017.
 */
public class App003 {
    public static void main(String[] args) throws IOException {

//        File file = new File("Test/temp.csv");
//
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.length());
//        System.out.println(file.exists());
//        System.out.println(file.getCanonicalPath());
//        System.out.println(file.getUsableSpace());

        BufferedReader fileReader =  new BufferedReader(new FileReader(new File("Test/temp.csv")));

        String line = fileReader.readLine();
        List<String> list = new ArrayList<>();

        while (line != null){
            System.out.println(line);
            byte[] bytes = line.getBytes();
            System.out.println(Arrays.toString(bytes));

            for (byte bt : bytes ){
                list.add(Integer.toBinaryString(bt));
            }
            System.out.println(list);

            line = fileReader.readLine();
            list.clear();
        }



    }

}
