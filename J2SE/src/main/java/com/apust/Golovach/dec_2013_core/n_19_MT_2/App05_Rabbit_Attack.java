package com.apust.Golovach.dec_2013_core.n_19_MT_2;


public class App05_Rabbit_Attack {
    public static void main(String[] args) throws InterruptedException {
        for(int k =1; k < Integer.MAX_VALUE; k++){
            String spaces = spaces(k);
            Runnable printer = new PrintRunnable (spaces + k, 100);
            Thread thread = new Thread(printer);
            thread.start();
            Thread.sleep(100);
        }
    }

    private static String spaces (int count){
        String result = "";
        for (int i = 0; i < count; i ++){
            result += " ";
        }
        return result;

    }

}
