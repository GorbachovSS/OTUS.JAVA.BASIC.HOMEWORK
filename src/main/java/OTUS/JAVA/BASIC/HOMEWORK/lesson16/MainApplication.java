package otus.java.basic.homework.lesson16;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean cont = true;
        PhoneBook phoneBook = new PhoneBook();
        while (cont) {
            System.out.println(" 1. Добавить номер\n 2. Поиск по имени \n 3. Поиск по номеру\n 4. Завершить работу");
            int input = scanner.nextInt();
            if (input == 1) {
                System.out.println("Веведите имя: ");
                String name = scanner.next();
                System.out.println("Введите номер телефона: ");
                String phone = scanner.next();
                phoneBook.add(name, phone);
            } else if (input == 2) {
                System.out.println("Введите имя для поиска номера");
                String name = scanner.next();
                ArrayList<String> phones = phoneBook.find(name);
                if (phones == null) {
                    System.out.println("По данному имени номеров не найденно");
                } else {
                    for (String n : phones) {
                        System.out.println(n);
                    }
                }
            } else if (input == 3) {
                System.out.println("Введите номер для поиска контакта");
                String phone = scanner.next();
                String name = phoneBook.containsPhoneNumber(phone);
                if (name == null) {
                    System.out.println("По данному номеру контакт не найденно");
                } else {
                    System.out.println(name);
                }
            } else if (input == 4) {
                cont = false;
            }
        }
    }
}