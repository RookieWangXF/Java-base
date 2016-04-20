package cn.rookie.io.print;

import java.util.Scanner;

/**
 * Created by Rookie on 2016/4/20.
 */
public class ScannerDemo {

    public static void scanner() {
        Scanner s = new Scanner(System.in);

        System.out.println("请输入内容");
        if (s.hasNext()) {
            String text = s.next();
            if ("over".equals(text)) {
                System.out.println("输入错误");
                System.exit(0);
            }
            System.out.println("输入的内容是：" + text);
        }

    }

    public static void main(String[] args) {
        ScannerDemo.scanner();
    }
}
