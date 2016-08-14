package demo;

import java.util.Scanner;

/**
 * Created by Rookie on 2016/8/2.
 * Package_name is demo
 * Description:
 */
public class Test01 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                String temp = in.next();
                if (".".equals(temp)) {
                    //可以走的路设值为1
                    arr[i][j] = 1;
                } else if("X".equals(temp)){
                    arr[i][j] = 0;
                }
            }
        }
        //获取起点坐标
        int x = in.nextInt();
        int y = in.nextInt();
        //合法步长数
        int k = in.nextInt();
        int[][] choseStep = new int[k][2];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < 2; j++) {
                choseStep[i][j] = in.nextInt();
            }
        }
        int result = findMaxStep(m,n,arr,x,y,choseStep,k);
        System.out.println(result);
    }

    /**
     * @param arr       整个图
     * @param x
     * @param y
     * @param choseStep 可选路径
     * @return
     */
    private static int findMaxStep(int m, int n, int[][] arr, int x, int y, int[][] choseStep, int k) {

        if (x >= m || y >= n || x < 0 || y < 0 || arr[x][y] == 0) {
            return -1;
        }

        int length = 0;
        for (int i = 0; i < k; i++) {
            x += choseStep[i][0];
            y += choseStep[i][1];

            if (x >= m || y >= n || x < 0 || y < 0 || arr[x][y] == 0) {
                return 0;
            } else {
                int temp = 1 + findMaxStep(m, n, arr, x, y, choseStep, k);
                if (temp > length && temp < k) {
                    length = temp;
                }
            }
        }
        return length;
    }

}
