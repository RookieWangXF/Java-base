package cn.rookie.atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;

/**
 * Created by Rookie on 2016/8/22.
 * Package_name is cn.rookie.atomic
 * Description:
 */
public class BasicType {

    private AtomicInteger ai = new AtomicInteger();
    private static AtomicBoolean ab = new AtomicBoolean();
    private static AtomicLong al = new AtomicLong();

    public int add(int delta) {
        return ai.addAndGet(delta);
    }
    public int incr() {
        return ai.incrementAndGet();
    }

    public AtomicBoolean getAb() {
        return ab;
    }

    public AtomicInteger getAi() {
        return ai;
    }

    public static AtomicLong getAl() {
        return al;
    }

    /**
     * 并不能保证
     */
    public void useAtomicInt() {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        ExecutorService executor = Executors.newFixedThreadPool(2);

        IntStream.range(0, 1000).forEach(i -> executor.submit(atomicInteger::incrementAndGet));
        executor.shutdown();
        System.out.println(atomicInteger.get());
    }

    public static void main(String[] args) {
        new BasicType().useAtomicInt();
    }
}
