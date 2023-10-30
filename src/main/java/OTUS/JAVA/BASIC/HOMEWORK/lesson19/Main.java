package otus.java.basic.homework.lesson19;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¬ведите первое число:");
        String first = scanner.nextLine();

        System.out.println("¬ведите второе число:");
        String two = scanner.nextLine();

        System.out.println("”кажите операцию:");
        String operation = scanner.nextLine();

        byte[] bytes = String.format("%s%s%s\n", first, operation, two).getBytes();

        try (Socket socket = new Socket("localhost", 8088)) {
            PingClient pingClient = new PingClient(socket.getInputStream(), socket.getOutputStream());

            System.out.println(pingClient.ping(bytes));
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}