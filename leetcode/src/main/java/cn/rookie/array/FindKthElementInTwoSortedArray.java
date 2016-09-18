package cn.rookie.array;

/**
 * Created by Rookie on 2016/8/20.
 * Package_name is cn.rookie.array
 * Description:
 */
public class FindKthElementInTwoSortedArray {

    /**
     * K的时间复杂度
     * @param arrA
     * @param arrB
     * @param k
     * @return
     */
    public int findKthSmallest(int[] arrA, int[] arrB, int k) {
        int a_offset = 0, b_offset = 0;
        if (arrA.length + arrB.length < k) {
            return -1;
        }

        while (true) {
            if (a_offset < arrA.length) {
                while ((a_offset < arrA.length) && (b_offset == arrB.length || arrA[a_offset] <= arrB[b_offset] )) {
                    a_offset++;
                    if ((a_offset + b_offset) == k) {
                        return arrA[a_offset - 1];
                    }
                }
            }
            if (b_offset < arrB.length) {
                while ((b_offset < arrB.length) && (a_offset == arrA.length || arrA[a_offset] >= arrB[b_offset])) {
                    b_offset++;
                    if ((a_offset + b_offset) == k) {
                        return arrB[b_offset - 1];
                    }
                }
            }
        }
    }


    public int findK(int[] arrA, int[] arrB, int k){
        if (arrA.length + arrB.length < k) {
            return -1;
        }
        return findK(arrA, 0, arrA.length - 1, arrB, 0, arrB.length - 1, k);
    }

    public int findK(int[] arrA, int aBegin, int aEnd, int[] arrB, int bBegin, int bEnd, int k) {
        if (aBegin > aEnd) {
            return arrB[bBegin + k - 1];
        }
        if (bBegin > bEnd) {
            return arrA[aBegin + k - 1];
        }

        int aMid = aBegin + (aEnd - aBegin) / 2;
        int bMid = bBegin + (bEnd - bBegin) / 2;

        int halfLen = aMid - aBegin + bMid - bBegin + 2;

        if (arrA[aMid] < arrB[bMid]) {
            if (halfLen > k) {
                //比大数所在的数组要小
                return findK(arrA, aBegin, aEnd, arrB, bBegin, bMid - 1, k);
            } else {
                //比小数所在的数组大，因此可以去除小数组的前部分
                return findK(arrA, aMid + 1, aEnd, arrB, bBegin, bEnd, k - (aMid - aBegin + 1));
            }
        } else {
            if (halfLen > k) {
                return findK(arrA, aBegin, aMid - 1, arrB, bBegin, bEnd, k);
            } else {
                return findK(arrA, aBegin, aEnd, arrB, bMid + 1, bEnd, k - (bMid - bBegin + 1));
            }
        }
    }
}
