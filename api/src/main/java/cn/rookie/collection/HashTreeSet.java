package cn.rookie.collection;

/**
 * Created by Rookie on 2016/3/28.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
/**
 * Created by Rookie.
 * 1. HashSet是无序存储的，Internal implementation  底层是HashMap实现的；TreeSet底层TreeMap是红黑树，是有序的
 * 2. 允许空值；不允许空值
 * 3. Performance HashSet take constant time performance for the basic operations like add, remove contains and  size.While TreeSet guarantees log(n) time cost for the basic operations (add,remove,contains).
 * 4. Speed
 * 5. Functionality: TreeSet
 * 6. Comparision : HashSet uses equals() method for comparison in java while TreeSet uses compareTo() method for maintaining ordering .
 * */


import java.util.HashSet;
import java.util.TreeSet;


public class HashTreeSet {
    private HashSet<String> hashSet = new HashSet<String>();
    private TreeSet<String> treeSet = new TreeSet<String>();
    public HashTreeSet(){
        hashSet.add("dxa");
        hashSet.add("dvf");
        hashSet.add("sdf");
        hashSet.add("bdf");

        treeSet.add("daaa");
        treeSet.add("dvf");
        treeSet.add("sff");
        treeSet.add("sdf");
    }
    public void printHashSet(){
       System.out.println(hashSet);
    }
    public void printTreeSet(){
       System.out.println(treeSet);
    }

    public void isNull(){
       hashSet.add(null);
        treeSet.add(null); //会抛出NullPointerException
    }

    public void hashSetDemo(){
        //hashset 是没有get方法的，用于判断是否存在，不存在就加入
        //static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; 初始化大小为16  加载因子是0.75
        if (hashSet.contains("aa")) {
            hashSet.add("dd");
        }
    }
    public void useTreeSet(){
        System.out.println("treeSet.last() "+treeSet.last());
        System.out.println("treeSet.pollFirst() "+treeSet.pollFirst());
        System.out.println("treeSet.first() "+treeSet.first());
    }
    public static void main(String[] args) {
       HashTreeSet demo = new HashTreeSet();
       demo.printHashSet();
       demo.printTreeSet();
        //demo.isNull();
       demo.useTreeSet();
    }
}
