package cn.rookie.p2;

public class RemoveElement {

	 public static int removeElement(int[] A, int elem) {
		int count=0;
		int[] B = new int[A.length];
		int j=0;
		if(A==null)
			return 0;
		for (int i = 0; i < A.length; i++) {
			if(A[i] != elem){
				B[j]=A[i];
				j++;
			    count++;
			}
		}
		 
		 return count;
	        
	    }
	public static void main(String[] args) {
		int[] A={1,2,3,4,1};
		int count=removeElement(A,1);
		System.out.print(count);
	}

}
