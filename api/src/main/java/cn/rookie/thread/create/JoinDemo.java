package cn.rookie.thread.create;

/**
 * Created by Rookie on 2016/4/14.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */

class Sleeper extends Thread {
    private int duration;
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
            System.out.println(getName()+"  was   打断了  "+"  是否被打断了？"+isInterrupted());
            return;
        }
        System.out.print("醒了");
    }
}

class Joiner extends Thread {
    private Sleeper sleeper;
    public Joiner(String name, Sleeper sleeper){
        super(name);
        this.sleeper=sleeper;
        start();
    }
    public void run(){
        try {//加入的是Sleepr的对象，而不是Joiner的
            sleeper.join();
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println(getName()+"加入好了");
    }
}

public class JoinDemo {

    public static void main(String[] args) {
        Sleeper sleeper= new Sleeper("sleepy", 10000);
        Sleeper grumpy = new Sleeper("Grumpy",10000);
        Joiner dopey=new Joiner("Dopey", sleeper);
        Joiner doc = new Joiner("Doc",grumpy);
        //可以中断对join方法的调用，对调用线程进行interrupt
        grumpy.interrupt();
    }

}
