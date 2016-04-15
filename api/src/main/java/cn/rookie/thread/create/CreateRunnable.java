package cn.rookie.thread.create;

/**
 * Created by Rookie on 2016/4/14.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class CreateRunnable implements Runnable {
    private int num;

    public CreateRunnable(int num) {
        this.num = num;
        System.out.println("创建线程 "+num);
    }
    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.println("线程  "+ num +": 计数 "+i +"---");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i <3; i++) {
            new CreateThread(i+1).start();
			/*
			 *直接调用run方法，其实就是单线程，即按照顺序执行
			 */
            //new CreateThread(i+1).run();
        }
    }
}
