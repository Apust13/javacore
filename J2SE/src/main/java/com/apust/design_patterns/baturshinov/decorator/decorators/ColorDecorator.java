package com.apust.design_patterns.baturshinov.decorator.decorators;

import com.apust.design_patterns.baturshinov.decorator.objects.Component;

public class ColorDecorator extends Decorator {

    public ColorDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("... added color");
    }

}
