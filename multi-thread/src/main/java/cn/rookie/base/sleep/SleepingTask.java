package cn.rookie.base.sleep;

import cn.rookie.base.LiftOff;

import java.util.concurrent.TimeUnit;

/**
 * Created by Rookie on 2016/6/13.
 * Package_name is cn.rookie.base.sleep
 * Description:
 */
public class SleepingTask extends LiftOff {

    public SleepingTask() {
        super();
    }
    public SleepingTask(int countDown) {
        super(countDown);
    }

    @Override
    public void run() {
        try{
            while (countDown-- > 0) {
                System.out.print(status());

                TimeUnit.MILLISECONDS.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
