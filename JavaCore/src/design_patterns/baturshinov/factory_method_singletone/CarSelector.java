package design_patterns.baturshinov.factory_method_singletone;

// фабрика по созданию автомобилей
public class CarSelector {

    private static CarSelector instance;

    private CarSelector() {
    }

    public static CarSelector getInstance(){
        if (instance == null){
            instance = new CarSelector();
        }
        return instance;
    }

    // фабричный метод, который создает нужный автомобиль
    public Car getCar(RoadType roadType) {
        Car car = null;
        switch (roadType) {
            case CITY:
                car = new Porsche();
                break;
            case OFF_ROAD:
                car = new Geep();
                break;
            case GAZON:
                car = new NewGeep();
                break;
        }

        return car;
    }
}
