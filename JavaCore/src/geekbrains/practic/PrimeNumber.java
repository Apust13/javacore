package geekbrains.practic;

import java.util.ArrayList;

/**
 * Created by GUN
 * on 15.06.2016.
 */
public class PrimeNumber {

    public static void main(String[] args) {
        ArrayList<Integer> primeVals = new ArrayList<>();

        for(int i = 2; i < 1000; i++){
            boolean isPrime = true;
            for(int p : primeVals){
                if(i%p==0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                primeVals.add(i);
            }
        }



        System.out.println(primeVals);

    }
}
