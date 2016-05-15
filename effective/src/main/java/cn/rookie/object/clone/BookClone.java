package cn.rookie.object.clone;

/**
 * Created by Rookie on 2016/4/13.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class BookClone implements Cloneable {
    private String name;
    private double price;

    public BookClone(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "书名： "+this.name + "  价格："+this.price;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public boolean equals(BookClone obj) {
        return this.name == obj.name && this.price == obj.price;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        BookClone bookA = new BookClone("Java", 12.34);
        BookClone bookB = (BookClone) bookA.clone();
        System.out.println(bookA);
        System.out.println(bookB);
        System.out.println(bookA.hashCode() == bookB.hashCode());
        System.out.println(bookA == bookB);
        System.out.println(bookA.equals(bookB));
    }
}
