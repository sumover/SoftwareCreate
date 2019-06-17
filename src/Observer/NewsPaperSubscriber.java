package Observer;

public class NewsPaperSubscriber {
    private int index;
    private static int next = 0;

    public NewsPaperSubscriber() {
        index = next++;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        else if (obj instanceof NewsPaperSubscriber) {
            return this.index == ((NewsPaperSubscriber) obj).index;
        } else return false;
    }

    void getNewspaper() {
        System.out.println("Num: " + index + "get message!!");
    }
}
