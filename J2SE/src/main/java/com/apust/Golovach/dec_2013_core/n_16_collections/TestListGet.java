package com.apust.Golovach.dec_2013_core.n_16_collections;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.currentTimeMillis;

/**
 * Created by GUN on 12/18/2015.
 */
public class TestListGet {
    static int LIST_LENGTH = 100_000;
    static int OPERATION_COUNT = 100_000;
    public static void main(String[] args) {

        int elemIndex = 12;

        List<String> list = new ArrayList<>();
//        List<String> list = new LinkedList<>();

        for (int k = 0; k < LIST_LENGTH; k++){
            list.add("A");
        }

        long startTime = currentTimeMillis();
        for (int k = 0; k < OPERATION_COUNT; k++){
            list.get(elemIndex);
        }
        long stopTime = currentTimeMillis();
        System.out.println("dT: " + (stopTime - startTime));

    }
}
