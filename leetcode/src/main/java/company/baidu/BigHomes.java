package company.baidu;

/**
 * Created by Rookie on 2016/9/21.
 * Description:
 */
public class BigHomes {
    public static int bigHomes(int[][] grid) {
        if (grid == null || grid.length == 0)
            return 0;
        int rowLength = grid.length;
        int colLength = grid[0].length;
        int max = 0;

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if (grid[i][j] == 1) {
                    int tmpArea = wideRange(grid, i, j, 0);
                    max = tmpArea > max ? tmpArea : max;
                }
            }
        }
        return max;
    }

    private static int wideRange(int[][] grid, int i, int j, int direction) {
        int rowLength= grid.length;
        int colLength = grid[0].length;
        int count = 1;
        grid[i][j] = 2;
        if (i + 1 < rowLength && grid[i + 1][j] == 1 && direction != 3)
            count += wideRange(grid, i + 1, j, 2);
        if (i - 1 >= 0 && grid[i - 1][j] == 1 && direction != 2)
            count += wideRange(grid, i - 1, j, 3);
        if (j + 1 < colLength && grid[i][j + 1] == 1 && direction != 1)
            count += wideRange(grid, i, j + 1, 0);
        if (j - 1 >= 0 && grid[i][j - 1] == 1 && direction != 0)
            count += wideRange(grid, i, j - 1, 0);
        return count;
    }
}
