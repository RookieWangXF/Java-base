package cn.rookie.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Rookie on 2016/3/28.
 * Description:自定义一个Set,实现插入的时候不能插入重复元素
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class SetDemo {
    private Set<String> set = new HashSet<String>();
    /**
     * Created by Rookie.
     * Description: HashSet的底层是HashMap
     * private transient HashMap<E,Object> map;
     * private static final Object PRESENT = new Object();
     * public HashSet() {
     * map = new HashMap<>();
     * }
     * public boolean add(E e) {
     * return map.put(e, PRESENT)==null;
     * }
     * <p>
     * public V put(K key, V value) {
     * return putVal(hash(key), key, value, false, true);
     * }
     * Parameter:
     * return:
     */

    private HashMap<Object, Object> map;
    private static final Object PRESENT = new Object();
    public SetDemo(){
        map = new HashMap<Object, Object>();
    }

    public boolean add(Object o) {
        return map.put(o, PRESENT) == null;
    }
    public static void main(String[] args) {
        SetDemo setDemo = new SetDemo();
        System.out.println(setDemo.map.put("aa", "aa"));  //插入成功返回null
        System.out.println(setDemo.add("ba"));
        System.out.println(setDemo.add("ba"));
    }
}
