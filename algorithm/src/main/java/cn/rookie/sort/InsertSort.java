package cn.rookie.sort;

/**
 * Created by Rookie on 2016/3/26.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class InsertSort {
    public static void sort(int[] arr){
        int length = arr.length;
        int j, key;
        for (int i = 1; i < length; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void rsort(int[] arr){
        int length = arr.length;
        rsort(arr, 0, length);
    }

    private static void rsort(int[] arr, int p, int q) {
        if (p < q) {
            rsort(arr, p, q - 1);
            rsortInsert(arr, p, q - 1);
        }
    }

    private static void rsortInsert(int[] arr, int p, int q) {
        int j = q - 1;
        int key = arr[q];
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }

    public static void main(String[] args) {
        int[] arr = {1,9,2,7,4,5,89,45,67,23};
        int[] arr2 = {1,9,2,7,4,5,89,45,67,23};
        sort(arr);
        rsort(arr2);
        for (int i = 0 ;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0 ;i<arr2.length;i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
