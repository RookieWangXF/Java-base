package cn.rookie.math;

/**
 * Created by Rookie on 2016/9/21.
 * Description:
 */
public class NumberOf1 {

    public static int numberOf1(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n &= (n - 1);
        }
        return count;
    }
}
