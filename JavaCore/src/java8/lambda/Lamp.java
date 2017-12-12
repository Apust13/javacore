package java8.lambda;

/**
 * Created by APUST on 1/31/2017.
 */
public class Lamp implements ElectricityConsumer{

    public void lightOn(){
        System.out.println("Lamp is turn on!!!");
    }

    @Override
    public void turnOn(Object sender) {
        lightOn();
    }
}
