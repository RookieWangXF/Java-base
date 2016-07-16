package cn.rookie.base.daemons;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

/**
 * Created by Rookie on 2016/6/13.
 * Package_name is cn.rookie.base.daemons
 * Description:
 */
public class SimpleDaemonsTest {

    @Test
    public void run() throws Exception {
        for (int i = 0; i < 10; i++) {
            Thread daemon = new Thread(new SimpleDaemons());
            daemon.setDaemon(true);
            daemon.start();
        }
        System.out.println("All daemons starts");
        TimeUnit.MILLISECONDS.sleep(1000);
    }

    @Test
    public void isDaemons() throws Exception {
        Thread daemon = new Thread(new SimpleDaemons());
        daemon.setDaemon(true);
        daemon.start();
        System.out.println(daemon.isDaemon());
        TimeUnit.MILLISECONDS.sleep(1000);
    }

}