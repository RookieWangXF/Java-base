package demo1;

/**
 * Created by Rookie on 2016/9/5.
 * Package_name is demo1
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.f(123));
    }
    private int f(int x) {
        int res = 0;
        while (x != 0) {
            res += (1 & x);
            x = x >> 1;
        }
        return res;
    }
}
