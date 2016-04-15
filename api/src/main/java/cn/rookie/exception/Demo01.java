package cn.rookie.exception;

/**
 * Created by Rookie on 2016/4/7.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */

/**
 * throws的异常是针对整个方法的
 * catch是针对 try中抛出的异常进行处理，如果能catch到程序就不会结束
 */
public class Demo01 {
    public static void main(String[] args) throws Exception {

        int[] arr = {1,2};

        try {
            arr[3] = 3;
        } catch (ArrayIndexOutOfBoundsException e) {
            //throw new RuntimeException("数组越界了");
        } finally {
            System.out.println("finally内容一定会执行");
        }
        System.out.println("aa");
        arr[3] = 3;

    }
}
