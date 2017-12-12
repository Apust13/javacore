package Golovach.dec_2013_core.n_19_MT_2;


public class App02 {

    public static void main(String[] args) {
        System.out.println("main()" + Thread.currentThread().getName());

        Thread newThread = new Thread (new Runnable(){
            @Override
            public void run() {
                System.out.println("run() " + Thread.currentThread().getName());
            }
        });

        newThread.start();


    }




}
