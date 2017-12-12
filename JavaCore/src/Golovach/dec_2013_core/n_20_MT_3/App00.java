package Golovach.dec_2013_core.n_20_MT_3;

/**
 * Created by GUN on 3/21/2015.
 */
public class App00 {

    public static void main(String[] args) throws InterruptedException {
//        new Object().wait();
//        new Object().notify();
//        new Object().notifyAll();
       Object ref = new Object();
        synchronized (ref) {
            ref.wait(3000);

        }
        Thread t1 = new Thread();
        t1.notify();
    }

}
