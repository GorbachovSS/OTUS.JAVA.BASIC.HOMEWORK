package OTUS.JAVA.BASIC.HOMEWORK.Lesson3;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        greetings();
        checkSign(5, -10, 30);
        selectColor();
        compareNumbers();
        addOrSubtractAndPrint(50, 63, true);
        scannerNam();
    }

    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        int data = 15;
        if (data <= 10) {
            System.out.println("Red");
        } else if (data <= 20) {
            System.out.println("Eloy");
        } else if (data > 20) {
            System.out.println("Green");
        }
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a<b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        int addition = initValue + delta;
        int subtraction = initValue - delta;
        if (increment) {
            System.out.println(addition);
        } else {
            System.out.println(subtraction);
        }
    }

    public static void scannerNam(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5");
        switch (scanner.nextInt()){
            case 1:
                System.out.println("Вы выиграли автомобиль!!!");
                break;
            case 2:
                System.out.println("Вы выиграли телефон!!!");
                break;
            case 3:
                System.out.println("Вы выиграли подгузники!!!");
                break;
            case 4:
                System.out.println("Вы выиграли рулетку!!!");
                break;
            case 5:
                System.out.println("Вы выиграли загородный дом на 2000 кв метров!!!");
                break;
        }
    }
}
