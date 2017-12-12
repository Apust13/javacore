package Golovach.dec_2013_core.n_1_procedural;

import java.util.Arrays;

/**
 * Created by GUN on 11/20/2015.
 */
public class ArrayTest {


    public static void main(String[] args) {

        int[] ar1 = {5,2,1,3};
        System.out.println(Arrays.toString(ar1));

        for (int i = 0; i<ar1.length; i++){
            swap(ar1,i,i+1);
        }



//        int[] ar2 = new int[ar1.length];

//        String a = "Hello";

//        for(int i=0;i <ar1.length/2;i++){
//            int tmp = ar1[i];
//            ar1[i]=ar1[ar1.length-1-i];
//            ar1[ar1.length-1-i]= tmp;
//
//        }
//        for(int i=0;i < ar1.length;i++){
//            ar2[i] =ar1[ar1.length-1- i];
//
//
//        }

        // рекурсия

//        System.out.println(a.charAt(4));

//    invertRec(ar1, 0);







        System.out.println(Arrays.toString(ar1));




//        a = a + b;
//        b = a - b;
//        a = a - b;
//
//        int tmp = a;
//        a = b;
//        b = tmp;

//         a = a ^ b;
//         b = a ^ b;
//         a = a ^ b;

//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        System.out.println(a + b);
    }
//    public static void invertRec(int[] ar1, int i){
//    if(i<ar1.length/2-1){
//        int tmp = ar1[i];
//        ar1[i]=ar1[ar1.length-1-i];
//        ar1[ar1.length-1-i]= tmp;
//        invertRec(ar1,i+1);
//
//    }
//}

    public static void swap(int[] array, int fst, int snd){
        if(array[fst]>array[snd]){
            int tmp = array[fst];
            array[fst]=array[snd];
            array[snd]=tmp;
        }
    }
}
