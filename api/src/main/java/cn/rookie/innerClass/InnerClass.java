package cn.rookie.innerClass;

/**
 * Created by Rookie on 2016/4/7.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class InnerClass {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display(){
        System.out.println("Outname : "+ getName() + " ; Outage"+getAge() );
    }
    /**
     * Created by Rookie.
     * Description: 定义一个内部类,把一个类的定义放在另一个类的内部就是内部类
     * 1. 每个内部类都能独立地继承一个接口或者抽象类的实现，无论外围类是否继承了此实现，对内部类没有影响
     *    --即接口的多重实现解决了部分问题，而内部类使得多重继承的方案完善
     */
    class Inner{

        public Inner() {
            name = "rookie";
            age = 12;
        }

        public void dispaly() {
            System.out.println("name : "+ getName() + " ; age"+getAge() );
        }

        public InnerClass getInnerClass() {
            return InnerClass.this;
        }
    }
}
