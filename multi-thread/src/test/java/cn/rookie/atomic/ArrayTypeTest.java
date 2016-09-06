package cn.rookie.atomic;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rookie on 2016/8/22.
 * Package_name is cn.rookie.atomic
 * Description:
 */
public class ArrayTypeTest {
    @Test
    public void getAndSet() throws Exception {
        System.out.println(ArrayType.aia.getAndSet(0, 3));
        System.out.println(ArrayType.aia.get(0));
        System.out.println(ArrayType.value[0]);//原来的值未改变
    }

}