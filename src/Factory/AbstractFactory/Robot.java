package Factory.AbstractFactory;

public class Robot {
    private Arm arm;
    private Roll roll;
    private RobotBody body;

    public Robot(Arm arm, Roll roll, RobotBody body) {
        this.arm = arm;
        this.roll = roll;
        this.body = body;
    }
}
