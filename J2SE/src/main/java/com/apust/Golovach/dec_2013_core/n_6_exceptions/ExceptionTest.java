package com.apust.Golovach.dec_2013_core.n_6_exceptions;

/**
 * Created by GUN on 12/1/2015.
 */
public class ExceptionTest {
    public static void main(String[] args) {
        System.err.println("0>");
        a();
        System.err.println("0<");

    }
    public static void a() {
        System.err.println("  1>");
        b();
        System.err.println("  1<");


    }
    public static void b(){
        System.err.println("    2>");
        try {
            c();
        } catch (Exception e){
            System.err.println("BAD ....");
        }
        System.err.println("    2<");

    }
    public static void c(){
        throw new RuntimeException();
//        throw new Exception();


    }
}
