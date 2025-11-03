public class Counter {
    private volatile int sum;

    public Counter() {
        sum = 0;
    }

    public void inc() {
        sum++;
    }

    public void dec() {
        sum--;
    }

    public int get() {
        return sum;
    }

    public void set(int c) {
        sum = c;
    }
}

