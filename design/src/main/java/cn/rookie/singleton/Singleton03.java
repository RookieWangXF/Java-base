package cn.rookie.singleton;

/**
 * Created by Rookie on 2016/4/9.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class Singleton03 {
    private static Singleton03 instance;

    private Singleton03() {

    }

    public static Singleton03 getInstance() {
        if (instance == null) {
            synchronized (Singleton03.class) {
                instance = new Singleton03();
            }
        }
        return instance;
    }
    public void speak() {
        System.out.println("hello  Singleton03");
    }
}
