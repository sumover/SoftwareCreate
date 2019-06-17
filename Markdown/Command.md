命令模式

# 模式定义

# 问题需求描述

# 设计类图

# Code
Command.java
```java
package Command;

public abstract class Command {
    protected Executable executable;

    public Command(Executable executable) { this.executable = executable; }

    public abstract void execute();
}
```

Executable.java
```java
package Command;

public abstract class Executable {}
```

Involver.java
```java
package Command;

import java.util.LinkedList;
import java.util.List;

public class Involver {
    List<Command> commandList;

    Involver() { commandList = new LinkedList<Command>(); }

    void addCommand(Command command) { commandList.add(command); }

    void execute() {
        for (Command command : commandList) command.execute();
        commandList.clear();
    }
}
```

TeleVision.java
```java
package Command;

public class TeleVision extends Executable {
    int volume;

    public TeleVision() { volume = 50; }

    void addVolume(int index) {
        volume = volume + index;
        if (volume <= 0) volume = 0;
        if (volume >= 100) volume = 100;
    }
}
```

TurnDownVolume.java
```java
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
```

TurnUpVolume.java
```java
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
```
# 运行结果

Main.java
```java
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
```

out

```text
turn up one volume voice.
turn down one volume voice.
```