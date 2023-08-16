package otus.java.basic.homework.lesson14;

import java.lang.reflect.Array;
import java.util.Random;

public class MainApplication {
    public static void main(String[] args)  {
        try {
            Array(new String[4][4]);
            System.out.println();
            System.out.println("Метод работает исправно!");
        } catch (MyArraySizeException e) {
            System.out.println("Размер массива превышен!");
        } catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }

    }


    public static void Array(String[][] arr) throws MyArraySizeException, MyArrayDataException{


            int[][] arrInt = new int[2][3];
            Random random = new Random();
            if (arr.length != 4) {
                throw new MyArraySizeException();
            }
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = String.valueOf(random.nextInt(20) / 2);
                    arrInt[i][j] = Integer.parseInt(arr[i][j]);
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            for (int i = 0; i < arrInt.length; i++) {
                for (int j = 0; j < arrInt[i].length; j++) {
                    try {
                    sum += arrInt[i][j];
                    }catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j);
                    }
                }

            }
            System.out.println("Сумма чисел массива: " + sum);

        }
    }



