package cn.rookie.array;

public class WordSearch {
	public static boolean exist(char[][] board, String word) {
		int[] arr = new int[2];
		int length = word.length();
		int[][] arred = new int[length][2];
		for (int i = 0; i < arred.length; i++) {
			arred[i][0]=-1;
		}
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (word.charAt(0) == board[i][j]) {
					arr[0] = i;
					arr[1] = j;
					boolean res = SearchOrder(arr,arred,word);
					if (res == true) {
						return true;
					}
				}
			}
		}	
        return false;
    }
	
	private static boolean SearchOrder(int[] arr, int[][] arred, String word) {
		if (word.length() == 0 || word==null) {
			return true;
		}
		
		
		return false;
	}

	public static void main(String[] args) {
			
			
	}
	
	public static void setNum(){
		
	}
}
