package com.apust.design_patterns.baturshinov.abstract_factory.factory.interfaces;

import com.apust.design_patterns.baturshinov.abstract_factory.transport.interfaces.Aircraft;
import com.apust.design_patterns.baturshinov.abstract_factory.transport.interfaces.Car;

// фабрика по созданию транспортных средств
public interface TransportFactory {
    
    // что фабрика будет производить
    
    Car createCar();// автомобили
    
    Aircraft createAircraft(); // самолеты

}
