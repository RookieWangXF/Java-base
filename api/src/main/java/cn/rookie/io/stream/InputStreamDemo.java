package cn.rookie.io.stream;

import java.io.*;

/**
 * Created by Rookie on 2016/4/19.
 */
public class InputStreamDemo {
    /**
     * 读取文件的内容，字节流是按照字节为单位，读到最后返回-1的
     * 一个字节 一个字节的读，汉字是不可以的
     * @param path
     */
    public void Stream01(String path) throws IOException {
        File file = new File(path);
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int ch;
        while ((ch = inputStream.read()) != -1) {
            System.out.println((char) ch);
        }
    }

    /**
     * 使用数组,一次读取更多的字节
     * 一行一行的读，有的是读不出来的
     * @param path
     * @throws IOException
     */
    public void Stream02(String path) throws IOException {
        File file = new File(path);
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        byte[] bytes = new byte[10];
        int len;
        while ((len = inputStream.read(bytes)) != -1) {
            String string = new String(bytes, 0, len);
            System.out.println(string);
        }
    }
    /**
     * 使用缓冲区进行读取
     * @param path
     * @throws IOException
     */
    public void Stream03(String path) throws IOException {
        File file = new File(path);
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        InputStreamReader insr = new InputStreamReader(inputStream);
        BufferedReader buff = new BufferedReader(insr);
        String line= null;
        while ((line = buff.readLine() )!= null) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufr = new BufferedReader(new InputStreamReader(in));

        boolean flag = true;
        while (flag == true) {
            System.out.println("请输入数据：");
            String str = bufr.readLine();
            System.out.println("请输入的内容为：" + str);

            if (str.matches("\\d+")) {
                System.out.println("年龄是：" + Integer.parseInt(str));
                flag = false;
            } else {
                System.out.println("年龄输入错误，应该由数字组成");
            }
        }
    }
}
