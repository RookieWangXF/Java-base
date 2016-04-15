package cn.rookie.array;

public class RotateArray {
	public static void rotate(int[] nums, int k) {
		int n = nums.length;
		k = k% n;
		if (nums.length > 1) {
			
			reverse(nums,0,n-k-1);
			reverse(nums, n-k, n-1);
			reverse(nums, 0, n-1);
		}
    }
	public static void reverse(int[] nums, int low, int high){
		int temp = 0;
		while (low < high) {
			temp = nums[low];
			nums[low] = nums[high];
			nums[high] = temp;
			low++;
			high--;
		}
	}
	public static void main(String[] args) {
		int[] nums = {1,2};
		rotate(nums, 3);
		for (int i : nums) {
			System.out.print(i + ":");
		}
		
	}

}
