package design_patterns.baturshinov.singletone.threadsafe;

import design_patterns.baturshinov.singletone.classic.TestSingletone;

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
