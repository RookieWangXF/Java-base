package cn.rookie.lock;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by Rookie on 2016/8/31.
 * Package_name is cn.rookie.lock
 * Description:自旋锁
 */
public class SpinLock {
    private AtomicReference<Thread> sign = new AtomicReference<>();

    public void lock() {
        Thread current = Thread.currentThread();
        while (!sign.compareAndSet(null, current)) {

        }
    }

    public void unlock() {
        Thread current = Thread.currentThread();
        sign.compareAndSet(current, null);
    }
}
