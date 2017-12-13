package com.apust.Golovach.feb_2013_core.collection_n4;

import java.util.HashMap;

/**
 * Created by GUN
 * on 01.07.2016.
 */
public class App03 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 0);
        map.put("C", 1);

        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        System.out.println(map);

    }
}
class Test{
    public static void main(String[] args) {
        System.out.println(new Integer(1).equals(new Long(1)));
        System.out.println(new Integer(1).equals(new Long(1)));
    }
}
