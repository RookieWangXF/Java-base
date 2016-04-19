package cn.rookie.ip.tcp;

import java.io.*;
import java.net.Socket;

/**
 * Created by Rookie on 2016/4/19.
 */
public class ClientTcp {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8190);

        OutputStream out = socket.getOutputStream();
        out.write("tcp演示，哥们又来了:".getBytes());

        InputStream in = socket.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String text;
        while ((text = reader.readLine()) != null) {
            System.out.println(text);
        }
        socket.close();
    }
}
