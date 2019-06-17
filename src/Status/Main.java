package Status;

public class Main {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine();
        washingMachine.run();
        washingMachine.addWater();
        washingMachine.run();
        washingMachine.addClothes();
        washingMachine.run();
        washingMachine.stop();
    }
}
