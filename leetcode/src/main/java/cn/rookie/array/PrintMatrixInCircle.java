package cn.rookie.array;

import cn.rookie.util.PrintUtil;

/**
 * Created by Rookie on 2016/9/9.
 * Description:输入一个二维矩阵，按照从外向里以顺时针依次打印出每一个数字
 */
public class PrintMatrixInCircle{

    public void printMatrixClockwisely(int[][] arr) {
        if (arr == null || arr.length == 0)
            return;
        int rows = arr.length;  //行数
        int columns = arr[0].length;  //列数

        int start = 0;  //指示左上角的位置
        while (columns > start * 2 && rows > start * 2) {  //看打印几圈
            printMatrixInCircle(arr, columns, rows, start);
            ++start;
        }
    }

    private void printMatrixInCircle(int[][] arr, int columns, int rows, int start) {
        int endX = columns - 1 - start;
        int endY = rows - 1 - start;

        //从左到右打印
        for (int i = start; i <= endX; ++i) {
            int number = arr[start][i];
            PrintUtil.printNumber(number);
        }
        //从上到下打印
        if (start < endY) {
            for (int i = start + 1; i <= endY; ++i) {
                int number = arr[i][endX];
                PrintUtil.printNumber(number);
            }
        }
        //从友到左
        if (start < endX && start < endY) {
            for (int i = endX - 1; i >= start; --i) {
                int number = arr[endY][i];
                PrintUtil.printNumber(number);
            }
        }
        //从下到上
        if (start < endX && start < endY - 1) {
            for (int i = endY - 1; i >= start + 1; --i) {
                int number = arr[i][start];
                PrintUtil.printNumber(number);
            }
        }
    }

}
