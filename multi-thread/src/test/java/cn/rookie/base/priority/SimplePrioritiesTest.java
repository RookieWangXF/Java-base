package cn.rookie.base.priority;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

/**
 * Created by Rookie on 2016/6/13.
 * Package_name is cn.rookie.base.priority
 * Description:
 */
public class SimplePrioritiesTest {

    @Test
    public void run() throws Exception {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new SimplePriorities(Thread.MIN_PRIORITY));
        }
        TimeUnit.MILLISECONDS.sleep(1000);
        exec.shutdown();
    }

}