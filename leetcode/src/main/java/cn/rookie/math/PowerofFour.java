package cn.rookie.math;

/**
 * Created by WXF on 2016/4/30.
 */
public class PowerofFour {

    public static boolean isPowerOfFour(int num) {
        while (num >= 4) {
            if (num % 4 != 0) {
                return false;
            }
            num /= 4;
        }
        return num == 1;
    }

    public static void main(String[] args) {
        for (int i =  0; i <= 16; i++) {
            System.out.println(i +" : " + PowerofFour.isPowerOfFour(i));
        }
        System.out.println(PowerofFour.isPowerOfFour(1162261466));

    }
}
