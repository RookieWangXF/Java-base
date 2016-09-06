package cn.rookie.atomic;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * Created by Rookie on 2016/8/22.
 * Package_name is cn.rookie.atomic
 * Description:
 */
public class ArrayType {
    static int[] value = {1, 2, 3};
    static AtomicIntegerArray aia = new AtomicIntegerArray(value);

    public int getAndSet(int i, int j) {
        return aia.getAndSet(i, j);
    }
}
