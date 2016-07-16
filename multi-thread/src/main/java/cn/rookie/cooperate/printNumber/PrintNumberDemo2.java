package cn.rookie.cooperate.printNumber;

/**
 * Created by Rookie on 2016/4/14.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 启动3个线程打印递增的数字, 线程1先打印1,2,3,4,5, 然后是线程2打印6,7,8,9,10, 然后是线程3打印11,12,13,14,15. 接着再由线程1打印16,17,18,19,20....以此类推, 直到打印到75. 程序的输出结果应该为:

 线程1: 1
 线程1: 2
 线程1: 3
 线程1: 4
 线程1: 5

 线程2: 6
 线程2: 7
 线程2: 8
 线程2: 9
 线程2: 10
 ...

 线程3: 71
 线程3: 72
 线程3: 73
 线程3: 74
 线程3: 75
 * @author fei
 *
 */
public class PrintNumberDemo2{
    private static int n = 1;
    private static int state = 1;
    private Lock lock = new ReentrantLock();

    private Condition c1 = lock.newCondition();
    private Condition c2 = lock.newCondition();
    private Condition c3 = lock.newCondition();

    public void run() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    try {
                        lock.lock();
                        while (state != 1) {
                            try {
                                c1.await();
                            } catch (Exception e) {

                            }
                        }
                        for (int j = 0; j < 5; j++) {
                            System.out.println(Thread.currentThread().getName()+":" +n++);
                        }
                        System.out.println();

                        state = 2;
                        c2.signal();
                    } finally {
                        lock.unlock();
                    }
                }
            }
        },"线程1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    try {
                        lock.lock();
                        while (state != 2) {
                            try {
                                c2.await();
                            } catch (Exception e) {

                            }
                        }
                        for (int j = 0; j < 5; j++) {
                            System.out.println(Thread.currentThread().getName()+":" +n++);
                        }
                        System.out.println();

                        state = 3;
                        c3.signal();
                    } finally {
                        lock.unlock();
                    }
                }
            }
        },"线程2").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    try {
                        lock.lock();
                        while (state != 3) {
                            try {
                                c3.await();
                            } catch (Exception e) {

                            }
                        }
                        for (int j = 0; j < 5; j++) {
                            System.out.println(Thread.currentThread().getName()+":" +n++);
                        }
                        System.out.println();

                        state = 1;
                        c1.signal();
                    } finally {
                        lock.unlock();
                    }
                }
            }
        },"线程3").start();
    }
    public static void main(String[] args) {
        new PrintNumberDemo2().run();
    }


}
