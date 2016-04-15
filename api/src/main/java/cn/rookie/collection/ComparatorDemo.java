package cn.rookie.collection;

import java.util.Comparator;

/**
 * Created by Rookie on 2016/3/27.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class ComparatorDemo implements Comparator {

    public int compare(Object o1, Object o2) {
        int age1 = ((ComparableDemo) o1).getAge();
        int age2 = ((ComparableDemo) o2).getAge();
        return age2 - age1;
    }
}
