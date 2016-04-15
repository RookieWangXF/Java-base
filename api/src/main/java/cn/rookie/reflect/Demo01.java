package cn.rookie.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Rookie on 2016/4/12.
 */
public class Demo01 {
    String path = "cn.rookie.api.reflect.bean.User";

    public void printClassInfo() {
        try {
            Class clazz = Class.forName(path);
            Class clazz2 = Class.forName(path);
            //每个类都有一个Class对象，只加载一个
            System.out.println(clazz.hashCode());
            System.out.println(clazz2.hashCode());

            Class test1 = int.class;
            Class test2 = String.class;
            Class test3 = path.getClass();

            int[] arr01 = new int[10];
            int[] arr02 = new int[30];
            int[][] arr03 = new int[10][];
            Class test4 = arr01.getClass();
            Class test5 = arr02.getClass();
            Class test6 = arr03.getClass();

            //每一种类型对应着一个Class类
            printClass("int",test1);
            printClass("String",test2);
            printClass("path.getClass()",test3);
            printClass("int[]",test4);
            printClass("int[]",test5);
            printClass("int[][]",test6);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    private void printClass(String name , Class clazz){
        System.out.println(name + " : " + clazz.hashCode());
    }

    public void printClassInfo2() throws NoSuchFieldException, NoSuchMethodException {
        try {
            Class clazz = Class.forName(path);
            /**
             * 获取类的名字、属性、方法
             */
            clazz.getName();
            clazz.getSimpleName();

            Field[] fields = clazz.getFields();
            Field[] fields1 = clazz.getDeclaredFields();
            Field field = clazz.getDeclaredField("name");

            Method[] methods = clazz.getMethods();
            Method methods1 = clazz.getDeclaredMethod("getName", null);
            Method methods2 = clazz.getDeclaredMethod("setName", String.class);

            Constructor[] constructors = clazz.getDeclaredConstructors();
            Constructor constructor = clazz.getDeclaredConstructor(null);
            Constructor constructor1 = clazz.getDeclaredConstructor(int.class, int.class, String.class);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        demo01.printClassInfo();

    }
}
