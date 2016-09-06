package cn.rookie.base.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Rookie on 2016/8/22.
 * Package_name is cn.rookie.base.lock
 * Description:
 */
public class Demo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        ReentrantLock lock = new ReentrantLock();

        executor.submit(() ->{
            lock.lock();
            try {
                Thread.sleep(2);
                System.out.println("First");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });

        executor.submit(()->{
            System.out.println("Locked: " + lock.isLocked());
            System.out.println("Held by me: " + lock.isHeldByCurrentThread());
            boolean locked = lock.tryLock();
            System.out.println("Lock acquired: " + locked);
        });

    }
}
