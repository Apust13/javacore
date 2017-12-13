package com.apust.Golovach.dec_2013_core.n_14_collections;

import java.util.Iterator;

/**
 * Created by GUN on 12/16/2015.
 */
public class IteratorTest {
    public static void main(String[] args) {

    }

}
class Student{}
class Group implements Iterable<Student>{

    @Override
    public Iterator<Student> iterator() {
        return null;
    }
}
