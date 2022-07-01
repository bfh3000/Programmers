package my.example;

import java.io.IOException;
import java.net.ServerSocket;

public class SocketTest {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(6000)) {
            
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
