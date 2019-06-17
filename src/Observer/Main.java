package Observer;

public class Main {
    public static void main(String[] args) {
        NewsPaper newsPaper = new NewsPaper();
        newsPaper.addSubscriber(new NewsPaperSubscriber());
        newsPaper.addSubscriber(new NewsPaperSubscriber());
        newsPaper.addSubscriber(new NewsPaperSubscriber());
        newsPaper.sendNewspaper();
        Bilibili bilibili = new Bilibili();
        BilibiliUser user = new BilibiliUser(bilibili);
        BilibiliUser user1 = new BilibiliUser(bilibili);
        BilibiliUser user2 = new BilibiliUser(bilibili);
        bilibili.refreshMessage("23333");
        user.getMessage();
        user1.getMessage();
        user2.getMessage();
        bilibili.refreshMessage("12222");
        user.getMessage();
        user1.getMessage();
        user2.getMessage();
    }
}
