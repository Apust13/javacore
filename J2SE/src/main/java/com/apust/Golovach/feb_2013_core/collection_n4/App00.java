package com.apust.Golovach.feb_2013_core.collection_n4;

import java.util.*;

/**
 * Created by GUN
 * on 01.07.2016.
 */
public class App00 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Map<String, List<String>> map = new HashMap<>();

        map.put("Smith", new ArrayList<String>(Arrays.asList("A", "B")));
//        map.put("John", 2);
//        System.out.println(map.put("John", 0));
        System.out.println(map.put("John", null));
        System.out.println(map.get("Smith"));

        map.get("Smith").add("d");

        System.out.println(map.get("Smith"));

        System.out.println(map.get("John"));


        System.out.println(map);



    }
}
