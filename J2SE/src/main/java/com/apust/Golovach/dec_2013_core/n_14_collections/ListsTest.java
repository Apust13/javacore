package com.apust.Golovach.dec_2013_core.n_14_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by GUN on 12/16/2015.
 */
public class ListsTest {
    // -verbose:gc   ���������� ������ Garbage Collector
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        long startArr = System.nanoTime();

        for(int i = 0; i<=10_000_000; i++){
            list.add(i);

        }
        long finishArr = (System.nanoTime() - startArr)/1_000_000;

        System.out.println("ArrayList add's time " + finishArr);

        long startLink = System.nanoTime();
        for(int i = 0; i<=10_000_000; i++){
            list2.add(i);

        }
        long finishLink = (System.nanoTime() - startLink)/1_000_000;
        System.out.println("LinkedList add's time " + finishLink);

        long strArrGet = System.nanoTime();
        list.get(8_754_000);
        long finArrGet = (System.nanoTime() - strArrGet)/1_000_00;
        long strLinkGet = System.nanoTime();
        list2.get(8_754_000);
        long finLinkGet = (System.nanoTime() - strLinkGet)/1_000_00;
        System.out.println("ArrayList get time " + finArrGet);
        System.out.println("LinkedList get time " + finLinkGet);




    }
}
