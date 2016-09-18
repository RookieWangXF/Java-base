package cn.rookie.cast;

import java.lang.reflect.Field;

/**
 * Created by Rookie on 2016/9/6.
 * Description:
 */
public class IntToFloat {

    int num = 10;


    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {

        Class clazz = Class.forName("cn.rookie.cast.IntToFloat");
        Field field = clazz.getDeclaredField("num");
        System.out.println(field.getName());
        System.out.println(field.getType()); //获取变量的基本类型

    }
}
