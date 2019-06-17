package Strategy;

public abstract class Hero {
    private DefenceAction defenceAction;
    private AttackAction attackAction;
    private RunAction runAction;

    public Hero(DefenceAction defenceAction, AttackAction attackAction, RunAction runAction) {
        this.defenceAction = defenceAction;
        this.attackAction = attackAction;
        this.runAction = runAction;
    }

    public void defence() {
        defenceAction.defence();
    }

    public void attack() {
        attackAction.attack();
    }

    public void run() {
        runAction.run();
    }
}
