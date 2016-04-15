package cn.rookie.p2;

public class LengthofLastWord {

	public static int lengthOfLastWord(String s) {
		int length=0;
		s=s.trim();
		if(s==null)
			return 0;
		String[] res = s.split(" ");
		length = res[res.length-1].length();
		return length;
        
    }
	public static void main(String[] args) {
		String string=" ";
		System.out.println(lengthOfLastWord(string));
	}

}
