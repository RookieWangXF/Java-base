package cn.rookie.sort;

/**
 * Created by Rookie on 2016/4/2.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class SelectionSort {
    public static void sort(int[] arr){
        int length = arr.length;
        int min; //记录每一行的最小值
        for (int i = 0; i< length;i++) {
            min = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            swap(arr, i, min);
        }
    }

    public static void rsort(int[] arr) {
        int length = arr.length;
        rsort(arr, 0, length);
    }

    private static void rsort(int[] arr, int p, int q) {
        if (p < q) {
            int min = findMin(arr, p, q);
            swap(arr, min, p);
            rsort(arr, p + 1, q);
        }
    }

    private static int findMin(int[] arr, int p, int q) {
        int min = p;
        for (int i = p; i < q;i++) {
            if (arr[i] < arr[min]) {
                min = i;

            }
        }
        return min;
    }


    private static void swap(int[] arr, int m, int n) {
        int temp = arr[m];
        arr[m] = arr[n];
        arr[n] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,9,2,7,4,5,89,45,67,23};
        int[] arr2 = {1,9,2,7,4,5,89,45,67,23};
        rsort(arr2);
        sort(arr);
        System.out.println("SelectionSort");
        for (int i = 0 ;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("RSelectionSort");
        for (int i = 0 ;i<arr2.length;i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
