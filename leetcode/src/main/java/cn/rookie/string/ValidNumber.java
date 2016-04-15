package cn.rookie.string;

public class ValidNumber {
	public static boolean isNumber(String s) {
		
		 if(s.trim().isEmpty()){  
	            return false;  
	        }  
	        String regex = "[-+]?(\\d+\\.?|\\.\\d+)\\d*(e[-+]?\\d+)?";
	        if(s.trim().matches(regex)){  
	            return true;  
	        }else{  
	            return false;  
	        }  
    }
	public static void main(String[] args) {
		System.out.println(Character.isDigit('c'));
		
	}

}
