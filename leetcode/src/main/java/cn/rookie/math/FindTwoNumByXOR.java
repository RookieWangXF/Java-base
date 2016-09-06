package cn.rookie.math;

/**
 * Created by Rookie on 2016/9/5.
 * Package_name is cn.rookie.math
 * Description:
 */
public class FindTwoNumByXOR {

    public static int[] findTwoNumByXOR(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            x ^= arr[i];
        }

        if (x == 0) {
            throw new RuntimeException("No single data");
        }
        int flag = 1;
        int xCopy = x;
        while ((1 & xCopy) == 0) {
            xCopy = xCopy >> 1;
            flag = flag << 1;
        }
        int y = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((flag & arr[i]) == flag) {

                y ^= arr[i];
            }
        }

        return new int[]{x ^ y, y};
    }

    public static void main(String[] args) {
        int[] arr = new int[]{ 5, 6, 7, 6,5,6};
        int[] res = FindTwoNumByXOR.findTwoNumByXOR(arr);
        for (int i = 0; i < res.length;i++ ) {
            System.out.println(res[i]);
        }
    }
}
