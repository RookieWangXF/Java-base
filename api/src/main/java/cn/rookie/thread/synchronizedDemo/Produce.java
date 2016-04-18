package cn.rookie.thread.synchronizedDemo;

import java.util.concurrent.TimeUnit;

/**
 * Created by Rookie on 2016/4/13.
 * 生产者进程，负责生产公共资源
 */
public class Produce implements Runnable {
    private Counter counter;

    public Produce(Counter counter) {
        this.counter = counter;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.counter.increment();
        }
    }
}
