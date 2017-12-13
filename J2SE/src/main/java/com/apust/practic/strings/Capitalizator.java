package com.apust.practic.strings;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by GUN
 * on 17.06.2016.
 */
public class Capitalizator {

    public static void f1(String str) {

        StringBuilder sb = new StringBuilder();
        Character ch = new Character(' ');
        boolean flag = false;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);


            if ( ch.isLetter(c)== true & i == 0 & c != ' ') {
                c = str.toUpperCase().charAt(i);
                sb.append(c);
                continue;
            }

            if ( ch.isLetter(c)== true & flag == true ) {
                c = str.toUpperCase().charAt(i);
                sb.append(c);
                flag =false;
                continue;
            }


            if (c == ' ') {
                sb.append(c);
                continue;
            }
            if (i != 0 && str.charAt(i - 1) == ' ') {
                c = str.toUpperCase().charAt(i);
                sb.append(c);
                continue;
            }

            if (i != 0 && str.charAt(i - 1) != ' ') {
                c = str.toLowerCase().charAt(i);
                sb.append(c);
                continue;
            }
            flag = true;

        }

        System.out.println(sb);
    }

    public static void f2(String str) {
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i == 0 || str.charAt(i - 1) == ' ') {
                c = str.toUpperCase().charAt(i);
            } else {
                c = str.toLowerCase().charAt(i);
            }

            sb.append(c);

        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {


        StringBuilder sb2 = new StringBuilder();


        String str = "пРивет кАк деЛа";

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("D:/Test1.txt"), "UTF-8"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                sb2.append(line);
                sb2.append("\n");
            }

            String strTest = sb2.toString();
            System.out.println(strTest);
            System.out.println();

            char x = strTest.charAt(0);
            long t1 = System.currentTimeMillis();
            f1(strTest);
            long t2 = System.currentTimeMillis();
            f2(strTest);
            long t3 = System.currentTimeMillis();




            System.out.print(" Time f1() --> ");
            System.out.println(t2 - t1);
            System.out.print(" Time f2() --> ");
            System.out.println(t3 - t2);



        } catch (IOException e) {
            System.out.println("Проблема с файлом!");
        }




    }
}
