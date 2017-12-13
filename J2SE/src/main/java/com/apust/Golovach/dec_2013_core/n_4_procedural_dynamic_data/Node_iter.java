package com.apust.Golovach.dec_2013_core.n_4_procedural_dynamic_data;

import static java.util.Arrays.copyOfRange;

/**
 * Created by GUN on 11/25/2015.
 */
public class Node_iter {

    public static void main(String[] args) {
        Node tail = genIter(1,2,3,4);

    }
    // Iteration
    public static Node genIter(int... values){
        Node tail = null;

        for(int k = values.length-1;k>=0; k--){
            tail = new Node(values[k],tail);
        }

//        for(int elem : values){
//            tail = new Node(values[elem],tail);
//        }
        return tail;
    }

    // Recurssion
    public static Node genRecFull(int... v){
        if(v.length == 0)
            return null;
        else {
            int[] newArray = copyOfRange(v, 1, v.length);
            return new Node(v[0], genRecFull(newArray));
        }
    }
// �������� ������
    public static Node genRec(int...v){
        return v.length == 0 ? null : new Node(v[0],genRec(copyOfRange(v,1,v.length)));

    }



}
