package Decorator;

public class Main {
    public static void main(String[] args) {
        Food food = new 果子(new 蛋(new 煎饼()));
        System.out.println(food.getCost());
        System.out.println(food.getName());
    }
}
