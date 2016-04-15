package cn.rookie.proxy;

/**
 * Created by Rookie on 2016/4/12.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
interface IGiveGift{
    public abstract void GiveMoney();
    public abstract void GiveFlower();
}

class You implements IGiveGift{

    @Override
    public void GiveMoney() {
        System.out.println("song qian");
    }

    @Override
    public void GiveFlower() {
        System.out.println("song hua");
    }

}

class Proxy implements IGiveGift{
    private IGiveGift y;
    public Proxy(IGiveGift t1) {
        this.y = t1;
    }
    @Override
    public void GiveMoney() {
        y.GiveMoney();
    }

    @Override
    public void GiveFlower() {
        y.GiveFlower();
    }

}

public class StaticProxy {

    public static void main(String[] args) {
        IGiveGift t1 = new You();
        Proxy proxy = new Proxy(t1);
        proxy.GiveFlower();
        proxy.GiveMoney();
    }


}
