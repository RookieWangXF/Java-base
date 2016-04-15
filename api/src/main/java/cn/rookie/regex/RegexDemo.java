package cn.rookie.regex;

/**
 * Created by Rookie on 2016/4/11.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class RegexDemo {

    public static boolean isTrue(String str) {
        String[] names = str.split("(.)\\1+");
        for (String name : names) {
            System.out.println(name);
        }
        return false;
    }

    public static void main(String[] args) {
        String tel = "12323412";
        isTrue(tel);
    }
}
