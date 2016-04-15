package cn.rookie.string;

public class ImplementstrStr {
	public static int strStr(String haystack, String needle) {
		if (haystack.length() == 0 && needle.length() == 0) {
			return 0;
		}
        if (haystack == null || haystack.length() == 0) {
			return -1;
		}
        if (needle == null || needle.equals("")) {
			return 0;
		}
		if (needle.length() > haystack.length()) {
			return -1;
		}
		int length = 0;
		for (int i = 0; i < haystack.length()- needle.length()+1; i++) {
			if (needle.charAt(0) == haystack.charAt(i)) {
				length = needle.length() - 1;
				for (int j = 1; j < needle.length(); j++) {
					if (needle.charAt(j) == haystack.charAt(i +j)) {
						length--;
					}
				}
				if (length == 0) {
					return i;
				}
			}
		}
		return -1;
    }
	public static void main(String[] args) {
		System.out.println(strStr("aaa", "aaa"));
	}

}
