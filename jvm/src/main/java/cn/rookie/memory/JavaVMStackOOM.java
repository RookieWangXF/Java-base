package cn.rookie.memory;

/**
 * Created by Rookie on 2016/5/14.
 * Package_name is cn.rookie.memory
 * Description:创建线程导致内存溢出
 */
public class JavaVMStackOOM {
    private void dontStop() {
        while (true) {

        }
    }

    public void satckLeakByThread() {
        while (true) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) {
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.satckLeakByThread();
    }
}
