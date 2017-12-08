package com.apust.javacore.work.performance;

import java.util.ArrayList;

public class App0 {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        int j = 0;
        int k = 0;

//        for(int i = 0; i++ < 10;){
//            list1.add(String.valueOf(i));
//
//        }
//
//        for(int i = 0; ++i < 10;){
//            list2.add(String.valueOf(i));
//        }



        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 10;) {
            list1.add(String.valueOf(++i));
        }
        long t2 = System.currentTimeMillis() - t1;
        System.out.println("++i :" + t2);


        long t3 = System.currentTimeMillis();
        for (int f = 0; f < 10;) {
            list2.add(String.valueOf(f++));
        }
        long t4 = System.currentTimeMillis() - t3;
        System.out.println("i++ :" + t4);

        System.out.println(list1);
        System.out.println(list2);



    }

}
