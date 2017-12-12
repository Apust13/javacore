package design_patterns.baturshinov.abstract_factory.factory.impl;

import design_patterns.baturshinov.abstract_factory.transport.impl.aircraft.TU134;
import design_patterns.baturshinov.abstract_factory.transport.interfaces.Aircraft;
import design_patterns.baturshinov.abstract_factory.factory.interfaces.TransportFactory;
import design_patterns.baturshinov.abstract_factory.transport.interfaces.Car;
import design_patterns.baturshinov.abstract_factory.transport.impl.car.Niva;

// российские транспортные средства
public class RussianFactory implements TransportFactory{

    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }

}
