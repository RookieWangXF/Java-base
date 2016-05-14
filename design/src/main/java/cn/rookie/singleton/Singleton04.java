package cn.rookie.singleton;

/**
 * Created by Rookie on 2016/4/9.
 * Description: 使得这一个单例类是可序列化的
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public enum  Singleton04 {
    instance;
    public void speak() {
        System.out.println("hello Singleton04");
    }
}
