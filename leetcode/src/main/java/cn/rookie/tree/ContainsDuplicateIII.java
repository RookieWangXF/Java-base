package cn.rookie.tree;

import java.util.TreeSet;

/*
 *  给定一个整数数组，判断其中是否存在两个不同的下标i和j满足：| nums[i] - nums[j] | <= t 并且 | i - j | <= k
 *  1. floor()方法返set中≤给定元素的最大元素；如果不存在这样的元素，则返回 null。
	 2. ceiling()方法返回set中≥给定元素的最小元素；如果不存在这样的元素，则返回 null。
 */
public class ContainsDuplicateIII {
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(k <1 || t<0){
            return false;
        }
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (set.floor(n) != null && n <= t + set.floor(n) ||set.ceiling(n) != null &&set.ceiling(n) <= t+n) {
                return true;
            }
            set.add(n);
            if (i >= k) {
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }

}

