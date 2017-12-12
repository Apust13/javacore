package Golovach.dec_2013_core.n_13_collections;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by GUN on 12/9/2015.
 */
public class App_13_01 {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add("a");
//
//        System.out.println(list);
//
//        list.remove("a");
//        System.out.println(list);
//        System.out.println(list.contains("a"));
//        System.out.println(list.get(2));
//        System.out.println(list.set(2, "f"));
//        list.add(1,"a");
//        list.remove("b");
//        System.out.println(list);
//
//       Set<String> set = new HashSet<>();
//        set.add("a");
//        set.add("b");
//        set.add("c");
//        set.add("1");
//        set.add("4");
//        set.add("sfh");
//        set.add("sd1");
//        set.add("1sdgs");
//        set.add("sd2");
//        set.add("sd3");
//
//        System.out.println(set.add("f"));
//
//        System.out.println(set);
//
//        System.out.println(set.remove(1));
//        System.out.println(set);
//        System.out.println(set.contains("a"));
//        set.remove("b");
//        System.out.println(set);

//        Set<String> tSet = new TreeSet<>();
        Set<String> tSet = new LinkedHashSet<>();
        tSet.add("e");
        tSet.add("b");
        tSet.add("c");


        System.out.println(tSet);
        System.out.println(tSet.add("f"));

        System.out.println(tSet);







    }
}


