package Golovach.dec_2013_core.n_19_MT_2;

/**
 * Created by GUN on 3/20/2015.
 */
public class PrintRunnable implements Runnable {
    private String msg;
    private long sleepMillis;
    public PrintRunnable(String msg, long sleepMillis) {
        this.msg = msg;
        this.sleepMillis = sleepMillis;
    }

    @Override
    public void run() {
        for(int k = 0; k < 10; k++){
            try {
                Thread.sleep(sleepMillis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(msg);
        }

    }
}
