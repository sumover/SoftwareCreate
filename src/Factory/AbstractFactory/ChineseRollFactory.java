package Factory.AbstractFactory;

public class ChineseRollFactory extends BaseRollFactory {

    @Override
    Part getPart() {
        return new BigRoll();
    }
}
