package cn.rookie.util;

import cn.rookie.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rookie on 2016/9/9.
 * Description:
 */
public class TreeUtil {

    /**
     * 分层打印二叉树
     * @param root
     */
    public static void printTreeByLevel(TreeNode root){
        if (root == null)
            return;
        List<TreeNode> nodeList = new ArrayList<TreeNode>();
        int cur = 0;
        int end = 1;
        int level = countLevels(root);
        nodeList.add(root);
        while (cur < nodeList.size()) {
            end = nodeList.size();
            printSpace(level);
            level = level - 2;
            while (cur < end) {
                nodeList.get(cur).visit();
                if (nodeList.get(cur).getLeft() != null){
                    nodeList.add(nodeList.get(cur).getLeft());
                }
                if (nodeList.get(cur).getRight() != null){
                    nodeList.add(nodeList.get(cur).getRight());
                }
                cur++;
            }
            System.out.println();
        }
    }

    private static void printSpace(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print(" ");
        }
    }

    /**
     * 计算多少层
     * @param node
     * @return
     */
    public static int countLevels(TreeNode node){
        if (node == null) {
            return 0;
        } else {
            return 1 + Math.max(countLevels(node.getLeft()), countLevels(node.getRight()));
        }
    }
}
