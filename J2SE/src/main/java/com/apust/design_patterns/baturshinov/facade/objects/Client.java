package com.apust.design_patterns.baturshinov.facade.objects;

import com.apust.design_patterns.baturshinov.facade.facade.CarFacade;
import com.apust.design_patterns.baturshinov.facade.parts.Door;
import com.apust.design_patterns.baturshinov.facade.parts.Wheel;
import com.apust.design_patterns.baturshinov.facade.parts.Zazhiganie;

public class Client {

    public static void main(String[] args) {
        // вызов без фасада
        Door door = new Door();
        door.open();

        Zazhiganie zazhiganie = new Zazhiganie();
        zazhiganie.fire();
        
        Wheel wheel = new Wheel();
        wheel.turn();
        

        // вызов с фасадом
        CarFacade carFacade = new CarFacade();
        carFacade.go();



    }
}
