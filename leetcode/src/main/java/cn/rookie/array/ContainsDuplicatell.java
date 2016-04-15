package cn.rookie.array;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicatell {

	 public static boolean containsNearbyDuplicate(int[] nums, int k) {
		 if (nums.length == 1) {
			return false;
		}
		 Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	     for (int i = 0; i < nums.length; i++) {
	    	 if (map.containsKey(nums[i])) {
				int j = map.get(nums[i]);
				if (i-j<=k) {
					return true;
				}else {
					map.remove(nums[j]);
					map.put(nums[i], i);
				}
			}else {
				map.put(nums[i], i);
			}
		}
		 return false;
	 }
	public static void main(String[] args) {
		int[] nums ={99,99};
		System.out.println(containsNearbyDuplicate(nums, 2));
	}

}
