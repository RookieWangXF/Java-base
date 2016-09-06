package cn.rookie.tree;

/**
 * Created by Rookie on 2016/8/25.
 * Package_name is cn.rookie.tree
 * Description:
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (q == null && p == null) {
            return true;
        } else if ((p == null && q != null) || (q == null && p != null) || p.val != q.val || !isSameTree(p.left, q.left) || !isSameTree(p.right, q.right)) {
            return false;
        } else {
            return true;
        }

    }
}
