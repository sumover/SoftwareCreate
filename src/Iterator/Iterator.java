package Iterator;

public abstract class Iterator<T> {
    public abstract boolean hasNext();

    public abstract T next();

    public abstract void remove();
}
