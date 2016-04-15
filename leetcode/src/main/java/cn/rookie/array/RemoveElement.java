package cn.rookie.array;

public class RemoveElement {
	public static int removeElement(int[] nums, int val) {
		if (nums.length == 0) {
			return 0;
		}
		int n = nums.length;
		int i= 0;
		while (i < n) {
			if (nums[i] !=val) {
				i++;
			} else {
				int temp = nums[i];
				nums[i] = nums[n-1];
				nums[n-1] = temp;
				
				n--;
			}
		}
		int[] res = new int[n];
		System.arraycopy(nums, 0, res, 0, n);
		nums =null;
		nums = res;
		return n;
    }
	public static void main(String[] args) {
		int[] nums  = {1};
		int val =1;
		System.out.println(removeElement(nums, val));
	}

}
