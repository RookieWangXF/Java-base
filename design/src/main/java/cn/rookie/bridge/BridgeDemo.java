package cn.rookie.bridge;

/**
 * Created by Rookie on 2016/4/11.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */

interface HandsetSoft{ // shoujiruanjianjiekou
    public abstract void run();
}

class HandsetGame implements HandsetSoft{
    //手机游戏实现
    @Override
    public void run() {
        System.out.println("Game run");
    }
}

class HandsetAddressList implements HandsetSoft{
    //通讯录实现
    @Override
    public void run() {
        System.out.println("运行通讯录");
    }
}

abstract class HandsetBrand{
    HandsetSoft soft;
    public void setHandsetSoft(HandsetSoft soft){
        this.soft = soft;
    }
    public abstract void run();
}

class HandsetBrandA extends HandsetBrand{

    @Override
    public void run() {
        soft.run();
    }
}

class HandsetBrandB extends HandsetBrand{

    @Override
    public void run() {
        soft.run();
    }
}

public class BridgeDemo {
    public static void main(String[] args) {
        HandsetBrand ab;
        ab=new HandsetBrandA();
        ab.setHandsetSoft(new HandsetGame());
        ab.run();

        ab.setHandsetSoft(new HandsetAddressList());
        ab.run();
        ab.run();
    }
}
