package cn.rookie.p2;

import java.util.HashMap;

public class LongestSubstring {

	public static void main(String[] args) {
		String s="qwewrtyuiopcvbq";
		int subString = lengthOfLongestSubstring(s);
		System.out.print(subString);
	}

	    public static int lengthOfLongestSubstring(String s) {
	    	int max = Integer.MIN_VALUE;
	    	int start = 0;
	    	HashMap<Character, Integer> map= new HashMap<Character, Integer>();
	    	if(s.length()==0 || s==null)
	    	    return 0;
	    	for (int i = 0; i < s.length(); i++) {
				char c= s.charAt(i);
				if(map.containsKey(c)){
					for (int j = start; j < i; j++) {
						if(s.charAt(j)==c)
							break; //������ǰѭ������㻹������
						map.remove(s.charAt(j));
					}
					start=map.get(c)+1;
					map.put(c, i);
				}else{
					map.put(c, i);
					if(i-start+1>max)
						max=i-start+1;
				}
			}
			return max;	    	
	    	
	    
	    
	    }

}
