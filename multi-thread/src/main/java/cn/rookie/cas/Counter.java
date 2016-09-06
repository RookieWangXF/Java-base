package cn.rookie.cas;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Rookie on 2016/8/31.
 * Package_name is cn.rookie.cas
 * Description:使用Cas和不使用线程安全的计结果
 */
public class Counter {
    private AtomicInteger atomicI = new AtomicInteger(0);
    private int i = 0;

    public static void main(String[] args) {
        final Counter cas = new Counter();
        List<Thread> ts = new ArrayList<Thread>(600);
        long start = System.currentTimeMillis();
        for (int j = 0; j < 100; j++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 1000; i++) {
                        cas.count();
                        cas.safeCount();
                    }
                }
            });
            ts.add(t);
        }

        for (Thread t : ts) {
            t.start();
        }

        //Main线程等待其他线程执行完再执行
        for (Thread t : ts) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(cas.i);
        System.out.println(cas.atomicI.get());
        System.out.println(System.currentTimeMillis() - start);
    }

    private void count() {
        i++;
    }

    /**
     * 使用cas实现安全计数
     * 问题：1.ABA 2.循环时间过长 3.只能保证对于一个共享变量的原子操作，对于多个共享变量不可以。
    · */
    private void safeCount() {
        for (;;) {
            int i = atomicI.get();
            //自旋CAS实现，当compare i 和原值相同的时候，才可以执行++i
            boolean suc = atomicI.compareAndSet(i, ++i);
            if (suc) {
                break;
            }
        }
    }
}
