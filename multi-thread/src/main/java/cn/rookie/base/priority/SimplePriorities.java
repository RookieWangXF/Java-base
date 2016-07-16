package cn.rookie.base.priority;

/**
 * Created by Rookie on 2016/6/13.
 * Package_name is cn.rookie.base.priority
 * Description:
 */
public class SimplePriorities implements Runnable{

    private int countDown = 5;
    private volatile double d;
    private int priority;

    public SimplePriorities(int priority){
        this.priority = priority;
    }

    @Override
    public String toString() {
        return Thread.currentThread() + " : " + countDown;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(priority);
        while (true) {
            for (int i = 1; i < 10000; i++) {
                d += (Math.PI + Math.E) / (double) i;
                if (i % 1000 == 0) {
                    Thread.yield();
                }
            }
            System.out.println(this);
            if (--countDown == 0) {
                return;
            }
        }
    }

}
