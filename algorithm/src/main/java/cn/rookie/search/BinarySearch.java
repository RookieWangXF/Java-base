package cn.rookie.search;

/**
 * Created by Rookie on 2016/4/2.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class BinarySearch {
    public int indexOf(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) { //这里是 <=  不=的话会出现问题
            int mid = low + (high - low) / 2; //这里(low + high) / 2 容易出现溢出
            if (arr[mid] == key){
                return mid;
            } else if (arr[mid] > key){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public int rindexOf(int[] arr, int key){
        return rindexOf(arr, key, 0, arr.length - 1);
    }

    private int rindexOf(int[] arr, int key, int low, int high) {
        if (low > high) {
            return -1;
        } else {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                return rindexOf(arr, key, mid + 1, high);
            } else {
                return rindexOf(arr, key, low, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
        int[] arr = {1, 2, 3, 4, 5};
        int key = 2;
        System.out.println(search.indexOf(arr,key));
        System.out.println(search.rindexOf(arr,key));
    }
}
