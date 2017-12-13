package com.apust.design_patterns.baturshinov.abstract_factory.factory.impl;

import com.apust.design_patterns.baturshinov.abstract_factory.transport.impl.aircraft.Boeing747;
import com.apust.design_patterns.baturshinov.abstract_factory.transport.impl.car.Porsche;
import com.apust.design_patterns.baturshinov.abstract_factory.transport.interfaces.Aircraft;
import com.apust.design_patterns.baturshinov.abstract_factory.factory.interfaces.TransportFactory;
import com.apust.design_patterns.baturshinov.abstract_factory.transport.interfaces.Car;

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
