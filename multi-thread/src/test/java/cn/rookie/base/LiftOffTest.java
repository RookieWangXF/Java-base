package cn.rookie.base;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Rookie on 2016/6/13.
 * Package_name is cn.rookie.base
 * Description:
 */
public class LiftOffTest {

    @Test
    public void run() throws Exception {
        LiftOff liftOff = new LiftOff();
        liftOff.run();
    }

    /**
     * 在执行期间，输出的结果会有变化
     * @throws Exception
     */
    @Test
    public void testThread() throws Exception {
        Thread thread = new Thread(new LiftOff());
        thread.start();
        System.out.println("Waiting for LiftOff");
    }

    /**
     * @throws Exception
     */
    @Test
    public void testMultiThread() throws Exception {
        for (int i = 0; i < 5; i++) {
            new Thread(new LiftOff()).start();
        }
        System.out.println("Waiting for LiftOff");
    }

    /**
     * @throws Exception
     */
    @Test
    public void testExecute() {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}