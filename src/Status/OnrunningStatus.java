package Status;

public class OnrunningStatus extends Status {
    OnrunningStatus(WashingMachine washingMachine) {
        super(washingMachine);
    }

    @Override
    public void addWater() {
        System.out.println("running.");
    }

    @Override
    public void addClothes() {
        System.out.println("running.");
    }

    @Override
    public void run() {
        System.out.println("i was run..");
    }

    @Override
    public void stop() {
        System.out.println("stop!");
        washingMachine.turnToIdle();
    }
}
