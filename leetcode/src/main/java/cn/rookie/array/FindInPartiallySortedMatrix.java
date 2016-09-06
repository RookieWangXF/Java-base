package cn.rookie.array;

/**
 * Created by Rookie on 2016/8/25.
 * Package_name is cn.rookie.array
 * Description:
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
