package Factory.AbstractFactory;

public abstract class BaseRobotBodyFactory extends BasePartsFactory {
    @Override
    abstract Part getPart();
}
