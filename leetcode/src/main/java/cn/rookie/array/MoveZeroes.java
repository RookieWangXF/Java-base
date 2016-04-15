package cn.rookie.array;

public class MoveZeroes {
	public static void moveZeroes(int[] nums) {
		int count = 0;
		int length= nums.length;
		for (int i = 0; i < length; i++) {
			
			if (nums[i] == 0) {
				count++;
			}else {
				nums[i-count] = nums[i];
			}
		}
		for (int i = count; i >0; i--) {
			nums[length-i] =0;
		}
		for (int i : nums) {
			System.out.print(i+":");
		}
		
    }
	public static void main(String[] args) {
		int[] nums = {0,2,3,5,0,0,4,3};
		moveZeroes(nums);
	}

}
