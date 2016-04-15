package cn.rookie.game;

/**
 * Created by Rookie on 2016/3/27.
 * Description:八皇后问题
 * Project_name: Algorithm
 * http://blog.csdn.net/zhong317/article/details/4586131
 * Copyright (c) All Rights Reserved.
 */
public class Queen8 {
    public static int num = 0;
    public static final int MAXQUEEN = 8;
    public static int[] cols = new int[MAXQUEEN];  //表示8列旗子摆放情况

    public Queen8(){
        getArrangement(0);
        System.out.print("\n");
        System.out.println(MAXQUEEN+"皇后问题有"+num+"种摆放方法。");
    }

    private void getArrangement(int n) {
        boolean[] rows = new boolean[MAXQUEEN];
        for (int i = 0; i < n; i++) {
            rows[cols[i]] = true;
            int d = n - i;
            if (cols[i] - d >= 0) {
                rows[cols[i] - d] = true;
            }
            if (cols[i] + d <= MAXQUEEN - 1) {
                rows[cols[i] + d] = true;
            }
        }
        for (int i = 0; i<MAXQUEEN;i++) {
            if (rows[i]) {
                continue;
            }
            cols[n] = i;
            if (n < MAXQUEEN - 1) {
                getArrangement(n + 1);
            } else {
                num++;
                printChessBoard();
            } 
        }
        
    }

    private void printChessBoard() {
        System.out.print("第" + num + "种走法 \n");
        for (int i = 0 ;i < MAXQUEEN;i++) {
            for (int j = 0;j<MAXQUEEN;j++) {
                if (i == cols[j]) {
                    System.out.print("0 ");
                } else {
                    System.out.print("+ ");
                }
            }
            System.out.print("\n");
        }
    }
}
