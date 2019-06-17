package Status;

public class IdleStatus extends Status {
    IdleStatus(WashingMachine washingMachine) {
        super(washingMachine);
    }

    @Override
    public void addWater() {
        System.out.println("add water.");
        washingMachine.turnToPrepared();
    }

    @Override
    public void addClothes() {
        System.out.println("add clothes.");
        washingMachine.turnToPrepared();
    }

    @Override
    public void run() {
        System.out.println("cannnot run!");
    }

    @Override
    public void stop() {
        System.out.println("always stop.");
    }
}
