package com.stepic.javacore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by GUN on 12/18/2015.
 */
public class SysIn {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        List <Integer>list = new ArrayList<>();
        while (true){
            String pattern = "(\\d)(\\s+)([\\.,])";
            String[] s = scanner.nextLine().split(pattern);
//            char[] ch = (char[]) s;
//            Arrays.copyOf(s);


//            Integer tmp = new Integer(s);

//
//            for(int i = 0; i < chars.length;i++){
//                chars.
//            }
//
//            list.add(Integer.valueOf(tmp));

//            System.out.println(s.);
        }

    }
}
