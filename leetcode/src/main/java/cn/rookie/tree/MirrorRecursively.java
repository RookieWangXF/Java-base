package cn.rookie.tree;

/**
 * Created by Rookie on 2016/9/9.
 * Description:
 */
public class MirrorRecursively {

    public void mirrorRecursively(TreeNode root) {
        if (root == null)
            return;
        //有一边为null的时候，另一边不需要移动
        if (root.left == null && root.right == null)
            return;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        if (root.left != null)
            mirrorRecursively(root.left);
        if (root.right != null)
            mirrorRecursively(root.right);
    }
}
