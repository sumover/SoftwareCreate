package Adapter;

class Wolf implements WolfHui {

    @Override
    public void aowu() {
        System.out.println("aowu~~");
    }
}

class Sheep implements SheepXi {

    @Override
    public void mea() {
        System.out.println("mea~~~");
    }
}

public class Main {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.aowu();
        Sheep sheep = new Sheep();
        sheep.mea();
        SheepXi sheepXi = new TwoWayAdapter(wolf);
        sheepXi.mea();
        WolfHui wolfHui = new TwoWayAdapter(sheep);
        wolfHui.aowu();
    }
}
