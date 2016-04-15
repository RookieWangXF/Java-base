package cn.rookie.hashtable;

import java.util.HashMap;

public class WordPattern {
	public static boolean wordPattern(String pattern, String str) {
		String[] strArr = str.split(" ");
        HashMap<Character, String> map = new HashMap<Character, String>();
        for (int i = 0; i < pattern.length(); i++) {
			if (map.containsKey(pattern.charAt(i))) {
				String temp = map.get(pattern.charAt(i));
				if (temp.equals(strArr[i])) {
					return false;
				}
			}else {
				map.put(pattern.charAt(i), strArr[i]);
			}
		}
		return true;
    }
	public static void main(String[] args) {

	}

}
