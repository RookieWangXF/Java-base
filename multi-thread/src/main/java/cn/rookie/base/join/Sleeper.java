package cn.rookie.base.join;

/**
 * Created by Rookie on 2016/6/13.
 * Package_name is cn.rookie.base.join
 * Description:
 */
public class Sleeper extends Thread{
    private int duration;

    //根据名称和时间睡眠
    public Sleeper(String name, int sleepTime){
        super(name);
        duration=sleepTime;
        //创建对象时候就开启了线程
        start();
    }
    public void run(){
        try {
            sleep(duration);
        } catch (Exception e) {
            System.out.println(getName()+" was 打断了 "+"是否被打断了？"+ isInterrupted());
            return;
        }
        System.out.println("醒了");
    }
}
