package design_patterns.baturshinov.singletone.classic;


public class TestSingletone {

    private static TestSingletone instance;

    private TestSingletone() {
    }

    public static TestSingletone getInstance(){
        if (instance == null){
            instance = new TestSingletone();
        }
        return instance;
    }

    public void print(){
        System.out.println(this);
    }
}
