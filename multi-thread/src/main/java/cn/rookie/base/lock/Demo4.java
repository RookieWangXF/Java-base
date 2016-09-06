package cn.rookie.base.lock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.StampedLock;

/**
 * Created by Rookie on 2016/8/22.
 * Package_name is cn.rookie.base.lock
 * Description:
 */
public class Demo4 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        /**
         * 实现乐观锁
         */
        StampedLock lock = new StampedLock();

        executor.submit(() ->{
            long stamp = lock.tryOptimisticRead();
            try {
                System.out.println("Optimistic Lock Valid: " + lock.validate(stamp));
                Thread.sleep(1);
                System.out.println("Optimistic Lock Valid: " + lock.validate(stamp));
                Thread.sleep(2);
                System.out.println("Optimistic Lock Valid: " + lock.validate(stamp));
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlockWrite(stamp);
            }
        });

        executor.submit(() -> {
            long stamp = lock.writeLock();
            try {
                System.out.println("Write Lock acquired");
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock(stamp);
                System.out.println("Write done");
            }
        });


        /**
         * 将读锁转化为写锁
         */
        executor.submit(() -> {
            int count = 0;
            long stamp = lock.readLock();
            try {
                if (count == 0) {
                    stamp = lock.tryConvertToWriteLock(stamp);
                    if (stamp == 0L) {
                        System.out.println("Could not convert to write lock");
                        stamp = lock.writeLock();
                    }
                    count = 23;
                }
                System.out.println(count);
            } finally {
                lock.unlock(stamp);
            }
        });
    }
}
