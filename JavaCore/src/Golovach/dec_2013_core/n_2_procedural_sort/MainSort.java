package Golovach.dec_2013_core.n_2_procedural_sort;


import java.util.Arrays;
import java.util.Random;

public class MainSort {
    public static void main(String[] args) {


        int[] a = {3,7,1,9,2,6,5,8,4};

        int[][] data = {
                {},
                {1},
                {4,7,2,5},
                {2,3,6,1,4,8,8,90,33,21}


        };
        int[] big_ar = new int[10000];
        Random rnd = new Random();
        for(int j = 0;j <big_ar.length ; j++){
            big_ar[j] = rnd.nextInt();

        }

//        for(int[] arr : data){
//
//            System.out.print(Arrays.toString(arr) + " - >> ");
//            long time = System.nanoTime();
//            BubbleSort.sort();
//            System.out.println(Arrays.toString(arr));
//            System.out.println("Operation time " + ((System.nanoTime() - time) / 1_000_000));
//        }
        long time = System.nanoTime();
        SelctionSort.sort(a);
//        System.out.println(Arrays.toString(big_ar));
        System.out.println("Operation time " + ((System.nanoTime() - time) / 1_000_000));
        System.out.println();
        System.out.print(Arrays.toString(a) + " - >> ");
        System.out.println(Arrays.binarySearch(a, 7));


//        sort(a);
//
//        System.out.println(Arrays.toString(a));
    }
}
