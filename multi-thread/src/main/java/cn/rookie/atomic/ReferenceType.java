package cn.rookie.atomic;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by Rookie on 2016/8/22.
 * Package_name is cn.rookie.atomic
 * Description:
 */
public class ReferenceType {
    public static AtomicReference<User> atomicReference = new AtomicReference<>();

    public static void main(String[] args) {
        User user = new User("conan", 15);
        atomicReference.set(user);
        User update = new User("Shin", 17);
        atomicReference.compareAndSet(user, update);
        System.out.println(atomicReference.get().getName());
        System.out.println(atomicReference.get().getOld());
    }

    static class User {
        private String name;
        private int old;
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

