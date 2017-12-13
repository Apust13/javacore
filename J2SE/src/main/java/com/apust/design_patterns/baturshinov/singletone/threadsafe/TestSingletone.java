package com.apust.design_patterns.baturshinov.singletone.threadsafe;


public class TestSingletone {

    private static TestSingletone instance;

    private TestSingletone() {
    }

    public static synchronized TestSingletone getInstance(){
        if (instance == null){
            instance = new TestSingletone();
        }
        return instance;
    }

    public void print(){
        System.out.println(this);
    }
}
