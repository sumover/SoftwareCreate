package Template;

public final class ColdTea extends Drink {
    @Override
    protected void addColdWater() {

    }

    @Override
    protected boolean addColdWaterOrNot() {
        return false;
    }

    @Override
    protected void addHotWater() {
        System.out.println("add hot water, but not too hot.");
    }

    @Override
    protected boolean addHotWaterOrNot() {
        return true;
    }

    @Override
    protected void stir() {

    }

    @Override
    protected boolean stirOrNot() {
        return false;
    }

    @Override
    protected void waitForaMoment() {
        System.out.println("wait for a long time.");
    }

    @Override
    protected boolean waitOrNot() {
        return true;
    }
}
