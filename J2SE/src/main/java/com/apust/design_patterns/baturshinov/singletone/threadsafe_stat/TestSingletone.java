package com.apust.design_patterns.baturshinov.singletone.threadsafe_stat;


public class TestSingletone {

    private static TestSingletone instance = new TestSingletone();

    private TestSingletone() {
    }

    public static TestSingletone getInstance(){
         return instance;
    }

    public void print(){
        System.out.println(this);
    }
}
