package otus.java.basic.homework.lesson7;

import java.util.Random;

public class HomeWorkLesson7 {
    public static void main(String[] args) {
        sumOfPositiveElements(new int[5][5]);
        System.out.println();
        drawBox(5, 5);
        System.out.println();
        diagonalElements(new int[10][10]);
        System.out.println();
        findMax(new int[5][5]);
        System.out.println();
        sumTwoLine(new int[5][5]);
    }

    public static void sumOfPositiveElements(int[][] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(20) - 10;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Сумма чисел массива > 0: " + sum);
    }

    public static void drawBox(int size_X, int size_Y) {
        char[][] array = new char[size_X][size_Y];
        for (int i = 0; i < size_X; i++) {
            for (int j = 0; j < size_Y; j++) {
                array[i][j] = '*';
            }
        }
        for (int i = 0; i < size_X; i++) {
            for (int j = 0; j < size_Y; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static public void diagonalElements(int[][] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if (j < 5) {
                    System.out.print(5 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    public static int findMax(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100) - 50;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int max = 0;
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                } else if (min > array[i][j]) {
                    min = array[i][j];
                }
            }
        }
        System.out.println("Максимальное число массива = " + max);
        System.out.println("Максимальное число массива = " + min);
        return max + min;

    }

    public static int sumTwoLine(int[][] array) {
        Random random = new Random();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        count = array[1][0] + array[1][1] + array[1][2] + array[1][3] + array[1][4];


        System.out.println("Сумма 2 сторки = " + count);

        return count;
    }
}
