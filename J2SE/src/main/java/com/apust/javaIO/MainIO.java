package com.apust.javaIO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by APUST on 6/27/2017.
 */
public class MainIO {
    public static void main(String[] args) throws IOException, InterruptedException {
//        int count = Integer.parseInt(args[0]);
//        File file = new File(args[1]);
//
//        List<String> groups = generateGroups(count);
//        save(groups, file);

        File file = new File("./Test");
        File[] files = file.listFiles();
        for(File file2 : files){
            String absolutePath = file2.getAbsolutePath();

            FileReader fileReader = new FileReader(absolutePath);
            int c;
            while ((c = fileReader.read()) != -1){
                System.out.println(c + " - " + (char)c + " = " + Integer.toBinaryString(c) + " ... " + Integer.toBinaryString(c*-1) );
                Thread.sleep(150);
            }
        }


    }

    private static void save(List<String> groups, File file) throws IOException {
        System.out.println(new File(".").getAbsolutePath());
        Writer writer = new FileWriter(file);
        for (String str : groups){
            writer.write(String.format(" File : %s\n", str ));
        }
        writer.close();
    }

    private static List<String> generateGroups(int count) {
        ArrayList<String> strings = new ArrayList<>();
        for(int i =0; i<count; i++){
            strings.add(String.format("String %s", i));
        }
        return strings;
    }
}
