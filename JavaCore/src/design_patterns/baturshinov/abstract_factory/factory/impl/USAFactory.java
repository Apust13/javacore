package design_patterns.baturshinov.abstract_factory.factory.impl;

import design_patterns.baturshinov.abstract_factory.transport.impl.aircraft.Boeing747;
import design_patterns.baturshinov.abstract_factory.transport.impl.car.Porsche;
import design_patterns.baturshinov.abstract_factory.transport.interfaces.Aircraft;
import design_patterns.baturshinov.abstract_factory.factory.interfaces.TransportFactory;
import design_patterns.baturshinov.abstract_factory.transport.interfaces.Car;

// американские транспортные средства
public class USAFactory implements TransportFactory{

    @Override
    public Car createCar() {
        return new Porsche();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing747();
    }

}
