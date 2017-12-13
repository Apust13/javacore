package com.apust.comparable;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {


    public static void main(String[] args) {

        Man man1 = new Man(170, 70);
        Man man2 = new Man(180, 60);
        Man man3 = new Man(100, 90);
        Man man4 = new Man(200, 120);


        Set<Man> ts1 = new TreeSet<Man>();
        Set<Man> ts2 = new TreeSet<Man>();




//		ts1.add(man1);
//		ts1.add(man2);
//		ts1.add(man3);
//		ts1.add(man4);
//
//
//		ts2.add(man1);
//		ts2.add(man2);
//		ts2.add(man3);
//		ts2.add(man4);





        Set<Man> ts3 = new TreeSet<Man>(new Comparator<Man>() {

            @Override
            public int compare(Man arg0, Man arg1) {
                if(arg0.getVes() > arg1.getVes()){
                    return 1;
                } else if (arg0.getVes() < arg1.getVes()){
                    return -1;
                } else return 0;
            }
        });

        ts3.add(man1);
        ts3.add(man2);
        ts3.add(man3);
        ts3.add(man4);

//		System.out.println(ts1.toString());
//		System.out.println(ts3.toString());



        Set<Man> hs = new HashSet<Man>();

        hs.add(man1);
        hs.add(man2);
        hs.add(man3);
        hs.add(man4);


        System.out.println(hs.toString());



    }

}

