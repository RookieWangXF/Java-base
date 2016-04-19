package cn.rookie.io.stream;

import java.io.*;

/**
 * Created by Rookie on 2016/4/19.
 */
public class OutputStreamDemo {
    public static void OutputStream01(String path) throws IOException {
        File file = new File(path);
        OutputStream out = new FileOutputStream(file);

        out.write(97);
    }

    /**
     * 在输入汉字的时候会出现问题
     * @param path
     * @throws IOException
     */
    public static void OutputStream02(String path) throws IOException {
        File file = new File(path);
        OutputStream out = new FileOutputStream(file);

        byte[] bytes = "abcdefghijklmn".getBytes();
        out.write(bytes);
    }

    /**
     * 使用字节流
     * @param path
     * @throws IOException
     */
    public static void OutputStream03(String path) throws IOException {
        File file = new File(path);
        OutputStream out = new FileOutputStream(file);

        OutputStreamWriter osw = new OutputStreamWriter(out,"utf-8");
        osw.write("你好");
        osw.close();
    }
}
