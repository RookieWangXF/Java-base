package cn.rookie.memory;

import java.util.ArrayList;
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
        List<OOMObject> list = new ArrayList<>();
        while (true) {
            list.add(new OOMObject());
        }
    }
}
