package com.apust.design_patterns.baturshinov.abstract_factory.start;

import com.apust.design_patterns.baturshinov.abstract_factory.factory.impl.RussianFactory;
import com.apust.design_patterns.baturshinov.abstract_factory.factory.impl.USAFactory;
import com.apust.design_patterns.baturshinov.abstract_factory.factory.interfaces.TransportFactory;

public class Start {
    
    private static TransportFactory factory;
    
    public static void main(String[] args) {
      
        if (false){
            factory = new RussianFactory();
        }else{
            factory = new USAFactory();
        }
        
        
        factory.createAircraft().flight();
        factory.createCar().drive();
        
        
    }

}
