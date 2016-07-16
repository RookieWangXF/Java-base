package cn.rookie.memory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Rookie on 2016/5/14.
 * Package_name is cn.rookie.memory
 * Description: 可以造成堆内存溢出
 */
public class HeapOOM {
    static class OOMObject {

    }

    public static void main(String[] args) {
        System.out.println("HeapOOM");
        List<OOMObject> list = new ArrayList<>();
        int count = 0;
        while (true) {
            list.add(new OOMObject());
            System.out.println("Instance: " + (++count));
        }

    }
}
