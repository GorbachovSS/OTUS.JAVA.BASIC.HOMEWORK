package otus.java.basic.homework.multithreading2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Future<Void> futureA = executor.submit(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.print("A");
                try {
                    TimeUnit.MILLISECONDS.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return null;
        });

        Future<Void> futureB = executor.submit(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.print("B");
                try {
                    TimeUnit.MILLISECONDS.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return null;
        });

        Future<Void> futureC = executor.submit(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.print("C");
                try {
                    TimeUnit.MILLISECONDS.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return null;
        });

        try {
            futureA.get();
            futureB.get();
            futureC.get();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}