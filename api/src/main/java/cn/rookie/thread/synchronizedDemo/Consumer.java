package cn.rookie.thread.synchronizedDemo;

import java.util.concurrent.TimeUnit;

/**
 * Created by Rookie on 2016/4/13.
 */
public class Consumer implements Runnable {

    private Counter counter;

    public Consumer(Counter counter) {
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
            this.counter.decrement();
        }
    }
}
