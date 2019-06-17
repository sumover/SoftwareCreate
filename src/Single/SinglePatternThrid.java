package Single;

public class SinglePatternThrid {
    private SinglePatternThrid() {

    }

    private static SinglePatternThrid singlePatternThrid = null;

    public static SinglePatternThrid getInstance() {
        if (singlePatternThrid == null) {
            synchronized (SinglePatternThrid.class) {
                singlePatternThrid = new SinglePatternThrid();
            }
        }
        return singlePatternThrid;
    }
}
