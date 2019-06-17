package Command;

public class TurnUpVolume extends Command {
    public TurnUpVolume(TeleVision teleVision) {
        super(teleVision);
    }

    @Override
    public void execute() {
        System.out.println("turn up one volume voice.");
        ((TeleVision) executable).addVolume(1);
    }
}
