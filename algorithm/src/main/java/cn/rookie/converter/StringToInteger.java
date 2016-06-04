package cn.rookie.converter;

/**
 * Created by Rookie on 2016/6/1.
 * Package_name is cn.rookie.converter
 * Description:
 */
public class StringToInteger {

    public static int valueOf(String s){
        return parseInt( s, 10);
    }

    private static int parseInt(String s, int radix) {

        if (s == null) {
            throw new RuntimeException("null");
        }

        int result = 0;
        boolean negative = false;
        int i = 0, len = s.length();
        int digit;

        if (len > 0) {
            char firstChar = s.charAt(0);
            if (firstChar < '0') {
                if (firstChar == '-') {
                    negative = true;
                } else if (firstChar != '+') {
                    throw new RuntimeException(s + "符号有错误");
                }

                if (len == 1) {
                    throw new RuntimeException(s + "输入有错误");
                }
                i++;
            }

            while (i < len) {
                digit = Character.digit(s.charAt(i++), radix);
                result *= radix;
                result -= digit;
            }
        } else {
            throw new RuntimeException(s + "输入有错误!");
        }
        return negative ? result : -result;
    }


    public static void main(String[] args) {
        System.out.println(StringToInteger.valueOf("-23452")+1);
    }
}
