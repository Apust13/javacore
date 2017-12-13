package com.apust.Golovach.dec_2013_core.n_14_collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by GUN on 12/10/2015.
 */
public class App_14_00 {
    public static void main(String[] args) {
        Map<String,Person> map = new HashMap<>();
        Person man1 = new Person(25,"Kein");
        Person man2 = new Person(55,"Jane");
        Person man3 = new Person(12,"Rick");

        map.put(man1.getName(),man1);
        map.put(man2.getName(),man2);
        map.put(man3.getName(),man3);

        System.out.println(map);
        System.out.println(map.entrySet());


    }
}
class Person{
    private int age;
    private String name;


    public Person() {

    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName() +" " + age;
    }

}