package cn.rookie.array;

public class MergeSortedArray {
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;
	 
		while (k >= 0) {
			if (j < 0 || (i >= 0 && nums1[i] > nums2[j]))
				nums1[k--] = nums1[i--];
			else
				nums1[k--] = nums2[j--];
		}
       
       
    }
	public static void main(String[] args) {
		int[] nums1 = {1,0};
		int m =1;
		int[] nums2 = {2};
		int n =1;
		merge(nums1, m, nums2, n);
		for (int i = 0; i < nums1.length; i++) {
			System.out.print(nums1[i]);
		}
		
	}

}
