package Command;

public class TurnDownVolume extends Command {
    public TurnDownVolume(TeleVision teleVision) {
        super(teleVision);
    }

    @Override
    public void execute() {
        ((TeleVision) executable).addVolume(-1);
    }
}
