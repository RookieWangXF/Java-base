package cn.rookie.array;

import org.junit.Test;

/**
 * Created by Rookie on 2016/8/20.
 * Package_name is cn.rookie.array
 * Description:
 */
public class KthLargestElementInAnArrayTest {
    @Test
    public void findKthLargest() throws Exception {
        int[] arr = {2, 1};
        KthLargestElementInAnArray test = new KthLargestElementInAnArray();
        System.out.println(test.findKthLargest(arr, 2));
    }

}