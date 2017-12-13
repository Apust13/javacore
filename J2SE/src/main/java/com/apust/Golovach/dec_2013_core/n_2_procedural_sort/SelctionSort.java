package com.apust.Golovach.dec_2013_core.n_2_procedural_sort;


public class SelctionSort {
    public static void sort(int[] arr){
        for(int barrier = 0; barrier < arr.length-1; barrier++ ){
            for(int index = barrier + 1; index < arr.length; index ++){
                if(arr[barrier] > arr[index]){
                    int tmp = arr[index];
                    arr[index] = arr[barrier];
                    arr[barrier]=tmp;
                }
            }

        }
    }

}
