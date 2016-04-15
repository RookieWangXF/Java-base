package cn.rookie.tree.bst;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Rookie on 2016/4/2.
 * Description: 一个通用查找树的实现
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class IntBST {


    /**
     * Created by Rookie.
     * Description:利用数组构造一个二叉排序树
     * Parameter:
     * return: 根节点
     */
    public IntBSTNode createBST(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        IntBSTNode[] nodes = createNode(arr);
        return createBSTHelper(nodes, 0, arr.length - 1);
    }

    private IntBSTNode createBSTHelper(IntBSTNode[] nodes, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;
        if (start == end) {
            return nodes[mid];
        }

        IntBSTNode res = nodes[mid];
        res.left = createBSTHelper(nodes, start, mid - 1);
        res.right = createBSTHelper(nodes, mid + 1, end);
        return res;
    }

    private IntBSTNode[] createNode(int[] arr) {
        int len = arr.length;
        IntBSTNode[] nodes = new IntBSTNode[len];
        for (int i = 0; i < len ;i++) {
            nodes[i] = new IntBSTNode(arr[i]);
        }
        return nodes;
    }

    private IntBSTNode IntBST(int[] arr, int low, int high) {
        if (low <= high) {
            int middle = (low + high) / 2;

            return new IntBSTNode(arr[middle]);
        } else {
            return null;
        }
    }
    /**
     * Created by Rookie.
     * Description:实现二叉树的二分查找
     * Parameter:
     * return:
     */
    public IntBSTNode search(IntBSTNode p, int value) {

        while (p != null) {
            if (p.key == value) {
                return p;
            } else if (p.key < value) {
                p = p.right;
            } else {
                p = p.left;
            }
        }
        return null;
    }

    /**
     * Created by Rookie.
     * Description: 先序 中序 后序 遍历 以及非递归形式的实现
     * Parameter:
     * return:
     */
    public void preorder(IntBSTNode p) {
        if (p != null) {
            p.visit();
            preorder(p.left);
            preorder(p.right);
        }
    }
    public void iterativePreorder(IntBSTNode p) {
        Stack<IntBSTNode> stack = new Stack<IntBSTNode>();
        if (p != null) {
            stack.push(p);
            while (!stack.isEmpty()) {
                p = stack.pop();
                p.visit();
                if (p.right != null) {
                    stack.push(p.right);
                }
                if (p.left != null) {
                    stack.push(p.left);
                }
            }
        }
    }
    public void inorder(IntBSTNode p) {
        if (p != null) {
            inorder(p.left);
            p.visit();
            inorder(p.right);
        }
    }

    public void postorder(IntBSTNode p) {
        if (p != null) {
            postorder(p.left);
            postorder(p.right);
            p.visit();
        }
    }
    //一个自右向左的先序遍历和自左向右的后序遍历是一个序列
    public void iterativePostorder(IntBSTNode p) {
        IntBSTNode q = p;
        Stack<IntBSTNode> stack = new Stack<IntBSTNode>();
        while (p != null) {
            for (;p.left != null; p = p.left) {
                stack.push(p);
            }

            while (p != null && (p.right == null || p.right == q)) {
                p.visit();
                q = p;
                if (stack.isEmpty()) {
                    return;
                }
                p = stack.pop();
            }
            stack.push(p);
            p = p.right;
        }

    }
    /**
     * Created by Rookie.
     * Description:层次遍历二叉树
     * Parameter:
     * return:
     */
    public void pirntByLevel(IntBSTNode root){
        if (root == null) {

        }
        List<IntBSTNode> nodeList = new ArrayList<IntBSTNode>();
        int cur = 0;
        int end = 1;
        nodeList.add(root);
        while (cur < nodeList.size()) {
            end = nodeList.size();
            while (cur < end) {
                nodeList.get(cur).visit();
                if (nodeList.get(cur).left != null){
                    nodeList.add(nodeList.get(cur).left);
                }
                if (nodeList.get(cur).right != null){
                    nodeList.add(nodeList.get(cur).right);
                }

                cur++;
            }
            System.out.println();
        }
    }
    public void print(IntBSTNode p){
        System.out.print("先序遍历： ");
        preorder(p);
        System.out.println();
        System.out.print("先序遍历(非递归)： ");
        iterativePreorder(p);
        System.out.println();
        System.out.print("中序遍历： ");
        inorder(p);
        System.out.println();
        System.out.print("后序遍历： " );
        postorder(p);
        System.out.println();
        System.out.print("后序遍历(非递归)： " );
        iterativePostorder(p);
        System.out.println();
    }

    /**
     * Created by Rookie.
     * Description:从二叉树中 插入和删除一个结点
     * Parameter:
     * return:
     */
    public void insert(IntBSTNode p ,int value) {
        IntBSTNode prev = null;
        while (p != null) {
            prev = p;
            if (p.key < value) {
                p = p.right;
            } else {
                p = p.left;
            }
        }
        if (p == null) {
            p = new IntBSTNode(value);
        } else if (prev.key < value) {
            prev.right = new IntBSTNode(value);
        } else {
            prev.left = new IntBSTNode(value);
        }
    }

    public void delete(IntBSTNode p, int value) {
        IntBSTNode root = p;
        IntBSTNode tmp,node,prev = null;
        while (p != null && p.key != value) {
            prev = p; //prev 是p的父节点
            if (p.key < value) {
                p = p.right;
            } else {
                p = p.left;
            }
        }
        node = p;
        if (p != null && p.key == value) {
            if (node.right == null) {  //右节点为空，就把左边的移上来
                node = node.left;
            } else if (node.left == null) {
                node = node.right;
            } else {
                tmp = node.left;
                while (tmp.right != null) {
                    tmp = tmp.right;
                }
                tmp.right = node.right;
                node = node.left;
            }
            if (root.key == value) {
                root = node;
            } else if (prev.left == p) {
                prev.left = node;
            } else {
                prev.right = node;
            }
        } else if (p != null) {
            System.out.println("key is not in the tree");
        } else {
            System.out.println("the tree is empty");
        }
    }
    /**
     * 计算所有存储在二叉树中的节点的值（若是求节点个数就把return 那里改为1）
     * @param node
     * @return
     */
    public int sum(IntBSTNode node) {
        if (node == null) {
            return 0;
        } else {
            return node.key + sum(node.left) + sum(node.right);
        }
    }

    /**
     * 计算多少层
     * @param node
     * @return
     */
    public int countLevels(IntBSTNode node){
        if (node == null) {
            return 0;
        } else {
            return 1 + Math.max(countLevels(node.left), countLevels(node.right));
        }
    }

    /**
     * 计算多少叶子节点
     * @param node
     * @return
     */
    
    public int countLeaves(IntBSTNode node) {
        if (node == null) {
            return 0;
        } else if (node.left == null && node.right == null) {
            return 1;
        } else {
            return countLevels(node.left) + countLevels(node.right);
        }
    }

}
