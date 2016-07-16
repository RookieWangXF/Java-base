package cn.rookie.cooperate.wax;

import java.util.concurrent.TimeUnit;

/**
 * Created by Rookie on 2016/6/14.
 * Package_name is cn.rookie.cooperate.wax
 * Description:
 */
public class WaxOn implements Runnable {

    private Car car;

    public WaxOn(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {

                System.out.println("Wax on");
                TimeUnit.MILLISECONDS.sleep(200);
                car.waxed();
                car.waitForBuffing();

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Ending Wax On task");
    }
}
