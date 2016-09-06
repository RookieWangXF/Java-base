package cn.rookie.io;

import java.io.*;
import java.nio.ByteBuffer;

/**
 * Created by Rookie on 2016/3/27.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class ReaderDemo {
    public void read(){
        InputStream input = null;
        try {
            input = new FileInputStream(new File("src/demo1/resources/io/User.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(input));

        try {
            String name = reader.readLine();
            String age = reader.readLine();
            String email = reader.readLine();
            String phone = reader.readLine();
            System.out.println(name + " " + age + " "+ email + " "+ phone);
        } catch (IOException e) {
            e.printStackTrace();
        }

        ByteBuffer buffer = ByteBuffer.allocate(48);
    }

    public static void main(String[] args) {
        ReaderDemo readerDemo = new ReaderDemo();
        readerDemo.read();
    }
}
