package cn.rookie.tree;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 * Created by Rookie on 2016/9/9.
 * Description:判断一个树是否是另一个树的子树
 */
public class HasSubTree {

    public boolean hasSubTree(TreeNode pRoot1, TreeNode pRoot2) {
        boolean result = false;
        if (pRoot1 != null && pRoot2 != null) {
            if (pRoot1.val == pRoot2.val)
                result = tree1HasTree2(pRoot1, pRoot2);

            if (!result)
                result = hasSubTree(pRoot1.left ,pRoot2);
            if (!result)
                result = hasSubTree(pRoot1.right, pRoot2);
        }
        return result;
    }

    public boolean tree1HasTree2(TreeNode pRoot1, TreeNode pRoot2) {
        if (pRoot2 ==null)
            return true;

        if (pRoot1 == null)
            return false;

        if (pRoot1.val != pRoot2.val)
            return false;

        return tree1HasTree2(pRoot1.left, pRoot2.left) && tree1HasTree2(pRoot1.right, pRoot2.right);
    }
}
