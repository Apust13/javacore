package com.apust.Golovach.feb_2013_core.collection_n4;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by GUN
 * on 01.07.2016.
 */
public class App01 {
    public static void main(String[] args) {

        Set<String[]> set = new TreeSet<>();
        set.add(new String[]{"A"});
        set.add(new String[]{"B"});
        System.out.println(set.size());

    }
}
