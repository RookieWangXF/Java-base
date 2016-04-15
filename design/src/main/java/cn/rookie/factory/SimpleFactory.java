package cn.rookie.factory;

/**
 * Created by Rookie on 2016/4/11.
 * Description:简单工厂模式
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
interface Sim_Fruit{
    void grow();
    void harvest();
    void plant();
}

class Apple implements Sim_Fruit {

    @Override
    public void grow() {
        System.out.println("苹果---生长");
    }
    @Override
    public void harvest() {
        System.out.println("苹果---收获");
    }
    @Override
    public void plant() {
        System.out.println("苹果---种植");
    }
}

class Pear  implements Sim_Fruit{

    @Override
    public void grow() {
        System.out.println("梨---生长");
    }
    @Override
    public void harvest() {
        System.out.println("梨---收获");
    }
    @Override
    public void plant() {
        System.out.println("梨---种植");
    }
}

class Grape implements Sim_Fruit{

    @Override
    public void grow() {
        System.out.println("葡萄---生长");
    }
    @Override
    public void harvest() {
        System.out.println("葡萄---收获");
    }
    @Override
    public void plant() {
        System.out.println("葡萄---种植");
    }
}


public class SimpleFactory {
    public Sim_Fruit getFruit(String fruit) {
        if (fruit == "葡萄") {
            return new Grape();
        }
        if (fruit == "梨") {
            return new Pear();
        }
        if (fruit == "苹果") {
            return new Apple();
        }
        return null;
    }
}
