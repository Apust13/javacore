package geekbrains.practic.strings;

import java.util.Arrays;

/**
 * Created by GUN
 * on 17.06.2016.
 */
public class TestStrings {
    public static void main(String[] args) {
        String str = "пРивет кАк деЛа";

        String str1 = new String("help");
        String str2 = "help";
        String str3 = str1;
        char c[] = {'h','e','l','p'};
        char c1[];
        c1 = str1.toCharArray();


        System.out.println(str1.compareTo(String.copyValueOf(c)));
        System.out.println(Arrays.toString(c));
        System.out.println(String.copyValueOf(c));

//        System.out.println("HashCode String 1 - " + str1.hashCode());
//        System.out.println("HashCode String 2 - " + str2.hashCode());
//        System.out.println("HashCode String 3 - " + str3.hashCode());
        System.out.print("String 1 == 2 - ");
        System.out.println(str1 == str2);
        System.out.print("String 1.equals(2) - ");
        System.out.println(str1.equals(str2));

        System.out.print("String 1 == 3 - ");
        System.out.println(str1 == str3);
        System.out.print("String 1.equals(3) - ");
        System.out.println(str1.equals(str3));

        System.out.print("String 1.equals(c) - ");
        System.out.println(str1.equals(c.toString()));

        System.out.println(str1.getClass());
        System.out.println(c.getClass());

        for(int i = 0; i<c.length;i++){
            System.out.print(c[i]);
        }
        System.out.println();

        for(int i = 0; i<c1.length;i++){
            System.out.print(c1[i]);
        }
        System.out.println();

        System.out.println(Arrays.equals(c, c1));


        System.out.println("--------- Меняет значение  ---------");


        str1 = str1.substring(0,4) +"1";
        str2 = "help1";
        //str3 = str3.substring(0,4) +"1";


        System.out.println("HashCode String 1 - " + str1.hashCode());
        System.out.println("HashCode String 2 - " + str2.hashCode());
        System.out.println("HashCode String 3 - " + str3.hashCode());
        System.out.print("String 1 == 2 - ");
        System.out.println(str1 == str2);
        System.out.print("String 1.equals(2) - ");
        System.out.println(str1.equals(str2));

        System.out.print("String 1 == 3 - ");
        System.out.println(str1 == str3);
        System.out.print("String 1.equals(3) - ");
        System.out.println(str1.equals(str3));
        System.out.println(str3);

        System.out.println(str1.getClass());
        System.out.println(str2.getClass());
        System.out.println(str3.getClass());

    }
}
