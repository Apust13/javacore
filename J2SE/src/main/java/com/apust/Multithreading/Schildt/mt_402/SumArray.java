package com.apust.Multithreading.Schildt.mt_402;

/**
 * Created by GUN on 3/21/2015.
 */
public class SumArray {
    private int sum;

   /* synchronized*/ int sumArray(int nums[]){
      sum = 0;

        for (int i=0; i<nums.length; i++){
            sum+= nums[i];
            System.out.println("Running total for " + Thread.currentThread().getName() + " is " + sum);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("MainIO thread interrupted");
            }
        }
        return sum;
    }


}
