package cn.rookie.sort;

import java.util.Arrays;

/**
 * Created by Rookie on 2016/4/2.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class MergeSort {
    public static void Merge(int[] result, int[] left, int[] right){
        System.out.print("mergeing:" + Arrays.toString(left) + " and " + Arrays.toString(right));
        int i1 = 0; //index of left array
        int i2 = 0;  //index of right array
        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
                result[i] = left[i1];
                i1++;
            } else {
                result[i] = right[i2];
                i2++;
            }
        }
        System.out.println("  after one mergeing:" + Arrays.toString(result) );
    }

    public static void MergeSort(int[] arr) {

        System.out.println("sorting:" + Arrays.toString(arr));
        if (arr.length > 1) {
            int[] left = Arrays.copyOfRange(arr, 0, arr.length / 2);
            int[] right = Arrays.copyOfRange(arr, arr.length / 2, arr.length);

            MergeSort(left);
            MergeSort(right);

            Merge(arr, left, right);
        }
    }




    public static void main(String[] args) {
        int[] list = {14,32,67,76,23,41,58,85};
        System.out.println("before:"+ Arrays.toString(list));
        MergeSort(list);
        System.out.println("after:"+ Arrays.toString(list));
    }
}
