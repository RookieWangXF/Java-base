package cn.rookie.array;

import java.util.HashMap;

/*
 * ����һ��Int�����飬���ز���ȵ����ֵĸ���
 */
public class RemoveDuplicatesfromSortedArray {
	public static int removeDuplicates(int[] nums) {
		if (nums == null) {
			return 0;
		}
		int count = 0;
		int index = 0;  //��������±�
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
        for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				continue;
			}else {
				nums[index] = nums[i];
				index++;
				map.put(nums[i], 0);
				count++;
			}
		}
		
		return count;
    }
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,2,3};
		System.out.println(removeDuplicates(nums));
		for (int i : nums) {
			System.out.print(i+":");
		}
	}

}
