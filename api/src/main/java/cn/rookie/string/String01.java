package cn.rookie.string;

import java.util.ArrayList;

/**
 * Created by Rookie on 2016/3/27.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class String01 {
    public static void main(String[] args) {
        System.out.println(true & false);
        System.out.println(true && true);
        System.out.println(8 & 1);
        String s = "ads";
        System.out.println(s.getClass());
        System.out.println(12 > 323.3);
        String te = null;
        //System.out.println(te.trim());
        ArrayList<String> list = new ArrayList<>();
        list.add("11");
        for (int i = 9; i > 0; i--) {
            list.add(1, i + "");
        }
        for (int i = 0 ;i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }
}
