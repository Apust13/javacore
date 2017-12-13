package com.apust.design_patterns.baturshinov.factory_method_singletone;

public class Start {
    
    public static void main(String[] args) {
        


        Car car = CarSelector.getInstance().getCar(RoadType.CITY);
        car.drive();
        car.stop();

        Car car2 = CarSelector.getInstance().getCar(RoadType.OFF_ROAD);
        car2.drive();
        car2.stop();


//
//
//        car = carSelector.getCar(RoadType.GAZON);
        
        
    }

}
