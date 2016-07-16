package cn.rookie.factory;

/**
 * Created by Rookie on 2016/4/11.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class AbstractFactory {

}

interface Gardener {
    public Fruit createFruit(String name);
    public Veggie createVeggie(String name);
}

class NorthernGardener implements Gardener {
    public Fruit createFruit(String name) {
        return new NorthernFruit(name);
    }

    public Veggie createVeggie(String name) {
        return new NorthernVeggie(name);
    }
}

class TropicalGardener implements Gardener {
    public Fruit createFruit(String name) {
        return new TropicalFruit(name);
    }

    public Veggie createVeggie(String name) {
        return new TropicalVeggie(name);
    }
}

interface Veggie {
}

class TropicalVeggie implements Veggie {
    private String name;

    public TropicalVeggie(String name) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class NorthernVeggie implements Veggie {
    private String name;

    public NorthernVeggie(String name) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

interface Fruit {
}

class NorthernFruit implements Fruit {
    private String name;

    public NorthernFruit(String name) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class TropicalFruit implements Fruit {
    private String name;

    public TropicalFruit(String name) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}