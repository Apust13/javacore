package Golovach.dec_2013_core.n_2_procedural_sort;

/**
 * Created by GUN on 11/23/2015.
 */
public class InsertionSort {
    public static void sort (int[] arr){
        for(int barrier = 1; barrier < arr.length; barrier++){
            int newElement = arr[barrier];
            int location = barrier -1;
            while(location >=0 && arr[location] > newElement){
                arr[location+1] = arr[location];
                location --;
            }
            arr[location+1] = newElement;
        }
    }
}
