package com.apust.javacore.work.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadTxtFile {

    public static void main(String[] args) {

        final String fileName = "/main/resources/testTxt.txt";

        List<String> strings = readFile(fileName);

        for(String s : strings){
            System.out.println(s);
        }


    }


    public static List<String> readFile(String fileName) {
        ArrayList<String> result = new ArrayList<>();
        try {

            BufferedReader bR = new BufferedReader(new FileReader(fileName));
            String line;
            try {
                while ((line = bR.readLine()) != null) {
                    result.add(line);
                }
            } finally {
                bR.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
