package cn.rookie.math;

/**
 * Created by Rookie on 2016/3/27.
 * Description: 实现矩阵计算
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class Matrix {
    /**
     * Created by Rookie.
     * Description: 矩阵加法、减法
     * Parameter:要求参数的行数和列数是相同的
     * return:
     */
    public static double[][] matrixPlux(double[][] a, double[][] b) {
        if (a == null || b == null || a.length == 0 || b.length == 0) {
            return null;
        }

        if (a.length != b.length || a[0].length != b[0].length) {
            throw new RuntimeException("两个矩阵大小不一致");
        }

        int length = a.length;
        int width = a[0].length;
        double[][] res = new double[length][width];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                res[i][j] = a[i][j] + b[i][j];
                //res[i][j] = a[i][j] - b[i][j];  减法
            }
        }
        return res;
    }
    /**
     * Created by Rookie.
     * Description:矩阵乘积
     * Parameter:要求a的列数等于b的行数
     * return:
     */
    public static double[][] matrixMul(double[][] a, double[][] b) {
        if (a == null || b == null || a.length == 0 || b.length == 0) {
            return null;
        }

        if (a.length != b[0].length) {
            throw new RuntimeException("两个矩阵无法相乘");
        }

        int length = a.length;
        int l = a[0].length;
        int width = b[0].length;
        System.out.println(length + " "+ width);
        double[][] res = new double[length][width];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                res[i][j] = 0;
                for (int k = 0; k < l ; k++) {
                    res[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        return res;
    }
}
