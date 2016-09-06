package cn.rookie.atomic;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/**
 * Created by Rookie on 2016/8/22.
 * Package_name is cn.rookie.atomic
 * Description:
 */
public class FiledType {
    public static AtomicIntegerFieldUpdater<User> a = AtomicIntegerFieldUpdater.newUpdater(User.class, "old");

    public static void main(String[] args) {
        User conan = new User("Conan", 10);
        System.out.println(a.getAndIncrement(conan));
        System.out.println(a.get(conan));
    }
    public static class User {
        private String name;
        public volatile int old;
        public User(String name,int old) {
            this.name = name;
            this.old = old;
        }

        public int getOld() {
            return old;
        }

        public String getName() {
            return name;
        }
    }
}
