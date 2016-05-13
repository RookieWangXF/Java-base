package cn.rookie.array;

/**
 * Created by Rookie on 2016/5/12.
 * Package_name is cn.rookie.array
 * Description:
 */
public class UniquePaths {
    private static int count = 0;

    /**
     * 使用递归方式实现，速度慢
     * @param m
     * @param n
     * @return
     */
    public static int uniquePaths(int m, int n) {
        if (m == 1 && n == 1) {
            return 0;
        }
        if (m > 1 && n > 1) {
            return count = uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
        }
        if (m > 1 ) {
            return 1;
        }
        if (n > 1) {
            return 1;
        }

        return count;
    }

    /**
     * 可以将其看成二维数组，一个数的值是他的左边数值加上右边数值
     * @param m
     * @param n
     * @return
     */
    public static int uniquePaths2(int m, int n) {
        // DP with 1 dimension array
        int[] a = new int[n];
        for (int j = 0; j < n; j++) {
            a[j] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                a[j] += a[j-1];
            }
        }
        return a[n-1];
    }

    /**
     * 二维数组的实现
     * @param m
     * @param n
     * @return
     */
    public static int uniquePaths3(int m, int n) {
        // DP with 1 dimension array
        int[][] a = new int[m][n];

        for (int j = 0; j < m; j++) {
            a[j][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            a[0][j] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                a[i][j] = a[i - 1][j] + a[i][j - 1];
            }
        }
        return a[m-1][n-1];
    }
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(uniquePaths2(3,4));
        long end = System.currentTimeMillis();
        System.out.println("非递归"+(end-start));

        start = System.currentTimeMillis();
        System.out.println(uniquePaths(23,12));
        end = System.currentTimeMillis();
        System.out.println("递归"+(end-start));
    }
}
