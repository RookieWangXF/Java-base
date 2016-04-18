package cn.rookie.reflect;


import cn.rookie.reflect.bean.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Rookie on 2016/4/13.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class Demo02 {

    String path = "cn.rookie.api.reflect.bean.User";

    public void generate() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //通过反射API调用构造方法，构造对象。
        Class clazz = Class.forName(path);
        User u = (User) clazz.newInstance();
        Constructor<User> c = clazz.getDeclaredConstructor(int.class, int.class, String.class);

        User u2 = c.newInstance(100, 18, "fei");
        System.out.println(u2.getName());


    }
}
