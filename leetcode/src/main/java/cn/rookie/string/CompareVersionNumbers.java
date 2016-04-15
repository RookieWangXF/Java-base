package cn.rookie.string;

public class CompareVersionNumbers {
		public static int compareVersion(String version1, String version2) {
	        int[] ver1 = praseInt(version1);
	        int[] ver2 = praseInt(version2);
	        int length = ver1.length > ver2.length ? ver2.length :ver1.length;
	        for (int i = 0; i < length; i++) {
				if (ver1[i] > ver2[i]) {
					return 1;
				}else if (ver1[i] < ver2[i]) {
					return -1;
				}else {
					continue;
				}
			}
	        while (length < ver1.length) {
				if (ver1[length] == 0) {
					length++;
					continue;
				}
				return 1;
			}
	        while (length < ver2.length) {
				if (ver2[length] == 0) {
					length++;
					continue;
				}
				return -1;
			}
	    
			return 0;
	    }
		
		private static int[] praseInt(String version) {
			//ת�����ַ�����
			String[] str = version.split("\\.");
			//ת����int������
			int[] arr  = new int [str.length];
			for (int i = 0; i < str.length; i++) {
				arr[i] = Integer.parseInt(str[i]);
			}
			return arr;
		}

	public static void main(String[] args) {
		System.out.println(compareVersion("1.2", "1.2.0"));
	}

}
