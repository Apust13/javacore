package com.apust.javacore.work.IO;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class readerTxt_v7 {

    public static void main(String[] args) {
       final String fileName = System.getProperty(("user.dir")) + "\\work\\src\\main\\resources\\testText.txt";
//        final String fileName = "test.txt";
        List<String> strings = readFile(fileName);
        for(String s : strings){
            System.out.println(s);
        }
    }


    public static List<String> readFile(String fileName) {
        try {
          return Files.readAllLines(Paths.get(fileName));
        } catch (IOException ex){
            ex.printStackTrace();
        }
        return null;
    }
}
