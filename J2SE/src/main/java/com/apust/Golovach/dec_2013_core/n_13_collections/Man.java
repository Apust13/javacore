package com.apust.Golovach.dec_2013_core.n_13_collections;

/**
 * Created by GUN on 12/7/2015.
 */
public class Man {
    private int age;
    private String name;
    private String lastName;


    public Man() {

    }

    public Man(int age, String name, String lastName) {
        this.age = age;
        this.name = name;
        this.lastName = lastName;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
       return name + " " + lastName + " " + age;
    }

}
