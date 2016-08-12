package demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Rookie on 2016/8/2.
 * Package_name is demo
 * Description:
 */
public class Test02 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        int count = 0;

        while (in.hasNext()) {
            String s = in.next();
            if (!set.contains(s)) {
                set.add(s);
                count++;
            }
        }
        System.out.println(count);
    }
}
