package Golovach.dec_2013_core.n_19_MT_2;


public class App03 {

    public static void main(String[] args) throws InterruptedException {
//        for(int n = 0; n < 5; n++){
//            sillyWork();
//            System.out.println("Hello");
//        }
        new Thread (new Runnable(){
            @Override
            public void run() {
                for(int n = 0; n < 5; n++) {
                    sillyWork();
                   // Thread.yield();
                    System.out.println("run() 1");
                }
            }
        }).start();
        new Thread (new Runnable(){
            @Override
            public void run() {
                for(int n = 0; n < 5; n++) {
                    sillyWork();
                    //Thread.yield();
                    System.out.println("run() 2");
                }
            }
        }).start();
        new Thread (new Runnable(){
            @Override
            public void run() {
                for(int n = 0; n < 5; n++) {
                    sillyWork();
                    Thread.yield();
                    System.out.println("run() 3");
                }
            }
        }).start();
        new Thread (new Runnable(){
            @Override
            public void run() {
                for(int n = 0; n < 5; n++) {
                    sillyWork();
                    //Thread.yield();
                    System.out.println("run() 4");
                }
            }
        }).start();
        new Thread (new Runnable(){
            @Override
            public void run() {
                for(int n = 0; n < 5; n++) {
                    sillyWork();
                    //Thread.yield();
                    System.out.println("run() 5");
                }
            }
        }).start();



        for(int n = 0; n < 5; n++){
           // Thread.sleep(500);
            sillyWork();

            System.out.println("MainIO ");
        }

    }

    private static void sillyWork(){
        double d = 2.0;
        for(int k = 0; k < 150_000_000; k++){
            d = Math.sin(d);
        }
    }
}
