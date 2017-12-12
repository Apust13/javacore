package design_patterns.baturshinov.factory_method_singletone;

public class Porsche implements Car {

    @Override
    public void drive() {
        System.out.println("Drive speed 150 km/h");
    }

    @Override
    public void stop() {
        System.out.println("Stopped at 1 sec");
    }

}
