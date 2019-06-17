package Observer;

public class BilibiliUser {
    private Bilibili bilibili;

    BilibiliUser(Bilibili bilibili) {
        this.bilibili = bilibili;
    }

    void getMessage() {
        System.out.println("I get message: " + bilibili.getMessage());
    }

}
