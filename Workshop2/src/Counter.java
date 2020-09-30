public class Counter {
    private int count = 0;

    public synchronized void inc() {
        count += 2;
    }

    public synchronized void dec() {
        count -= 2;
    }

    public synchronized int getValue() {
        return count;
    }
}
