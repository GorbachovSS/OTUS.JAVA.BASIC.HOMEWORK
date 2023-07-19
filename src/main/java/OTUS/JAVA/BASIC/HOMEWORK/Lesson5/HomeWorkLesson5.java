package otus.java.basic.homework.lesson5;

import java.util.Arrays;

public class HomeWorkLesson5 {
    public static void main(String[] args) {
        printNumberString(5, "Hello World!");
        sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        fillArray(5, new int[10]);
        numberLinkBoost(5, new int[10]);
        arraySum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    public static void printNumberString(int number, String str) {
        for (int i = 1; i <= number; i++) {
            System.out.println(i + ": " + str);
        }
    }

    public static void sum(int... number) {
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > 5) {
                count += number[i];
            }
        }
        System.out.println(count);
    }


    public static void fillArray(int num, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void numberLinkBoost(int num, int[] arr) {

        for (int j = 0; j < arr.length; j++) {
            arr[j] += num;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void arraySum(int... array) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length / 2; i++) {
            sum1 = sum1 + array[i];
        }
        for (int j = array.length / 2; j < array.length; j++) {
            sum2 = sum2 + array[j];
        }
        if (sum1 > sum2) {
            System.out.println(sum1);
        } else if (sum2 > sum1) {
            System.out.println(sum2);
        }
    }
}



