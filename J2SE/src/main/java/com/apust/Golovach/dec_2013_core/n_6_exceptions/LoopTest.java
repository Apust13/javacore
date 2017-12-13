package com.apust.Golovach.dec_2013_core.n_6_exceptions;

/**
 * Created by GUN on 12/1/2015.
 */
public class LoopTest {
    public static void main(String[] args) {
        f();
        System.out.println(" ---> Begin next method!");

    }

    public static void f (){
        for(int i = 0; i < 3; i++){
            System.out.println("Start - " + i);
            if(true)continue;
//            if(true)break;
//            if(true)return;
//            if(true)throw new Error();
            System.out.println("Finish - " + i);
        }
        System.out.println("The End of F!");
    }
}
