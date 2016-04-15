package cn.rookie.p2;

import java.util.List;

public class Sum {

	public List<List<Integer>> threeSum(int[] num) {
		
		return null;
        
    }
	public static String addBinary(String a, String b) {
		if(a ==null || b==null)
			return null;
		int i , j=0;
		int x,y=0;
		i=a.length() < b.length()?a.length():b.length();
		boolean flag = false;
		int res=0;
		String string="";
		while(j<i){
			if(flag){
				res =1;
				flag= false;
			}
			x = Character.getNumericValue(a.charAt(j));
		    y = Character.getNumericValue(b.charAt(j));
			res = res+x +y;
			if((res/2)==1)
				flag = true;
			res%=2;
			string = ""+res+string;
			j++;
			x=0;
			y=0;
		}
		
		return string;
    }
	public static void main(String[] args) {
		char a ='1';
		int b = Character.getNumericValue(a);
		b++;
		String string= "asdasd";
		String bString="123";
		string+=bString;
		String s = addBinary("111", "000");
		System.out.print(s);
		
	}

}
