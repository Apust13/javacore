package com.apust.practic;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by GUN
 * on 15.06.2016.
 */
public class CollectionsTest {

    // Подсчет количества одинаковых цифр в массиве.
    public static void countNumber(int arr[]){
        Integer integer;

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for(int val : arr){
            integer = map.get(val);
            if(integer == null){
                map.put(val, 1);
            } else {
                map.put(val, integer + 1);
            }
        }

        System.out.println(map);


    }

    // Подсчет количества одинаковых букв в строке.
    public static void countLetter(String str){


        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++){
            char c = str.toLowerCase().charAt(i);

            if(!map.containsKey(c)){
                map.put(c,1);
            } else{
                int cnt = map.get(c);
                map.put(c,cnt +1);
            }
        }
        System.out.println(map);
    }



    public static void main(String[] args) {



        int arr[] = {3,6,4,1,9,7,4,3};
        String str1 = "Привет какт делап?";

        countNumber(arr);
        countLetter(str1);


    }

}
