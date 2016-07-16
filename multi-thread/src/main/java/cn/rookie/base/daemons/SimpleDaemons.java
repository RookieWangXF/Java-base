package cn.rookie.base.daemons;

import java.util.concurrent.TimeUnit;

/**
 * Created by Rookie on 2016/6/13.
 * Package_name is cn.rookie.base.daemons
 * Description:
 */
public class SimpleDaemons implements Runnable{

    //设置Main函数的睡眠时间，因为其他线程设计的是后台线程，在没有start之前设置的，所以主线程结束了，其他线程都
    //会结束，后台线程是依托非后台线程的，
    @Override
    public void run() {
        try {
            while (true) {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
