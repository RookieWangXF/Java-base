package cn.rookie.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagrams {
	public static List<String> anagrams(String[] strs) {
		List<String> list = new ArrayList<String>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < strs.length; i++) {
			char[] chars = strs[i].toCharArray();
			Arrays.sort(chars);
			String anagram = new String(chars);
			if (map.containsKey(anagram)) {
				int index = map.get(anagram);
				if (index != -1) {
					list.add(strs[index]);
					map.put(anagram, -1);
				}
				list.add(strs[i]);
			}else {
				map.put(anagram, i);
			}
		}
        return list;
        
    }
	public static void main(String[] args) {
		String[] strs = {"asd","dsa","sad","aab","baa"};
		System.err.println(anagrams(strs));
	}

}
