package cn.rookie.array;

/**
 * Created by Rookie on 2016/8/20.
 * Package_name is cn.rookie.array
 * Description:  https://leetcode.com/problems/kth-largest-element-in-an-array/
 */
public class KthLargestElementInAnArray {

    public int findKthLargest(int[] nums, int k) {
        int left = 0;
        int right = nums.length - 1;

        while (true) {
            //find a num which is in the final location
            int pos = partition(nums, left, right);
            if (pos == (nums.length-k)) {
                return nums[pos];
            }
            if (pos > (nums.length-k)) {
                right = pos - 1;
            } else {
                left = pos + 1;
            }
        }
    }

    private int partition(int[] arr, int p, int q) {
        int pivotKey = arr[p];
        while (p < q) {
            while (p < q && arr[q] >= pivotKey) {
                q--;
            }
            arr[p] = arr[q];
            while (p < q && arr[p] <= pivotKey) {
                p++;
            }
            arr[q] = arr[p];
        }
        arr[q] = pivotKey;
        return q;
    }
}
