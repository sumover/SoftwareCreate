package Factory.FactoryMode;

public abstract class BaseChocolateFactory {
    public Chocolate getChocolate() {
        Chocolate chocolate = new Chocolate();
        processCoco();
        heatChocolate();
        addSugar();
        coolingPlastic();
        return chocolate;
    }

    protected abstract void processCoco();

    protected abstract void heatChocolate();

    protected abstract void addSugar();

    protected abstract void coolingPlastic();
}
