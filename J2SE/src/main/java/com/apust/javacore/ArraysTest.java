package com.apust.javacore;

import java.util.Arrays;

/**
 * Created by GUN on 11/18/2015.
 */
public class ArraysTest {
    public static int[] mergeArrays(int[] a1, int[] a2){
        int [] temp = new int [a1.length + a2.length];
        System.arraycopy(a1,0,temp,0,a1.length);
        System.arraycopy(a2,0,temp,a1.length,a2.length);


       Arrays.sort(temp);

        return temp ;

    }

    public static void main(String[] args) {
//        int[] a = new int[10];
//        int[] b = new int[0];
//        int[][] f = new int[][]{{1,3,4,},{5,6,7}};
//
//
//        for(int i = 0; i<a.length; i++){
//            a[i]=i;
//        }
////        for(int c = 0; c<a.length; c++){
////            b[c] = a[c];
////        }
//

        int[] a1 = {0, 2, 4};

        int[] a2 = {1, 3, 5};

        int [] r = mergeArrays(a1,a2);





        System.out.println(Arrays.toString(r));

    }
}
