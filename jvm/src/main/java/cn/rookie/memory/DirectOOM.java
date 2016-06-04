package cn.rookie.memory;

import java.nio.ByteBuffer;

/**
 * Created by Rookie on 2016/6/3.
 * Package_name is cn.rookie.memory
 * Description:直接内存溢出
 */
public class DirectOOM {
    private static final int ONE_GB = 1024 * 1024 * 512;
    private static int count = 1;

    public static void main(String[] args) {
        try {
            while (true) {
                ByteBuffer byteBuffer = ByteBuffer.allocate(ONE_GB);
                count++;
            }
        } catch (Exception e) {
            System.out.println("Exception: instance created" + count);
            e.printStackTrace();
        } catch (Error e) {
            System.out.println("Error: instance created" + count);
            e.printStackTrace();
        }
    }
}
