package cn.rookie.util;

/**
 * Created by Rookie on 2016/9/9.
 * Description:
 */
public class PrintUtil {

    /**
     * print a number
     * @param number
     */
    public static void printNumber(int number) {
        System.out.print(number+" ");
    }

    /**
     * print a matrix
     * @param arr
     */
    public static void printMatrix(int[][] arr) {
        if(arr == null || arr.length == 0)
            return;
        int rows = arr.length;
        int columns = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                printNumber(arr[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * 打印数组，从第k个位置开始打印
     * @param arr
     * @param k
     */
    public static void printArray(int[] arr, int k) {
        for (int i = k;i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void printArray(int[] arr) {
        printArray(arr, 0);
    }

    public static void printArray(Object[] arr, int k) {
        for (int i = k;i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void printArray(Object[] arr) {
        printArray(arr, 0);
    }
}
