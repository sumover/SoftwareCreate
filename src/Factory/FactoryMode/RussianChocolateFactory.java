package Factory.FactoryMode;

public class RussianChocolateFactory extends BaseChocolateFactory {
    @Override
    protected void processCoco() {
        System.out.println("process russian coco.");
    }

    @Override
    protected void heatChocolate() {
        System.out.println("heat Chocolate to melt.");
    }

    @Override
    protected void addSugar() {
        System.out.println("add many sugar.");
    }

    @Override
    protected void coolingPlastic() {
        System.out.println("cooling until plastic by circle template.");
    }
}
