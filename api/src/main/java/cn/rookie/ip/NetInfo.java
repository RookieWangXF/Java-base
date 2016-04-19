package cn.rookie.ip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * Created by Rookie on 2016/4/19.
 */
public class NetInfo {

    /**
     * 根据URl或许相关信息
     * @param url
     * @throws IOException
     */
    public static void getUrlInfo(URL url) throws IOException {
        System.out.println(url.getProtocol());
        System.out.println(url.getHost());
        System.out.println(url.getContent());
        System.out.println(url.getPort());
        URLConnection uc=url.openConnection();
        BufferedReader br= new BufferedReader(new InputStreamReader(uc.getInputStream()));
        String lineString;
        while ((lineString=br.readLine())!=null){
            System.out.println(lineString);
        }
        br.close();
    }

    /**
     * 根据ip信息
     * @throws IOException
     */
    public static void getIpInfo() throws IOException {
        InetAddress ip = InetAddress.getLocalHost();  //获取本地的网络对象
        InetAddress jd = InetAddress.getByName("www.jd.com"); //根据主机名获取ip
        InetAddress[] addresses = InetAddress.getAllByName("www.jd.com");
        for(InetAddress a:addresses)
            System.out.println(a.getHostName());
        System.out.println("原始的ip地址："+ Arrays.toString(jd.getAddress()));
        System.out.println(ip.getHostAddress());
        System.out.println(ip.getHostName());
        System.out.println("是否可达："+jd.isReachable(5000));
    }
    public static void main(String[] args) throws IOException {
        URL url= new URL("http://www.baidu.com");
        //NetInfo.getUrlInfo(url);

        NetInfo.getIpInfo();
    }
}
