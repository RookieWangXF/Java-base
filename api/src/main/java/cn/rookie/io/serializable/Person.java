package cn.rookie.io.serializable;

import java.io.Serializable;

/**
 * Created by Rookie on 2016/4/20.
 */
public class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return this.getName() + ":" + this.getAge();
    }
}
