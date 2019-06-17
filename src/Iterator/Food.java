package Iterator;

public class Food {
    int index;
    static int NUM = 0;

    public Food() {
        index = NUM++;
    }

    @Override
    public String toString() {
        return "food index = " + index;
    }
}
