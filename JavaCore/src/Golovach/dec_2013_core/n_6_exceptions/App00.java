package Golovach.dec_2013_core.n_6_exceptions;

/**
 * Created by GUN on 12/2/2015.
 */
public class App00 {
    public static void main(String[] args) {
        System.err.println(0);
        f();
        System.err.println(0);

    }

    private static void f() {
        System.err.println(1);
        try {
            g();
        } catch (Exception e){
            System.err.println("Exception");
        }
        System.err.println(1);
    }

    private static void g() {
        System.err.println(2);

        try {
            h();
        } catch (Error e){
            System.err.println("Error");
        }
        System.err.println(2);
    }

    private static void h() {
        throw new RuntimeException();
    }
}
