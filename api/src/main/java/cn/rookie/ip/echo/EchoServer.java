package cn.rookie.ip.echo;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Rookie on 2016/4/19.
 */

class EchoThread implements Runnable {

    private Socket client;

    public EchoThread(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        try {
            /**
             * 得到客户端的输入数据和从客户端输出数据的对象
             */
            Scanner scan = new Scanner(client.getInputStream());
            PrintStream out = new PrintStream(client.getOutputStream());
            boolean flag = true;
            while (flag) {
                if (scan.hasNext()) {
                    String str = scan.next().trim();
                    if (str.equalsIgnoreCase("byebye")) {
                        out.println("byebye");
                    } else {
                        out.println("ECHO: " + str);
                    }
                }
            }
            client.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
public class EchoServer{

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(9999);
        boolean flag = true;
        while (flag) {
            Socket client = server.accept();
            new Thread(new EchoThread(client)).start();
        }
        server.close();
    }
}
