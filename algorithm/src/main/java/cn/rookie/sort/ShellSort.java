package cn.rookie.sort;

/**
 * Created by Rookie on 2016/3/26.
 * Description:又叫做缩小增量排序
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class ShellSort {
    public static void shellsort(int[] arr){
        int j;

        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {

                Integer temp = arr[i];
                for (j = i; j >= gap && temp.compareTo(arr[j - gap]) < 0; j-=gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }

    }
}
