package cn.rookie.io.stream;

import java.io.*;

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
     * 在输入汉字的时候会出现问题
     * @param path
     * @throws IOException
     */
    public void OutputStream02(String path) throws IOException {
        File file = new File(path);
        OutputStream out = new FileOutputStream(file);

        byte[] bytes = "abcdefghijklmn你好".getBytes();
        out.write(bytes);
        out.close();
    }

    /**
     * 使用字节流
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
