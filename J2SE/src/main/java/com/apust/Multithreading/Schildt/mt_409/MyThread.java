package com.apust.Multithreading.Schildt.mt_409;

/**
 * Created by GUN on 3/21/2015.
 */
public class MyThread implements Runnable {
    Thread thrd;
    TickTock ttOb;

    MyThread(String name, TickTock tt){
        thrd = new Thread(this, name);
        ttOb = tt;
        thrd.start();
    }


    @Override
    public void run() {

        if(thrd.getName().compareTo("Tick") == 0){
            for(int i=0; i<5; i++){
                ttOb.tick(true);
            }
            ttOb.tick(false);
        }
        else {
            for (int i=0; i<5; i++){
                ttOb.tock(true);
            }
            ttOb.tock(false);
        }
    }
}
