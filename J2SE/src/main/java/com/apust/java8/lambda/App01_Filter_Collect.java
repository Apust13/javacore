package com.apust.java8.lambda;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class App01_Filter_Collect {

    public static void main(String[] args) {

        String value = "rgba(255, 255, 255, 1)";

        String regEx = "rgba?\\(255, 255, 255(, 1)?\\)";

//        Set<String> collect = null;
//
//        List<String> collectList = null;
//
//        Set<String> strings = new HashSet<>(Arrays.asList("rgba(255, 255, 255, 1)", "rgb(255, 255, 255)", "rgba(143, 225, 255, 1)", "rgb(155, 255, 255)"));

        List<String> strings2 = new ArrayList<>(Arrays.asList("rgba(255, 255, 255, 1)", "rgb(255, 255, 255)", "rgba(143, 225, 255, 1)", "rgb(155, 255, 255)"));

        strings2.replaceAll(s -> s.replaceAll("rgba", "rgb").replaceAll(", \\d\\)", ")"));


//        System.out.println("Before stream Set : \n " + strings);
//
////        collectList = strings.stream().filter(s -> Pattern.matches(regEx, s)).map(s -> s="rgb(255, 255, 255)").collect(Collectors.toList());
//
//        collectList = strings.stream().map(s - > {if(Pattern.matches(regEx, s)){
//                s ="rgb(255, 255, 255)";
//            }
//        ).collect(Collectors.toList());
//
//        strings.stream()
//                .forEach(s ->{
//                    if(Pattern.matches(regEx, s)){
//                        s ="rgb(255, 255, 255)";
//                    }
//                });
//
////        Set<String> collect = strings.stream().filter(s -> Pattern.matches(regEx, s)).collect(Collectors.toSet());


        System.out.println("After stream Set : \n " + strings2);


//        System.out.println("After stream Collect : \n " + collectList);
//
//        System.out.println("After stream NEW : \n " + collect);



    }


}
