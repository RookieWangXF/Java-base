package cn.rookie.adapter;

/**
 * Created by Rookie on 2016/4/11.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */

interface Target{
    public void Request();
}

class Adaptee{
    public void SpecilalRequest() {
        System.out.println("SpecilalRequest");
    }
}

class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    @Override
    public void Request() {
        adaptee.SpecilalRequest();
    }
}


public class AdapterDemo {

    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.Request();
    }
}
