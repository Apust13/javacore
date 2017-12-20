package com.apust.goJavaOnline_1.generic;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class App00 {

    @Test
    public void arrays(){
        Number[] num;
        Integer[] integer = new Integer[] {1, 2, 3};
        num = integer;
        num[1] = 1.23;
    }


    @Test
    public void generic(){
        List<Number> num;
        List<Integer> integer = Arrays.asList(1,2,3);
        num = integer;
    }

}
