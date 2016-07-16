package cn.rookie.base.join;


/**
 * Created by Rookie on 2016/6/13.
 * Package_name is cn.rookie.base.join
 * Description:
 */
public class Joining {

    public static void main(String[] args) {
        Sleeper sleeper= new Sleeper("sleepy", 10000);
        Sleeper grumpy = new Sleeper("Grumpy",10000);
        Joiner dopey=new Joiner("Dopey", sleeper);
        Joiner doc = new Joiner("Doc",grumpy);
        //可以中断对join方法的调用，对调用线程进行interrupt

        grumpy.interrupt();
    }
}
