package cn.rookie.array;

/**
 * Created by Rookie on 2016/8/17.
 * Package_name is cn.rookie.array
 * Description:
 */
public class TranslateArray {

    public int[] translate(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        int length = arr.length;
        int[] b = new int[length];
        b[0] = 1;
        for (int i = 1; i <= length - 1; i++) {
            b[i] = b[i-1] * arr[i - 1];
        }
        for (int i = length - 1; i >= 1; i--) {
            b[i] *= b[0];
            b[0] *= arr[i];
        }
        return b;
    }


}
