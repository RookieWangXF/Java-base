package cn.rookie.thread;

/**
 * Created by Rookie on 2016/3/27.
 * Description:实现一个死锁
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class Deadlock implements Runnable {
    private int flag;
    static Object o1 = new Object();
    static Object o2 = new Object();

    public void run() {
        System.out.println(flag);
        if (flag == 0) {
            synchronized (o1) {
                try{
                    Thread.sleep(500);} catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o2) {

                }
            }
        }
        if (flag == 1) {
            synchronized (o2) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o1) {
                }
            }
        }
    }

    public static void main(String[] args) {
        Deadlock test1 = new Deadlock();
        Deadlock test2 = new Deadlock();
        test1.flag = 0;
        test1.flag = 1;
        Thread t1 = new Thread(test1);
        Thread t2 = new Thread(test2);
        t1.start();
        t2.start();

    }
}
