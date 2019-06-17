package Template;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        System.out.println("make coffee.");
        coffee.makeDrink();
        System.out.println("****************");
        ColdTea coldTea = new ColdTea();
        System.out.println("make cold tea.");
        coldTea.makeDrink();
    }
}
