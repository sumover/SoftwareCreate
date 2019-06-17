package Status;

public class PreparedStatus extends Status {
    PreparedStatus(WashingMachine washingMachine) {
        super(washingMachine);
    }

    @Override
    public void addWater() {
        System.out.println("have prepared!");
    }

    @Override
    public void addClothes() {
        System.out.println("have prepared!");
    }

    @Override
    public void run() {
        System.out.println("run...");
        washingMachine.turnToRunning();
    }

    @Override
    public void stop() {
        System.out.println("always stop..");
    }
}
