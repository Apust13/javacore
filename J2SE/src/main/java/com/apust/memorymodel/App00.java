package com.apust.memorymodel;

/**
 * Created by APUST on 12/3/2017.
 */
public class App00 {

    public static void main(String[] args) {

        Runtime r = Runtime.getRuntime();
        long memory = r.maxMemory();


        System.out.printf("Max memory: %d MB", memory/1024/1024);

    }

}
