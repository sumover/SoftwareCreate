package Factory.SimpleFactory;

public class Airplane {
    private Airplane() {
        System.out.println("add roll");
        System.out.println("add wing");
        System.out.println("add engine");
    }

    public static Airplane getInstance() {
        return new Airplane();
    }
}

