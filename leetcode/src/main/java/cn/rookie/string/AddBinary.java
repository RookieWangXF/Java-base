package cn.rookie.string;

/**
 * Created by Rookie on 2016/4/10.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class AddBinary {
    public static String addBinary(String a, String b) {
        //1. 判断一方为null的情况
        if (a == null || a.length() == 0) {
            return b;
        }
        if (b == null || b.length() == 0) {
            return a;
        }
        //2. 将字符串转化为字符数组
        int length   = a.length() >=b.length() ? a.length() : b.length();
        int shortLength = a.length() >=b.length() ? b.length() : a.length();
        int[] A = getCharArray(a,length);
        int[] B =  getCharArray(b,length);
        int[] res = new int[length+1];
        //3. 相加
        int i = 0;
        int flag = 0;
        while (i < shortLength ) {
            res[i] = (A[i] +B[i]+flag) % 2;
            if ((A[i] +B[i]+flag) /2 == 1) {
                flag = 1;
            }else {
                flag = 0;
            }
            i++;
        }

        //4. 处理长度较长的那个
        if (a.length() < b.length()) {
            while (i <b.length()) {
                res[i] = (B[i]+flag) % 2;
                if ((B[i]+flag) /2 == 1) {
                    flag = 1;
                }else {
                    flag = 0;
                }
                i++;
            }
        }else{
            while (i < a.length()) {
                res[i] = (A[i]+flag) % 2;
                if ((A[i]+flag) /2 == 1) {
                    flag = 1;
                }else {
                    flag = 0;
                }
                i++;
            }
        }
        //5.对最后一位进行判断。
        StringBuilder sb = new StringBuilder();
        if(flag == 1){
            res[i] = 1;
            for (int j = length  ; j >= 0; j--) {
                sb.append(res[j]);
            }
        }else {
            for (int j = length -1 ; j>=0; j--) {
                sb.append(res[j]);
            }
        }

        return sb.toString();
    }
    public static int[] getCharArray(String s, int length){
        int[] arr = new int[length];
        for (int i = 0 ; i <s.length(); i++) {
            arr[i] = s.charAt(s.length()-1-i)-48;
        }
        return arr;
    }
    public static void main(String[] args) {
        String s1 = "1";
        String s2 = "1";
        System.out.println(addBinary(s1, s2));
        System.out.println(s1.charAt(0));
        int a = 3;
        int b =5;
        System.out.println(a>b ?a:b);
    }
}
