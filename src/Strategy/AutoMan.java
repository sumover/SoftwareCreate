package Strategy;

public class AutoMan extends Hero {
    public AutoMan() {
        super(new Shield(),new Laser(),new Fly());
    }
}
