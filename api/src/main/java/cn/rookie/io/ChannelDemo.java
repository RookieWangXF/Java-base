package cn.rookie.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by Rookie on 2016/3/27.
 * Description:使用FileChannel读取数据到Buffer中，数据是从通道中读取到缓冲区的，从缓冲区写入到通道中
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 * http://www.iteye.com/magazines/132-Java-NIO#579
 */
public class ChannelDemo {
    public static void read() throws IOException {
        RandomAccessFile aFile = null;
        try {
            aFile = new RandomAccessFile("src/main/resources/io/User.txt","rw");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        FileChannel inChannel = aFile.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(48);  //一次读取48个字节的内容
        int byesRead = 0;
        try {
            byesRead = inChannel.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (byesRead != -1) {
            System.out.println("READ " + byesRead);
            buffer.flip(); //切换模式
            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }
            buffer.clear();
            byesRead = inChannel.read(buffer);
        }
        aFile.close();
    }

    public static void main(String[] args) throws IOException {
        ChannelDemo.read();
    }
}
