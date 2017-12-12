package design_patterns.baturshinov.strategy.strategy;

public interface AuthStrategy {
    boolean checkLogin(String name, String password);
}
