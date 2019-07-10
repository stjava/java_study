package timeclient.bio;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TimeServerNIO {
    public static void main(String[] args) throws IOException {
        int port = 8000;

        ServerSocket serverSocket;

        try {
            serverSocket = new ServerSocket(port);
            System.out.println("begin");
            Socket socket;

            while (true) {
                socket = serverSocket.accept();
                new Thread(new TimeServerHandle(socket)).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
