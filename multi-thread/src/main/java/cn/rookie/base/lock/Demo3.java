package cn.rookie.base.lock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.StampedLock;

/**
 * Created by Rookie on 2016/8/22.
 * Package_name is cn.rookie.base.lock
 * Description:
 */
public class Demo3 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Map<String,String> map = new HashMap<>();
        /**
         * 不实现可重入的特点
         */
        StampedLock lock = new StampedLock();

        executor.submit(() ->{
            long stamp = lock.writeLock();
            try {
                Thread.sleep(1);
                map.put("foo", "bar");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlockWrite(stamp);
            }
        });

        Runnable readTask = () -> {
            long stamp = lock.writeLock();
            try {
                System.out.println(map.get("foo"));
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlockWrite(stamp);
            }
        };
        executor.submit(readTask);
        executor.submit(readTask);

    }
}
