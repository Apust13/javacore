package com.apust.design_patterns.baturshinov.decorator.decorators;

import com.apust.design_patterns.baturshinov.decorator.objects.Component;

public class BorderDecorator extends Decorator {

    public BorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println(" ... add border");
    }

   
}
