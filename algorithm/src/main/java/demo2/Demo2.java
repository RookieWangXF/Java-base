package demo2;

import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Created by Rookie on 2016/9/12.
 * Description:
 */
public class Demo2 {

    public static final char[] arrDigths = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 'A',
            'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
            'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W'};

    public static void main(String[] args) {
        for (int i = 0; i < arrDigths.length; i++) {
            System.out.println(arrDigths[i] - 55 + "  ");
        }

        char a = 'a';
        System.out.println(a + 3);

    }
}

