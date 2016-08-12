package cn.rookie.topk;

import java.util.PriorityQueue;

/**
 * Created by Rookie on 2016/8/4.
 * Package_name is cn.rookie.topk
 * Description:  一个数组，先放入最小堆中，在一次插入
 * PriorityQueue 优先队列类，本质就是一个堆，堆的顶部是最小的值。
 */
public class MinHeap {


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

        for (int i = k;i < arr.length;i++) {
            if (arr[i] > (int) p.peek()) {
                p.poll();
                p.add(arr[i]);
            }
        }

        return p.toArray();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 23, 4, 5, 6, 7, 8, 89, 5, 3, 223, 2};
        MinHeap minHeap = new MinHeap();
        Object[] arr2 = minHeap.findTopK(arr,5);
        for (int i = 0;i< arr2.length;i++) {
            System.out.println(arr2[i]);
        }
    }
}
