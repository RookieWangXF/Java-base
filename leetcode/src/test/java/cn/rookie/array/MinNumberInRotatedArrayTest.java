package cn.rookie.array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rookie on 2016/8/25.
 * Package_name is cn.rookie.array
 * Description:
 */
public class MinNumberInRotatedArrayTest {
    @Test
    public void minIndex() throws Exception {
        MinNumberInRotatedArray minNumberInRotatedArray = new MinNumberInRotatedArray();
        int[] arr = {4, 5, 6, 7, 1, 2, 3};
        System.out.println(minNumberInRotatedArray.minIndex(arr));
    }

}