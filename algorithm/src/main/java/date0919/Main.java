package date0919;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        /*int T;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        int n;
        while (sc.hasNext()) {
            n = sc.nextInt();
            int res = 0;
            for (int j = 1; j <= n; j++) {

            }
            System.out.println(res);
        }*/
        System.out.println(findStep(0,2,1));
        Stack stack = new Stack();
        ArrayList data = new ArrayList();
    }

    public static int findStep(int current, int target, int length) {
        //1. 相等时候，返回0，不用移动。
        if (current == target)
            return 0;
        //2. 不相等的时候要移动，移动结果分为三种情况
        if (current + length == target || current - length == target) {
            return 1;
        } else if (Math.abs(current + length) > Math.abs(target) || Math.abs(current - length) > Math.abs(target)) {
            return -1;
        } else {
            int res = findStep(current + length, target, length + 1);
            int res2 = findStep(current - length, target, length + 1);
            if (res != -1)
                return res;
            if (res2 != -1)
                return res2;
            return -1;
        }
    }

}
