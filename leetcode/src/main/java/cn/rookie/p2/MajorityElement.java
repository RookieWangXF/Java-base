package cn.rookie.p2;

public class MajorityElement {

	public static void main(String[] args) {

		int[] num ={1,3,1,3,3,2};
		int a=majorityElement(num);
		System.out.print(a);
	}
	public static int majorityElement(int[] num) {
		int a=-1;
		int b=0;
		if(num.length==0)
			return 0;
		
		for(int i=0;i<num.length;i++){
			if(b==0)
			{
				a=num[i];
				b++;
				continue;
			}
			if(b!=0){
				if(a==num[i]){
					b++;
					if(b==0){
						a=num[i];
						continue;
					}
				}
				if(a!= num[i]){
					b--;
					if(b==0){
						a=num[i];
						continue;
					}
				}
			}
		}
		
		return a;
        
    }
}
