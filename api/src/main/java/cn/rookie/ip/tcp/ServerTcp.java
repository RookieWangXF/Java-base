package cn.rookie.ip.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Rookie on 2016/4/19.
 */

class ThreadHandler implements Runnable {

    private Socket socket;

    public ThreadHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream inputStream = socket.getInputStream();
            OutputStream out = socket.getOutputStream();

            Scanner scanner = new Scanner(inputStream);

            String line = scanner.nextLine();
            System.out.println(line);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class ServerTcp {
    public static void main(String[] args) throws IOException {
        ServerSocket ss= new ServerSocket(8190);
        while(true){
            Socket incoming= ss.accept();
            Runnable r = new ThreadHandler(incoming);
            Thread t = new Thread(r);
            t.start();
        }
    }
}
