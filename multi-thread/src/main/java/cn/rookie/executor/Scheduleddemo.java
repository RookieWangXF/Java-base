package cn.rookie.executor;

import java.util.concurrent.*;

/**
 * Created by Rookie on 2016/8/22.
 * Package_name is cn.rookie.executor
 * Description:
 */
public class ScheduledDemo {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        Runnable task = () -> System.out.println("Scheduling: " + System.nanoTime());
        ScheduledFuture<?> future = scheduledExecutorService.schedule(task, 3, TimeUnit.SECONDS);

        TimeUnit.MILLISECONDS.sleep(1000);
        long remainingDelay = future.getDelay(TimeUnit.SECONDS);
        System.out.printf("Remaining Delay: %sms", remainingDelay);
        System.out.println();

    }
}
