package Golovach.dec_2013_core.n_16_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static java.lang.System.currentTimeMillis;

/**
 * Created by GUN on 12/18/2015.
 */
public class TestListRemove {
    static int LIST_LENGTH = 100_000;
    static int OPERATION_COUNT = 100_000;
    public static void main(String[] args) {

        int elemIndex = 12;

        List<String> list = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        for (int k = 0; k < LIST_LENGTH; k++){
            list.add("A");
        }
        for (int k = 0; k < LIST_LENGTH; k++){
            list2.add("A");
        }

        long startTime = currentTimeMillis();
        for (int k = 0; k < OPERATION_COUNT; k++){
            list.remove(list.size() / 2);
        }
        long stopTime = currentTimeMillis();
        System.out.println("ArrayList dT: " + (stopTime - startTime));

        long startTime2 = currentTimeMillis();
        for (int k = 0; k < OPERATION_COUNT; k++){
            list2.remove(list2.size() / 2);
        }
        long stopTime2 = currentTimeMillis();
        System.out.println("LinkedList dT: " + (stopTime2 - startTime2));

    }
}
