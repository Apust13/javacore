package com.apust.design_patterns.baturshinov.singletone.threadsafe_stat;

import com.apust.design_patterns.baturshinov.singletone.classic.TestSingletone;

/**
 * Created by GUN on 4/15/2015.
 */
public class StartSingleTone {
    public static void main(String[] args) {
        TestSingletone.getInstance().print();
        TestSingletone.getInstance().print();
        TestSingletone.getInstance().print();
    }
}
