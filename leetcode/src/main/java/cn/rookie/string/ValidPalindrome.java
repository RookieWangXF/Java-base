package cn.rookie.string;

public class ValidPalindrome {
	  public static boolean isPalindrome(String s) {
		  //1. �մ���ʱ��
		  if (s.length() == 0 || s == null) {
			return true;
		}
		  //2. ��������ָ��
		  int i = 0;
		  int j = s.length()-1;
		  //3. ѭ���ж�
		  while (i < j) {
			if (!Character.isLetter(s.charAt(i)) && !Character.isDigit(s.charAt(i)) ) {
				i++;
				continue;
			}
			if (!Character.isLetter(s.charAt(j)) && !Character.isDigit(s.charAt(j))) {
				j--;
				continue;
			}
			
			if (s.charAt(i) == s.charAt(j) || s.charAt(i)-32 == s.charAt(j) || s.charAt(i) + 32 == s.charAt(j)) {
				i++;
				j--;
			}else {
				return false;
			}
			
			  if (i == j || i > j) {
					return true;
			}
		}
		  return true;
		
 }
	public static void main(String[] args) {
		System.out.println(isPalindrome("aa"));
		
	}

}
