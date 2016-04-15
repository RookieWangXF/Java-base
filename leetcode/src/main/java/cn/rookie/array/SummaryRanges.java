package cn.rookie.array;

import java.util.ArrayList;
import java.util.List;

/**
 * ��һ�����飬�ҳ�����������һ�Σ��ѵ�һ�������һ�����һ�� "0->2"
 * @author fei
 *
 */
public class SummaryRanges {
	public static List<String> summaryRanges(int[] nums) {
        ArrayList<String> array = new ArrayList<String>();
        if (nums==null || nums.length < 1) {
			return array;
		}
        int start = 0, end =0;
        while (end < nums.length) {
			if (end+1<nums.length && nums[end+1] == nums[end]+1) {
				end++;
			}else {
				/*
				 * �����������һ�������һ�����֣���һ�������һ���ֶ�
				 */
				if (end == start) {
					array.add(Integer.toString(nums[end]));
				}else {
					StringBuilder sb = new StringBuilder();
					sb.append(nums[start]);
					sb.append("->");
					sb.append(nums[end]);
					array.add(sb.toString());
				}
				++end;
				start = end;
			}
		}
		
		return array;
    }
	public static void main(String[] args) {

	}

}
