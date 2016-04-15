package cn.rookie.sort;

import java.util.Arrays;

/**
 * Created by Rookie on 2016/3/26.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class QuickSort {
    public static void sort(int[] arr){
        sort(arr, 0, arr.length-1);
    }

    private static void sort(int[] arr, int p, int q) {
        if (p < q) {
            int pivot = Partition(arr,p,q);
            sort(arr, p, pivot - 1);
            sort(arr, pivot + 1, q);
        }
    }

    private static int Partition(int[] arr, int p, int q) {
        int pivotKey = arr[p];
        while (p < q) {
            while (p < q && arr[q] >= pivotKey) {
                q--;
            }
            arr[p] = arr[q];
            while (p < q && arr[p] <= pivotKey) {
                p++;
            }
            arr[q] = arr[p];
        }
        arr[q] = pivotKey;
        return q;
    }

    public static void main(String[] args) {
        int[] list = {14,32,67,76,23,41,58,85};
        System.out.println("QuickSort");
        System.out.println("before:"+ Arrays.toString(list));
        sort(list);
        System.out.println("after:"+ Arrays.toString(list));
    }
}
