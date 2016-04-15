package cn.rookie.p2;

/**
 * Created by Rookie on 2016/4/10.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class PlusOne {
    public static void main(String[] args) {
        int[] a ={2,3};
        a=plusOne(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }

    }
    public static int[] plusOne(int[] digits) {
        int flag = 1;
        int i =0;
        for(i= digits.length-1;i>=0;i--){
            digits[i] = digits[i]+flag;
            if(digits[i]>9){
                flag=1;
                digits[i] = 0;
            }else {
                return digits;
            }
        }
        if(i==-1&&flag ==1){
            int[] newPlusOne = new int[digits.length+1];
            newPlusOne[0] = 1;
            for (int j = 0; j < digits.length; j++) {
                newPlusOne[j+1] = digits[j];
            }
            return newPlusOne;
        }
        return digits;
    }
}
