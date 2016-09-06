package cn.rookie.threadLocal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Rookie on 2016/9/6.
 * Description:一个线程包含一个ThreadLocalMap，可对应多个ThreadLocal
 */
public class MainThreadLocalMap {

    static Logger logger = LoggerFactory.getLogger(MainThreadLocalMap.class);
    /**
     * 给主线程分配三个ThreadLocal对象
     */
    private ThreadLocal<Boolean> booleanThreadLocal = new ThreadLocal<>();
    private final ThreadLocal<Integer> integerThreadLocal = new ThreadLocal<Integer>();
    private final ThreadLocal<Long> doubleThreadLocal = new ThreadLocal<Long>();

    public void setMoreThreadLocal() {
        for (int i = 0; i < 16; i++) {
            ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
            threadLocal.set(i);
        }
    }
    public static void main(String[] args) {
        MainThreadLocalMap mainThreadLocalMap = new MainThreadLocalMap();
        mainThreadLocalMap.booleanThreadLocal.set(false);
        mainThreadLocalMap.integerThreadLocal.set(12);
        mainThreadLocalMap.doubleThreadLocal.set(System.currentTimeMillis());

        mainThreadLocalMap.setMoreThreadLocal();

        logger.info(String.valueOf(mainThreadLocalMap.booleanThreadLocal.get()));
        logger.info(String.valueOf(mainThreadLocalMap.integerThreadLocal.get()));
        logger.info(String.valueOf(mainThreadLocalMap.doubleThreadLocal.get()));
    }
}
