package cn.rookie.tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rookie on 2016/9/20.
 * Description:
 */
public class ReConstructBinaryTreeTest {
    private ReConstructBinaryTree demo;
    @Before
    public void setUp() throws Exception {
        demo = new ReConstructBinaryTree();
    }

    //{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
    @Test
    public void reConstructBinaryTree() throws Exception {
        int[] pre ={1,2,4,7,3,5,6,8};
        int[] in ={4,7,2,1,5,3,8,6};
        demo.reConstructBinaryTree(pre, in);
    }

}