package com.apust.samples_java;

/**
 * Created by GUN on 11/17/2015.
 */
public class Factorial2 {

    public static long factorial2(long x){
        if (x<0) throw new IllegalArgumentException("x must be >=0");
        if(x<=1) return 1; // end recursion
        else return x * factorial2(x-1);
    }
}
