package com.apust.Golovach.dec_2013_core.n_14_collections;

import java.util.*;

import static java.util.Arrays.asList;


/**
 * Created by GUN on 12/16/2015.
 */
public class App_14_01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(asList("Bbb", "a", "A", "C", "E","zz", "D", "a", "Bbb", "A"));
        System.out.println(list);
        HashSet<String> list2 = new HashSet<>(list);
        System.out.println(list2);
        List <String> list3 = new ArrayList<>(list2);
        Collections.sort(list3);
        System.out.println(list3);
        System.out.println("-----------------");

        List<String> list4 = new ArrayList<>(new HashSet<>(new ArrayList<>(asList("Bbb", "a", "A", "C", "E","zz", "D", "a", "Bbb", "A"))));
        Collections.sort(list4);
        System.out.println(list4);
        f(2);
        f(1, 3, 4, 5, 6);

        System.out.println();
        System.out.print("Iterator - ");

        Iterator<String> iter = list4.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
        }

        System.out.println();
        System.out.print("for each - ");

        for (String s : list4) {
            System.out.print(s + " ");
        }

        System.out.println();
        System.out.print("for - ");

        for (int i = 0; i < list4.size(); i++) {
            System.out.print(list4.get(i) + " ");
        }

    }

    public static void f(int... arr){
        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");

        }
    }
}
