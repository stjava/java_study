package timeclient.bio;

import java.net.ServerSocket;
import java.net.Socket;

public class TimeServerFakeAsyncIO {

    /**
     * 伪异步IO
     * 通过创建线程池的方式
     *
     * @param args
     */
    public static void main(String[] args) {

        int port = 8000;

        ServerSocket serverSocket;

        try {
            serverSocket = new ServerSocket(port);
            System.out.println("begin");
            Socket socket;
            TimeServerHandlePool timeServerHandlePool = new TimeServerHandlePool(100, 100);


            while (true) {
                socket = serverSocket.accept();
                timeServerHandlePool.execute(new TimeServerHandle(socket));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
