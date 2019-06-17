package Observer;

import java.util.Iterator;
import java.util.List;

public class NewsPaper {
    List<NewsPaperSubscriber> list;

    public void addSubscriber(NewsPaperSubscriber subscriber) {
        list.add(subscriber);
    }

    public void ereaseSubscriber(NewsPaperSubscriber subscriber) {
        Iterator<NewsPaperSubscriber> iterator = list.iterator();
        while (iterator.hasNext()) {
            NewsPaperSubscriber subscriber1 = iterator.next();
            if (subscriber.equals(subscriber1)) {
                iterator.remove();
                return;
            }
        }
    }

    public void sendNewspaper() {
        for (NewsPaperSubscriber subscriber : list) {
            subscriber.getNewspaper();
        }
    }
}
