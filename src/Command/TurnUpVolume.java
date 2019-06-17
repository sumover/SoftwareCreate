package Command;

public class TurnUpVolume extends Command {
    public TurnUpVolume(TeleVision teleVision) {
        super(teleVision);
    }

    @Override
    public void execute() {
        ((TeleVision) executable).addVolume(1);
    }
}
