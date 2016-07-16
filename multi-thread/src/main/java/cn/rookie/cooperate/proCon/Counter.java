package cn.rookie.cooperate.proCon;

/**
 * Created by Rookie on 2016/4/13.
 */
public class Counter {

    private int number = 0;

    /**
     * 增加公共资源，上限为10
     */
    public synchronized void increment() {
        System.out.println("before increment,number= " + number);
        while (number == 10) {
            try {
                this.wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        number++;
        System.out.println("after increment,number= " + number);
        System.out.println("");
        notifyAll();
    }

    /**
     * 减少公共资源，下限为0
     */
    public synchronized void decrement() {
        System.out.println("before decrement,number= " + number);
        while (number == 0) {
            try {
                this.wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        number--;
        System.out.println("after decrement, number=" +number);
        System.out.println("");
        notifyAll();
    }
}
