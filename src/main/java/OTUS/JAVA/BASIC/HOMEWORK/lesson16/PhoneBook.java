package otus.java.basic.homework.lesson16;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {


    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        add(new HashMap<>());

    }

    public static void add(HashMap<String, String> addMap) {
        int yes = 1;
        int no = 2;
        int amountOfMemory = 16;  // Количество памяти
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < amountOfMemory; i++) {

            System.out.println("Хотите записать номер? \n 1. ДА  \n 2. НЕТ");
            if (scanner.nextInt() == yes) {
                System.out.println("Веведите имя: ");
                String name = scanner.next();
                System.out.println("Введите номер телефона: ");
                String phone = scanner.next();
                addMap.put(name, phone);
                System.out.println("Память спавочника: " + amountOfMemory);
                amountOfMemory--;
                System.out.println("В можете записать ещё: " + amountOfMemory + " номеров");
            } else {
                System.out.println("Вы отказались записать номер");
                System.out.println(addMap);
                add(new HashMap<>());
            }
        }


        System.out.println(addMap);
    }
}
