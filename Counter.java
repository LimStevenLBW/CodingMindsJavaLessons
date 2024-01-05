public class Counter {
    private int value;
    // private int previousValue;

    public void click() {
        // previousValue = value;
        value++;
    }

    public void undo() {
        int previousValue = value - 1;
        value = Math.max(previousValue, 0);
    }

    public int getValue() {
        return value;
    }

}
