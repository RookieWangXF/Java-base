package company.sohu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int len = scn.nextInt();
        if (len <= 0) {
            System.out.println(-1);
        } else {
            //最后多一个终点位置
            int[] places = new int[len + 1];
            for (int i = 0; i < len; i++) {
                places[i] = scn.nextInt();
            }

            int[] res = new int[places.length];
            for (int i = 0; i < places.length; i++) {
                res[i] = Integer.MAX_VALUE;
            }
            res[0] = 0;

            for (int i = 1; i < places.length; i++) {
                for (int j = 0; j < i; j++) {
                    if (res[j] != Integer.MAX_VALUE && j + places[j] >= i) {
                        res[i] = res[j] + 1;
                        break;
                    }
                }
            }

            System.out.println(res[places.length - 1]);
        }
    }
}