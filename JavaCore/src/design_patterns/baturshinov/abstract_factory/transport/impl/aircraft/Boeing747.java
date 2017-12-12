package design_patterns.baturshinov.abstract_factory.transport.impl.aircraft;

import design_patterns.baturshinov.abstract_factory.transport.interfaces.Aircraft;

public class Boeing747 implements Aircraft{

    @Override
    public void flight() {
        System.out.println("Boing is flying!");
    }
    
}
