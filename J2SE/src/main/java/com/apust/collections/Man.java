package com.apust.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by GUN on 4/28/2015.
 */
public class Man {
    private String name;
    private int age;
    private int heigh;

    public int getHeigh() {
        return heigh;
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }

    public Man(String name, int age, int heigh) {

        this.name = name;
        this.age = age;
        this.heigh = heigh;
    }

    public Man(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return name + " " + age;
    }

    @Override
    public int hashCode() {
        int hash = 31*age + 32*heigh;
        return hash  ;
    }

    @Override
    public boolean equals(Object obj) {
        if(this.hashCode() == obj.hashCode()){
            return true;
        }
        return false;
    }
}
