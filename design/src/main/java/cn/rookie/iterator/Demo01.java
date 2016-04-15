package cn.rookie.iterator;

/**
 * Created by Rookie on 2016/4/12.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
import java.util.ArrayList;
import java.util.List;

interface Iterator{
    public Object next();
    public boolean hasNext();
}

class ConcreteIterator implements Iterator{
    private List list;
    private int cursor = 0;

    public ConcreteIterator(List list) {
        this.list = list;
    }
    @Override
    public Object next() {
        Object object = null;
        if (this.hasNext()) {
            object = this.list.get(cursor++);
        }

        return object;
    }

    @Override
    public boolean hasNext() {
        if (cursor == list.size()) {
            return false;
        }
        return true;
    }
}

interface Aggregate{
    public void add(Object object);
    public void remove(Object object);
    public Iterator iterator();
}

class ConcreteAddregate implements Aggregate{
    private List list = new ArrayList();

    @Override
    public void add(Object object) {
        list.add(object);
    }

    @Override
    public void remove(Object object) {
        list.remove(object);
    }

    @Override
    public Iterator iterator() {

        return new ConcreteIterator(list);
    }

}

public class Demo01 {

    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAddregate();
        aggregate.add("飞飞");
        aggregate.add("蕾蕾");
        aggregate.add("dada");
        Iterator iterator = aggregate.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            String str = (String)iterator.next();
            i++;
            System.out.println(str+":"+i);
        }
    }

}
