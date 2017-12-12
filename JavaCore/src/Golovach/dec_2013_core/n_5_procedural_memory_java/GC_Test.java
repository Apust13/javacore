package Golovach.dec_2013_core.n_5_procedural_memory_java;

/**
 * Created by GUN on 11/26/2015.
 */
public class GC_Test {
    public int value;
    public GC_Test(int value){
        this.value = value;
    }

}

class App0 {
    public static void main(String[] args) {
        Object[] ref = new Object[1];
        int counter = 0;
        while (true){
            ref = new Object[]{ref, new byte[1_000_0000]};
            System.out.println(counter++);
        }
    }
}
