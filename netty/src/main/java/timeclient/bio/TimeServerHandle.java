package timeclient.bio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;

public class TimeServerHandle implements Runnable {


    private Socket socket;

    public TimeServerHandle(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        BufferedReader in = null;
        PrintWriter out = null;
        try {
            in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));

            out = new PrintWriter(this.socket.getOutputStream(), true);
            String currentTime = null;
            String body = null;

            while (true) {
                body = in.readLine();

                if (body == null) {
                    break;
                }

                System.out.println("接收到消息：" + body);

                try {
                    currentTime = "QUERY TIME ORDER".equals(body) ?
                            new Date(System.currentTimeMillis()).toString() : "错误指令";
                    out.println(currentTime);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
