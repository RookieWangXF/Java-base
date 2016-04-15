package cn.rookie.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rookie on 2016/4/11.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class Product {
    List<String> parts=new ArrayList<String>();
    public void Add(String part){
        parts.add(part);
    }
    public void show(){
        System.out.println("产品创建完毕!");
        for (String string : parts) {
            System.out.println(string);
        }
    }
}
