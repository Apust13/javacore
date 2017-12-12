package design_patterns.baturshinov.abstract_factory.factory.interfaces;

import design_patterns.baturshinov.abstract_factory.transport.interfaces.Aircraft;
import design_patterns.baturshinov.abstract_factory.transport.interfaces.Car;

// фабрика по созданию транспортных средств
public interface TransportFactory {
    
    // что фабрика будет производить
    
    Car createCar();// автомобили
    
    Aircraft createAircraft(); // самолеты

}
