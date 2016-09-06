package cn.rookie.p2;/*package p2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class SubstringwithConcatenationofAllWords {

	public static void demo1(String[] args) {

	}
	public List<Integer> findSubstring(String S, String[] L) {
		if(L==null ||L.length==0)
			return null;
		//L�������ַ����ĳ���
		int lengthL= L[0].length() *L.length;
		//newһ����Lͬ�����ַ�������
		String temp = new String[lengthL];
		
		HashSet<Character> hs =new HashSet<Character>();
		for (int i = 0; i < L.length; i++) {
			hs.add(L[i].charAt(0));
		}
		//���α���S����������S.length-lengthL���ɣ�
		for(int i =0;i<S.length()-lengthL+1;i++){
			temp = null;
			if(hs.contains(S.charAt(i))){
				temp=S.substring(i, i+lengthL-1);
			}
		}
		return null;
        
    }
}
*/