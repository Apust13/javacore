package Golovach.feb_2013_core.collection_n3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by GUN
 * on 29.06.2016.
 */
public class UniqueWords {
    public static void main(String[] args) {
        String str = "как дела привет спроси его как дела привет";

        String[] arr = str.split(" ");

        Set<String> set = new HashSet<>(Arrays.asList(arr));


        System.out.println(Arrays.toString(arr));
        System.out.println(set);
        System.out.println(set.size());

    }
}
