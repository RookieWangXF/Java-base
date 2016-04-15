package cn.rookie.p2;

public class PalindromeNumber {

	public static void main(String[] args) {

		int x = 121;
		boolean t = isPalindrome(x);
		System.out.print(t);
	}

	public static boolean isPalindrome(int x) {
		
		int num = x, h = 1;
        if (num < 0) 
        	return false;
        double b=x;
        if(b> Integer.MAX_VALUE)
        	return false;
        
        while (num / h >= 10) {
            h = h * 10;
        }
        while (num > 0) {
            if (num / h != num % 10)
            	return false;
            num = num % h;
            num = num / 10;
            h = h / 100;
        }

        return true;
    }
}
