package Command;

import java.util.LinkedList;
import java.util.List;

public class Involver {
    List<Command> commandList;

    Involver() {
        commandList = new LinkedList<Command>();
    }

    void addCommand(Command command) {
        commandList.add(command);
    }

    void execute() {
        for (Command command : commandList) command.execute();
        commandList.clear();
    }
}
