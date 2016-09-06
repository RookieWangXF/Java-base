package cn.rookie.executor;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Rookie on 2016/8/21.
 * Package_name is cn.rookie.executor
 * Description:
 */
public class CachedThreadPoolTest {
    private CachedThreadPool cachedThreadPool;
    @Before
    public void setUp() throws Exception {
        cachedThreadPool = new CachedThreadPool();
    }

    @Test
    public void newCachedThreadPool() throws Exception {
        cachedThreadPool.newCachedThreadPool();
    }

    @Test
    public void newFixedThreadPool() throws Exception {
        cachedThreadPool.newFixedThreadPool();
    }

    @Test
    public void newScheduledThreadPool() throws Exception {
        cachedThreadPool.newScheduledThreadPool();
    }

    @Test
    public void newSingleThreadExecutor() throws Exception {
        cachedThreadPool.newSingleThreadExecutor();
    }

}