package Status;

public class WashingMachine extends BaseMachine {
    Status status;

    WashingMachine() {
        status = new IdleStatus(this);
    }

    @Override
    public void addWater() {
        status.addWater();
    }

    @Override
    public void addClothes() {
        status.addClothes();
    }

    @Override
    public void run() {
        status.run();
    }

    @Override
    public void stop() {
        status.stop();
    }

    void turnToIdle() {
        status = new IdleStatus(this);
    }

    void turnToPrepared() {
        status = new PreparedStatus(this);
    }

    void turnToRunning() {
        status = new OnrunningStatus(this);
    }

}
