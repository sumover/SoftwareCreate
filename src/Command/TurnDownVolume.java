package Command;

public class TurnDownVolume extends Command {
    public TurnDownVolume(TeleVision teleVision) {
        super(teleVision);
    }

    @Override
    public void execute() {
        System.out.println("turn down one volume voice.");
        ((TeleVision) executable).addVolume(-1);
    }
}
