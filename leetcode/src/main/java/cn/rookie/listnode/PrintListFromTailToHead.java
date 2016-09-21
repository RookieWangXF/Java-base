package cn.rookie.listnode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Rookie on 2016/9/20.
 * Description:
 */
public class PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> data = new ArrayList<Integer>();
        if(listNode != null){
            Stack<ListNode> nodes = new Stack();
            while(listNode!= null){
                nodes.push(listNode);
                listNode = listNode.next;
            }
            while(!nodes.isEmpty()){
                data.add(((ListNode)nodes.pop()).val);
            }
        }
        return data;
    }

}
