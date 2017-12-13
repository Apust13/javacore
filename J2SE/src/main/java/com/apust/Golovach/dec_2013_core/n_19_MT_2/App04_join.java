package com.apust.Golovach.dec_2013_core.n_19_MT_2;


public class App04_join {

    public static void main(String[] args) throws InterruptedException {
//        for(int n = 0; n < 5; n++){
//            sillyWork();
//            System.out.println("Hello");
//        }
        Thread newThread = new Thread (new Runnable(){
            @Override
            public void run() {
                for(int n = 0; n < 7; n++) {
                    sillyWork();

                    System.out.println("run() 1");
                }
            }
        });
        newThread.start();



        for(int n = 0; n < 3; n++){
           // Thread.sleep(500);
            sillyWork();

            System.out.println("MainIO ");
        }
        newThread.join();
        System.out.println("That's ALL!!!");

    }

    private static void sillyWork(){
        double d = 2.0;
        for(int k = 0; k < 10_000_000; k++){
            d = Math.sin(d);
        }
    }
}
