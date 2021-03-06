package com.apust.design_patterns.baturshinov.abstract_factory.transport.impl.car;

import com.apust.design_patterns.baturshinov.abstract_factory.transport.interfaces.Car;

public class Porsche implements Car{

    @Override
    public void drive() {
        System.out.println("Drive speed 150 km/h");
    }

    @Override
    public void stop() {
        System.out.println("Stopped at 1 sec");
    }

}
