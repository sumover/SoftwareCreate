package Template;

public final class Coffee extends Drink {
    @Override
    protected void addColdWater() {
    }

    @Override
    protected boolean addColdWaterOrNot() {
        return false;
    }

    @Override
    protected void addHotWater() {
        System.out.println("add hot water.");
    }

    @Override
    protected boolean addHotWaterOrNot() {
        return true;
    }

    @Override
    protected void stir() {
        System.out.println("stir.");
    }

    @Override
    protected boolean stirOrNot() {
        return true;
    }

    @Override
    protected void waitForaMoment() {
        System.out.println("wait....");
    }

    @Override
    protected boolean waitOrNot() {
        return true;
    }
}
