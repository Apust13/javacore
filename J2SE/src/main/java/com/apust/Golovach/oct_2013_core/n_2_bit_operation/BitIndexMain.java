package com.apust.Golovach.oct_2013_core.n_2_bit_operation;

/**
 * Created by GUN
 * on 21.06.2016.
 */
public class BitIndexMain {

    private long data;

    public BitIndexMain(boolean allTrue) {
        if(allTrue){
            data = -1;
        } else {
            data = 0;
        }
    }

    public boolean get(int index){
        return (data & (1 << index)) != 0;

    }

    public void set(int index, boolean value){

        if(value){

            data = data | (1 << index);
        } else {
            data = data & ~(1 << index);

        }

    }


}

class BitIndexTest{
    public static void main(String[] args) {
        BitIndexMain bitIndex = new BitIndexMain(false);
        bitIndex.set(19, true);
        bitIndex.set(62, true);

//        System.out.println(Integer.toBinaryString((1<<2)>>1));
//        System.out.println(false || true);
//        System.out.println(true || false);
//        System.out.println(true || true);

    }


}
