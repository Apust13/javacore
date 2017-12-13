package com.apust.practic.compare;

import java.util.*;

/**
 * Created by GUN
 * on 15.06.2016.
 */
public class CompareTest {
    public static void main(String[] args) {
        List<Man> arrList = new ArrayList<>();

        Set <Man> set = new HashSet<>();

        Map<Man, Integer> map = new HashMap<>();

        TreeMap<Man, Integer> map1 = new TreeMap<>();

        TreeMap<Man, Integer> map2 = new TreeMap<>(new NewComparator());

        TreeMap<Man, Integer> map3 = new TreeMap<>(new Comparator<Man>() {
            @Override
            public int compare(Man o1, Man o2) {
                return o2.getName().compareTo(o1.getName());
            }

        });


        Man man1 = new Man(13, "Abc");
        Man man2 = new Man(20, "Zxy");
        Man man3 = new Man(1, "Adc");
        Man man4 = new Man(1, "Adc");


        arrList.add(man1);
        arrList.add(man2);
        arrList.add(man3);
        arrList.add(man4);



        set.add(man1);
        set.add(man2);
        set.add(man3);
        set.add(man4);



        map.put(man1, 1);
        map.put(man2, 2);
        map.put(man3, 3);
        map.put(man3, 4);



        map1.put(man1, 1);
        map1.put(man2, 2);
        map1.put(man3, 3);
        map1.put(man3, 4);

        map2.put(man1, 1);
        map2.put(man2, 2);
        map2.put(man3, 3);
        map2.put(man3, 4);

        map3.put(man1, 1);
        map3.put(man2, 2);
        map3.put(man3, 3);
        map3.put(man3, 4);


        System.out.println("Hash man1: " + man1.hashCode() + "; hash man2: " + man2.hashCode() + "; hash man3: " + man3.hashCode() + "; hash man4: " + man4.hashCode());
        System.out.println();
        System.out.println("List " + arrList);
        Collections.sort(arrList);
        System.out.println("List sort " + arrList);
        System.out.println();
        System.out.println("Set " + set);
        System.out.println();
        System.out.println("Map " +map);
        System.out.println();
        System.out.println("TreeMap 1 " +map1);
        System.out.println("TreeMap 2 " +map2);
        System.out.println("TreeMap 3 " +map3);



    }
}
