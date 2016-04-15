package cn.rookie.math;

/**
 * Created by Rookie on 2016/3/26.
 * Description: 计算最大公约数，
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class Gcd {
    /**
     * Created by Rookie.
     * Description: 使用辗转相除法，但当参与的数据非常大的时候不好
     * Parameter:
     * return:
     */
    public int gcd(int a, int b) {
        int max,min,r;
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }

        r = max % min;
        while (r != 0) {
            max = min;
            min = r;
            r = max % min;
        }
        return min;
    }

    /**
     * Created by Rookie.
     * Description: 使用Stein算法，在计算超过64位大数的时候，采用整数的移位和加减法（int 32位）
     * Parameter:
     * return:
     */
    public int gcd2(int a, int b) {
        int max,min,r;
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }

        //当较小数为0时，返回较大的数为最大公约数
        if (min == 0) {
            return max;
        }
        //都是偶数时候，去一个2
        if (max % 2 == 0 && min % 2 == 0) {
            return 2 * gcd(max >> 1, min >> 1);
        }

        if (max % 2 == 0) {
            return gcd(max >> 1, min);
        }
        if (min % 2 == 0) {
            return gcd(max, min >> 1);
        }

        return gcd((max + min) >> 1, (max - min) >> 1);
    }

    public int lcm (int a ,int b) {
        int gcd = gcd2(a, b);
        return (a * b) / gcd;
    }
}
