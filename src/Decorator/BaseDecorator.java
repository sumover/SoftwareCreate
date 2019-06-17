package Decorator;

public abstract class BaseDecorator extends Food {
    Food food;

    BaseDecorator(Food food) {
        this.food = food;
    }

    @Override
    public abstract double getCost();

    @Override
    public abstract String getName();
}
