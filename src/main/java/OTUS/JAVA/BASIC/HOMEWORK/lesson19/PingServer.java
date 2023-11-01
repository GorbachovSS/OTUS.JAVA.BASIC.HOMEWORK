package otus.java.basic.homework.lesson19;

import java.io.*;
import java.lang.reflect.Array;
import java.net.ServerSocket;
import java.net.Socket;

public class PingServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8088);
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");
            readRequest(socket);
        }
    }

    private static void readRequest(Socket socket) throws IOException {
        System.out.println("1");
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        while (true) {
            System.out.println(2);

            String rl = reader.readLine();

            if (rl == null || rl.trim().isEmpty()) {
                break;
            }

            System.out.println(rl);

            String rezult = executeOperation(rl);

            System.out.println(rezult);

            out.write(rezult + "\n");
            out.flush();
        }
    }


    private static String executeOperation(String stringOperation) {

        System.out.println(3);

        String first = stringOperation.substring(0, 1);
        String operation = stringOperation.substring(1, 2);
        String two = stringOperation.substring(2, 3);

        switch (operation) {

            case "+", "/", "-", "*" -> {
                return String.valueOf(Integer.valueOf(first) + Integer.valueOf(two));
            }
        }
        return "Операция не найдена";

    }

}
