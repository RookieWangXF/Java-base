package cn.rookie.string;

/**
 * Created by Rookie on 2016/4/13.
 */
public class StringToInteger {

    public static int stringToInteger(String s) {
        int res = 0,temp;

        int i = s.length();
        int k = 0;

        while (k < i) {
            temp = s.charAt(k) - 48;
            res = res * 10 + temp;
            k++;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "1243";
        System.out.println(stringToInteger(s));
    }
}
