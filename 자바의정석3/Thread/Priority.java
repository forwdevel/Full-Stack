abstract public class Priority {
    abstract void setPriority(int newPriority);

    abstract int getPriority();

    public static final int MAX_PRIORITY = 10;
    public static final int MIN_PRIORITY = 1;
    public static final int NORM_PRIORITY = 5;
}
