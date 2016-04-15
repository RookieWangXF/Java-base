package cn.rookie.collection;

import java.util.*;

/**
 * Created by Rookie on 2016/3/28.
 * Description: 学习Iterator Enumeration
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class IteratorEnumeration {
    public void IteratorDemo(){
        /**
         * Created by Rookie.
         * Description: 两种方式通过iterator遍历list   有删除，一个没删除
         *  hasNext()
         *  next()
         *  remove()
         * Parameter:
         * return:
         */
        List<String> flower = new ArrayList<String>();
        flower.add("aa");
        flower.add("bb");
        flower.add("cc");
        Iterator<String> iterator = flower.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        /**
         * Created by Rookie.
         * Description:移除元素
         * Parameter: 使用迭代器可以移除当前元素
         * return:
         */
        Iterator iterator2 = flower.iterator();
        while (iterator2.hasNext()) {
            Object o = iterator2.next();
            if (o.equals("bb")) {
                iterator2.remove();
            }
        }

        for (Iterator<String> iterator1 = flower.iterator(); iterator1.hasNext();) {
            System.out.println(iterator1.next());
        }
    }

    public void enumeration(){
        ArrayList<String> list = new ArrayList<String>();
        Vector<String> vector = new Vector<String>();
        for (int i =0; i< 1000000;i++) {
            vector.add("element");
        }
        Iterator<String> iterator = vector.iterator();
        Enumeration<String> enumeration = vector.elements();
        long start = System.currentTimeMillis();
        while (enumeration.hasMoreElements()) {
            enumeration.nextElement();
        }
        System.out.println("Enumeration end:"+(System.currentTimeMillis()-start));
        System.gc();
        long start2 = System.currentTimeMillis();
        while (iterator.hasNext()) {
            iterator.next();
        }
        System.out.println("Iterator end:"+(System.currentTimeMillis()-start2));
    }


    public static void main(String[] args) {
        IteratorEnumeration h = new IteratorEnumeration();
        //h.IteratorDemo();
        h.enumeration();
    }
}
