package com.apust.design_patterns.baturshinov.facade.facade;

// фасад для работы 
import com.apust.design_patterns.baturshinov.facade.parts.Door;
import com.apust.design_patterns.baturshinov.facade.parts.Zazhiganie;
import com.apust.design_patterns.baturshinov.facade.parts.Wheel;

public class CarFacade {

    private Door door = new Door();
    private Zazhiganie zazhiganie = new Zazhiganie();
    private Wheel wheel = new Wheel();

    public void go(){
        door.open();
        zazhiganie.fire();
        wheel.turn();
    }
    
        
    
}
