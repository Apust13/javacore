package Golovach.dec_2013_core.n_3_procedural;

/**
 * Created by GUN on 11/24/2015.
 */
public class Fibanacci_Rec {
    public static int fib(int arg){
        if (arg == 0){
            return 1;
        } else if (arg == 1){
            return 1;
        } else {
            return fib(arg-2) + fib(arg-1);
        }
    }

    public static void main(String[] args) {
//        long start = System.nanoTime();
//        System.out.println(fib(26));
//        System.out.println((System.nanoTime() - start) / 1_000_000);
        for(int i = 0; i < 29; i++){
            long start = System.nanoTime();
            System.out.print("fib("+i+") = " + fib(i) + " ---- ");
            System.out.println((System.nanoTime() - start) / 1_000_000);
        }
    }
}
