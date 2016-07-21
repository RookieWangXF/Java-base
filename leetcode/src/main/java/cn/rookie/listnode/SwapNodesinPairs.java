package cn.rookie.listnode;

/**
 * Created by Rookie on 2016/7/21.
 * Package_name is cn.rookie.listnode
 * Description:
 */
public class SwapNodesinPairs {

    public ListNode swapPairs(ListNode head) {

        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }

        ListNode second = head.next;
        ListNode temp = second.next;
        second.next = head;
        head.next = swapPairs(temp);

        return second;
    }
}
