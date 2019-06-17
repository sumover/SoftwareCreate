package Factory.AbstractFactory;

public abstract class BaseRobotFactory {
    private BaseRollFactory rollFactory;
    private BaseArmFactory armFactory;
    private BaseRobotBodyFactory robotBodyFactory;

    public BaseRobotFactory(BaseRollFactory rollFactory,
                            BaseArmFactory armFactory,
                            BaseRobotBodyFactory robotBodyFactory) {
        this.rollFactory = rollFactory;
        this.armFactory = armFactory;
        this.robotBodyFactory = robotBodyFactory;
    }

    public Robot getRobot() {
        return new Robot(getArm(), getRoll(), getBody());
    }

    private Arm getArm() {
        return (Arm) armFactory.getPart();
    }

    private RobotBody getBody() {
        return (RobotBody) robotBodyFactory.getPart();
    }

    private Roll getRoll() {
        return (Roll) rollFactory.getPart();
    }
}
