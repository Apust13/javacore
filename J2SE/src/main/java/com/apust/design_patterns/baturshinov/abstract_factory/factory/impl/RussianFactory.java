package com.apust.design_patterns.baturshinov.abstract_factory.factory.impl;

import com.apust.design_patterns.baturshinov.abstract_factory.transport.impl.aircraft.TU134;
import com.apust.design_patterns.baturshinov.abstract_factory.transport.interfaces.Aircraft;
import com.apust.design_patterns.baturshinov.abstract_factory.factory.interfaces.TransportFactory;
import com.apust.design_patterns.baturshinov.abstract_factory.transport.interfaces.Car;
import com.apust.design_patterns.baturshinov.abstract_factory.transport.impl.car.Niva;

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
