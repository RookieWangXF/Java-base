package cn.rookie.templateMethod;

/**
 * Created by Rookie on 2016/4/12.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
/*
 * 模板方法，是一种行为上的，父类定义具体的行为，子类通过继承来实现。
 */

abstract class 飞飞{
    public 飞飞(){
        起床();
        吃饭();
        学习();
    }
    public abstract void 起床();
    public abstract void 吃饭();
    public abstract void 学习();
}

class 蕾蕾 extends 飞飞 {

    @Override
    public void 起床() {
        System.out.println("蕾蕾起床了！");
    }

    @Override
    public void 吃饭() {
        System.out.println("蕾蕾吃饭了！");
    }

    @Override
    public void 学习() {
        System.out.println("蕾蕾学习了！");
    }

}

public class Demo01 {

    public static void main(String[] args) {
        飞飞 s = new 蕾蕾();
    }

}

