package Command;

public abstract class Command {
    protected Executable executable;

    public Command(Executable executable) {
        this.executable = executable;
    }

    public abstract void execute();
}
