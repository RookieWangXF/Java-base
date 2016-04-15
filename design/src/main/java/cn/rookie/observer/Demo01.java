package cn.rookie.observer;

/**
 * Created by Rookie on 2016/4/12.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * 抽象观察者角色
 */
interface Wacther {
    public void update(String str);
}

/*
 * 抽象主题角色，被观察的角色
 */
interface Watched {
    public void addWatcher(Wacther wacther);
    public void removeWacther(Wacther wacther);
    public void notifyWacthers(String str);
}

/*
 * 具体的观察者
 */
class ConcreteWacther implements Wacther {

    @Override
    public void update(String str) {
        System.out.println(str);
    }
}

/*
 * 具体的主题角色
 */
class ConcreteWached implements Watched {

    private List<Wacther> list = new ArrayList<Wacther>();

    @Override
    public void addWatcher(Wacther wacther) {
        list.add(wacther);
    }

    @Override
    public void removeWacther(Wacther wacther) {
        list.remove(wacther);
    }

    @Override
    public void notifyWacthers(String str) {
        for (Wacther wacther : list) {
            wacther.update(str);
        }
    }

}

public class Demo01 {

    public static void main(String[] args) {
        Watched girl = new ConcreteWached();

        Wacther wacther1 = new ConcreteWacther();
        Wacther wacther2 = new ConcreteWacther();
        Wacther wacther3 = new ConcreteWacther();

        girl.addWatcher(wacther1);
        girl.addWatcher(wacther2);
        girl.addWatcher(wacther3);

        girl.notifyWacthers("开心");
    }

}

