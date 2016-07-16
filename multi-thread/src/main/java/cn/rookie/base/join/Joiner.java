package cn.rookie.base.join;


/**
 * Created by Rookie on 2016/6/13.
 * Package_name is cn.rookie.base.join
 * Description:
 */
public class Joiner extends Thread{
    private Sleeper sleeper;

    public Joiner(String name, Sleeper sleeper){
        super(name);
        this.sleeper=sleeper;
        start();
    }
    public void run(){
        try {//加入的是Sleepr的对象，Joiner线程将通过在Sleeper对象上调用join()方法来等待Sleeper醒来
            sleeper.join();
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println(getName()+"加入好了");
    }
}
