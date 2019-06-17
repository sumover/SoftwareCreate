package Adapter;

public class TwoWayAdapter implements SheepXi, WolfHui {
    private SheepXi sheepXi;
    private WolfHui wolfHui;

    @Override
    public void mea() {
        sheepXi.mea();
    }

    @Override
    public void aowu() {
        wolfHui.aowu();
    }

    public TwoWayAdapter(SheepXi sheepXi) {
        this.sheepXi = sheepXi;
        this.wolfHui = null;
    }

    public TwoWayAdapter(WolfHui wolfHui) {
        this.wolfHui = wolfHui;
        this.sheepXi = null;
    }
}
