package cn.rookie.innerClass;

/**
 * Created by Rookie on 2016/4/9.
 * Description:Java中的内部类分为 成员内部类、局部内部类、匿名内部类、静态内部类
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class OuterClass {
    /**
     * 成员内部类：不能存在static方法和变量；是依附于外部类的，只有先创建外部类，才能创建内部类
     */
    private String str;
    private static String name = "12234dsgsd";
    public OuterClass(){
        System.out.println("OuterClass");
    }
    public void outerDisplay() {
        System.out.println("outerClass...outerDisplay");
    }

    public class InnerClass{
        public InnerClass(){
            System.out.println("InnerClass");
        }
        public void innerDisplay() {
            str = "chenssy...innerDisplay";
            System.out.println(str);
            //外围类的方法
            outerDisplay();
        }
    }

    public InnerClass getInstance() {
        return new InnerClass();
    }


    /**
     * 局部内部类：只是作用域发生了改变，只在方法或者属性当中使用
     */
    public String InnerPart(String name){
        class Part{
            private String label;
            private Part(String label) {
                this.label = label;
            }

            public String readlabel() {
                return label+"feifei";
            }
        }
        return new Part(name).readlabel();
    }

    /**
     * 匿名内部类：Android中的button绑定事件;
     * 1.没有访问修饰符
     * 2.new匿名内部类，这个类首先要是存在的，起码有个接口是可以创建的
     * 3.没有构造方法，因为没有名字都
     * 4.当有参数被匿名内部类使用的时候，那么需要设置为final的
     */
    interface InnerAnony {
        int getNumber();
    }

    public InnerAnony getInstance(final int num,String temp) {
        return new InnerAnony() {
            int number = num + 10;
            @Override
            public int getNumber() {
                return number;
            }
        };
    }

    /**
     * 静态内部类：static可以修饰类指的就是内部类，非静态的内部类在编译完成会保存着内部类的一个引用，
     *          而静态内部类却没有，意味着他的创建是不依赖于外部类的，不能使用任何外围类的非static方法和成员
     */

    static class InnerStaticClass{
        private static String name1 = "feileidf";

        //只能访问外围类的静态的，实际这名字还是自己的
        public static void display() {
            System.out.println("OuterClass name : " + name);
        }
    }

    public void staticClass() {
        //可以直接new静态内部类的对象，而不需要外部类
        new InnerStaticClass().display();
    }
}
