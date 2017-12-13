package com.apust.Golovach.dec_2013_core.n_3_procedural;

/**
 * Created by GUN on 11/24/2015.
 */
public class ArrayInverter {

    public static void invert(int[] array){
       for(int i= 0; i< array.length/2; i++){
           int tmp = array[i];
           array[i] = array[array.length - i - 1];
           array[array.length - i - 1] = tmp;
       }
    }

    public static void invertRec(int[] arr, int k){
        if(k < arr.length/2){
            int tmp = arr[k];
            arr[k] = arr[arr.length - k - 1];
            arr[arr.length - k - 1] = tmp;
            invertRec(arr, k + 1);
        }
    }

}
