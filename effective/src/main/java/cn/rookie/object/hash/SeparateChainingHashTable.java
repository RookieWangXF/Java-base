package cn.rookie.object.hash;


import cn.rookie.object.hash.bean.Employee;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by fei on 2016/4/9.
 * 分离链接法，用以解决hash冲突的方式
 */
public class SeparateChainingHashTable{
    private static final int DEFAULT_TABLE_SIZE = 10;

    public List<Employee>[] theLists;
    private int currentSize;


    public SeparateChainingHashTable(){
        this(DEFAULT_TABLE_SIZE);
    }

    public SeparateChainingHashTable(int size) {

        theLists = new LinkedList[nextPrime(size)];

        for (int i = 0; i < theLists.length; i++) {
            theLists[i] = new LinkedList<Employee>();
        }
    }

    private void rehash() {

    }

    private int myHash(Employee m) {
        int hashVal = m.hashCode();

        hashVal %= theLists.length;
        if (hashVal < 0) {
            hashVal += theLists.length;
        }
        return hashVal;
    }


    public static int nextPrime(int n) {
        return 0;
    }

    public static boolean isPrime(int n) {
        return true;
    }


    public void insert(Integer x) {

    }

    public void remove(Integer x) {

    }

    public boolean contains(Integer x) {
        return true;
    }

    public void makeEmpty() {
        for (int i = 0;i< theLists.length;i++) {
            theLists[i].clear();
            currentSize = 0;
        }
    }
}
