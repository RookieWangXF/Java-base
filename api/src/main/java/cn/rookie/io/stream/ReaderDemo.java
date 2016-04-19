package cn.rookie.io.stream;

import java.io.*;

/**
 * Created by Rookie on 2016/4/19.
 */
public class ReaderDemo {

    public void read01(String path) throws IOException {
        File file = new File(path);
        Reader reader = new FileReader(file);
        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.println((char) ch);
        }
    }

    public void read02(String path) throws IOException {
        File file = new File(path);
        Reader reader = new FileReader(file);

        char[] str = new char[1024];
        System.out.println(reader.read(str));
        String s = new String(str);
        System.out.println(s);
    }


    public void read03(String path) throws IOException {
        File file = new File(path);
        Reader reader = new FileReader(file);

        BufferedReader buff = new BufferedReader(reader);
        String string;
        while ((string = buff.readLine()) != null) {
            System.out.println(string);
        }
    }
}
