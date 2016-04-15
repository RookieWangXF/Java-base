package cn.rookie.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Rookie on 2016/4/10.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
/*
* 类A的equals方法只是重写了equals方法
*/
class A{

    /**
     * 首先会判断hashcode,如果相同，则继续判断equals方法，equals是最终判断的方式，如果不一致才是真正的不一致
     * 多个对象之间有可能是hashcode相同的
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

/*
 * 类B的hashcode方法总是返回1，但没有重写其equals()方法
 */
class B{
    @Override
    public int hashCode() {
        return 1;
    }
}

/*
 * 类C的hashcode()方法总是返回2，且重写了	其equals()方法
 */
class C{
    @Override
    public int hashCode() {
        return 2;
    }
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

public class EqualsHashcode {

    public static void main(String[] args) {
        Set books = new HashSet<>();
        books.add(new A());
        books.add(new A());
        //books.add(new B());
        //books.add(new B());
        //books.add(new C());
        //books.add(new C());

        System.out.println(books);
    }
}
