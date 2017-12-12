package samples_java;

/**
 * Created by GUN on 11/17/2015.
 */
public class FactorialCash {
    static long[] table = new long[21];
    static { table[0] = 1;}
    static int last = 0;
    public static  long factorial3(int x) throws IllegalArgumentException{
        if (x >=table.length) throw new IllegalArgumentException("Overload: x too big");
        if(x<0) throw new IllegalArgumentException("x must be possitive");
        while (last < x){
            table[last+1] = table[last] * (last +1);
            last++;
        }
        return table[x];
    }

}
