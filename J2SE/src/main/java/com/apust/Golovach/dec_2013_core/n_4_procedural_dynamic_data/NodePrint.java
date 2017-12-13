package com.apust.Golovach.dec_2013_core.n_4_procedural_dynamic_data;

/**
 * Created by GUN on 11/25/2015.
 */
public class NodePrint {
    public static void main(String[] args) {
        Node tail = _(1,2,3,4,5);
        System.out.println(toStringIter(tail));
        System.out.println(toStringRec(tail));

    }
    public static String toStringIter(Node tail){
        String result = "";
        while(tail != null){
            result += tail.value + "->";
            tail = tail.next;
        }
        return result + "*";
    }

    public static String toStringRec(Node tail){
        return (tail == null)? "*" : tail.value + "->" + toStringRec(tail.next);
    }
    public static Node _(int... values){
        Node tail = null;
        for(int k = values.length-1; k>=0; k--){
            tail = new Node(values[k], tail);
        }
        return tail;
    }
}
