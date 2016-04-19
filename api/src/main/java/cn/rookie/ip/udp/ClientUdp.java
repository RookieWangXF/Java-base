package cn.rookie.ip.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * Created by Rookie on 2016/4/19.
 */
public class ClientUdp {
    public void sendDemo01() throws IOException {
        // 创建数据报套接字并将其绑定到本地主机上的指定端口。
        DatagramSocket ds = new DatagramSocket(8888);
        String str = "传输内容";
        byte[] buf = str.getBytes();
        DatagramPacket dp = new DatagramPacket(buf,buf.length, InetAddress.getByName("127.0.0.1"),10000);
        ds.send(dp);
        ds.close();
    }

    public void sendDemo02() throws IOException {
        // 创建数据报套接字并将其绑定到本地主机上的指定端口。
        DatagramSocket ds = new DatagramSocket(8888);
        //		String str = "传输内容";
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        String lineString = null;
        while((lineString= bufr.readLine())!=null){
            if("over".equals(lineString))
                break;
            byte[] buf = lineString.getBytes();
            DatagramPacket dp = new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.152.1"),10000);
            ds.send(dp);
        }
        ds.close();
    }

    public static void main(String[] args) throws IOException, SocketException {

    }
}
