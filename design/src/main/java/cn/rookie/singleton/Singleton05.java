package cn.rookie.singleton;

/**
 * Created by Rookie on 2016/4/20.
 * Description:
 * Project_name: Java-base
 * Copyright (c) All Rights Reserved.
 */
public class Singleton05 {
    private Singleton05() {

    }
    private static class SingletonHolder{
        private static Singleton05 singleton = new Singleton05();
    }

    public static Singleton05 getInstance() {
        return SingletonHolder.singleton;
    }
}
