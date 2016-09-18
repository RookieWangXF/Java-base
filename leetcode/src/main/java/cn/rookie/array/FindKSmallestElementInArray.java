package cn.rookie.array;

import java.util.PriorityQueue;

/**
 * Created by Rookie on 2016/8/20.
 * Package_name is cn.rookie.array
 * Description:找到数组中最大的k个数。
 */
public class FindKSmallestElementInArray {

    public Object[] findTopK(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        if (arr.length <= k) {
            return null;
        }

        PriorityQueue p = new PriorityQueue(k);
        for (int i = 0; i < k; i++) {
            p.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            if (arr[i] > (int) p.peek()) {
                p.poll();
                p.add(arr[i]);
            }
        }
        return p.toArray();
    }

}
