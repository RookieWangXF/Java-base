package cn.rookie.array;

import jdk.internal.org.objectweb.asm.Handle;

import java.util.HashMap;
import java.util.Map;
import java.util.zip.Inflater;

/**
 * Created by WXF on 2016/4/30.
 */
public class SortColors {

    public static void sortColors(int[] nums) {

        if (nums == null || nums.length == 0 || nums.length == 1) {
            return;
        } else {
            int i = -1, j = -1;
            for (int p = 0; p < nums.length; p++) {
                int v = nums[p];
                nums[p] = 2;

                if (v == 0) {
                    nums[++j] = 1;
                    nums[++i] = 0;
                } else if (v == 1) {
                    nums[++j] = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        SortColors.sortColors(null);

    }
}
