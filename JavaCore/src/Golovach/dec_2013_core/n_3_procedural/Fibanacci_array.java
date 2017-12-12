package Golovach.dec_2013_core.n_3_procedural;

/**
 * Created by GUN on 11/24/2015.
 */
public class Fibanacci_array {

    public static int fib (int arg){
        if(arg == 0) return 1;
        if(arg == 1) return 1;

        int[] result = new int[arg +1];
        result[0] = 1;
        result[1] = 1;
        for(int k =2; k < result.length; k++){
            result[k] = result[k-2] + result[k-1];
        }
        return result[arg];
    }

    public static void main(String[] args) {
//        long start = System.nanoTime();
//        System.out.println(fib(26));
//        System.out.println((System.nanoTime() - start) / 1_000_000);

        for(int i = 0; i < 555; i++){
            long start = System.nanoTime();
            System.out.print("fib("+i+") = " + fib(i) + " ---- ");
            System.out.println((System.nanoTime() - start) / 1_000_000);
        }
    }

}
