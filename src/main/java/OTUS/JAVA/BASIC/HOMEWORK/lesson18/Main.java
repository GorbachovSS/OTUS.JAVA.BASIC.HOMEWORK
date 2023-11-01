package otus.java.basic.homework.lesson18;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        File directoryPath = new File("E:\\test");
        File filesList[] = directoryPath.listFiles();
        System.out.println("Список файлов: ");
        for (File file : filesList) {
            System.out.println("File name: " + file.getName());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите файл ");
        String str = scanner.nextLine();

        if (str.equals("Car")) {
            System.out.println("Данные файла.");
            try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("E:\\test\\Car.txt"))) {
                int n = bufferedInputStream.read();
                while (n != -1) {
                    System.out.print((char) n);
                    n = bufferedInputStream.read();
                }
            }
            System.out.println("Введите текст ");
            Scanner scan = new Scanner(System.in);
            String fill = scan.nextLine();
            try (
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
                            new FileOutputStream("E:\\test\\Car.txt", true))) {
                byte[] bytes = fill.getBytes(StandardCharsets.UTF_8);
                for (int i = 0; i < bytes.length; i++) {
                    bufferedOutputStream.write(bytes[i]);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else if (str.equals("Name")) {
            System.out.println("Данные файла.");
            try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("E:\\test\\Car.txt"))) {
                int n = bufferedInputStream.read();
                while (n != -1) {
                    System.out.print((char) n);
                    n = bufferedInputStream.read();
                }
            }

            System.out.println("Введите текст ");
            Scanner scan = new Scanner(System.in);
            String fill = scan.nextLine();


            try (
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
                            new FileOutputStream("E:\\test\\Name.txt", true))) {
                byte[] bytes = fill.getBytes(StandardCharsets.UTF_8);
                for (int i = 0; i < bytes.length; i++) {
                    bufferedOutputStream.write(bytes[i]);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else if (str.equals("PhoneNumber")) {
            System.out.println("Данные файла.");
            try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("E:\\test\\Car.txt"))) {
                int n = bufferedInputStream.read();
                while (n != -1) {
                    System.out.print((char) n);
                    n = bufferedInputStream.read();
                }
            }

            System.out.println("Введите текст ");
            Scanner scan = new Scanner(System.in);
            String fill = scan.nextLine();
            try (
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
                            new FileOutputStream("E:\\test\\PhoneNumber.txt", true))) {
                byte[] bytes = fill.getBytes(StandardCharsets.UTF_8);
                for (int i = 0; i < bytes.length; i++) {
                    bufferedOutputStream.write(bytes[i]);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Неверное имя файла");
        }
    }
}
