package cn.rookie.array;

/**
 * Created by Rookie on 2016/5/13.
 * Package_name is cn.rookie.array
 * Description:只要将障碍那一点设值为0即可
 */
public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int row = obstacleGrid.length;
        if (row < 1)
            return 0;
        int col = obstacleGrid[0].length;
        if (col < 1)
            return 0;

        if (obstacleGrid[0][0] == 1 || obstacleGrid[row - 1][col - 1] == 1)
            return 0;

        int[] a = new int[col];
        a[0] = 1;
        //一维数组方式，设值为1
        for (int j = 1; j < col; j++) {
            if (obstacleGrid[0][j] == 0) {
                a[j] = a[j - 1];
            } else {
                a[j] = 0;
            }
        }

        for (int i = 1; i < row; i++) {
            //左边起点为0，则整条路堵死
            if (obstacleGrid[i][0] == 1) {
                a[0] = 0;
            }
            for (int j = 1; j < col; j++) {
                if (obstacleGrid[i][j] == 1) {
                    a[j] = 0;
                } else {
                    a[j] += a[j - 1];
                }
            }
        }
        return a[col - 1];
    }
}
