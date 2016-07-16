package cn.rookie.ref;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

/**
 * Created by Rookie on 2016/7/4.
 * Package_name is cn.rookie.ref
 * Description:
 */
public class WeakReference {

    /**
     * 弱引用 一旦被发现，便被立即回收
     */

    private static ReferenceQueue<MyObject> weakQueue = new ReferenceQueue<>();

    public static class MyObject{

        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("MyObject's finalize called");
        }

        @Override
        public String toString() {
            return "I am MyObject";
        }
    }

    public static class CheckRefQueue implements Runnable {
        Reference<MyObject> obj = null;

        @Override
        public void run() {
            try {
                obj = (Reference<MyObject>) weakQueue.remove();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (obj == null) {
                System.out.println("被删除的弱引用为：" + obj +"  but获取弱引用的对象obj.get()=" + obj.get());
            }
        }
    }

    public static void main(String[] args) {
        MyObject object = new MyObject();
        Reference<MyObject> weakRef = new java.lang.ref.WeakReference<>(object, weakQueue);
        System.out.println("创建弱引用为：" + weakRef);

        new Thread(new CheckRefQueue()).start();
        object = null;
        System.out.println("Before GC : Weak Get = " + weakRef.get());
        System.gc();
        System.out.println("After GC : Weak Get = " + weakRef.get());
    }
}
