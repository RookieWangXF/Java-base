package cn.rookie.singleton;

/**
 * Created by Rookie on 2016/4/9.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class Singleton02 {
    private static Singleton02 instance = new Singleton02();
    private Singleton02() {

    }

    public static Singleton02 getInstance() {
        return instance;
    }
}
