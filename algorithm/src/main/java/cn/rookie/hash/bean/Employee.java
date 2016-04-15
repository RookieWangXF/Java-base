package cn.rookie.hash.bean;

/**
 * Created by fei on 2016/4/9.
 */
public class Employee {
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Employee && name.equals(((Employee)obj).name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    private String name;
    private double salary;
    private int seniority;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }
}
