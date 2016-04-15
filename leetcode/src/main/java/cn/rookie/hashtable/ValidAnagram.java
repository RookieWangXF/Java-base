package cn.rookie.hashtable;

import java.util.HashMap;

public class ValidAnagram {
	public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int tmp = 0;
        for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				tmp = map.get(s.charAt(i));
				tmp++;
				map.put(s.charAt(i), tmp);
			}else {
				map.put(s.charAt(i), 1);
			}
		}
        for (int i = 0; i < t.length(); i++) {
			if (map.containsKey(t.charAt(i))) {
				tmp = map.get(t.charAt(i));
				tmp--;
				if (tmp < 0) {
					return false;
				}
				map.put(t.charAt(i), tmp);
			}else {
				return false;
			}
		}
        System.out.println(map.values().getClass().getName());
        for (Integer i : map.values()) {
			if (i != 0) {
				return false;
			}
		}
		return true;
    }
	public static void main(String[] args) {
		System.out.println(isAnagram("asd", "ads"));
	}

}
