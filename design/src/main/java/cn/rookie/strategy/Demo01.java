package cn.rookie.strategy;

/**
 * Created by Rookie on 2016/4/12.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
/*
 * 抽象的策略
 */
abstract class AbstractStrategy {
    /*
     * 某个希望有不同策略实现的算法
     */
    public abstract void algorithm();
}

/*
 * 对上边的抽象策略有不同的实现方式
 */
class ConcreteStrategy01 extends AbstractStrategy {

    @Override
    public void algorithm() {
        System.out.println("这是策略一的方法");
    }
}

class ConcreteStrategy02 extends AbstractStrategy {

    @Override
    public void algorithm() {
        System.out.println("这是策略二的方法");
    }
}

/*
 * 环境角色，用来对特定的策略进行调用
 */
class Context {
    private AbstractStrategy strategy;
    public Context(AbstractStrategy strategy) {
        this.strategy = strategy;
    }
    public void algorithm() {
        this.strategy.algorithm();
    }
}

public class Demo01 {

    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategy01());
        context.algorithm();
        context = new Context(new ConcreteStrategy02());
        context.algorithm();
        //-----------------------------------
        AbstractStrategy strategy = new ConcreteStrategy01();
        strategy.algorithm();
        strategy = new ConcreteStrategy02();
        strategy.algorithm();

    }

}