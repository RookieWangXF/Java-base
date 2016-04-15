package cn.rookie.array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if (numRows <=0) {
			return list;
		}
		ArrayList<Integer> rowList = new ArrayList<Integer>();
		rowList.add(1);
		list.add((List<Integer>) rowList.clone());
		if (numRows == 1) {
			return list;
		}
		rowList.add(1);
		list.add((List<Integer>) rowList.clone());
		if (numRows == 2) {
			return list;
		}

		for (int i = 2; i < numRows; i++) {
			rowList.clear();
			rowList.add(1);
			ArrayList<Integer> temp = (ArrayList<Integer>) list.get(i-1);
			for (int j = 0; j < temp.size()-1; j++) {
				rowList.add(temp.get(j)+temp.get(j+1));
			}
			rowList.add(1);
			list.add((ArrayList<Integer>) rowList.clone());
		}
		return list;
    }
	public static void main(String[] args) {
		List<List<Integer>> list = generate(7);
		for (List<Integer> list2 : list) {
			for (Integer integer : list2) {
				System.out.print(integer+",");
			}
			System.out.println();
		}
	}

}
