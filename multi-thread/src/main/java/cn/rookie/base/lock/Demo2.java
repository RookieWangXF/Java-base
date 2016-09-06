package cn.rookie.base.lock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by Rookie on 2016/8/22.
 * Package_name is cn.rookie.base.lock
 * Description:
 */
public class Demo2 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Map<String,String> map = new HashMap<>();
        ReadWriteLock lock = new ReentrantReadWriteLock();

        /**
         * 维持两个锁，一个读锁，一个写锁
         */
        executor.submit(() ->{
            lock.writeLock().lock();
            try {
                Thread.sleep(1);
                map.put("foo", "bar");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.writeLock().unlock();
            }
        });

        Runnable readTask = () -> {
            lock.readLock().lock();
            try {

                System.out.println(map.get("foo"));
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.readLock().unlock();
            }
        };
        executor.submit(readTask);
        executor.submit(readTask);

    }
}
