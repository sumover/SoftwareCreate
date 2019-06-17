package Strategy;

public class Gouda extends Hero{
    public Gouda() {
        super(new Mecha(), new MachineGun(), new Fly());
    }
}
