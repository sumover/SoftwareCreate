package Factory.AbstractFactory;

public class ChineseArmFactory extends BaseArmFactory {
    @Override
    Part getPart() {
        return new SmallArm();
    }
}
