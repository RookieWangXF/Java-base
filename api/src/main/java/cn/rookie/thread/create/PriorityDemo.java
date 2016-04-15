package cn.rookie.thread.create;

/**
 * Created by Rookie on 2016/4/14.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class PriorityDemo extends Thread {
    private int num;

    public PriorityDemo(int num, int priority) {
        this.num = num;
        this.setPriority(priority);
        System.out.println("创建线程  "+ num);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程  "+ num +": 计数 "+i);
        }
    }

    public static void main(String[] args) {
        new PriorityDemo(3, Thread.MAX_PRIORITY).start();
        for (int i = 0; i <2; i++) {
            new PriorityDemo(i+1, Thread.MIN_PRIORITY).start();
        }
    }
}
