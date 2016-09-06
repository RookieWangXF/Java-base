package cn.rookie.threadLocal;

/**
 * Created by Rookie on 2016/9/5.
 * Package_name is cn.rookie.threadLocal
 * Description:
 */
public class ThreadLocalMapTest {
    public static void main(String[] args) {
        Thread thread = new Thread();
        Thread thread2 = new Thread();

        ThreadLocal t1 = new ThreadLocal();
        ThreadLocal t2 = new ThreadLocal();
        t1.set("boolean");
        t2.set("boolean");
    }
}
