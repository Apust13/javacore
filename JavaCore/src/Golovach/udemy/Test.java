package Golovach.udemy;

/**
 * Created by GUN
 * on 16.06.2016.
 */
public class Test {
    public static void main(String[] args) {

        String a = new String("abc");
        String b =""+ "abc";

        System.out.println(a==b);
        System.out.println(a.equals(b));

    }
}
