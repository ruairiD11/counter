package ie.gmit;

public class Counter {
    private int count;

    public Counter() {
        this.count = 0;
    }

    public int getCount() {
        return count;
    }

    public int increment() {
        return ++count;
    }

    public int decrement() {
        return --count;
    }
}
