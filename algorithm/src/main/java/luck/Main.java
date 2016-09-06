package luck;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int T;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        int n;
        while (sc.hasNext()) {
            n = sc.nextInt();
            int res = 0;
            for (int j = 1; j <= n; j++) {
                if ((f(j) == g(j))) {
                    res++;
                }
            }
            System.out.println(res);
        }
    }

    public static int f(int x) {
        int res = 0;
        while (x != 0) {
            res += x % 10;
            x = x / 10;
        }
        return res;
    }
    public static int g(int x) {
        int res = 0;
        while (x != 0) {
            res += (1 & x);
            x = x >> 1;
        }
        return res;
    }

}