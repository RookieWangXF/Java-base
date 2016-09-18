package cn.rookie.array;

import cn.rookie.util.PrintUtil;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by Rookie on 2016/9/9.
 * Description:
 */
public class FindKSmallestElementInArrayTest {

    private int[] arr;
    private int[] arr2;
    @Before
    public void setUp() throws Exception {
        Random random = new Random();
        arr = new int[100000];
        arr2 = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = random.nextInt(10000);
            arr2[i] = arr[i];
        }
    }

    @Test
    public void findTopK() throws Exception {
        Object[] res = new FindKSmallestElementInArray().findTopK(arr, 10);
        Arrays.sort(arr2);
        PrintUtil.printArray(res);
        System.out.println();
        PrintUtil.printArray(arr2, arr2.length - 10);
    }

}