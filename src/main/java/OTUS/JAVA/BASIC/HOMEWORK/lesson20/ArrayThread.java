package otus.java.basic.homework.lesson20;

public class ArrayThread {
    private int counter = 0;
    private static final Double[] arr = new Double[100_000_0];
    private static final Object object = new Object();

    public void add(Double d) {
        if (check()) {
            arr[counter] = d;
            counter++;
        }
    }

    public synchronized boolean check() {
        return counter != 100_000_0;
    }

    public synchronized int getCounter() {
        return counter;
    }
}
