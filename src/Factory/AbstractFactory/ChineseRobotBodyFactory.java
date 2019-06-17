package Factory.AbstractFactory;

public class ChineseRobotBodyFactory extends BaseRobotBodyFactory {
    @Override
    Part getPart() {
        return new StrongBody();
    }
}
