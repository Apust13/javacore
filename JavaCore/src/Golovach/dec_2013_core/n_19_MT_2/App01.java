package Golovach.dec_2013_core.n_19_MT_2;


public class App01 {

    public static void main(String[] args) {
        Runnable r = new Runnable(){
            @Override
            public void run() {
                System.out.println("run() 2");
            }
        };
        r.run();

        System.out.println(r.getClass().getName());


    }




}
