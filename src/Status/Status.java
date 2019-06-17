package Status;

public abstract class Status extends BaseMachine {
    protected WashingMachine washingMachine;

    Status(WashingMachine washingMachine) {
        this.washingMachine = washingMachine;
    }
}
