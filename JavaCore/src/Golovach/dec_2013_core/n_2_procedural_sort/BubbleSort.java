package Golovach.dec_2013_core.n_2_procedural_sort;

/**
 * Created by GUN on 11/23/2015.
 */
public class BubbleSort {

    public static void sort(int[] arr){
        for(int barrier = 0; barrier < arr.length - 1; barrier++){
            for(int index = arr.length-2; index >= barrier; index --){
                if(arr[index] > arr[index + 1]){
                    int tmp = arr[index];
                    arr[index] = arr[index+1];
                    arr[index + 1] = tmp;

                }

            }
        }

    }

}
