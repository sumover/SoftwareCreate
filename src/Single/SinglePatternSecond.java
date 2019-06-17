package Single;

public class SinglePatternSecond {
    private static SinglePatternSecond singlePatternSecond = new SinglePatternSecond();

    public static SinglePatternSecond getInstance() {
        return singlePatternSecond;
    }
}
