package com.apust.collections;

import java.util.*;

/**
 * Created by GUN on 4/28/2015.
 */

/**
 * @
 */
public class CollectionTest {
    /**
     * @param args sbsdb
     */
    public static void main(String[] args) {


        Man man1 = new Man("Ben", 12);
        Man man2 = new Man("Stive", 16);
        Man man3 = new Man("Jhon", 65);
        Man man4 = new Man("Gary", 64);
        Man man5 = new Man("Bill", 44);


//        ArrayList <Man> ar = new ArrayList<>();
//        ar.add(man1);
//        ar.add(man3);
//        ar.add(man5);
//
//        System.out.println(ar);
//
//        ar.remove(man3);
//        System.out.println(ar);


//
//        Map<String,Integer> col = new HashMap<String,Integer>();
//
//        col.put(man1.getName(), ((Integer) man1.getAge()));
//        col.put(man2.getName(), ((Integer) man2.getAge()));
//        col.put(man3.getName(), ((Integer) man3.getAge()));
//        col.put(man4.getName(), ((Integer) man4.getAge()));

        Map<String, Man> col = new HashMap<>();
        col.put(man1.getName(), man1);
        col.put(man2.getName(), man2);
        col.put(man3.getName(), man3);
        col.put(man4.getName(), man4);


//        for(int i=0;i<col.size();i++){
//            System.out.println(col.get(i));
//
//        }


        System.out.println(col.size());
        System.out.println(col.entrySet());
        System.out.println(col.keySet());
        System.out.println(col.values());

        System.out.println(col.containsValue(man3));

    }
}
