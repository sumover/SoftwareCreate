package Iterator;

class MenuIterator extends Iterator<Food> {
    int index, size;
    Food[] foods;
    Menu menu;

    public MenuIterator(Menu menu) {
        this.menu = menu;
        foods = menu.foods;
        size = menu.size;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index != size;
    }

    @Override
    public Food next() {
        return foods[index++];
    }

    @Override
    public void remove() {
        for (int i = index; i < size; ++i)
            foods[i] = foods[i + 1];
        size = (size - 1) % Menu.maxn;
        menu.size = size;
    }
}

public class Menu extends Iterable {
    Food[] foods;
    int size;
    final static int maxn = 1000;

    Menu() {
        foods = new Food[maxn];
        size = 0;
    }

    void addFood(Food food) {
        foods[(size++) % maxn] = food;
        size %= maxn;
    }

    @Override
    public Iterator getIterator() {
        return new MenuIterator(this);
    }
}
