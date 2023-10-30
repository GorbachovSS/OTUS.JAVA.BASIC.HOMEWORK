package otus.java.basic.homework.lesson20;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        double[] array = new double[100000000];

        for (int i = 0; i < array.length; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");
    }
}
