package com.stepic.javacore;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by GUN on 12/18/2015.
 */
public class App_6_2 {
    public static void main(String[] args) {
        Set <Integer> set1 = new HashSet<>();
        Set <Integer> set2 = new HashSet<>();
//        Set <Integer> set3 = new HashSet<>();
//        Set <Integer> set4 = new HashSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);

        set2.add(1);
        set2.add(2);
        set2.add(3);
//
//        set3.addAll(set1);
//        set4.addAll(set2);
//
//        set3.removeAll(set2);
//        set4.removeAll(set1);
//        set4.addAll(set3);



        System.out.println(set1);
        System.out.println(set2);
//        System.out.println(set3);
//        System.out.println(set4);

//
        System.out.println(symmetricDifference(set1, set2));


    }
    public static  Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set <Integer> set3 = new HashSet<>();
        Set <Integer> set4 = new HashSet<>();
//        for (Integer e : set1){
//            if (set2.contains(e)){
//                continue;
//            }
//            else set3.add(e);
//        }
//
//        for (Integer e : set2){
//            if (set1.contains(e)){
//                continue;
//            }
//            else set3.add(e);
//        }
        set3.addAll(set1);
        set4.addAll(set2);

        set3.removeAll(set2);
        set4.removeAll(set1);
        set4.addAll(set3);

        return set4;
    }

}
