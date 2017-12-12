package design_patterns.baturshinov.facade.objects;

import design_patterns.baturshinov.facade.facade.CarFacade;
import design_patterns.baturshinov.facade.parts.Door;
import design_patterns.baturshinov.facade.parts.Wheel;
import design_patterns.baturshinov.facade.parts.Zazhiganie;

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
