package otus.java.basic.homework.lesson20;

public class MainApp {
    public static void main(String[] args) throws Exception {
        long startTime = System.currentTimeMillis();

        ArrayThread arrayThread = new ArrayThread();


        Thread t1 = new Thread(() -> {
            while (arrayThread.check()) {
                arrayThread.add(1.14 * Math.cos(arrayThread.getCounter()) * Math.sin(arrayThread.getCounter() * 0.2) * Math.cos(arrayThread.getCounter() / 1.2));
            }

        });


        Thread t2 = new Thread(() -> {
            while (arrayThread.check()) {
                arrayThread.add(1.14 * Math.cos(arrayThread.getCounter()) * Math.sin(arrayThread.getCounter() * 0.2) * Math.cos(arrayThread.getCounter() / 1.2));
            }
        });

        Thread t3 = new Thread(() -> {
            while (arrayThread.check()) {
                arrayThread.add(1.14 * Math.cos(arrayThread.getCounter()) * Math.sin(arrayThread.getCounter() * 0.2) * Math.cos(arrayThread.getCounter() / 1.2));
            }
        });

        Thread t4 = new Thread(() -> {
            while (arrayThread.check()) {
                arrayThread.add(1.14 * Math.cos(arrayThread.getCounter()) * Math.sin(arrayThread.getCounter() * 0.2) * Math.cos(arrayThread.getCounter() / 1.2));
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");
    }

}
