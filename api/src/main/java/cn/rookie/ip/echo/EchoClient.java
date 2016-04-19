package cn.rookie.ip.echo;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Rookie on 2016/4/19.
 */
public class EchoClient {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost", 9999);
        Scanner input = new Scanner(System.in);
        Scanner scan = new Scanner(client.getInputStream());
        PrintStream out = new PrintStream(client.getOutputStream());

        input.useDelimiter("\n");
        scan.useDelimiter("\n");
        boolean flag = true;
        while (flag) {
            System.out.println("请输入要发送的数据：");
            if (input.hasNext()) {
                String string = input.next().trim();
                out.println(string);
                if (string.equalsIgnoreCase("byeBye")) {
                    flag = false;
                }
                if (scan.hasNext()) {
                    System.out.println(scan.next());  //输出回应数据
                }
            }
        }
        input.close();
        scan.close();
        client.close();
    }
}
