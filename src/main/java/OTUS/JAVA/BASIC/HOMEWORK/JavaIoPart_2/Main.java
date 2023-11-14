package otus.java.basic.homework.JavaIoPart_2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя файла: ");
        try {
            File file = new File(in.next());
            Scanner sc = new Scanner(file, StandardCharsets.UTF_8);
            String pattern = in.next();
            int count = 0;
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.contains(pattern)) {
                    count++;
                }
            }
            System.out.printf("Количество вхождений: %d%n", count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}




