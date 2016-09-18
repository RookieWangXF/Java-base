package cn.rookie.array;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Rookie on 2016/8/20.
 * Package_name is cn.rookie.array
 * Description:
 */
public class FindKthElementInTwoSortedArrayTest {



    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void findK2() throws Exception {
        int[] arrA = {1, 4, 5, 7};
        int[] arrB = {2, 3, 6};
        FindKthElementInTwoSortedArray findKthElm = new FindKthElementInTwoSortedArray();
        System.out.println(findKthElm.findKthSmallest(arrA,arrB,1));
        System.out.println(findKthElm.findKthSmallest(arrA,arrB,2));
        System.out.println(findKthElm.findKthSmallest(arrA,arrB,3));
        System.out.println(findKthElm.findKthSmallest(arrA,arrB,4));
        System.out.println(findKthElm.findKthSmallest(arrA,arrB,5));
        System.out.println(findKthElm.findKthSmallest(arrA,arrB,6));
        System.out.println(findKthElm.findKthSmallest(arrA,arrB,7));


    }
    @Test
    public void findK() throws Exception {
        int[] arrA = {1, 4, 5, 7};
        int[] arrB = {2, 3, 6};
        FindKthElementInTwoSortedArray findKthElm = new FindKthElementInTwoSortedArray();
        System.out.println(findKthElm.findK(arrA, arrB, 1));
        System.out.println(findKthElm.findK(arrA, arrB, 2));
        System.out.println(findKthElm.findK(arrA, arrB, 3));
        System.out.println(findKthElm.findK(arrA, arrB, 4));
        System.out.println(findKthElm.findK(arrA, arrB, 5));
        System.out.println(findKthElm.findK(arrA, arrB, 6));
        System.out.println(findKthElm.findK(arrA, arrB, 7));
        System.out.println(findKthElm.findK(arrA, arrB, 8));

    }

}