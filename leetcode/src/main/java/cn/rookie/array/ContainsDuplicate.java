package cn.rookie.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Rookie on 2016/4/10.
 * Description:判断是否包含重复的数字
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class ContainsDuplicate {
    public static boolean  containsDuplicate(int[] nums) {
		/*
		 * 当输入为空，或者长度为0时候返回true
		 */
        if (nums.length == 0 || nums == null) {
            return true;
        }
		/*
		 * 依次遍历数组中的数，然后放入哈希表中，不同的key放入不同的位置，
		 * 然后放入下一个的时候判断key是否重复，最终会返回true
		 */
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 0);
            }else {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int a[]= {1,343,1,5,65};
        System.out.println(containsDuplicate(a));
    }
}
