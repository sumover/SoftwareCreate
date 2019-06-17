package Template;

public abstract class Drink {
    public void makeDrink() {
        if (addColdWaterOrNot()) addColdWater();
        if (addHotWaterOrNot()) addHotWater();
        if (stirOrNot()) stir();
        if (waitOrNot()) waitForaMoment();
    }

    protected abstract void addColdWater();

    protected abstract boolean addColdWaterOrNot();

    protected abstract void addHotWater();

    protected abstract boolean addHotWaterOrNot();

    protected abstract void stir();

    protected abstract boolean stirOrNot();

    protected abstract void waitForaMoment();

    protected abstract boolean waitOrNot();
}
