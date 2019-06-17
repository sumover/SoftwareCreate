package Decorator;

public class 蛋 extends BaseDecorator {
    蛋(Food food) {
        super(food);
    }

    @Override
    public double getCost() {
        return food.getCost() + .3;
    }

    @Override
    public String getName() {
        return food.getName() + "+蛋";
    }
}
