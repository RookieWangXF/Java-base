package cn.rookie.threadLocal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Rookie on 2016/9/6.
 * Package_name is cn.rookie.threadLocal
 * Description:
 */
public class TestThreadLocal {

    private static Logger logger = LoggerFactory.getLogger(TestThreadLocal.class);

    private static final ThreadLocal<Integer> value = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };
    private static int num;

    static class MyThread extends Thread {

        private int index;

        public MyThread(int index) {
            this.index = index;
        }

        @Override
        public void run() {
            logger.info("线程：" + index + "的初始值value：" + value.get());
            for (int i = 0; i < 10; i++) {
                value.set(value.get() + i);  //给ThreadLocal变量增加
            }
            logger.info("线程：" + index + "的累加值value：" + value.get());
            logger.info("value的hashCode():" + value.hashCode());
        }
    }

    static class MyThread2 extends Thread {

        private int index;

        public MyThread2(int index) {
            this.index = index;
        }

        @Override
        public void run() {
            logger.info("线程：" + index + "的初始值num：" + num);
            for (int i = 0; i < 10; i++) {
                num++;  //普通共享变量增加
            }
            logger.info("线程：" + index + "的累加值num：" + num);

        }
    }

    public static void main(String[] args) throws InterruptedException {
        /**
         * 开启5个线程，执行每个线程的run方法。
         * 1.  value值属于TestThreadLocal类的变量，是被各个线程共享的
         * 2.  一般变量的话访问共享变量，如果有修改的话是会出现问题的，因为每个线程看到的都是对象中的同一个变量。
         * 3.  因为有了ThreadLocal变量，每个线程执行的时候，都会针对当前线程，创建一个ThreadLocalMap,是属于这个线程的引用，
         *     只有线程销毁的时候，持有的map就会被回收。
         * 4.  hashcode值是相同的，因此每个线程是共享的value变量。
         */
        for (int i = 0; i < 5; i++) {
            new Thread(new MyThread(i)).start();
        }
        Thread.sleep(1000);
        logger.info("-------------------");

        for (int i = 0; i < 5; i++) {
            new Thread(new MyThread2(i)).start();
        }
    }
}
