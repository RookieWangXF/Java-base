package cn.rookie.singleton;

/**
 * Created by Rookie on 2016/4/9.
 * Description:单例设计模式
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * 设置同步
     * @return
     */
    public static synchronized Singleton getInstance2() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
