package cn.rookie.listnode;

/**
 * Created by Rookie on 2016/9/21.
 * Description:输入一个链表，输出该链表中倒数第k个结点。
 */
public class FindKthToTail {

    public ListNode findKthToTail(ListNode head,int k) {
        if (head == null || count(head) < k)
            return null;
        if (k == 0)
            return null;
        ListNode result = head;
        int i = 1;
        while (i < k){
            head = head.next;
            i++;
        }
        while (head.next != null){
            head = head.next;
            result = result.next;
        }
        return result;
    }

    private int count(ListNode head){
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }
}
