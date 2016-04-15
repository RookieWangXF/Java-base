package cn.rookie.p2;

public class LongestCommonPrefix {

	public static void main(String[] args) {

		String[]strs= {};
		String subString = longestCommonPrefix(strs);
		System.out.println(subString);
	}
	public static String longestCommonPrefix(String[] strs) {
		if(strs.length ==0 ||strs ==null||strs[0].length() ==0)
			return null;
		String substr="";
		substr = strs[0];
		if (substr.length() == 0)  
            return null;
		if(strs.length==1)
			return substr;
		for(int i =1;i<strs.length;i++){
			String temp ="";
			for(int j =0;j<substr.length()&&j<strs[i].length();j++)
			{
				if(substr.charAt(j) == strs[i].charAt(j))
					temp += substr.charAt(j);	
			    else{
		    		substr = temp;
		    	}
			}
			substr=temp;
		}
		return substr;
        
    }

}
