package Golovach.dec_2013_core.n_2_procedural_sort;

/**
 * Created by GUN on 11/24/2015.
 */
public class SpeedTestCopy {
    public static void main(String[] args) {
        byte[] arByte = new byte[1_000_000];
        short[] arShort = new short[1_000_000];
        int[] arInt = new int[1_000_000];
        long[] arlong = new long[1_000_000];

        testArraycopy(arByte);
        testFor(arByte);
        testArraycopy(arShort);
        testFor(arShort);
        testArraycopy(arInt);
        testFor(arInt);
        testArraycopy(arlong);
        testFor(arlong);


    }

    private static void testArraycopy(byte[] array){
        System.out.println("Byte array");
        long start = System.nanoTime();
        System.arraycopy(array, 0, array, 1, array.length - 1);
        long stop = System.nanoTime();
        System.out.printf("arraycopy: %,10d\n", stop - start);

        System.out.println();

    }
    private static void testArraycopy(short[] array){
        System.out.println("Short array");
        long start = System.nanoTime();
        System.arraycopy(array, 0, array, 1, array.length-1);
        long stop = System.nanoTime();
        System.out.printf("arraycopy: %,10d\n", stop - start);
        System.out.println();

    }
    private static void testArraycopy(int[] array){
        System.out.println("Int array");
        long start = System.nanoTime();
        System.arraycopy(array, 0, array, 1, array.length-1);
        long stop = System.nanoTime();
        System.out.printf("arraycopy: %,10d\n", stop - start);
        System.out.println();

    }
    private static void testArraycopy(long[] array){
        System.out.println("Long array");
        long start = System.nanoTime();
        System.arraycopy(array, 0, array, 1, array.length-1);
        long stop = System.nanoTime();
        System.out.printf("arraycopy: %,10d\n", stop - start);
        System.out.println();

    }


    private static void testFor(byte[] array){
        System.out.println("Byte array");
        long start = System.nanoTime();
        for(int k = 0; k<array.length - 2; k++){
            array[k+1]=array[k];
        }
        long stop = System.nanoTime();
        System.out.printf("for: %,10d\n",stop - start);
        System.out.println();
    }
    private static void testFor(short[] array){
        System.out.println("Short array");
        long start = System.nanoTime();
        for(int k = 0; k<array.length - 2; k++){
            array[k+1]=array[k];
        }
        long stop = System.nanoTime();
        System.out.printf("for: %,10d\n",stop - start);
        System.out.println();

    }
    private static void testFor(int[] array){
        System.out.println("Int array");
        long start = System.nanoTime();
        for(int k = 0; k<array.length - 2; k++){
            array[k+1]=array[k];
        }
        long stop = System.nanoTime();
        System.out.printf("for: %,10d\n",stop - start);
        System.out.println();

    }
    private static void testFor(long[] array){
        System.out.println("Long array");
        long start = System.nanoTime();
        for(int k = 0; k<array.length - 2; k++){
            array[k+1]=array[k];
        }
        long stop = System.nanoTime();
        System.out.printf("for: %,10d\n",stop - start);
        System.out.println();

    }
}
