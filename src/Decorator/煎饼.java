package Decorator;

public class 煎饼 extends Food {
    @Override
    public double getCost() {
        return 1.0;
    }

    @Override
    public String getName() {
        return "煎饼";
    }
}
