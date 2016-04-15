package cn.rookie.builder;

/**
 * Created by Rookie on 2016/4/11.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class ConcreteBuilder extends Builder {
    private Product product = new Product();
    @Override
    public void builderPartA() {
        product.Add("partA");
    }

    @Override
    public void builderPartB() {
        product.Add("partB");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
