package com.apust.Golovach.dec_2013_core.n_16_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by GUN on 12/17/2015.
 */
public class App_16_00 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>(Arrays.asList("a","b","c","d","e"));

        System.out.println(list);
        list.set(1, "F");
        System.out.println(list);
        list.add(2, "b");
        System.out.println(list);
        System.out.println(list.size());
       list.getClass();
//        for(int i = list.size();i<1000;i++){
//
//            list.add(String.valueOf(i));
//            if(list.size() > size*2){
//                System.out.println(list.size());
//            }
//        }
//        System.out.println(list.size());
//        System.out.println(list);
//

    }
}
