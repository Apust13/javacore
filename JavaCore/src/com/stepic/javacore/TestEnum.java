package com.stepic.javacore;

/**
 * Created by GUN on 11/24/2015.
 */
public class TestEnum {

    public static void main(String[] args) {
        for(DayOfWeek day : DayOfWeek.values()){
            System.out.println(day.ordinal() + " " + day.name());
        }
    }

}
