package thread;

/**
 * Created by 201601120071 on 2016/1/20.
 */

import java.util.concurrent.TimeUnit;

/**
 * 当不使用同步的时候，线程之间是无法看到变化的，因此就不能达到互斥的目的。
 */
public class StopThread {
    private static volatile boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {
            Thread backgroundThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    int i = 0;
                    while (!stopRequested){
                        i++;
                    }
                }
            });
            backgroundThread.start();
            TimeUnit.SECONDS.sleep(1);
            stopRequested = true;
        }
}
