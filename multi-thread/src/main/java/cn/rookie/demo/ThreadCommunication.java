package cn.rookie.demo;

/**
 * Created by Rookie on 2016/8/28.
 * Package_name is cn.rookie.demo
 * Description:子线程循环10次，接着主线程循环100，接着又回到子线程循环10次，接着再回到主线程又循环100，如此循环50次
 */
public class ThreadCommunication {
    public static void main(String[] args) {
        final Business business = new Business();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 50; i++) {
                    business.sub(i);
                }
            }
        }).start();

        for (int i = 1; i <= 50; i++) {
            business.main(i);
        }
    }
}

class Business{
    private boolean isShouldSub = false;

    public synchronized void sub(int i) {
        //如果不是子线程执行，则等待
        while (!isShouldSub) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int j = 1; j <= 10; j++) {
            System.out.println("子线程：" + j + "，循环次数：" + i);
        }
        isShouldSub = false;
        this.notify();
    }

    public synchronized void main(int i) {
        while (isShouldSub) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int j = 1; j <= 100; j++) {
            System.out.println("主线程：" + j + ",循环次数：" + i);
        }
        isShouldSub = true;
        this.notify();
    }
}
