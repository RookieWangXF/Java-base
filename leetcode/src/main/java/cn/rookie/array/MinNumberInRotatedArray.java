package cn.rookie.array;

/**
 * Created by Rookie on 2016/8/25.
 * Package_name is cn.rookie.array
 * Description:[2,3,5,0,1]  弄成整体有序的
 */
public class MinNumberInRotatedArray {

    /**
     * 找到数组中最小的元素所在的位置，使用二分查找的方法
     * @param array
     * @return
     */
    public int minIndex(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE;
        }

        int before = 0;
        int last = array.length-1;
        int mid = before;
        while (array[before] >= array[last]) {
            if (last - before == 1) {
                mid = last;
                break;
            }

            mid = (last + before) / 2;
            if (array[before] == array[last] && array[last] == array[mid] && array[before] == array[mid]) {
                return minInOrder(array, before, last);
            }

            if (array[mid] >= array[before]) {
                before = mid;
            } else if (array[mid] <= array[last]) {
                last = mid;
            }
        }

        return array[mid];
    }

    private int minInOrder(int[] array, int before, int last) {
        int res = array[before];
        for (int i = before + 1; i <= last; ++i) {
            if (res > array[i]) {
                res = array[i];
            }
        }
        return res;
    }
}
