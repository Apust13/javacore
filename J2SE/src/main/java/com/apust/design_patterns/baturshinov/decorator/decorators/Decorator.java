package com.apust.design_patterns.baturshinov.decorator.decorators;

import com.apust.design_patterns.baturshinov.decorator.objects.Component;

public abstract class Decorator implements Component {
    
    protected Component component;
    
    public Decorator (Component component) {
        this.component = component;
    }
    
    public abstract void afterDraw();

    @Override
    public void draw() {
        component.draw();
        afterDraw();
    }
    
}
