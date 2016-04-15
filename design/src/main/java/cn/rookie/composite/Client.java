package cn.rookie.composite;

/**
 * Created by Rookie on 2016/4/12.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class Client {
    public static void main(String[] args) {
        Component leaf1 = new Leaf();
        Component leaf2 = new Leaf();

        Composites comp1 = new Composites();
        comp1.add(leaf1);
        comp1.add(leaf2);

        Component leaf3 = new Leaf();
        Component leaf4 = new Leaf();
        Composites comp2= new Composites();
        comp2.add(comp1);
        comp2.add(leaf3);
        comp2.add(leaf4);

        comp2.doSomething();
    }
}
