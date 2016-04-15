package cn.rookie.hashtable;

import java.util.HashMap;

public class IsomorphicStrings {
	public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				char tmp = map.get(s.charAt(i));
				if (!(tmp == t.charAt(i))) {
					return false;
				}
			}else {
				if (map.containsValue(t.charAt(i))) {
					return false;
				}
				map.put(s.charAt(i), t.charAt(i));
				
			}
		}
		
		return true;
    }
	public static void main(String[] args) {
		System.out.println(isIsomorphic("ab", "aa"));
	}

}
