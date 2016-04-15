package cn.rookie.recursive;

/**
 * Created by Rookie on 2016/4/13.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class Fibonacci {

    /**
     * 由于递归的原因，中间的计算过程有很多是重复的，导致计算速度非常慢。
     */
    public static long Fibonacci01(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return Fibonacci01(n - 1) + Fibonacci01(n - 2);
    }

    public static long Fibonacci02(int n) {
        int[] result = {0, 1};
        if (n < 2) {
            return result[n];
        }

        int fibNMinusOne = 1;
        int fibNMinusTwo = 0;
        int fibN = 0;
        for (int i =2; i<=n;i++) {
            fibN = fibNMinusOne + fibNMinusTwo;
            fibNMinusTwo = fibNMinusOne;
            fibNMinusOne = fibN;
        }
        return fibN;
    }

    public static long Fibonacci03(int n) {
        if (n < 0) {
            throw new RuntimeException("数值大小有问题");
        }
        if (n <= 1) {
            return 1;
        }
        int last = 1;
        int nextToLast= 1;
        int answer = 1;
        for (int i = 2; i < n; i++) {
            answer = last + nextToLast;
            nextToLast = last;
            last = answer;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci.Fibonacci01(10));
        System.out.println(Fibonacci.Fibonacci02(10));
        System.out.println(Fibonacci.Fibonacci03(10));
    }
}
