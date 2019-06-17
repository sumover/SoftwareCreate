package Factory.FactoryMode;

public class AmerciaChocolateFactory extends BaseChocolateFactory {
    @Override
    protected void processCoco() {
        System.out.println("process america coco.");
    }

    @Override
    protected void heatChocolate() {
        System.out.println("heat to just a little melt.");
    }

    @Override
    protected void addSugar() {
        System.out.println("add Capitalist sugar.");
    }

    @Override
    protected void coolingPlastic() {
        System.out.println("cooling until it shape by triangle.");
    }
}
