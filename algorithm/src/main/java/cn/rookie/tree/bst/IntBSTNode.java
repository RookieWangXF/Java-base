package cn.rookie.tree.bst;

/**
 * Created by Rookie on 2016/4/2.
 * Description: 二叉树的节点定义
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class IntBSTNode {
    protected int key;
    protected IntBSTNode left, right;
    public IntBSTNode(){
        left = right = null;
    }

    public IntBSTNode(int key) {
        this.key = key;
    }

    public IntBSTNode(int key, IntBSTNode left, IntBSTNode right) {
        this.left = left;
        this.right = right;
    }

    public void visit(){
        System.out.print(this.key + " ");
    }

}
