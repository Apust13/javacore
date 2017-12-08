package com.apust.javacore.work;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class App02_map_flatmap {

    public static void main(String[] args) {
        List<String> arg0 = asList("1", "2", "3");
        List<String> arg1 = asList("A", "B");

        for(List <String> elem : mul(arg0, arg1)){
            System.out.println(elem);
        }

        mul2(arg0, arg1).forEach(System.out::println);
    }

    //Java 7
    public static <T> List<List<T>> mul(List<T> arg0, List<T> arg1) {
        List<List<T>> result = new ArrayList<>();
        for(T fst : arg0){
            for(T snd : arg1) {
                result.add(asList(fst, snd));
            }
        }
        return result;
    }

    //Java 8
    public static <T> Stream<List<T>> mul2(List<T> arg0, List<T> arg1) {
        return arg0.stream().flatMap(fst -> arg1.stream().map(snd -> asList(fst, snd)));
    }


}



