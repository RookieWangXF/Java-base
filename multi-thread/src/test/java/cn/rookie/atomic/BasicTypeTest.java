package cn.rookie.atomic;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.*;

/**
 * Created by Rookie on 2016/8/22.
 * Package_name is cn.rookie.atomic
 * Description:
 */
public class BasicTypeTest {

    private BasicType basicType;

    @Test
    public void setUp() {
        Runnable runnable;
        basicType = new BasicType();
    }
    @Test
    public void add() throws Exception {
        for (int i = 0; i < 1000; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    basicType.add(1);
                }
            });
            thread.start();
        }

        System.out.println(basicType.getAi());
    }

    @Test
    public void incr() throws Exception {
        for (int i = 0; i < 1000; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    basicType.incr();
                }
            });
            thread.start();
        }

        System.out.println(basicType.getAi());
    }

}