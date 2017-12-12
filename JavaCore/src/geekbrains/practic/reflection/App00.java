package geekbrains.practic.reflection;

import java.util.Arrays;

/**
 * Created by GUN
 * on 28.06.2016.
 */
public class App00 {

    static class Cls {
        int f;
        int f1;
    }

    public static void main(String[] args) throws NoSuchFieldException {
        Cls ex = new Cls();

        Class aClass = ex.getClass();


        System.out.println(Arrays.toString(aClass.getDeclaredFields()));
    }
}


