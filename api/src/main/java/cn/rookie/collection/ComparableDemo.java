package cn.rookie.collection;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Rookie on 2016/3/27.
 * Description:比较 Comparator和Comparable
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class ComparableDemo implements Comparable {

        private int id;
        private String name;
        private int age;

        public ComparableDemo(int id, String name, int age){
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int compareTo(Object o) {
            return this.age - ((ComparableDemo)o).getAge();
        }

    @Override
    public String toString() {
        return this.getName() + " " + this.getAge();
    }

    public static void main(String[] args) {
        ComparableDemo demo1 = new ComparableDemo(1,"fei",12);
        ComparableDemo demo2 = new ComparableDemo(2,"lei",235);
        ComparableDemo demo3 = new ComparableDemo(3,"fessi",14);
        ComparableDemo[] a = new ComparableDemo[3];
        a[0] = demo1;
        a[1] = demo2;
        a[2] = demo3;
        Arrays.sort(a);
        for (int i = 0; i < 3; i++) {
            System.out.println(a[i]);
        }

        Comparator comparator = new ComparatorDemo();
        int result = comparator.compare(demo1, demo3);
        System.out.println(result);
        Arrays.sort(a,new ComparatorDemo());
        for (int i = 0; i < 3; i++) {
            System.out.println(a[i]);
        }
    }

}
