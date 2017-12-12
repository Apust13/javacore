package design_patterns.baturshinov.decorator.decorators;

import design_patterns.baturshinov.decorator.objects.Button;
import design_patterns.baturshinov.decorator.objects.TextView;
import design_patterns.baturshinov.decorator.objects.Window;
import design_patterns.baturshinov.decorator.objects.Component;

public class Start {
    
    private static Component window;
    private static Component textView;
    private static Component button;
    
    public static void main(String[] args) {
        
        
        boolean showBorder = true;
        
        if (!showBorder){
            window = new Window();
            textView = new TextView();
            button = new Button();
        }else{
            window = new BorderDecorator(new Window());
            textView = new BorderDecorator(new TextView());
            button = new BorderDecorator(new Button());
        }
        
        
        window.draw();
        textView.draw();
        button.draw();
        
        
    }

}
