package cn.rookie.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Rookie on 2016/8/28.
 * Package_name is cn.rookie.demo
 * Description:
 */
public class ThreadCommunication2 {
    private static Lock lock = new ReentrantLock();
    private static Condition subThreadCondition = lock.newCondition();
    private static boolean bShouldThread = false;

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 50; i++) {
                    lock.lock();
                    try {
                        if (!bShouldThread) {
                            subThreadCondition.await();
                        }
                        for (int j = 1; j <= 10; j++) {
                            System.out.println("主线程：" + j + "，循环次数：" + i);
                        }
                        bShouldThread = false;
                        subThreadCondition.signal();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        lock.unlock();
                    }
                }
            }
        });

        threadPool.shutdown();
        for (int i = 1; i <= 50; i++) {
            lock.lock();
            try {
                if (bShouldThread)
                    subThreadCondition.await();
                for (int j = 1; j <= 10; j++) {
                    System.out.println("子线程：" + j + "，循环次数：" + i);
                }
                bShouldThread = true;
                subThreadCondition.signal();
            } catch (Exception e) {
            } finally {
                lock.unlock();
            }
        }
    }
}
