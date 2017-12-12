package design_patterns.baturshinov.abstract_factory.transport.impl.car;

import design_patterns.baturshinov.abstract_factory.transport.interfaces.Car;

public class Niva implements Car {

    @Override
    public void drive() {
        System.out.println("Niva drive");
    }

    @Override
    public void stop() {
        System.out.println("Niva stopped");
    }
    
}
