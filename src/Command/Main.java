package Command;

public class Main {
    public static void main(String[] args) {
        Involver involver = new Involver();
        TeleVision teleVision = new TeleVision();
        Command command;
        command = new TurnUpVolume(teleVision);
        involver.addCommand(command);
        command = new TurnDownVolume(teleVision);
        involver.addCommand(command);
        involver.execute();
    }
}
