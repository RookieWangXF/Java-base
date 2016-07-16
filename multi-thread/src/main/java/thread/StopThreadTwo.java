package thread;

import java.util.concurrent.TimeUnit;

/**
 * Created by 201601120071 on 2016/1/20.
 */
public class StopThreadTwo {
    private static boolean stopRequested;

    private static synchronized void rerquestStop(){
        stopRequested = true;
    }

    private static synchronized boolean stopRequest(){
        return stopRequested;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!stopRequest()){
                    i++;
                }
            }
        });
        backgroundThread.start();
        TimeUnit.SECONDS.sleep(3);
        rerquestStop();
    }
}
