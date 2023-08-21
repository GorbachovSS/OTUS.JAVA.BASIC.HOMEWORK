package otus.java.basic.homework.lesson14;

public class MainApplication {
    public static void main(String[] args) {
        try {
            exChecked(new String[][]{
                    {"1", "1", "1", "1"},
                    {"1", "1", "1", "1"},
                    {"1", "1", "1", "1"},
                    {"1", "1", "1", "1"}});
            System.out.println();
            System.out.println("Метод работает исправно!");

        } catch (MyArraySizeException e) {
            System.out.println("Неправильный размер массива!");
        } catch (MyArrayDataException e) {
            System.out.println("\nНеправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + e.getI() + " x " + e.getJ());
        }

    }

    public static int exChecked(String[][] arr) {
        int sum = 0;
        if (arr.length != 4) {
            try {
                throw new MyArraySizeException();
            } catch (MyArraySizeException e) {
                throw new RuntimeException(e);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");

                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    try {
                        throw new MyArrayDataException(i, j);
                    } catch (MyArrayDataException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
            System.out.println();
        }
        System.out.println("Сумма масива: " + sum);
        return sum;
    }
}





















