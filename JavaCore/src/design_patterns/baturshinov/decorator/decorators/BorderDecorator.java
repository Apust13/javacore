package design_patterns.baturshinov.decorator.decorators;

import design_patterns.baturshinov.decorator.objects.Component;

public class BorderDecorator extends Decorator {

    public BorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println(" ... add border");
    }

   
}
