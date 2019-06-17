package Strategy;

public class Main {
    public static void main(String[] args) {
        AutoMan autoMan = new AutoMan();
        Gouda gouda = new Gouda();
        System.out.println("now is automan!");
        autoMan.attack();
        autoMan.defence();
        autoMan.run();
        System.out.println("now is gouda!!");
        gouda.attack();
        gouda.defence();
        gouda.run();
        System.out.println("finish!");
    }
}
