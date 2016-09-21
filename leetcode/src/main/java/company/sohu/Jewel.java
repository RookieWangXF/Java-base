package company.sohu;

import java.util.HashSet;
import java.util.Scanner;

public class Jewel {
    public static void main(String args[]){
        String jewel;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            jewel = sc.nextLine();
            if (jewel == null || jewel.length() < 5) {
                System.out.println(0);
            } else {
                int length = jewel.length();
                int max = 0;
                for (int i = 0; i < length; i++) {
                    char temp = jewel.charAt(i);
                    //当数满足的时候，依次找到其他四个字母。
                    if (temp == 'A' || temp == 'B' || temp == 'C' || temp == 'D' || temp == 'E') {
                        HashSet<Character> set = new HashSet<>();
                        set.add(temp);
                        int actualLength = 1;
                        int j = i + 1;
                        while (j < i + length && set.size() < 5) {
                            int index = j % length;
                            char temp2 = jewel.charAt(index);
                            if (temp2 == 'A' || temp2 == 'B' || temp2 == 'C' || temp2 == 'D' || temp2 == 'E'){
                                set.add(temp2);
                            }
                            actualLength++;
                            j++;
                        }
                        max = max > (length - actualLength) ? max : (length - actualLength);
                    }
                }
                System.out.println(max);
            }
        }
    }
}