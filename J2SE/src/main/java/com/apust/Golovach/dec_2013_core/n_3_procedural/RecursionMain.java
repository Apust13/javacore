package com.apust.Golovach.dec_2013_core.n_3_procedural;

/**
 * Created by GUN on 11/24/2015.
 */
public class RecursionMain {
    public static void main(String[] args) {
//        f(1);
//        int[] arr = {1,2,3,4,5,6,7,8};
//        ArrayInverter.invertRec(arr, 0);
//        System.out.println(Arrays.toString(arr));

        System.out.println(factorial(5));

        }

    public static void f(int arg){

        if(arg < 7){
            f(2*arg);
        }
        System.out.print(" " + arg);
    }
    public static int factorial(int arg){

        if(arg == 1){
            return 1;
        }
        else return arg * factorial(arg -1);
        }

}
