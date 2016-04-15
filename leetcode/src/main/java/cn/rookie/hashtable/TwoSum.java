package cn.rookie.hashtable;

import java.util.Hashtable;

/**
 * Created by Rookie on 2016/4/10.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] num = { 2, 7, 11, 15 };
        int targ = 17;
        int[] res = twoSum(num, targ);
        System.out.println("index1="+(res[0])+", index2="+(res[1]));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        Hashtable<Integer, Integer> num = new Hashtable<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            Integer n = num.get(numbers[i]);
            if(n == null){
                n=num.put(numbers[i], i);
            }
            n=num.get(target-numbers[i]);
            if(n!=null && n<i){
                res[0] = n+1;
                res[1] = i+1;
                return res;
            }
        }
        return res;
    }
}
