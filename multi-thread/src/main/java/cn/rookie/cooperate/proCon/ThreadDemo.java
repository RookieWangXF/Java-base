package cn.rookie.cooperate.proCon;

/**
 * Created by Rookie on 2016/4/13.
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Produce produce = new Produce(counter);

        Consumer consumer = new Consumer(counter);
        Thread thread = new Thread(produce);
        Thread thread2 = new Thread(consumer);
        thread.start();
        thread2.start();
    }
}
