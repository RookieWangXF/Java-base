package cn.rookie.resource;

/**
 * Created by Rookie on 2016/6/13.
 * Package_name is cn.rookie.resource
 * Description:消费者任务
 */
public class EvenChecker implements Runnable{

    private IntGenerator generator;
    private final int id;

    public EvenChecker(IntGenerator generator, int id){
        this.generator = generator;
        this.id = id;
    }

    @Override
    public void run() {
        while (!generator.isCanceled()) {
            int val = generator.next();
            if (val % 2 != 0) {
                System.out.println(val + " not even!");
                generator.cancel();
            }
        }
    }
}
