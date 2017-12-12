package design_patterns.baturshinov.abstract_factory.transport.impl.aircraft;

import design_patterns.baturshinov.abstract_factory.transport.interfaces.Aircraft;

public class TU134 implements Aircraft{

    @Override
    public void flight() {
        System.out.println("TU-134 flight!");
    }

    
    
}
