package cn.rookie.base.sleep;

import java.util.concurrent.TimeUnit;

/**
 * Created by Rookie on 2016/8/22.
 * Package_name is cn.rookie.base.sleep
 * Description:
 */
public interface SleepDemo {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () ->{
          try {
              String name = Thread.currentThread().getName();
              System.out.println("Foo" + name);
              TimeUnit.SECONDS.sleep(1);
              System.out.println("Bar" + name);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
        };

        Thread t = new Thread(runnable);
        t.start();
        Thread.sleep(2000);//两种睡眠方式都可以
        System.out.println("Done!");
    }
}
