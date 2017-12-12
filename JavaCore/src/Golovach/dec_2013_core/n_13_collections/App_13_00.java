package Golovach.dec_2013_core.n_13_collections;

import java.util.*;

/**
 * Created by GUN on 12/7/2015.
 */
public class App_13_00 {
    public static void main(String[] args) {
        List arList = new ArrayList();
        List linkList = new LinkedList();


        Set hSet = new HashSet();
        Set tSet = new TreeSet();

        Map hMap = new HashMap();
        Map tMap = new TreeMap();


        Man man1 = new Man(32,"Ivan","Golovach" );
        Man man2 = new Man(42,"Gosha","Kutsenko" );

        House bd = new House();
        bd.setAdress(" Minsk - Lenina - 5");
        bd.putCitizenHome(man1);
        bd.putCitizenHome(man2);

        arList.add(man1);
        arList.add(man2);

//        System.out.println(arList.);



        System.out.println(arList.toString());





    }
}
