package cn.rookie.string;

public class CountandSay {
	public static String countAndSay(int n) {
		String res = "1";
		int i = 1;
		while (i < n) {
			res = CountandSayForOneString(res);
			i++;
		}
		return res;
    }
	private static String CountandSayForOneString(String input) {
		StringBuilder sb = new StringBuilder();
		//ÿ�����һλ����1
		char temp = input.charAt(0);
		int num =1;
		for (int i = 1; i < input.length(); i++) {
			if (input.charAt(i) == temp) {
				num++;
				continue;
			}
			sb.append(Integer.toString(num)+temp);
			temp = input.charAt(i);
			num =1;
		}
		sb.append(Integer.toString(num) + temp);
		return sb.toString();
	}
	public static void main(String[] args) {
		System.out.println(countAndSay(123));
	}

}
