package Factory.AbstractFactory;

public class ChineseRobotFactory extends BaseRobotFactory {
    public ChineseRobotFactory() {
        super(new ChineseRollFactory(), new ChineseArmFactory(), new ChineseRobotBodyFactory());
    }
}
