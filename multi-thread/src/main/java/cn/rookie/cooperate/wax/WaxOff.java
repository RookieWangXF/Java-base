package cn.rookie.cooperate.wax;

import java.util.concurrent.TimeUnit;

/**
 * Created by Rookie on 2016/6/14.
 * Package_name is cn.rookie.cooperate.wax
 * Description:
 */
public class WaxOff implements Runnable {

    private Car car;

    public WaxOff(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                car.waitForWaxing();
                System.out.println("Wax Off");
                TimeUnit.MILLISECONDS.sleep(200);
                car.buffed();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Ending Wax off task");
    }
}
