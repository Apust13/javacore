package com.apust.design_patterns.baturshinov.decorator.objects;

public class Window implements Component{

    @Override
    public void draw() {
        System.out.println("draw window");
    }

}
