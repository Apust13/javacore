package samples_java;

import java.math.BigDecimal;
import java.math.BigInteger;

import static java.lang.String.*;

/**
 * Created by GUN on 11/17/2015.
 */
public class Factorial {

    public static BigInteger factorial (int value) {
//        if (x < 0) throw  new IllegalArgumentException("x must be >=0");
//        long fact = 1;
//        int i = 2;
//        long start = System.nanoTime();
//        while (i<=x){
//            fact = fact * i;
//            i++;
//        }
////
////        for(int i = 2; i<=x; i++)
////            fact = fact * i;
//        long finish = System.nanoTime();
//        long result = finish - start;
//        System.out.println(finish / 1000000000 + " time ");
//        return fact;

        BigInteger temp = new BigInteger(valueOf(value));

        BigInteger fact = new BigInteger(valueOf(1));
        for(int i = 2; i<= value; i++){
            BigInteger mul = new BigInteger(valueOf(i));
            fact = fact.multiply(mul);
        }
        return fact;

        }
}
