package com.apust.Golovach.dec_2013_core.n_7_exceptions;

/**
 * Created by GUN on 12/3/2015.
 */
public class App_7_00 {
    public static void main(String[] args) {
        System.err.println(0);
        try {
            System.err.println(1);
            if (true)throw new Error();
        } finally {
            System.err.println(2);

//            try{
//
//            }
//            catch(Error er){
//                System.err.println("Catch");
//            }
        }

        System.err.println(3);

    }
}
