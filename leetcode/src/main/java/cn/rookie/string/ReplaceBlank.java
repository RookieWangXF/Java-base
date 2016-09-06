package cn.rookie.string;

/**
 * Created by Rookie on 2016/8/16.
 * Package_name is cn.rookie.string
 * Description:替换空的字符
 */
public class ReplaceBlank {

    public String replaceBlank2(char[] chars) {
        if (chars == null || chars.length == 0) {
            return null;
        }

        int i = 0;
        while (i < chars.length) {
            if (chars[i] == ' ') {
                for (int j = chars.length - 1; j > i + 2; j--) {
                    chars[j] = chars[j - 2];
                }
                chars[i++] = '%';
                chars[i++] = '2';
                chars[i++] = '0';
            } else {
                i++;
            }
        }
        return String.valueOf(chars);
    }
    public String replaceBlank(char[] chars) {

        if (chars == null || chars.length == 0) {
            return null;
        }

        int i = chars.length - 1;
        int p1 = -1;
        while (chars[i--] != ' ') {
            p1 = i;
        }
        int p2 = chars.length - 1;

        while (p1 > 0) {
            if (' ' == chars[p1]) {
                chars[p2--] = '0';
                chars[p2--] = '2';
                chars[p2--] = '%';
            } else {
                chars[p2--] = chars[p1];
            }
            p1--;
        }
        return String.valueOf(chars);
    }
    public static void main(String[] args) {
        char[] chars = new char[10];
        chars[0] = 'a';
        chars[1] = 'b';
        chars[2] = 'b';
        chars[3] = ' ';
        chars[4] = 'c';
        chars[5] = ' ';
        System.out.println(new ReplaceBlank().replaceBlank(chars));
    }
}

