package Decorator;

public class 果子 extends BaseDecorator {
    果子(Food food) {
        super(food);
    }

    @Override
    public double getCost() {
        return food.getCost() + 1.0;
    }

    @Override
    public String getName() {
        return food.getName() + "+果子";
    }
}
