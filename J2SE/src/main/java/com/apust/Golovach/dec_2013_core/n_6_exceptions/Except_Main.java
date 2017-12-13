package com.apust.Golovach.dec_2013_core.n_6_exceptions;

/**
 * Created by GUN on 12/1/2015.
 */
public class Except_Main {

    public static void main(String[] args) {
        int area = area(-12, 5);
        System.out.println("Area = " + area);

    }
    public static int area(int width, int height){
        if(width < 0 || height < 0){
            System.out.println("Incorrect args!");
            System.exit(0);
        }
        return width * height;
    }
}
