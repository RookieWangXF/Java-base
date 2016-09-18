package cn.rookie.io.stream;

import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by Rookie on 2016/4/19.
 */
public class OutputStreamDemo {
    /**
     * 97会转化为char类型的值
     * @param path
     * @throws IOException
     */
    public void OutputStream01(String path) throws IOException {
        File file = new File(path);
        OutputStream out = new FileOutputStream(file);

        out.write(97);
        out.close();
    }

    /**
     * 在输入汉字的时候会出现问题，可以设置字符级别
     * @param path
     * @throws IOException
     */
    public void OutputStream02(String path) throws IOException {
        File file = new File(path);
        OutputStream out = new FileOutputStream(file);

        byte[] bytes = "Hello world 你好  \n中文怎么了.\n".getBytes();
        String s = "中文显示没有问题了 bye \n";
        byte[] bytes2 = s.getBytes("utf-8");
        out.write(bytes);
        out.write(bytes2);
        out.flush();
        out.close();
    }

    /**
     * 使用字节流,根据对应的字符格式进行输出
     * @param path
     * @throws IOException
     */
    public void OutputStream03(String path) throws IOException {
        File file = new File(path);
        OutputStream out = new FileOutputStream(file);

        OutputStreamWriter osw = new OutputStreamWriter(out,"utf-8");
        osw.write("你好");
        osw.close();
    }
}
