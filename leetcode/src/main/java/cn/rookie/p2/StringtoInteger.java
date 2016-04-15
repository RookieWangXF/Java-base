package cn.rookie.p2;

public class StringtoInteger {

	public static void main(String[] args) {

		String str = "435126";
		int num = atoi(str);
		System.out.println(num);
	}
	//��ĿĬ���ַ�����û����ĸ�ģ��������ּ��Ϸ��š�
    static int atoi(String str) {
    	if(str == null)//�ж�Ϊ�պͳ���Ϊ0��ʲô����?
    		return 0;
    	str=str.trim();
    	if(str.length() <1)//
    		return 0;
    	char flag = '+';
    	int i=0;	
    		if(str.charAt(0) == '-'){
        		flag = '-';
        		i++;
        	}else if(str.charAt(0) == '+'){
        		i++;
        	}
    	double result =0;
    	while(str.length()>i&&str.charAt(i)>='0'&&str.charAt(i)<='9'){
    		result = result *10 +(str.charAt(i)-'0');
    		i++;
    	}
    	if(flag =='-'){
    		result = -result;
    	}
    	if(result > Integer.MAX_VALUE){
    		return Integer.MAX_VALUE;
    	}
    	if(result < Integer.MIN_VALUE){
    		return Integer.MIN_VALUE;
    	}
		return (int)result;    
		
    }
}
