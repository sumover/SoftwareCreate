package Iterator;

public class Main {
    public static void main(String[] args) {
//        System.out.println(new Food());
        Menu menu = new Menu();
        menu.addFood(new Food());
        menu.addFood(new Food());
        menu.addFood(new Food());
        Iterator iterator = menu.getIterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        iterator = menu.getIterator();
        iterator.next();
        iterator.next();
        iterator.remove();
        iterator = menu.getIterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
