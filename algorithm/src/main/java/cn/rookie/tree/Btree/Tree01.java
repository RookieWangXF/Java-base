package cn.rookie.tree.Btree;

/**
 * Created by fei on 2016/4/6.
 * 一个m分树或者m路树（查找树）
 * 1. 每个节点有m个子女和m-1个值
 * 2. 每个节点的值是按照升序排的
 * 3. 前i个子女的值比第i个值小
 * 4. 后m-i个子女的值比第i个值大
 */

/**
 * 数据库中大部分信息都存储在磁盘或者磁道上，
 * B树的特点 m序
 * 1. 根至少有两棵子树，除非它是一个叶子
 * 2. 每一个非根和非叶子节点保存k-1个值和k个对子树的引用， k 小于等于m,且大于等于 m的二分之一
 * 3. 每一个叶子节点保存了k-1个值，
 * 4. 所有的叶子都在同一层
 * 平衡的
 */
public class Tree01 {
}