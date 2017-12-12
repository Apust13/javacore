package java8.lambda;

/**
 * Created by APUST on 1/31/2017.
 */
public class Radio implements ElectricityConsumer {

    public void radioOn(){
        System.out.println("Radio is turn on and play music!!!");
    }

    @Override
    public void turnOn(Object sender) {
        radioOn();
    }
}
