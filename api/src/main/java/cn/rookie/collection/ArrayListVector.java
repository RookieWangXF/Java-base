package cn.rookie.collection;

import java.util.*;

/**
 * Created by Rookie on 2016/3/28.
 * Description:比较ArrayList和Vector的区别
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class ArrayListVector {

    /**
     * 1. Synchronization and Thread-Safe
     * 2. Resize: int newCapacity = oldCapacity + (oldCapacity >> 1);
     *            int newCapacity = oldCapacity + ((capacityIncrement > 0) ? capacityIncrement : oldCapacity);
     * 3. Performance
     * 4. There is nothing about Vector which List collection cannot do. Therefore Vector should be avoided. If there is a need of thread-safe operation
     * 5. fail-fast: First let me explain what is fail-fast: If the collection (ArrayList, vector etc) gets structurally modified by any means, except the add or remove methods of iterator, after creation of iterator then the iterator will throw ConcurrentModificationException. Structural modification refers to the addition or deletion of elements from the collection.
     As per the Vector javadoc the Enumeration returned by Vector is not fail-fast. On the other side the iterator and listIterator returned by ArrayList are fail-fast.
     */
    private ArrayList<String> arrayList = new ArrayList<String>();
    private Vector vector = new Vector();

    /**
     * How to make ArrayList synchronized?
     */
    //Use Collecions.synzhonizedList method
    private List list = Collections.synchronizedList(new ArrayList<String>());

    public void IteratorList(){
        synchronized (list) {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                iterator.next();
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> demo = new ArrayList<String>();
        demo.add("aa");
        demo.add("bb");
        demo.add("cc");

        Iterator iterator = demo.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(demo.size());

        Vector<String> vector = new Vector();
        vector.add("aa");
        vector.add("bb");
        vector.add("cc");
        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            enumeration.nextElement();
        }
    }
}
