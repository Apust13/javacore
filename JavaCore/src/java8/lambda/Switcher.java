package java8.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by APUST on 1/31/2017.
 */
public class Switcher {


    private List<ElectricityConsumer> consumers = new ArrayList<>();

    public void addConsumer(ElectricityConsumer consumer){
        consumers.add(consumer);
    }

    public void removeConsumer(ElectricityConsumer consumer){
        consumers.remove(consumer);
    }


    public void switchOn(){
        System.out.println("Switcher is turn on!");

//        if(consumer != null){
//            consumer.turnOn();
//        }
        for(ElectricityConsumer elCons : consumers){
            elCons.turnOn(this);
        }

    }
}
