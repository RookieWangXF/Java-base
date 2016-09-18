package cn.rookie.tree;

import cn.rookie.util.TreeUtil;
import org.junit.Test;

/**
 * Created by Rookie on 2016/9/9.
 * Description:
 */
public class MirrorRecursivelyTest {


    @Test
    public void mirrorRecursively() throws Exception {
        TreeNode root = new TreeNode(8);
        TreeNode root1 = new TreeNode(6);
        TreeNode root2 = new TreeNode(10);
        TreeNode root3 = new TreeNode(5);
        TreeNode root4 = new TreeNode(7);
        TreeNode root5 = new TreeNode(9);
        TreeNode root6 = new TreeNode(11);
        root.left = root1;
        root.right = root2;
        root1.left = root3;
        root1.right = root4;
        root2.left = root5;
        root2.right = root6;

        TreeUtil.printTreeByLevel(root);
        new MirrorRecursively().mirrorRecursively(root);
        TreeUtil.printTreeByLevel(root);
    }

    @Test
    public void mirrorRecursively2() throws Exception {
        TreeNode root = new TreeNode(8);
        TreeNode root1 = new TreeNode(6);
        TreeNode root3 = new TreeNode(5);
        TreeNode root4 = new TreeNode(7);
        root.left = root1;
        root1.left = root3;
        root1.right = root4;

        TreeUtil.printTreeByLevel(root);
        new MirrorRecursively().mirrorRecursively(root);
        TreeUtil.printTreeByLevel(root);
    }
}