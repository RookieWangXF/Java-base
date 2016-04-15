package cn.rookie.reflect.bean;

/**
 * Created by Rookie on 2016/4/12.
 */
public class User {
    private int id;
    private int age;
    private String name;
    public User(int id, int age, String name) {
        super();
        this.id = id;
        this.age = age;
        this.name = name;
    }
    public User() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
