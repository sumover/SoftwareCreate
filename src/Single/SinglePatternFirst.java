package Single;

public class SinglePatternFirst {
    private static SinglePatternFirst singlePatternFirst = null;

    private SinglePatternFirst() {
    }

    public synchronized static SinglePatternFirst getInstance() {
        if (singlePatternFirst != null) singlePatternFirst = new SinglePatternFirst();
        return singlePatternFirst;
    }
}
