package com.apust.Golovach.feb_2013_core.collection_n3;

import java.util.*;

/**
 * Created by GUN
 * on 29.06.2016.
 */
public class App00 {
    public static void main(String[] args) {
       SortedSet<String> coll = new TreeSet<>(new StringComparator());

        coll.add("A");
        coll.add("BC");
        coll.add("B");
        coll.add("CCC");
        coll.add("CB");
        coll.add("AAA");
        coll.add("BBB");

        //Iterator<String> iterator = coll.iterator();

//        while(iterator.hasNext()){
//            String elem = iterator.next();
//            System.out.print(elem + " ");
//
//        }
        System.out.println();
        System.out.println("--------------");
        System.out.println(coll);




    }
}

class StringComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {

//        int compare = o1.length() - o2.length();
//        return(compare !=0)? compare: o1.compareTo(o2);

        if(o1.compareTo(o2) < 0 & o1.length() - o2.length() < 0 ) return -1;
        if(o1.compareTo(o2) > 0 & o1.length() - o2.length() > 0 ) return 1;
        if(o1.compareTo(o2) < 0 ) {
            return -1;
        }
         if(o1.compareTo(o2) > 0 ) {
            return 1;
        }
        if(o1.length()- o2.length() < 0 ) {
            return -1;
        }
        if(o1.length()- o2.length() > 0 ) {
            return 1;
        }
        else return 0;
    }
}