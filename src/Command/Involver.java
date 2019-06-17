package Command;

import java.util.List;

public class Involver {
    List<Command> commandList;

    void addCommand(Command command) {
        commandList.add(command);
    }

    void execute() {
        for (Command command : commandList) command.execute();
        commandList.clear();
    }
}
