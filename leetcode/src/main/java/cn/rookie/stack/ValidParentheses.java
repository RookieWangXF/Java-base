package cn.rookie.stack;

import java.util.Stack;

public class ValidParentheses {
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		/*
		 * ������Ϊ������ʱ��϶��Ǵ����
		 */
		if((s.length())%2 == 1){
			return false;
		}
		/*
		 * �����ж��Ƿ��ջ
		 */
		for (int i = 0; i < s.length(); i++) {
			if (stack.isEmpty()) {
				stack.push(s.charAt(i));
			}else {
				Character temp = stack.peek();
				switch (temp) {
				case '[':
					if (']' == s.charAt(i)) {
						stack.pop();
					}else {
						stack.push(s.charAt(i));
					}
					break;
				case '(':
					if (')' == s.charAt(i)) {
						stack.pop();
					}else {
						stack.push(s.charAt(i));
					}
					break;
				case '{':
					if ('}' == s.charAt(i)) {
						stack.pop();
					}else {
						stack.push(s.charAt(i));
					}
					break;
				default:
					break;
				}
			}
		}
		if (stack.isEmpty()) {
			return true;
		} else {
			 return false;
		}
    }
	
	public static void main(String[] args) {

		String string = "[]{}";
		System.out.print(isValid(string));
	}

}
