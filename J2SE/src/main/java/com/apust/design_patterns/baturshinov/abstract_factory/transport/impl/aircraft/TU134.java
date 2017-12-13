package com.apust.design_patterns.baturshinov.abstract_factory.transport.impl.aircraft;

import com.apust.design_patterns.baturshinov.abstract_factory.transport.interfaces.Aircraft;

public class TU134 implements Aircraft{

    @Override
    public void flight() {
        System.out.println("TU-134 flight!");
    }

    
    
}
