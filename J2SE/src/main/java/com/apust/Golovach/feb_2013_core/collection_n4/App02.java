package com.apust.Golovach.feb_2013_core.collection_n4;

import java.util.HashSet;

/**
 * Created by GUN
 * on 01.07.2016.
 */
public class App02 {
    public static void main(String[] args) {

        HashSet<Boolean> set = new HashSet<>();
        set.remove(set.add(false));
        System.out.println(set.size());

    }
}
