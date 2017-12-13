package com.apust.memorymodel;

/**
 * Created by APUST on 12/3/2017.
 */
public class Temp {

    public static void main(String[] args) {

       int i = 5;
        i = (++i + ++i);
        assert (13 == i);


        System.out.printf("i =  %d", i);

    }

}
