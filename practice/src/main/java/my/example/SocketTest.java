package my.example;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTest {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(6000)) {
            System.out.println("Wating for connections.......");
            Socket socket = serverSocket.accept();
            System.out.println("Connected to client");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
