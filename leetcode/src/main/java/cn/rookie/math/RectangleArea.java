package cn.rookie.math;

/**
 * Created by Rookie on 2016/4/10.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class RectangleArea {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
    	/*
    	 * 分别计算两个长方形的面积
    	 */
        int length1 = Math.abs(C - A);
        int width1 = Math.abs(D - B);
        int area1 = length1*width1;
        int length2 = Math.abs(G - E);
        int width2 = Math.abs(H - F);
        int area2 = length2 * width2;
    	/*
    	 * 将两个图形相交的部分取出来
    	 */
        int area3 = getArea(A,B,C,D,E,F,G,H);
        return area1 + area2 - area3;
    }

    private int getArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        if (G-C < G-E && D-B < D-H) {
            return Math.abs(C-E) * Math.abs(H-B);
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {

    }
}
