package cn.rookie.sort;

/**
 * Created by Rookie on 2016/3/26.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class BubbleSort {

    public static void sort(int[] arr) {
        int length = arr.length;
        boolean flag;
        for (int i = 0; i < length; i++) {
            flag = false;
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    swap(arr, j, j + 1);
                }
            }
            if (!flag) {
                break;
            }
        }
    }

    public static void rsort(int[] arr) {
        int length = arr.length;
        rsort(arr, 0, length);
    }

    private static void rsort(int[] arr, int p, int q) {
        if (p < q) {
            findMax(arr, p, q);
            rsort(arr,p,q-1);
        }
    }

    private static void findMax(int[] arr, int p, int q) {
        for (int i = 0 ; i< q-1;i++) {
            if (arr[i] > arr[i + 1]) {
                swap(arr,i,i+1);
            }
        }
    }

    private static void swap(int[] arr, int m, int n) {
        int temp = arr[m];
        arr[m] = arr[n];
        arr[n] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,9,2,7,4,5,89,45,67,23};
        sort(arr);
        System.out.println("BubbleSort");
        for (int i = 0 ;i<arr.length;i++) {

            System.out.print(arr[i]+" ");
        }
    }
}
