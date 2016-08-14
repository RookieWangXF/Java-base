package cn.rookie.singleton;

/**
 * Created by Rookie on 2016/4/20.
 * Description:内部类方式，将对象定义为内部类的一个私有变量，
 * Project_name: Java-base
 * Copyright (c) All Rights Reserved.
 */
public class Singleton05 {

    /**
     * 静态内部类可以访问外部类的成员方法和属性，且只有当调用的时候才开始加载。
     */
    private Singleton05() {

    }
    private static class SingletonHolder{
        private static Singleton05 singleton = new Singleton05();
    }

    public static Singleton05 getInstance() {
        return SingletonHolder.singleton;
    }
}
