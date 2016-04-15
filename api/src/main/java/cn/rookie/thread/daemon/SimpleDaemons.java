package cn.rookie.thread.daemon;

import java.util.concurrent.TimeUnit;

/**
 * Created by Rookie on 2016/4/14.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class SimpleDaemons implements Runnable {
    @Override
    public void run() {
        try {
            while (true) {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread()+":          "+this);
            }
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 2; i++) {
            Thread daemon = new Thread(new SimpleDaemons());
            daemon.setDaemon(true);
            daemon.start();
            System.out.println("Started");
            //设置Main函数的睡眠时间，因为其他线程设计的是后台线程，在没有start之前设置的，所以主线程结束了，其他线程都
            //会结束，后台线程是依托非后台线程的，
            TimeUnit.MILLISECONDS.sleep(1100);
        }
    }
}
