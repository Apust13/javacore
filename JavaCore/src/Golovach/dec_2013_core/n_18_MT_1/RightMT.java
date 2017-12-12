package Golovach.dec_2013_core.n_18_MT_1;

public class RightMT {

    public static final int N = 10_000_000;
    public static int counter = 0;

    public synchronized static void inc(){
        counter ++;
    }

    public static void main(String[] args) throws InterruptedException {
       Thread t0 = new Thread(new Runnable() {

           public void run() {
               for (int k =0; k < N; k++) inc();
           }
       });
        t0.start();
        Thread t1 = new Thread(new Runnable() {

            public void run() {
                for (int k =0; k < N; k++) inc();
            }
        });
        t1.start();

        t0.join();
        t1.join();
        System.out.println(counter);
    }
}
