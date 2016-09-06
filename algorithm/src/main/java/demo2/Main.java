package demo2;

import java.util.Scanner;

/**
 * Created by Rookie on 2016/9/5.
 * Package_name is demo2
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        int m;
        double sum, n;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            n = sc.nextInt();
            m = sc.nextInt();
            sum = 0;
            for (int i = 0; i < m; i++) {
                sum = sum + n;
                n = Math.sqrt(n);
            }
            System.out.printf("%.2f", sum);
            System.out.println();
        }
    }
}
