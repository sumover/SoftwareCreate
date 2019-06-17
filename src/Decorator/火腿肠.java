package Decorator;

public class 火腿肠 extends BaseDecorator {

    public 火腿肠(Food food) {
        super(food);
    }

    @Override
    public double getCost() {
        return food.getCost() + .5;
    }

    @Override
    public String getName() {
        return food.getName() + "+ 火腿肠";
    }
}
