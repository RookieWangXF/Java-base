package cn.rookie.ip.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created by Rookie on 2016/4/19.
 */
public class ServerUdp {

    public void ReceDemo01() throws IOException {
         /*
		 * 建立UDP接收端的思路。
		 * 1，建立udp socket服务,因为是要接收数据，必须要明确一个端口号。
		 * 2，创建数据包，用于存储接收到的数据。方便用数据包对象的方法解析这些数据.
		 * 3，使用socket服务的receive方法将接收的数据存储到数据包中。
		 * 4，通过数据包的方法解析数据包中的数据。
		 * 5，关闭资源
		 */

        System.out.println("接收端启动");
        DatagramSocket ds = new DatagramSocket(10000);
        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, buf.length);
        ds.receive(dp);
        String ip = dp.getAddress().getHostAddress();
        int port = dp.getPort();
        //根据长度截取数据，而不是所有的都装进来
        String textString = new String(dp.getData(),0,dp.getLength());
        System.out.print(ip+"---"+port+"---"+textString);
        ds.close();
    }

    public void ReceDemo02() throws IOException {
        /*
		 * 建立UDP接收端的思路。
		 * 1，建立udp socket服务,因为是要接收数据，必须要明确一个端口号。
		 * 2，创建数据包，用于存储接收到的数据。方便用数据包对象的方法解析这些数据.
		 * 3，使用socket服务的receive方法将接收的数据存储到数据包中。
		 * 4，通过数据包的方法解析数据包中的数据。
		 * 5，关闭资源
		 */
        System.out.println("接收端启动......");
        DatagramSocket ds = new DatagramSocket(10000);
        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, buf.length);
        ds.receive(dp);//阻塞式的
        String ip = dp.getAddress().getHostAddress();
        int port = dp.getPort();
        //根据长度截取数据，而不是所有的都装进来
        String textString = new String(dp.getData(),0,dp.getLength());
        System.out.print(ip+"---"+port+"---"+textString);
    }
    public static void main(String[] args) throws IOException {

    }
}
