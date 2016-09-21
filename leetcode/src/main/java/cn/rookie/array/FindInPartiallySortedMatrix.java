package cn.rookie.array;

/**
 * Created by Rookie on 2016/8/25.
 * Package_name is cn.rookie.array
 * Description:在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class FindInPartiallySortedMatrix {

    public boolean find(int[][] matrix, int number) {
        if (matrix == null || matrix.length == 0)
            return false;

        boolean found = false;
        int rows = matrix.length;
        int columns = matrix[0].length;
        int row = 0;
        int column = columns - 1;
        while (row < rows && column >= 0) {
            if (matrix[row][column] == number) {
                found = true;
                break;
            } else if (matrix[row][column] > number) {
                --column;
            } else {
                ++row;
            }

        }
        return found;
    }
}
