package cn.rookie.thread;

import java.util.Random;

/**
 * Created by 201601120071 on 2016/1/20.
 */

class Data{
    public int value = 0;
}

class Work{
     public void process(Data data,Integer... numbers){
         for (int n : numbers){
             data.value += n;
         }
     }
}

public class HuiDiao extends Thread {
    private Work work;
    public HuiDiao(Work work){
        this.work = work;
    }
    @Override
    public void run() {
        Random random = new Random();
        Data data = new Data();
        int n1 = random.nextInt(1000);
        int n2 = random.nextInt(1000);
        int n3 = random.nextInt(1000);
        System.out.println(n1 + "= n1: "+n2 + " =n2 : "+n3 + " =n3 ");
        work.process(data,n1,n2,n3);
        System.out.println(data.value);
    }

    public static void main(String[] args) {
        Thread thread = new HuiDiao(new Work());
        thread.start();
    }
}
