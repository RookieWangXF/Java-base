package cn.rookie.lock;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by Rookie on 2016/8/31.
 * Package_name is cn.rookie.lock
 * Description:可重入的自旋锁
 */
public class ReentrantSpinLock {
    private AtomicReference<Thread> owner = new AtomicReference<>();
    private int count = 0;

    public void lock() {
        Thread current = Thread.currentThread();
        if (current == owner.get()) {
            count++;
            return;
        }
        while (!owner.compareAndSet(null, current)) {

        }
    }

    public void unlock() {
        Thread current = Thread.currentThread();
        if (current == owner.get()) {
            if (count != 0) {
                count--;
            } else {
                owner.compareAndSet(current, null);
            }
        }
    }
}
